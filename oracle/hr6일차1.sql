
--ex1) ���̺� : test 
create table test(
id number(5),
name char(10),
address varchar2(50));

--ex2) ���̺� : user1
create table user1(
idx number primary key,
id varchar2(10) unique,
name varchar2(10) not null,
phone varchar2(15),
address varchar2(50),
score number(6,2) check(score >= 0 and score <= 100),
subject_code number(5),
hire_date date default sysdate,
marriage char(1) default 'N' check(marriage in('Y', 'N')));

--ex3) �������� Ȯ��
select constraint_name, constraint_type 
from user_constraints
where table_name='USER1';

select *
from user_constraints
where table_name='USER1';

--ex4) ���̺�
create table user2(
idx number constraint PKIDX primary key,
id varchar2(10) constraint UNID unique,
name varchar2(10) constraint NOTNAME not null,
phone varchar2(15),
address varchar2(50),
score number(6,2) constraint CKSCORE check(score >=0 and score <=100),
subject_code number(5),
hire_date date default sysdate,
marriage char(1) default 'N' constraint CKMARR check(marriage in('Y','N')));

--ex5) �������� Ȯ��
select constraint_name , constraint_type
from user_constraints
where table_name='USER2';

select *
from user_constraints
where table_name = 'USER2';

--ex6) �߰�
insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(1,'aaa','kim','010-000-0000','����',75,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(1,'aaa','kim','010-000-0000','����',75,100,'2010-08-01','Y'); 

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'aaa','kim','010-000-0000','����',75,100,'2010-08-01','Y'); 

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','','010-000-0000','����',75,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','����',120,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','����',75,100,'2010-08-01','K');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','����',75,100,'2010-08-01','N');

--ex7) ���̺� ��� Ȯ��
select *from tab;

--ex8) ���̺��� ����Ȯ��
select * from user1;
select * from user2;

--ex9)?���̺���?����?Ȯ��
desc user1;

--ex10)?������?���?Ȯ��
select *from user_sequences;

--ex11)?���̺��?����?:?test?��?user3
alter table test rename to user3;

--ex12)?�÷�?�߰�?:??user3??��?phone??varchar2(15)
alter table user3 add phone varchar2(15);
desc user3;

--ex13)?��������?�߰�?:?user3??��??id��?unique,?�������Ǹ�?UID2
alter table user3 add constraint UID2 unique(id);

select constraint_name,constraint_type
from user_constraints
where table_name='USER3';

--ex14)?��������?����?-?alter?table?���̺��?drop?constraint?�������Ǹ�;
alter table user3 drop constraint UID2;
alter table user3 DROP constraint SYS_C007693;

select *
from user_constraints
where table_name='USER3';

--ex15)??�÷�?�߰�?:?user3?��?no??number??(PK?����)
alter table user3 add no number primary key;
desc user3;

--ex16)?����?����?:?user3?��?name?char(10)?��?varchar2(10)��?�ٲ�
alter table user3 modify name varchar2(10);
desc user3;

--ex17) �÷� ���� : user3 �� address
alter table user3 drop column address;
desc user3;

--ex18) ���̺���� / ���������: user3
drop table user3;
select * from tab;
purge recyclebin;

drop table user1 purge;

drop table user2;
show recyclebin;
flashback table user2 to before drop;
flashback table "BIN$mQkw3v/tQmyIs1qcFXRO+w==$0" to before drop;
select * from recyclebin;

--ex19) ������ ���� / ����
create sequence idx_sql increment by 2 start with 1 maxvalue 9 cycle nocache;

select idx_sql.nextval from dual;
select idx_sql.currval from dual;

drop sequence idx_sql;

--ex20) ���̺� ������ ������ ����
create table book(
no number primary key,
subject varchar2(50),
price number,
yesr date);

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into book(no, subject, price, year)
values(no_seq.nextval, '����Ŭ ������ �����ϱ�', 10000, sysdate);
insert into book(no, subject, price, year)
values(no_seq.nextval, '�ڹ� 3�� �ϼ�', 15000, '2007-03-01');
insert into book values(no_seq.nextval, 'JSP ���� �Ǳ�', 18000, '2010-01-01');
select * from book;

