--ex1)
select department_id from employees where first_name='Neena';
select department_name from departments where department_id =90;

select department_name from departments
where department_id = (select department_id from employees where first_name='Neena');

--ex2)
select last_name department_id,salary
from employees 
where department_id =(select department_id from employees where first_name='Neena')
 and salary > (select salary from employees where first_name ='Neena');
 
--[����1]?�����޿���?�޴�?�������?�̸���?�޿���?���Ͻÿ�
select last_name ,salary
from employees 
where salary = (select min(salary) from employees);

--[����2]?�μ���?�޿�?�հ�?��?�ִ�޿���?�޴�?�μ���?�μ����?�޿��հ踦?���Ͻÿ�
select department_name, sum(salary)
from employees
join departments using (department_id)
group by department_name
having sum(salary)=(select max(sum(salary))from employees group by department_id) ;


--ex3)
select last_name,department_name, salary
from employees
join departments using(department_id)
where department_id =(select department_id from employees where last_name='Austin')
    and salary = (select salary from employees where last_name ='Austin');
    
--ex4)
select last_name,job_id slary
from employees
where job_id='IT_PROG' and
    salary >any (select salary from employees where job_id='ST_MAN');

--[����3]
select last_name as �����,job_id as ����ID, to_char(salary,'999,999')||'��' as �޿�
from employees
where (job_id ='FI_ACCOUNT' or job_id ='SA_REP')
    and
    salary > all (select salary from employees where job_id='IT_PROG')
order by 3 desc;

--ex5)?
select last_name,job_id,salary
from employees
where salary in(select salary from employees where job_id ='IT_PROG');

--ex6)
--��?���1?(in?������)
select employee_id as  �����ȣ,
 last_name as �̸�,
 case   
    when employee_id in (select manager_id from employees)then '������'
    else'����'
    end as ����
from employees order by 3,1;

--��?���2?(union,?in,?not?in?������)
select employee_id as �����ȣ, last_name as �̸�,'������' as ����
from employees 
where employee_id in (select manager_id from employees)
union
select employee_id as �����ȣ, last_name as �̸�,'������' as ����
from employees
where employee_id not in (select manager_id from employees where manager_id is not null)
order by 3,1;

--��?���3?(���?����?�̿�)
select employee_id as �����ȣ,last_name as �̸�, '������' as ����
from employees e
where exists (select null from employees where e.employee_id=manager_id)
union
select employee_id  as �����ȣ,last_name as �̸�, '����' as ����
from employees e
where not exists (select null from employees where e.employee_id=manager_id)
order by 3,1;

--[����4]
select last_name as ����̸�,
        job_id as ����ID,
        job_title as ����,
        salary as  �޿�
from employees 
join jobs using(job_id)
where(job_id,salary)in (select job_id,trunc(avg(salary),-3) from employees group by job_id)
order by 4;
