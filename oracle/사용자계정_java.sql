create table 성적(
name varchar(15),
kor int,
eng number,
math number,
tot number);

--1byte : 영문자, 한글 -2byte, Express 한글 1자 = 3byte

select * from 성적;

insert into 성적 values('홍길동',89,90,78,0); --'문자','문자열'
insert into 성적 values('프로도',89,85,70,0);
commit;--오라클서버 갱신

rollback;
drop table 성적;