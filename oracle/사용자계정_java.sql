create table ����(
name varchar(15),
kor int,
eng number,
math number,
tot number);

--1byte : ������, �ѱ� -2byte, Express �ѱ� 1�� = 3byte

select * from ����;

insert into ���� values('ȫ�浿',89,90,78,0); --'����','���ڿ�'
insert into ���� values('���ε�',89,85,70,0);
commit;--����Ŭ���� ����

rollback;
drop table ����;