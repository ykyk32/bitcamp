
--ex1) 테이블 : test 
create table test(
id number(5),
name char(10),
address varchar2(50));

--ex2) 테이블 : user1
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

--ex3) 제약조건 확인
select constraint_name, constraint_type 
from user_constraints
where table_name='USER1';

select *
from user_constraints
where table_name='USER1';

--ex4) 테이블
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

--ex5) 제약조건 확인
select constraint_name , constraint_type
from user_constraints
where table_name='USER2';

select *
from user_constraints
where table_name = 'USER2';

--ex6) 추가
insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(1,'aaa','kim','010-000-0000','서울',75,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(1,'aaa','kim','010-000-0000','서울',75,100,'2010-08-01','Y'); 

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'aaa','kim','010-000-0000','서울',75,100,'2010-08-01','Y'); 

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','','010-000-0000','서울',75,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','서울',120,100,'2010-08-01','Y');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','서울',75,100,'2010-08-01','K');

insert into user1(idx,id,name,phone,address,score,subject_code,hire_date,marriage)
values(2,'bbb','lee','010-000-0000','서울',75,100,'2010-08-01','N');

--ex7) 테이블 목록 확인
select *from tab;

--ex8) 테이블의 내용확인
select * from user1;
select * from user2;

--ex9)?테이블의?구조?확인
desc user1;

--ex10)?시퀀스?목록?확인
select *from user_sequences;

--ex11)?테이블명?변경?:?test?→?user3
alter table test rename to user3;

--ex12)?컬럼?추가?:??user3??→?phone??varchar2(15)
alter table user3 add phone varchar2(15);
desc user3;

--ex13)?제약조건?추가?:?user3??→??id에?unique,?제약조건명?UID2
alter table user3 add constraint UID2 unique(id);

select constraint_name,constraint_type
from user_constraints
where table_name='USER3';

--ex14)?제약조건?삭제?-?alter?table?테이블명?drop?constraint?제약조건명;
alter table user3 drop constraint UID2;
alter table user3 DROP constraint SYS_C007693;

select *
from user_constraints
where table_name='USER3';

--ex15)??컬럼?추가?:?user3?→?no??number??(PK?설정)
alter table user3 add no number primary key;
desc user3;

--ex16)?구조?변경?:?user3?→?name?char(10)?를?varchar2(10)로?바꿈
alter table user3 modify name varchar2(10);
desc user3;

--ex17) 컬럼 삭제 : user3 → address
alter table user3 drop column address;
desc user3;

--ex18) 테이블삭제 / 휴지통비우기: user3
drop table user3;
select * from tab;
purge recyclebin;

drop table user1 purge;

drop table user2;
show recyclebin;
flashback table user2 to before drop;
flashback table "BIN$mQkw3v/tQmyIs1qcFXRO+w==$0" to before drop;
select * from recyclebin;

--ex19) 시퀀스 생성 / 삭제
create sequence idx_sql increment by 2 start with 1 maxvalue 9 cycle nocache;

select idx_sql.nextval from dual;
select idx_sql.currval from dual;

drop sequence idx_sql;

--ex20) 테이블 생성과 시퀀스 적용
create table book(
no number primary key,
subject varchar2(50),
price number,
yesr date);

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into book(no, subject, price, year)
values(no_seq.nextval, '오라클 무작정 따라하기', 10000, sysdate);
insert into book(no, subject, price, year)
values(no_seq.nextval, '자바 3일 완성', 15000, '2007-03-01');
insert into book values(no_seq.nextval, 'JSP 달인 되기', 18000, '2010-01-01');
select * from book;

