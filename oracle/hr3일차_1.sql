--ex1)

select to_char(trunc(avg(salary),0),'99,999') as 사원급여평균 from employees;

--ex2)
select department_id as 부서코드,
    to_char(round(avg(salary),0),'L99,999,999')as 평균급여
    from employees
    group by department_id
    having avg(salary)>= 5000
    order by department_id asc;

--ex3)    
select last_name, avg(salary)
from employees
group by department_id;


--[문제1]
select  job_id, sum(salary) as 급여합계
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
--[문제2]
select department_id ,city
from departments, locations
where departments.location_id =locations.location_id;
--[문제2]
select department_id, city
from departments d, locations l
where d.location_id =l.location_id;
--[문제2]
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

--ex9)inner?join?:?두?개의?컬럼이?일치?하는?경우

select e.last_name, d.department_id, d.manager_id
from employees e, departments d
where e.department_id=d.department_id and e.manager_id=d.manager_id;

select last_name,department_id manager_id
from employees
inner join departments using(department_id,manager_id);

--ex10)내용은?같은데?컬럼명이?다른?경우에?조인으로?연결하기
create table locations2 as select * from locations;
select*from locations2;
alter table locations2 rename column location_id to loc_id;
select *from locations2;
--방법1(오라클?전용?구문
select d.department_id,l.city
from departments d ,locations2 l
where d.location_id=l.loc_id;

--방법2(Ansi?표준)
select department_id,city
from departments
join locations2 on(location_id=loc_id);

--방법3(Ansi?표준)
select department_id,city
from departments d
join locations2 l on (d.location_id=l.loc_id);

--ex14)?n(여러)개의?테이블은?조인
select last_name,job_title,department_name
from employees 
join departments using(department_id)
join jobs using(job_id);

--[문제3]?
select last_name as 사원이름,city as "도 시",department_name as 부서이름
from departments
join locations2 on(location_id=loc_id)
join employees using(department_id)
where city in ('Seattle','Oxford')
order by 2 asc;

--[문제4]?
select employee_id as 사원번호,last_name as 사원이름,department_id as 부서이름,city 도시,
street_address as 도시주소,country_name as 나라이름
from employees
left join departments using(department_id)
join locations2 on (location_id = loc_id)
join countries using(country_id)
where street_address like '%Ch%' 
or street_address like '%Sh%' 
or street_address like'%Rd%'
order by 6,4 asc;



