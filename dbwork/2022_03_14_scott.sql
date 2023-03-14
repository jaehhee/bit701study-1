-- emp ���̺� ��ü �÷� ��ȸ
select * from emp;
--emp ���̺� �ִ� ������ ������ ���(���������� �ѹ���)
select DISTINCT job from emp;
--�÷��� ��Ī�� ����
select ename as "�����" ,job as "����" from emp;
--as����,��Ī�� �����߰��� ������ ������ " ���� ����
select ename "���� �����",job ���� from emp;
--���� : empno �� 7369,7566 �ΰ��� ����Ÿ Ȯ��
select * from emp where empno=7369 or empno=7566;
-- SMITH,WARD �� ����Ÿ ���
SELECT * FROM EMP WHERE ENAME='SMITH' OR ENAME='WARD';
--IN ������(OR �����ڷ� ��ȸ�ϴ°�� IN ���ε� ��ȸ ����)
SELECT * FROM EMP WHERE ENAME IN ('SMITH','WARD','SCOTT','FORD');
SELECT * FROM EMP WHERE EMPNO IN (7369,7654,7788,7876);
--AND �������� ��ȭ�ϴ� ���
SELECT ENAME,JOB,SAL,COMM FROM EMP WHERE SAL>=1500 AND SAL<=3000;
--���� SQL���� BETWEEN ���ε� ��ȸ�� ����
SELECT ENAME,JOB,SAL,COMM FROM EMP WHERE SAL BETWEEN 1500 AND 3000;
--������ MANAGER �� ����� SAL �� 2õ �̻��λ��
SELECT * FROM EMP WHERE JOB='MANAGER' AND SAL>=2000;
--COMM �� NULL �ΰ�츸 ���
SELECT * FROM EMP WHERE COMM IS NULL;
--COMM �� NULL �� �ƴ� ��츸 ���
SELECT * FROM EMP WHERE COMM IS NOT NULL;
--ENAME �� A�� �����ϴ� ����Ÿ ��ȸ
SELECT * FROM EMP WHERE ENAME LIKE 'A%';
--ENAME �� S�� ������ ����Ÿ ��ȸ
SELECT * FROM EMP WHERE ENAME LIKE '%S';
--ENAME �� A�� S�� �����ϴ� ����Ÿ ��ȸ
SELECT * FROM EMP WHERE ENAME LIKE 'A%' OR ENAME LIKE 'S%';
--ENAME �� 2��°�� 3��° ���ڰ� A�λ�� ��ȸ
SELECT * FROM EMP WHERE ENAME LIKE '_A%' OR ENAME LIKE '__A%';
--JOB �� MANAGER �� ANALYST �߿� SAL �� 2500 �̻��� ����� ��ȸ
SELECT * FROM EMP WHERE (JOB='MANAGER' OR JOB='ANALYST') AND SAL>=2500;
--IN ���� ����
SELECT * FROM EMP WHERE JOB IN ('MANAGER','ANALYST') AND SAL>=2500;
--SCOTT �� ������ ���� ������ �޴� ����� ��ȸ-��������(SUBQUERY)
SELECT * FROM EMP WHERE SAL=(SELECT SAL FROM EMP WHERE ENAME='SCOTT');
--ALLEN �� ������ ���� ������ ���� ����� ��ȸ�ϱ�
SELECT * FROM EMP WHERE JOB=(SELECT JOB FROM EMP WHERE ENAME='ALLEN');
--CONSOLE �� ��½� ���̺���� DUAL
--PPT 48������ �����Լ�-�����Լ�
SELECT ABS(-6),ABS(6) FROM DUAL; --ABS :���밪,������ ����� ���
SELECT CEIL(2.75),CEIL(2.11) FROM DUAL;--������ �ø����� ������ ��ȯ
SELECT FLOOR(2.75),FLOOR(2.11) FROM DUAL; --������ ������ �� ������ ��ȯ
SELECT ROUND(2.356,1),ROUND(2.22,1) FROM DUAL; --�Ҽ���1°�ڸ����� ���Ѵ�(�ݿø�)
SELECT TRUNC(2.356,1),TRUNC(2.22,1) FROM DUAL;--�Ҽ���1°�ڸ����� ���Ѵ�(�ݳ���)
SELECT ROUND(235678,-1),ROUND(235678,-2) FROM DUAL;--235680,235700
SELECT POWER(2,3),POWER(3,4) FROM DUAL;--8,81 �����±��ϱ�
SELECT MOD(7,2),MOD(10,2) FROM DUAL;--������ ���ϱ�  1,0

--49������ ���ڿ� �Լ�
SELECT CONCAT('JAVA','SPRING') FROM DUAL; --���ڿ���ġ��
--���ڿ��� ��ĥ��� || �̰ŷε� �����ϴ�
SELECT 'JAVA'||'SPRING' FROM DUAL;
--table emp �� �غ���
select ename||'���� ������ '||job||'�Դϴ�' message from emp;--message �� �÷���
select ename||'���� ������ '||sal||'�����Դϴ�' sal from emp;
select initcap(ename) from emp;--ù���ڸ� �빮�ڷ� ���
select upper(ename),lower(ename) from emp;--�빮��,�ҹ��ڷ� ��ȯ�� ���
--lpad,rpad :Ư�����ڷ� ä���
select lpad('happy',10,'*') from dual;
select rpad('happy',10,'*') from dual;
select ename,lpad(sal,10,'0') sal from emp;
--substr :���ڿ� ����
select substr('Happy Day',3,3),substr('Happy Day',-3,3) from dual;--ppy,Day
--ename ���� �� 2���ڸ� ����� * 3�� �ٿ��� ����ϱ�
select substr(ename,1,2)||'***' ename from emp;
select rpad(substr(ename,1,2),5,'*') ename from emp;
--length ���̱��ϱ�
select ename||'���� ���� ���̴� '||length(ename)||'�����Դϴ�' �޼��� from emp;
--replace :��ġ
select replace('Hello Kitty','t','*') from dual;
--instr:Ư�����ڿ��� ��ġ ���ϱ�
select instr('Good Day','Day') from dual;--6  :6��°���� �߰�
select instr('Good Day','happy') from dual;--0 :������� 0
--trim : ���� ���� ����
select '*'||trim('   hello   ')||'*' from dual; 
select '*'||ltrim('   hello   ')||'*' from dual; --���� ���鸸 ����
select '*'||rtrim('   hello   ')||'*' from dual; --������ ���鸸 ����

--sysdate �� ���糯¥ ���ϱ�
select sysdate from dual;
--���� ��¥ ���ϱ�
select sysdate+1 from dual;
--�����ϵ�
select sysdate+7 from dual;
select to_char(sysdate,'yyyy-mm-dd') today from dual;--2023-03-14
select to_char(sysdate,'yyyy-mm-dd am hh:mi:ss') today from dual;--2023-03-14 ���� 03:22:04
select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') today from dual;--2023-03-14 15:22:04
select to_char(2345678,'L999,999,999') from dual;-- ��2,345,678
select to_char(2345678,'L000,000,000') from dual;-- ��002,345,678
select to_char(2345678,'$999,999,999') from dual;-- $2,345,678
select to_char(2.3,'0.00') from dual; --2.30

--NVL :�ΰ��ϰ�� Ư�������� ���(Mysql ������ ifnull)
select NVL(mgr,1000),NVL(comm,0) from emp;
select sal+comm from emp;--comm �� null �ϰ�� ���ϸ� ����� null
--comm �� null �ϰ�� 10���� ���
select sal+NVL(comm,10) pay from emp;
--decode:���� ���� ���� �ٸ� �� ���
select ename,deptno,decode(deptno,10,'����',20,'������',30,'��⵵',40,'���ֵ�') city from emp;

--order ������� ���
select ename,sal from emp order by ename asc; --ename �� ��������(asc��������)
select ename,sal from emp order by sal desc;--sal �� ��������
--������ ���, ���� �����ϰ�� ������ ��������
select ename,job,sal from emp order by job,sal desc;
--sal �� �������� ��½� sal �� 3��° ����ϹǷ� ����ȣ 3���� ����
select ename,job,sal from emp order by 3;
--���� 1500-3000 ������ ����ϴµ� �̸��� ��������
select ename,sal from emp where sal between 1500 and 3000 order by ename;

