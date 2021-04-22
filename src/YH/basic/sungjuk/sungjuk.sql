create table sungjuk (
    sjno    int   auto_increment,
    name    varchar(10) not null,
    kor     int     default 0,
    eng     int     default 0,
    mat     int     default 0,
    tot     int,
    mean    decimal(5,1),
    grd     char(2),
    regdate datetime default current_timestamp,
      primary key (sjno)
);

-- 테이블 값 넣어 주기
insert into sungjuk ( name, kor, eng, mat, tot, mean, grd)
values( '지현 ', 98, 97, 87, 234, 85.5,'수' );

-- 테이블의 모든 열 조회
select sjno,name,kor,eng,mat,mid(regdate,1,10) regdate
from sungjuk order by sjno;

-- 조건하에 테이블의 모든 열 조회
select * from sungjuk where sjno =1;


-- 데이터 수정 테스트 //수정할 값은 국어 영어 수학만
update sungjuk
 set name =  'python', kor = 99, mat = 99
where sjno =1;

-- 데이터 삭제 테스트 -- 실행하지는 말것 삭제되니깐
 delete from sungjuk where sjno = 1;

-- board 테이블 만들기
 create table board (
     bdno    int   primary key,
     title    varchar(10) not null,
     userid   varchar(10),
     regdate   varchar(10),
     views    int   default 0,
     thumbup  int   default 0,
     contents  varchar(10)
     );

-- 테이블 값 넣어 주기
insert into board (  bdno , title , userid ,
  regdate, views ,  thumbup,contents)
values( 24681,' 전체 게시판 이용규칙','PROMPPfU',
'13/10/24', 4324677, 0,
'모든 게시판에 적용되는 이용규칙입니다. 이용에 반드시 참고하여 주시기 바랍니다.');

-- 테이블의 모든 열 조회
select bdno, title, userid, regdate, views , thumbup, contents
from board order by bdno;

-- 조건하에 테이블의 모든 열 조회
select * from board where bdno = 24681;


-- 데이터 수정 테스트
update board
 set title =  ' 특정 게시판 이용규칙 '
 where bdno = 24681;

 -- 데이터 삭제 테스트 -- 실행하지는 말것 삭제되니깐
 delete from board where bdno = 24681;