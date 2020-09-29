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
INSERT INTO song (title, lyrics) VALUES ('미스터', '이름이 뭐야 미스터');
INSERT INTO song (title, lyrics) VALUES ('Abracadabra', '이러다 미쳐 내가 여리여리');
INSERT INTO song (title, lyrics) VALUES ('8282', 'Give me a call Baby baby');
INSERT INTO song (title, lyrics) VALUES ('기대해', '기대해');
INSERT INTO song (title, lyrics) VALUES ('I Don\'t car', '다른 여자들의 다리를');
INSERT INTO song (title, lyrics) VALUES ('Bad Girl Good Girl', '앞에선 한 마디 말도');
INSERT INTO song (title, lyrics) VALUES ('피노키오', '뉴예삐오');
INSERT INTO song (title, lyrics) VALUES ('별빛달빛', '너는 내 별빛 내 마음의 별빛');
INSERT INTO song (title, lyrics) VALUES ('A', 'A 워오우 워오우워 우우우');
INSERT INTO song (title, lyrics) VALUES ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고');
INSERT INTO song (title, lyrics) VALUES ('LUV', '설레이나요 ');
INSERT INTO song (title, lyrics) VALUES ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면');
INSERT INTO song (title, lyrics) VALUES ('위아래', '위 아래 위위 아래');
INSERT INTO song (title, lyrics) VALUES ('Dumb Dumb' , '너 땜에 하루종일');

SELECT * FROM song;

INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('원더걸스', '2007-09-12', 101);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('소녀시대', '2009-06-03', 102);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('카라', '2009-07-30', 103);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('브라운아이드걸스', '2008-01-17', 104);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('다비치', '2009-02-27', 105);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('2NE1', '2009-07-08', 107);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('f(x)', '2011-04-20', 109);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('시크릿', '2011-01-06', 110);
INSERT INTO girl_group (name, debut, hit_song_id) 
VALUES ('레인보우', '2010-08-12', 111);
INSERT INTO girl_group (name, debut) 
VALUES ('에프터 스쿨', '2009-11-25');
INSERT INTO girl_group (name, debut) 
VALUES ('포미닛', '2009-08-28');

SELECT * FROM girl_group;
-- https://yoo-hyeok.tistory.com/98

-- INNER JOIN : A와 B의 교집합 
SELECT gg._id, gg.name, s.title 
FROM girl_group AS gg
INNER JOIN song AS s
On s._id = gg.hit_song_id;

-- LEFT OUTER JOIN : A와 B에서 A 내용 전부를 가져옴.
SELECT gg._id, gg.name, s.title 
FROM girl_group AS gg 
LEFT OUTER JOIN song AS s 
ON s._id = gg.hit_song_id; 

-- RIGHT OUTER JOIN : A와 B에서 B 내용 전부를 가져옴.
SELECT s._id, s.title, gg.name 
FROM girl_group AS gg 
RIGHT OUTER JOIN song AS s 
ON s._id = gg.hit_song_id;

-- FULL OUTER JOIN : A와 B의 모든 조합(교집합 제외)
SELECT s._id, s.title, gg.name 
FROM girl_group AS gg 
JOIN song AS s 
ON s._id <> gg.hit_song_id;

-- CROSS JOIN : A와 B의 곱집합( A테이블 갯수 * B테이블 갯수 만큼 나옴)
SELECT s._id, s.title, gg.name
FROM girl_group AS gg
CROSS JOIN song AS s;

-- CROSS JOIN : 윗엣것과 결과가 같음.
SELECT s._id, s.title, gg.name
FROM girl_group AS gg, song AS s;

-- SELF JOIN : A와 A의 곱집합( A테이블 갯수 * A테이블 갯수 만큼 나옴)
SELECT gg1.name , gg1.debut
FROM girl_group gg1, girl_group AS gg2 WHERE gg1.name = gg2.name

