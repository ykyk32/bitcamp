--ex11)?self?����
    --1
select e.employee_id as �����ȣ,
    e.last_name as ����̸�,
    m.last_name as ������
from employees e,employees m
where m.employee_id= e.manager_id;
    --2
select e.employee_id as �����ȣ,
    e.last_name as ����̸�,
    m.last_name as ������
from employees e
join employees m on(m.employee_id=e.manager_id);

--ex12)?cross?join
select*from countries,locations;
select*from countries cross join locations;

--ex13)?Non?Equijoin
create table salgrade(
salvel varchar2(2),
lowst number,
highst number);

insert into salgrade values('A',20000,29999);
insert into salgrade values('B',10000,19999);
insert into salgrade values('C',0,9999);
commit;

select* from salgrade;

select last_name,salary,salvel
from employees
join salgrade on(salary between lowst and highst)
order by salary desc;