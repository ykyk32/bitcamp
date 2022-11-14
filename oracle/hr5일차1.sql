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
 
--[문제1]?최저급여를?받는?사원들의?이름과?급여를?구하시오
select last_name ,salary
from employees 
where salary = (select min(salary) from employees);

--[문제2]?부서별?급여?합계?중?최대급여를?받는?부서의?부서명과?급여합계를?구하시오
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

--[문제3]
select last_name as 사원명,job_id as 업무ID, to_char(salary,'999,999')||'원' as 급여
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
--★?방법1?(in?연산자)
select employee_id as  사원번호,
 last_name as 이름,
 case   
    when employee_id in (select manager_id from employees)then '관리자'
    else'직원'
    end as 구분
from employees order by 3,1;

--★?방법2?(union,?in,?not?in?연산자)
select employee_id as 사원번호, last_name as 이름,'관리자' as 구분
from employees 
where employee_id in (select manager_id from employees)
union
select employee_id as 사원번호, last_name as 이름,'관리자' as 구분
from employees
where employee_id not in (select manager_id from employees where manager_id is not null)
order by 3,1;

--★?방법3?(상관?쿼리?이용)
select employee_id as 사원번호,last_name as 이름, '관리자' as 구분
from employees e
where exists (select null from employees where e.employee_id=manager_id)
union
select employee_id  as 사원번호,last_name as 이름, '직원' as 구분
from employees e
where not exists (select null from employees where e.employee_id=manager_id)
order by 3,1;

--[문제4]
select last_name as 사원이름,
        job_id as 업무ID,
        job_title as 직무,
        salary as  급여
from employees 
join jobs using(job_id)
where(job_id,salary)in (select job_id,trunc(avg(salary),-3) from employees group by job_id)
order by 4;
