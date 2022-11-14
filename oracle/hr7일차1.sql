--ex1)
create or replace view v_view1
as select employee_id, last_name,salary, department_id from employees
where department_id=90;

select* from v_view1;

delete from v_view1;

--[����1]
create or replace view v_view2(���ID, ����̸�, �޿�, �μ�ID)
as select employee_id,last_name,salary,department_id from employees
where salary>=5000 and salary<=10000;

--ex2)
select* from v_view2;

update v_view2 set �޿� =12000 where ���ID=103;

select * from employees where employee_id=103;

update employees set salary = 9000 where employee_id=103;

--[����2] 
create  or replace view v_view3(�����ȣ, �����, �μ���)
as select employee_id, last_name,department_name from employees
join departments using (department_id) 
where department_id in (10,90)
order by 1;

select* from v_view3;
--[����3]
create or replace view v_view4(�����ȣ, �����, �޿�, �Ի���, �μ���, "�μ���ġ(city)")
as select employee_id, 
        last_name,
        to_char(trunc(salary,-3),'999,999')||'��',
        to_char(hire_date,'rrrr"��"mm"��"dd"��"'),
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
update v_view5 set last_name='ȫ�浿' where employee_id=103;

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

--[����4]
create table bookshop(
isbn varchar2(10) constraint PISBN primary key,
title varchar2(50) constraint CTIT not null,
author varchar2(50),
price number,
company varchar2(30));

insert into bookshop values('is001','�ڹ�33�Ͽϼ�','���ڹ�',25000,'�߸޷����ǻ�');
insert into bookshop values('pa002','JSP���εǱ�','�̴���',28000,'��������');
insert into bookshop values('or003','����Ŭ�����������ϱ�','�ڵ���',23500,'�߸޷����ǻ�');

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

create or replace view bs_view(å����, ����, ���Ǹűݾ�)
as select title,
          author,
          to_char(sum(qty*price),'9,999,999')
from bookshop
join bookorder using(isbn)
group by(title,author)--�׷��Ű�� ������ select�� �� ����.
with read only;

select * from bs_view;