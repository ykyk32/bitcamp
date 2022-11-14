
--ex20) ���̺� ������ ������ ����
create table book(
no number primary key,
subject varchar2(50),
price number,
year date);

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into book(no, subject, price, year)
values(no_seq.nextval, '����Ŭ ������ �����ϱ�', 10000, sysdate);
insert into book(no, subject, price, year)
values(no_seq.nextval, '�ڹ� 3�� �ϼ�', 15000, '2007-03-01');
insert into book values(no_seq.nextval, 'JSP ���� �Ǳ�', 18000, '2010-01-01');

select *from book;

--ex21) ���̺� ������ ����
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

--ex23) ���̺� ���� �� �� �߰�
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
insert into dept(deptno, dname) values(10, '���ߺ�');
insert into dept(deptno, dname) values(20, '������');
insert into dept(deptno, dname) values(30, '������');
insert into dept(dname) values(40,'�渮��');
insert into dept(deptno, dname) values(40,'�渮��');

insert into emp(empno,ename, deptno) values (100, 'ȫ�浿', 10);
insert into emp(empno, ename, deptno) values(101, '���̾�', 20);
insert into emp(empno, ename, deptno) values(102, 'Ʃ��', 50); 

insert into emp(empno, ename, deptno) values(103, '����ġ', 40);
insert into emp(empno, ename) values(105, '���ε�');
insert into emp(ename,deptno)values('��',10);

commit;

delete from dept;
select *from dept;
rollback;

delete from dept where deptno=40;
select* from dept;
select* from emp;

--ex25) ����(update)
update emp set deptno=30 where ename='���ε�';
select* from emp;
commit;