--�׷��Լ� : ppt 57
--count,max,min,sum,avg
select count(*) from emp;--emp �� ����Ÿ ����
select max(sal) from emp;--�ְ�޿�
select min(sal) from emp;--�����޿�
select sum(sal) from emp;--�޿��� �հ�
select round(avg(sal),-1) from emp;--�޿��� ���,�Ͽ��������� �ݿø�

--group �� �Լ� ����
-- �� ������ �ο����� sal �� ����� ���غ���
select job ����,count(*) �ο���,round(avg(sal),-1) ��տ��� from emp group by job;

--���� �Ÿ������� �ο����� �����ź��� ���
select job ����,count(*) �ο���,round(avg(sal),-1) ��տ��� from emp  group by job order by �ο���;

--���� ���������� ������ �ο����� 3�� �̻��� ����Ÿ�� ���
--�׷��Լ��� �̿��ؼ� ������ ��Ÿ������ having ���� �ش�
select job ����,count(*) �ο���,round(avg(sal),-1) ��տ��� from emp  
        group by job having count(*)>=3 order by �ο���;

--�� �������� �ο����� �ְ���,���������� ���(������ ��������)
select job ����,count(*) �ο���,max(sal) �ְ���,min(sal) ��������
        from emp group by job order by 1;-- 1 �÷���ȣ ��� ���� �ص���
        
--���� �������� �ݾ׾տ� ȭ������� ���̰� 3�ڸ��ĸ� �߰��Ϸ���
select job ����,count(*) �ο���,to_char(max(sal),'L999,999') �ְ���,
        to_char(min(sal),'L999,999') ��������
        from emp group by job order by 1;
        
--���� 
--1. emp���̺��� ename a�� s�� �����ϴ»�� ���(��ҹ��� �������)
  SELECT * FROM EMP WHERE UPPER(ENAME) LIKE 'A%' OR UPPER(ENAME) LIKE 'S%';
--2. emp���̺��� ename ���� �ι�° ���ڰ� 'A' �λ�� ���
  SELECT * FROM EMP WHERE ENAME LIKE '_A%';
--3. job ���� ���� �������ϰ�� �ѹ����� ����Ͻÿ�
  SELECT DISTINCT JOB FROM EMP;  
--4. job �������� �ο����� ���Ͻÿ�
  SELECT JOB,COUNT(*) �ο��� FROM EMP GROUP BY JOB;
--5. job �������� sal �� ��ձ޿��� ���Ͻÿ�
  SELECT JOB,ROUND(AVG(SAL),0) ��ձ޿� FROM EMP GROUP BY JOB;
--6. job �������� sal �� �ִ밪�� �ּҰ��� ���Ͻÿ�
  SELECT JOB,MAX(SAL),MIN(SAL) FROM EMP GROUP BY JOB;
--7. deptno �� 10�ΰ�� 'ȫ����'
--   20 �ΰ�� '���ߺ�' 30�ΰ�� '������' �μ��� ���Ͽ�
--   ename, �μ� �� ����Ͻÿ�
   SELECT ENAME,DEPTNO,DECODE(DEPTNO,10,'ȫ����',20,'���ߺ�',30,'������') FROM EMP;   
--8. �޿�(sal)�� sal �� ��պ��� �� ���� ����� ename �� sal �� ����Ͻÿ�
    SELECT ENAME,SAL FROM EMP WHERE SAL>(SELECT AVG(SAL) FROM EMP);
--9. hiredate ���� ���� 5���� ����� ename �� hiredate �� ����Ͻÿ�
   SELECT ENAME,HIREDATE FROM EMP WHERE TO_CHAR(HIREDATE,'MM')='05';
   SELECT ENAME,HIREDATE FROM EMP WHERE TO_CHAR(HIREDATE,'MM')=5;
   
--10. SCOTT �� �޿��� �����ϰų� �� ���� �޴� ������ �޿��� ����϶�
  SELECT ENAME,SAL FROM EMP WHERE SAL>=(SELECT SAL FROM EMP WHERE ENAME='SCOTT');
