--ex1)

select to_char(trunc(avg(salary),0),'99,999') as ����޿���� from employees;

--ex2)
select department_id as �μ��ڵ�,
    to_char(round(avg(salary),0),'L99,999,999')as ��ձ޿�
    from employees
    group by department_id
    having avg(salary)>= 5000
    order by department_id asc;

--ex3)    
select last_name, avg(salary)
from employees
group by department_id;


--[����1]
select  job_id, sum(salary) as �޿��հ�
    from employees
    group by job_id;
    
--ex4)
select department_id,max(salary) as max_salary
from employees
group by department_id
having department_id in(10,20)
order by department_id;

select department_id, max(salary) as max_salary
from employees
where department_id in(10,20)
group by department_id
order by department_id;

--ex5)
select employee_id,salary, department_id,
first_value(salary) over(partition by department_id order by salary desc)"highsal_deptID"
from employees;


select employee_id, 
    employees.department_id,
    department_name
from employees,departments
where employees.department_id= departments.department_id;

select employee_id,
    e.department_id,
    department_name
from employees e, departments d
where e.department_id =d.department_id;

select employee_id,department_id,department_name
from employees
join departments using(department_id);
--[����2]
select department_id ,city
from departments, locations
where departments.location_id =locations.location_id;
--[����2]
select department_id, city
from departments d, locations l
where d.location_id =l.location_id;
--[����2]
select department_id,city
from departments
join locations using(location_id);

--ex6)

select e.last_name, d.department_id,d.department_name
from employees e,departments d
where e.department_id = d.department_id(+);

select last_name,department_id,department_name
from employees
left join departments using(department_id);

--ex7)

select e.last_name,d.department_id, d.department_name
from employees e, departments d
where e.department_id(+) = d.department_id;

select last_name, department_id, department_name
from employees right join departments using(department_id);

--ex8)??full?join

select last_name, department_id,department_name
from employees
full join departments using(department_id);

--ex9)inner?join?:?��?����?�÷���?��ġ?�ϴ�?���

select e.last_name, d.department_id, d.manager_id
from employees e, departments d
where e.department_id=d.department_id and e.manager_id=d.manager_id;

select last_name,department_id manager_id
from employees
inner join departments using(department_id,manager_id);

--ex10)������?������?�÷�����?�ٸ�?��쿡?��������?�����ϱ�
create table locations2 as select * from locations;
select*from locations2;
alter table locations2 rename column location_id to loc_id;
select *from locations2;
--���1(����Ŭ?����?����
select d.department_id,l.city
from departments d ,locations2 l
where d.location_id=l.loc_id;

--���2(Ansi?ǥ��)
select department_id,city
from departments
join locations2 on(location_id=loc_id);

--���3(Ansi?ǥ��)
select department_id,city
from departments d
join locations2 l on (d.location_id=l.loc_id);

--ex14)?n(����)����?���̺���?����
select last_name,job_title,department_name
from employees 
join departments using(department_id)
join jobs using(job_id);

--[����3]?
select last_name as ����̸�,city as "�� ��",department_name as �μ��̸�
from departments
join locations2 on(location_id=loc_id)
join employees using(department_id)
where city in ('Seattle','Oxford')
order by 2 asc;

--[����4]?
select employee_id as �����ȣ,last_name as ����̸�,department_id as �μ��̸�,city ����,
street_address as �����ּ�,country_name as �����̸�
from employees
left join departments using(department_id)
join locations2 on (location_id = loc_id)
join countries using(country_id)
where street_address like '%Ch%' 
or street_address like '%Sh%' 
or street_address like'%Rd%'
order by 6,4 asc;



