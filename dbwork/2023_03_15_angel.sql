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
--ORA-00001: ���Ἲ ���� ����(ANGEL.SYS_C008318)�� ����˴ϴ�
insert into person (num,name,age,today) values (1,'��ö��',23,'2022-10-10');--����
--�������� �������� ����� �־��
insert into person (num,name,age,today) values (2,'��ö��',23,'2022-10-10');
--�Ϻ� �÷��� �ƴ϶� ������� ��� �÷����� ������� �÷��� ���� ����
insert into person values (3,'��ȣ��',34,'����','���ֵ�','2021-12-25');
--���� 7������ �߰��غ���
insert into person values (4,'��ȿ��',27,'����','�λ�','2023-01-25');
insert into person values (5,'������',45,'����','�ϻ�',sysdate);
insert into person values (6,'����',39,'����','����','2022-05-10');
insert into person values (7,'������',19,'����','����','2020-11-22');
insert into person values (8,'��ȣ��',41,'����','�뱸',sysdate);
insert into person values (9,'������',32,'����','�λ�','2019-09-25');
insert into person values (10,'��ȿ��',28,'����','���ֵ�','2021-12-11');
commit;











