create table employees_role as select* from employees where 1=0;

select * from employees_role;

insert into employees_role values(101, 'Neena', 'Kochhar', 'NKOCHHAR', '515.123.4568', 
'1989-09-21', 'AD_VP', 17000.00, NULL, 100, 90);
insert into employees_role values(101, 'Neena', 'Kochhar', 'NKOCHHAR', '515.123.4568', 
'1989-09-21', 'AD_VP', 17000.00, NULL, 100, 90);
insert into employees_role values(101, 'Nee', 'Ko', 'NKOCHHAR', '515.123.4568', 
'1989-09-21', 'AD_VP', 17000.00, NULL, 100, 90);
insert into employees_role values(200, 'Neena', 'Kochhar', 'NKOCHHAR', '515.123.4568', 
'1989-09-21', 'AD_VP', 17000.00, NULL, 100, 90);
insert into employees_role values(200, 'Nee', 'Kochhar', 'NKOCHHAR', '515.123.4568', 
'1989-09-21', 'AD_VP', 17000.00, NULL, 100, 90);
insert into employees_role values(300, 'GilDong', 'Hong', 'NKOCHHAR', '010-123-4567', 
'2009-03-01', 'IT_PROG', 23000.00, NULL, 100, 90);

commit;

--ex1) union
select employee_id, last_name from employees
union
select employee_id, last_name from employees_role;

--ex2) union all
select employee_id,last_name from employees
union all 
select employee_id, last_name from employees_role;

select salary from employees where department_id=10
union all 
select salary from employees where department_id=30 order by 1;

--ex3) minus
select employee_id,last_name from employees
minus
select employee_id, last_name from employees_role;

--ex4) intersect
select employee_id,last_name from employees
intersect
select employee_id, last_name from employees_role;

--[문제1]
select last_name,job_id,department_id from employees where department_id=10
union
select last_name,job_id,department_id from employees_role where job_id='IT_PROG';

--ex5) SET operator과 IN operator관계
    --방법1(join, in연산자 이용)
    select last_name,job_title
    from employees
    join jobs using(job_id)
    where job_title in('Stock Manager','Programmer');
    --방법2 (join, union 이용)
    select last_name, job_title
    from employees
    join jobs using (job_id)
    where job_title='Stock Manager'
    union
     select last_name, job_title
    from employees
    join jobs using (job_id)
    where job_title='Programmer'
    order by 2;
    
--ex9) 컬럼명이 다른 경우의 SET operator
select last_name,employee_id, hire_date
from employees
where department_id=20
union
select department_name,department_id,null
from departments
where department_id=20;
