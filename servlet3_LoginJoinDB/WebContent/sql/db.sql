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

-- mySQL 5.6.5�̻�
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

-- ����Ŭ ��ġ�� ���ǻ���
-- 1. �������� �α��� ������ �������̸� �ѱ۾ƴ� ����. �����ڴ� ������ �������(����x)
-- 2. ��ġ ��ο� �ѱ��� �� ��� ���� �߻�
-- 3. zip���� 2���� �ݵ�� �ϳ��� ������ ��ó�� ��ġ�Ұ�
-- 4. db sid �� orcl ��ȣ�� 1111

-- ����Ŭ �⺻���� DB����
-- 1.sys(�ְ������),system(������),scott(������)
-- JDNI ����Ŭ���� - ��Ĺ������ Ŀ�ؼ�Ǯ�� ����ϴ� ��.

-- Project Explorer���� Servers�� Tomcat v8.5�� context.xml�� �߰�
--
--<Resource auth="Container" 
--      name="jdbc/orcl" 
--      driverClassName="oracle.jdbc.driver.OracleDriver" 
--      type="javax.sql.DataSource" 
--      url="jdbc:oracle:thin:@ip�ּ�:��Ʈ��ȣ:���� �����ͺ��̽� �̸�" 
--      username="���Ӱ���"
--      password="���� ��й�ȣ" 
--      loginTimeout="10" 
--      maxActive="50" 
--      maxIdle="20"
--      maxWait="5000" 
--      testOnBorrow="true" />

-- web.xml�� �߰�
--
--<resource-ref>
--     <description>connection</description>
--     <res-ref-name>jdbc/orcl</res-ref-name>
--     <res-type>javax.sql.DataSource</res-type>
--     <res-auth>Container</res-auth>
--</resource-ref>
 
--    description : ����
--    res-ref-name : JDBC �̸�, <Resource>�� name �κа� �����ϰ� �Է�
--    res-type : <Resource>�� type �κа� �����ϰ� �Է�
--    res-auth : <Resource>�� auth �κа� �����ϰ� �Է�
