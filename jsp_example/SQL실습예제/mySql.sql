
-- MySql.sql
-- SQL���Ͽ��� �ڸ�Ʈ�� --��


-- DB���� ��
-- 1) PowerShell - Ŀ�ǵ���� ��
-- 2) ��ũ��ġ(��,����) - GUI ��, �ӵ�����,
--      (����PC ���ӽÿ��� ���������� �ɸ�)
-- 3) phpMyAdmin(��) - GUI�� , �ӵ��� ����
--      (ȣ���ýÿ��� �̰ɷ� ��� ��) 

-- SQL(Structured Query Language: ����ȭ ���Ǿ�)�̰�,
-- DBMS(Database Management System)�� ����Ÿ�� �����ϱ� ����
-- Ư��(�Ϲݾƴ�) ������ ���α׷��� ����̴�.

-- SQL�� ���ҿ� ���� DML, DDL, DCL, TCL�� ������.
1. DML(Data Manupulation Language) ����Ÿ ���۾�
   SELECT - ����Ÿ ��ȸ(�˻�)
   DELETE - ����Ÿ ����
   INSERT - ����Ÿ �߰�
   UPDATE - ����Ÿ ����
2. DDL(Data Definition Language) DBMS ��ü�� ������
   CREATE - TABLE�̳� DB�� ����
   DROP - TABLE�̳� DB�� ����
   ALTER - TABLE�̳� DB���� ����
3. DCL(Data Control Language ) DBMS ������ ������
   GRANT - �б�/����/����/���� ���� �ο�
   REVOKE - �б�/����/����/���� ���� ����
4. TCL(Transaction Control Language ) �ϰ�ó�� ��ɾ�
  COMMIT - �ϰ�ó�� ����
  ROLLBACK - �ϰ�ó�� �ǵ���

-- SQL�������� "", '' �ֵ���ǥ �ܵ���ǥ�� �����ϰ� ���.
-- ���� �������� ; �����ݷ��� ������ ���� �Ƚᵵ ��. �������϶��� ����.

-- ���̺��� Ű(Key)
-- 1.�⺻Ű (Primary Key) : DBMS���� �����ϴ� �ߺ����� �ʴ� �ε�����ȣ
-- 2.�ܷ�Ű (Foreign Key) : �� ���̺��� �ٸ� ���̺��� �⺻Ű ���� ������
--                          �� Ű�� �ܷ�Ű��� �Ѵ�.

1.DB���� ����� 
  �̸�: mydb
2.Table �����
  �̸�: student 
  �÷�(5): �ʵ�(Field) 
  DB ���ɸ�(Schema) : ����
  no : Int 10, Primary Key, Auto Increament
  name : varchar 10
  phone : varchar 20
  address : varchar 100
  memo : varchar 200

3.����Ÿ(���ڵ�) �߰��ϱ�
  INSERT INTO �� ����Ÿ �߰���

4.�˻��ϱ� SELECT
  -- ��� ����Ÿ �ʵ� ��������
  SELECT   *    FROM student;
  -- name �ʵ常 ��������
  SELECT name FROM student;
  -- name,phone �ʵ常 ��������
  SELECT name,phone FROM student;

INSERT INTO `student` VALUES (5, '������', '01055556666', '����', '�����Դϴ�');
INSERT INTO `student` VALUES (6, '�¿�', '01088889999', '�Ż絿', '�º��Դϴ�');
INSERT INTO `student` VALUES (7, '����', '01011112222', '��赿', '�����Դϴ�');

5.�˻� ���� �ֱ� Where��
  -- name="ȫ�浿" �� ����� �˻��ϱ�
  SELECT * FROM student WHERE name = "ȫ�浿";
  -- name="���̾��" �̰ų�(OR) address="�Ѿ�" �� ��� �˻��ϱ�
  SELECT * FROM student WHERE name="���̾��" OR address="�Ѿ�";
  -- name="���̾��" �̰�(AND) address="����ź" �� ��� �˻��ϱ�
  SELECT * FROM student WHERE name="���̾��" AND address="����ź";
  -- name�� "ȫ"���� �����ϴ� ��� �˻��ϱ�
  SELECT * FROM student WHERE name like "ȫ%";
  -- name�� "��"���� ������ ��� �˻��ϱ�
  SELECT * FROM student WHERE name like "%��";
  -- name ��� "��"�� ����ִ� ��� �˻��ϱ�
  SELECT * FROM student WHERE name like "%��%";

