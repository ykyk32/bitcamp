--ex1)
create or replace view v_view1
as select employee_id, last_name,salary, department_id from employees
where department_id=90;

select* from v_view1;

delete from v_view1;

--[문제1]
create or replace view v_view2(사원ID, 사원이름, 급여, 부서ID)
as select employee_id,last_name,salary,department_id from employees
where salary>=5000 and salary<=10000;

--ex2)
select* from v_view2;

update v_view2 set 급여 =12000 where 사원ID=103;

select * from employees where employee_id=103;

update employees set salary = 9000 where employee_id=103;

--[문제2] 
create  or replace view v_view3(사원번호, 사원명, 부서명)
as select employee_id, last_name,department_name from employees
join departments using (department_id) 
where department_id in (10,90)
order by 1;

select* from v_view3;
--[문제3]
create or replace view v_view4(사원번호, 사원명, 급여, 입사일, 부서명, "부서위치(city)")
as select employee_id, 
        last_name,
        to_char(trunc(salary,-3),'999,999')||'원',
        to_char(hire_date,'rrrr"년"mm"월"dd"일"'),
        department_name,
        city 
from employees
join departments using (department_id)
join locations using(location_id)
where department_id in(10,90)
order by 1;

select* from v_view4;

--ex3)
create or replace view v_view5
as select employee_id, last_name, job_id
from employees
where job_id='IT_PROG'
with read only;

select * from v_view5;
delete from v_view5;
update v_view5 set last_name='홍길동' where employee_id=103;

--ex4)
create or replace view v_view6
as select employee_id, last_name, email, hire_date, job_id
from employees 
where job_id= 'IT_PROG' with check option;

select * from v_view6;

insert into v_view6(employee_id, last_name, email, hire_date, job_id)
values(500,'kim','candy','2004-01-01','Sales'); 

update v_view6 set job_id ='Sales' where employee_id=103;

insert into v_view6(employee_id, last_name, email, hire_date, job_id)
values(500,'kim','candy','2004-01-01','IT_PROG');

delete from v_view6;

--[문제4]
create table bookshop(
isbn varchar2(10) constraint PISBN primary key,
title varchar2(50) constraint CTIT not null,
author varchar2(50),
price number,
company varchar2(30));

insert into bookshop values('is001','자바33일완성','김자바',25000,'야메루출판사');
insert into bookshop values('pa002','JSP달인되기','이달인',28000,'공갈닷컴');
insert into bookshop values('or003','오라클무작정따라하기','박따라',23500,'야메루출판사');

commit;

select constraint_name,constraint_type
from user_constraints
where table_name='BOOKSHOP';


create table bookorder(
idx number primary key,
isbn varchar2(10) constraint FKISBN references bookshop(isbn),
qty number);

select constraint_name,constraint_type
from user_constraints
where table_name='BOOKORDER';


create sequence idx_seq increment by 1 start with 1 nocycle nocache;

insert into bookorder values(idx_seq.nextval, 'is001', 2);
insert into bookorder values(idx_seq.nextval, 'or003', 3);
insert into bookorder values(idx_seq.nextval, 'pa002', 5);
insert into bookorder values(idx_seq.nextval, 'is001', 3);
insert into bookorder values(idx_seq.nextval, 'or003', 10);

commit;

create or replace view bs_view(책제목, 저자, 총판매금액)
as select title,
          author,
          to_char(sum(qty*price),'9,999,999')
from bookshop
join bookorder using(isbn)
group by(title,author)--그룹시키지 않은건 select할 수 없다.
with read only;

select * from bs_view;