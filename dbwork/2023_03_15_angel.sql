--ppt 23������ table
--table  ���� (person): ��ȣ,�̸�,����,����,����,���糯¥
create table person (
    num number(3) PRIMARY key,
    name varchar2(15) not null,
    age number(3),
    gender varchar2(10) DEFAULT '����',
    city varchar2(15) DEFAULT '����',
    today date    
);

--����Ÿ ��ȸ
select * from person;

-- insert �÷�����Ÿ �Ϻθ� �߰��� ���
insert into person (num,name,today) values (1,'ȫ�浿',sysdate);
--pk(primary key), nn(not null) �̰�� ���� �ȳ־��ָ� �����߻�-Ȯ��
--ORA-01400: NULL�� ("ANGEL"."PERSON"."NUM") �ȿ� ������ �� �����ϴ�
insert into person (name,age,today) values ('��ö��',23,'2022-10-10');--����
--nn �Ӽ��� �� �÷��� ������ �־�����Ѵ�,�̹����� num�� ���� ����Ÿ�� �־��
insert into person (num,name,age,today) values (1,'��ö��',23,'2022-10-10');
















