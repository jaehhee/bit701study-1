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
insert into person (num,name,age,today) values (1,'강철수',23,'2022-10-10');
















