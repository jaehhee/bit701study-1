--ppt 23페이지 table
--table  생성 (person): 번호,이름,나이,성별,지역,현재날짜
create table person (
    num number(3) PRIMARY key,
    name varchar2(15) not null,
    age number(3),
    gender varchar2(10) DEFAULT '남자',
    city varchar2(15) DEFAULT '서울',
    today date    
);

--데이타 조회
select * from person;

-- insert 컬럼데이타 일부만 추가할 경우
insert into person (num,name,today) values (1,'홍길동',sysdate);
--pk(primary key), nn(not null) 이경우 값을 안넣어주면 오류발생-확인
--ORA-01400: NULL을 ("ANGEL"."PERSON"."NUM") 안에 삽입할 수 없습니다
insert into person (name,age,today) values ('강철수',23,'2022-10-10');--오류
--nn 속성이 들어간 컬럼은 무조건 넣어줘야한다,이번에는 num에 같은 데이타를 넣어보자
--ORA-00001: 무결성 제약 조건(ANGEL.SYS_C008318)에 위배됩니다
insert into person (num,name,age,today) values (1,'강철수',23,'2022-10-10');--오류
--오류없이 나오도록 제대로 넣어보자
insert into person (num,name,age,today) values (2,'강철수',23,'2022-10-10');
--일부 컬럼이 아니라 순서대로 모든 컬럼값을 넣을경우 컬럼명 생략 가능
insert into person values (3,'강호순',34,'여자','제주도','2021-12-25');
--각각 7개정도 추가해보자
insert into person values (4,'이효리',27,'여자','부산','2023-01-25');
insert into person values (5,'김진수',45,'남자','일산',sysdate);
insert into person values (6,'이진',39,'여자','뉴욕','2022-05-10');
insert into person values (7,'박지윤',19,'여자','김포','2020-11-22');
insert into person values (8,'강호동',41,'남자','대구',sysdate);
insert into person values (9,'박지나',32,'여자','부산','2019-09-25');
insert into person values (10,'이효진',28,'여자','제주도','2021-12-11');
commit;