6.�˻� �����ϱ� Order by��
  -- name �ʵ�������� ������������ (������, ABC) �����ϱ�
  SELECT * FROM student ORDER BY name asc;
  -- name �ʵ�������� ������������ (�ٳ���, CBA) �����ϱ�
  SELECT * FROM student ORDER BY name desc;

7.�˻� �ߺ��Ǵ� ����Ÿ �����ϱ�
  -- ȫ�浿 �̶�� ����� 2�� �̻��̸� 1���� ������.
  SELECT DISTINCT name FROM student;

  SELECT * from student where no in (select min(no) from student group by name);
  
8.����Ÿ(���ڵ�) �߰��ϱ� - INSERT
  INSERT INTO student 
      VALUES (5, '������', '01055556666', '����', '�����Դϴ�');
  INSERT INTO student 
      VALUES (6, '�¿�', '01088889999', '�Ż絿', '�º��Դϴ�');
  INSERT INTO student 
      VALUES (7, '�¿�', '01088889999', '�Ż絿', '�º��Դϴ�');
  -- �ʵ��̸��� �־ �߰��ϱ�
  INSERT INTO student (no, name, phone, address, memo)
      VALUES (8, '�¿�', '', '', '');

9.����Ÿ ���� - DELETE
  -- name�� "�����̴���"�� ��� �����ϱ�
  DELETE FROM student WHERE name = '�����̴���';

10.����Ÿ ���� - UPDATE
  -- name�� "ȫ�浿"�� ����� �ʵ嵥��Ÿ �����ϱ�
  UPDATE student SET address='����', memo='�������� �̻���'
       WHERE name = 'ȫ�浿'

-- ���̺� ���� SQL
11. ���̺� �߰��ϱ� - CREATE Table
  -- bank ���̺� �߰��ϱ�
  CREATE TABLE bank ( no integer PRIMARY KEY AUTO_INCREMENT, 
       account varchar(30), money integer, memo varchar(200) );

  --  varchar(255),    text ����ŸŸ���� ����
  --  255�ڱ���(�ӵ�����), 65535�ڱ��� ����(���� ����)

12. ���̺� �����ϱ� - ALTER TABLE
  -- email �ʵ� �߰��ϱ�
  ALTER TABLE bank ADD email varchar(255);
  -- memo �ʵ� �����ϱ�
  ALTER TABLE bank DROP COLUMN memo;
  -- email �ʵ� �Ӽ� �����ϱ�
  ALTER TABLE bank MODIFY email VARCHAR(100) NOT NULL;
  -- email �ʵ� �̸� �����ϱ�
  ALTER TABLE bank CHANGE COLUMN email email_address VARCHAR(100);
  -- ���̺� �̸� �����ϱ� 
  ALTER TABLE bank RENAME TO bank_table;

13. ���̺� �����ϱ� - DROP TABLE
  DROP TABLE bank_table

-- �ǽ��ð�
1. users ���̺� ����
  --  ��Ű��(Schema) : no �⺻Ű AI integer(10), 
  --                  user_id varchar(20)
  --                  user_pw varchar(20)
  --                  phone varchar(20)
  --                  address varchar(100)
2. ����Ÿ(���ڵ�) �߰��ϱ�
  1, 'sinsa', '1234', '01028382828', '�Ⱦ�'
  2, 'hwang', '1111', '01033334444', '���¿�'
  3, 'sejong', '2222', '01022221111', '�溹��'

3. ����Ÿ �˻��ϱ�
  -- user_id�� sinsa�� ��� �˻��ϱ�
  -- phone�� 4444�� �� ��� �˻��ϱ�
  -- user_pw��  1234 �̰ų�(OR) 2222�� ��� �˻��ϱ�
  -- user_id�� hwang�̰�(AND) ��ȣ�� 1111�� ��� �˻��ϱ�
  -- user_id�� s�� �����ϴ� ��� �˻��ϱ�

4. ����Ÿ �����ϱ�
  -- user_id�� sinsa�� ����� ��ȭ��ȣ�� '01011112222'�� �����ϱ�
  -- �ּҰ� �溹���� ����� ��ȣ�� 3333���� �����ϱ�

5. ����Ÿ �����ϱ�
  -- �ּҿ� '��'�� �� ��� �����ϱ�

6. ���̺� �����ϱ� 
  -- users ���̺��� �����ϱ