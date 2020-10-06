create table jsp_member
(
  id varchar2(50) not null primary KEY
  ,password varchar2(50) not null
  ,name varchar2(50)
  ,gender varchar2(10)
  ,birth date
  ,mail varchar2(100)
  ,phone varchar2(50)
  ,address varchar2(200)
  ,reg date default sysdate
);

-- mySQL 5.6.5이상
create table jsp_member
(
  id varchar(50) not null primary KEY
  ,password varchar(50) not null
  ,name varchar(50)
  ,gender varchar(10)
  ,birth date
  ,mail varchar(100)
  ,phone varchar(50)
  ,address varcha2(200)
  ,reg DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 오라클 설치시 주의사항
-- 1. 윈도우즈 로그인 계정은 가급적이면 한글아닌 영어. 개발자는 무조선 영어계정(공백x)
-- 2. 설치 경로에 한글이 들어간 경우 오류 발생
-- 3. zip파일 2개를 반드시 하나의 폴더에 겹처서 설치할것
-- 4. db sid 는 orcl 암호는 1111

-- 오라클 기본제공 DB파일
-- 1.sys(최고관리자),system(관리자),scott(연습용)
-- JDNI 오라클연결 - 톰캣서버의 커넥션풀을 사용하는 것.

-- Project Explorer에서 Servers의 Tomcat v8.5의 context.xml에 추가
--
--<Resource auth="Container" 
--      name="jdbc/orcl" 
--      driverClassName="oracle.jdbc.driver.OracleDriver" 
--      type="javax.sql.DataSource" 
--      url="jdbc:oracle:thin:@ip주소:포트번호:전역 데이터베이스 이름" 
--      username="접속계정"
--      password="계정 비밀번호" 
--      loginTimeout="10" 
--      maxActive="50" 
--      maxIdle="20"
--      maxWait="5000" 
--      testOnBorrow="true" />

-- web.xml에 추가
--
--<resource-ref>
--     <description>connection</description>
--     <res-ref-name>jdbc/orcl</res-ref-name>
--     <res-type>javax.sql.DataSource</res-type>
--     <res-auth>Container</res-auth>
--</resource-ref>
 
--    description : 설명
--    res-ref-name : JDBC 이름, <Resource>의 name 부분과 동일하게 입력
--    res-type : <Resource>의 type 부분과 동일하게 입력
--    res-auth : <Resource>의 auth 부분과 동일하게 입력
