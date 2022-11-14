--ex5)

create or replace view v_view7("부서ID","부서평균")
as select nvl(department_id,5000),
round(avg(salary),-3)
from employees
group by department_id
order by department_id asc;

select * from v_view7;

select 부서ID,부서평균
from (select nvl(department_id,5000)"부서ID",
round (avg(salary),-3)"부서평균"
from employees group by department_id
order by department_id asc);

--[문제5]?
--5-1.
select department_name as 부서명, max(salary) as 최대급여
 from employees
    join departments using(department_id) 
    group by department_name;
-------------------------------
select 부서명,최대급여
from (select department_name as 부서명,max(salary) as 최대급여
    from employees
    join departments using(department_id) 
    group by department_name);
--5-2.
select 이름,부서명,최대급여
from (select last_name as 이름 ,department_name as 부서명 ,salary as 최대급여
     from employees 
     join departments using(department_id) 
     where (department_name,salary)in (select department_name, max(salary) 
                                    from employees
                                    join departments using(department_id)
                                    group by department_name));
                                    
--ex6)?Top?N분석
select rownum,last_name,salary
from(select last_name,nvl(salary,0) as salary from employees order by 2 desc)
where reownum<=3;

--ex7)?최고급여를?받는?사원?1명을?구하시오
select rownum,last_name,salary
from (select last_name,nvl(salary,0) as salary from employees order by 2 desc)
where rownum = 1;
--?rownum=2는?error?(특정?행은?사용할?수?없음)

--ex8)
select* from 
(select rownum, ceil(rownum/3) as page, tt.* from
(select last_name,nvl(salary,0)as salary from employees order by salary desc) tt
)where page =2;

select *from 
(select rownum rn,tt.*from
(select last_name,nvl(salary,0) as salary from employees order by 2 desc)tt
)where rn >= 4 and rn <=6;

--[문제6]
select rownum, last_name as 사원이름, department_name as 부서명,to_char( salary ,'L999,999')as 연봉 
from (select last_name,
        department_name,
        salary*12+(salary*12*nvl(COMMISSION_PCT,0)) as salary
from employees
join departments using (department_id)
order by 3 asc)
where rownum <=5 ;

grant all on employees to c##java;--Grant을(를) 성공했습니다.


