CREATE TABLE girl_group
(
  _id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(32) NOT NULL,
  debut DATE NOT NULL,
  hit_song_id INT
);

CREATE TABLE song
(
  _id INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(32) NOT NULL,
  lyrics VARCHAR(32)
);
INSERT INTO song (_id, title, lyrics) VALUES (101, 'Tell Me', 'tell me tell me tetetete tel me');
INSERT INTO song (title, lyrics) VALUES ('Gee', 'GEE GEE GEE GEE GEE BABY BABY');
INSERT INTO song (title, lyrics) VALUES ('�̽���', '�̸��� ���� �̽���');
INSERT INTO song (title, lyrics) VALUES ('Abracadabra', '�̷��� ���� ���� ��������');
INSERT INTO song (title, lyrics) VALUES ('8282', 'Give me a call Baby baby');
INSERT INTO song (title, lyrics) VALUES ('�����', '�����');
INSERT INTO song (title, lyrics) VALUES ('I Don\'t car', '�ٸ� ���ڵ��� �ٸ���');
INSERT INTO song (title, lyrics) VALUES ('Bad Girl Good Girl', '�տ��� �� ���� ����');
INSERT INTO song (title, lyrics) VALUES ('�ǳ�Ű��', '�����߿�');
INSERT INTO song (title, lyrics) VALUES ('�����޺�', '�ʴ� �� ���� �� ������ ����');
INSERT INTO song (title, lyrics) VALUES ('A', 'A ������ ������� ����');
INSERT INTO song (title, lyrics) VALUES ('��ȥ��', '�� ȥ�� ���� �԰� �� ȥ�� ��ȭ ����');
INSERT INTO song (title, lyrics) VALUES ('LUV', '�����̳��� ');
INSERT INTO song (title, lyrics) VALUES ('ª��ġ��', 'ª�� ġ���� �԰� ���� ���� ������');
INSERT INTO song (title, lyrics) VALUES ('���Ʒ�', '�� �Ʒ� ���� �Ʒ�');
INSERT INTO song (title, lyrics) VALUES ('Dumb Dumb' , '�� ���� �Ϸ�����');

SELECT * FROM song;

INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('�����ɽ�', '2007-09-12', 101);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('�ҳ�ô�', '2009-06-03', 102);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('ī��', '2009-07-30', 103);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('������̵�ɽ�', '2008-01-17', 104);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('�ٺ�ġ', '2009-02-27', 105);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('2NE1', '2009-07-08', 107);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('f(x)', '2011-04-20', 109);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('��ũ��', '2011-01-06', 110);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('���κ���', '2010-08-12', 111);
INSERT INTO girl_group (name, debut) 
VALUES ('������ ����', '2009-11-25');
INSERT INTO girl_group (name, debut) 
VALUES ('���̴�', '2009-08-28');

SELECT * FROM girl_group;
-- https://yoo-hyeok.tistory.com/98

-- INNER JOIN : A�� B�� ������ 
SELECT gg._id, gg.name, s.title 
FROM girl_group AS gg
INNER JOIN song AS s
On s._id = gg.hit_song_id;

-- LEFT OUTER JOIN : A�� B���� A ���� ���θ� ������.
SELECT gg._id, gg.name, s.title 
FROM girl_group AS gg 
LEFT OUTER JOIN song AS s 
ON s._id = gg.hit_song_id; 

-- RIGHT OUTER JOIN : A�� B���� B ���� ���θ� ������.
SELECT s._id, s.title, gg.name 
FROM girl_group AS gg 
RIGHT OUTER JOIN song AS s 
ON s._id = gg.hit_song_id;

-- FULL OUTER JOIN : A�� B�� ��� ����(������ ����)
SELECT s._id, s.title, gg.name 
FROM girl_group AS gg 
JOIN song AS s 
ON s._id <> gg.hit_song_id;

-- CROSS JOIN : A�� B�� ������( A���̺� ���� * B���̺� ���� ��ŭ ����)
SELECT s._id, s.title, gg.name
FROM girl_group AS gg
CROSS JOIN song AS s;

-- CROSS JOIN : �����Ͱ� ����� ����.
SELECT s._id, s.title, gg.name
FROM girl_group AS gg, song AS s;

-- SELF JOIN : A�� A�� ������( A���̺� ���� * A���̺� ���� ��ŭ ����)
SELECT gg1.name , gg1.debut
FROM girl_group gg1, girl_group AS gg2 WHERE gg1.name = gg2.name

