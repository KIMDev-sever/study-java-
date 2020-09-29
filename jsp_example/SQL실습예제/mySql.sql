
-- MySql.sql
-- SQL파일에서 코멘트는 --임


-- DB조작 툴
-- 1) PowerShell - 커맨드라인 툴
-- 2) 워크벤치(앱,로컬) - GUI 툴, 속도빠름,
--      (원격PC 접속시에는 보안제한이 걸림)
-- 3) phpMyAdmin(웹) - GUI툴 , 속도가 느림
--      (호스팅시에는 이걸루 써야 됨) 

-- SQL(Structured Query Language: 구조화 질의어)이고,
-- DBMS(Database Management System)의 데이타를 관리하기 위한
-- 특수(일반아님) 목적의 프로그래밍 언어이다.

-- SQL은 역할에 따라 DML, DDL, DCL, TCL로 나누임.
1. DML(Data Manupulation Language) 데이타 조작어
   SELECT - 데이타 조회(검색)
   DELETE - 데이타 삭제
   INSERT - 데이타 추가
   UPDATE - 데이타 수정
2. DDL(Data Definition Language) DBMS 객체를 제어함
   CREATE - TABLE이나 DB를 생성
   DROP - TABLE이나 DB를 삭제
   ALTER - TABLE이나 DB내용 수정
3. DCL(Data Control Language ) DBMS 권한을 제어함
   GRANT - 읽기/쓰기/수정/삭제 권한 부여
   REVOKE - 읽기/쓰기/수정/삭제 권한 삭제
4. TCL(Transaction Control Language ) 일괄처리 명령어
  COMMIT - 일괄처리 시작
  ROLLBACK - 일괄처리 되돌림

-- SQL문법에서 "", '' 쌍따옴표 단따옴표는 동일하게 사용.
-- 문장 마지막에 ; 세미콜론은 한줄일 때는 안써도 됨. 여러줄일때는 쓴다.

-- 테이블의 키(Key)
-- 1.기본키 (Primary Key) : DBMS에서 관리하는 중복되지 않는 인덱스번호
-- 2.외래키 (Foreign Key) : 한 테이블에서 다른 테이블의 기본키 값을 가질때
--                          이 키를 외래키라고 한다.

1.DB파일 만들기 
  이름: mydb
2.Table 만들기
  이름: student 
  컬럼(5): 필드(Field) 
  DB 스케마(Schema) : 구조
  no : Int 10, Primary Key, Auto Increament
  name : varchar 10
  phone : varchar 20
  address : varchar 100
  memo : varchar 200

3.데이타(레코드) 추가하기
  INSERT INTO 로 데이타 추가함

4.검색하기 SELECT
  -- 모든 데이타 필드 가져오기
  SELECT   *    FROM student;
  -- name 필드만 가져오기
  SELECT name FROM student;
  -- name,phone 필드만 가져오기
  SELECT name,phone FROM student;

INSERT INTO `student` VALUES (5, '마동석', '01055556666', '강남', '마블리입니다');
INSERT INTO `student` VALUES (6, '태연', '01088889999', '신사동', '태블리입니다');
INSERT INTO `student` VALUES (7, '서준', '01011112222', '상계동', '서준입니다');

5.검색 조건 넣기 Where절
  -- name="홍길동" 인 사람만 검색하기
  SELECT * FROM student WHERE name = "홍길동";
  -- name="아이언맨" 이거나(OR) address="한양" 인 사람 검색하기
  SELECT * FROM student WHERE name="아이언맨" OR address="한양";
  -- name="아이언맨" 이고(AND) address="맨하탄" 인 사람 검색하기
  SELECT * FROM student WHERE name="아이언맨" AND address="맨하탄";
  -- name이 "홍"으로 시작하는 사람 검색하기
  SELECT * FROM student WHERE name like "홍%";
  -- name이 "맨"으로 끝나는 사람 검색하기
  SELECT * FROM student WHERE name like "%맨";
  -- name 가운데 "길"이 들어있는 사람 검색하기
  SELECT * FROM student WHERE name like "%길%";

6.검색 정렬하기 Order by절
  -- name 필드기준으로 오름차순으로 (가나다, ABC) 정렬하기
  SELECT * FROM student ORDER BY name asc;
  -- name 필드기준으로 내림차순으로 (다나가, CBA) 정렬하기
  SELECT * FROM student ORDER BY name desc;

7.검색 중복되는 데이타 제거하기
  -- 홍길동 이라는 사람이 2개 이상이면 1개로 보여줌.
  SELECT DISTINCT name FROM student;

  SELECT * from student where no in (select min(no) from student group by name);
  
8.데이타(레코드) 추가하기 - INSERT
  INSERT INTO student 
      VALUES (5, '마동석', '01055556666', '강남', '마블리입니다');
  INSERT INTO student 
      VALUES (6, '태연', '01088889999', '신사동', '태블리입니다');
  INSERT INTO student 
      VALUES (7, '태연', '01088889999', '신사동', '태블리입니다');
  -- 필드이름을 넣어서 추가하기
  INSERT INTO student (no, name, phone, address, memo)
      VALUES (8, '태연', '', '', '');

9.데이타 삭제 - DELETE
  -- name이 "스파이더맨"인 사람 삭제하기
  DELETE FROM student WHERE name = '스파이더맨';

10.데이타 변경 - UPDATE
  -- name이 "홍길동"인 사람의 필드데이타 수정하기
  UPDATE student SET address='대전', memo='대전으로 이사함'
       WHERE name = '홍길동'

-- 테이블 관련 SQL
11. 테이블 추가하기 - CREATE Table
  -- bank 테이블 추가하기
  CREATE TABLE bank ( no integer PRIMARY KEY AUTO_INCREMENT, 
       account varchar(30), money integer, memo varchar(200) );

  --  varchar(255),    text 데이타타입의 차이
  --  255자까지(속도빠름), 65535자까지 지원(좀더 느림)

12. 테이블 수정하기 - ALTER TABLE
  -- email 필드 추가하기
  ALTER TABLE bank ADD email varchar(255);
  -- memo 필드 삭제하기
  ALTER TABLE bank DROP COLUMN memo;
  -- email 필드 속성 수정하기
  ALTER TABLE bank MODIFY email VARCHAR(100) NOT NULL;
  -- email 필드 이름 변경하기
  ALTER TABLE bank CHANGE COLUMN email email_address VARCHAR(100);
  -- 테이블 이름 변경하기 
  ALTER TABLE bank RENAME TO bank_table;

13. 테이블 삭제하기 - DROP TABLE
  DROP TABLE bank_table

-- 실습시간
1. users 테이블 생성
  --  스키마(Schema) : no 기본키 AI integer(10), 
  --                  user_id varchar(20)
  --                  user_pw varchar(20)
  --                  phone varchar(20)
  --                  address varchar(100)
2. 데이타(레코드) 추가하기
  1, 'sinsa', '1234', '01028382828', '안양'
  2, 'hwang', '1111', '01033334444', '이태원'
  3, 'sejong', '2222', '01022221111', '경복궁'

3. 데이타 검색하기
  -- user_id가 sinsa인 사람 검색하기
  -- phone에 4444가 들어간 사람 검색하기
  -- user_pw가  1234 이거나(OR) 2222인 사람 검색하기
  -- user_id가 hwang이고(AND) 암호가 1111인 사람 검색하기
  -- user_id가 s로 시작하는 사람 검색하기

4. 데이타 수정하기
  -- user_id가 sinsa인 사람의 전화번호를 '01011112222'로 변경하기
  -- 주소가 경복궁인 사람의 암호를 3333으로 변경하기

5. 데이타 삭제하기
  -- 주소에 '안'이 들어간 사람 삭제하기

6. 테이블 삭제하기 
  -- users 테이블을 삭제하기