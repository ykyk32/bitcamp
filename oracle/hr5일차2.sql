--ex7)
select department_name, job_title, round(avg(salary),2)as"Avg_sal"
from employees
join departments using( department_id)
join jobs using(job_id)
group by rollup(department_name,job_title);

--ex8)?group?by?cube?:??a별?집계?또는?b별?집계
select department_name,job_title, round(avg(salary),2)as "Avg_sal"
from employees
join departments using(department_id)
join jobs using(job_id)
group by cube(department_name,job_title);

--ex9)?group?by?grouping?sets
select job_title ,round(avg(salary),2) as"Avg_sal"
from employees
join departments using(department_id)
join jobs using (job_id)
group by grouping sets((job_title),());
