
--ex20) 테이블 생성과 시퀀스 적용
create table book(
no number primary key,
subject varchar2(50),
price number,
year date);

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into book(no, subject, price, year)
values(no_seq.nextval, '오라클 무작정 따라하기', 10000, sysdate);
insert into book(no, subject, price, year)
values(no_seq.nextval, '자바 3일 완성', 15000, '2007-03-01');
insert into book values(no_seq.nextval, 'JSP 달인 되기', 18000, '2010-01-01');

select *from book;

--ex21) 테이블 구조만 복사
create table user3 as select * from user2 where 1=0;
desc user3;

select constraint_name, constraint_type, search_condition
from user_constraints
where table_name='USER2';

select constraint_name, constraint_type, search_condition 
from user_constraints
where table_name='USER3';

--ex22)
create table user4(bunho,irum,juso)
as select idx,name,address from user1 where id='bbb';

select * from user1;
select * from user4;

--ex23) 테이블 생성 후 행 추가
create table dept(
deptno number constraint DNO primary key,
dname varchar2(30) constraint DNAME not null
);

create table emp(
empno number constraint ENO primary key,
ename varchar2(30) constraint ENAME not null,
deptno number,
constraint FKNO foreign key(deptno) references dept on delete set null
);
insert into dept(deptno, dname) values(10, '개발부');
insert into dept(deptno, dname) values(20, '영업부');
insert into dept(deptno, dname) values(30, '관리부');
insert into dept(dname) values(40,'경리부');
insert into dept(deptno, dname) values(40,'경리부');

insert into emp(empno,ename, deptno) values (100, '홍길동', 10);
insert into emp(empno, ename, deptno) values(101, '라이언', 20);
insert into emp(empno, ename, deptno) values(102, '튜브', 50); 

insert into emp(empno, ename, deptno) values(103, '어피치', 40);
insert into emp(empno, ename) values(105, '프로도');
insert into emp(ename,deptno)values('콘',10);

commit;

delete from dept;
select *from dept;
rollback;

delete from dept where deptno=40;
select* from dept;
select* from emp;

--ex25) 수정(update)
update emp set deptno=30 where ename='프로도';
select* from emp;
commit;