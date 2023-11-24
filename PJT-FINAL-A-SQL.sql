-- CREATE DATABASE kot;

USE kot;
DROP TABLE IF EXISTS MatchResult;
DROP TABLE IF EXISTS MatchWait;
DROP TABLE IF EXISTS User;

CREATE TABLE User(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(50) NOT NULL, 
    user_loginId VARCHAR(50) UNIQUE NOT NULL,
    user_pass VARCHAR(30) NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    user_phone VARCHAR(50) UNIQUE NOT NULL,
    user_gender VARCHAR(20) NOT NULL,
    user_age INT(20) NOT NULL,
    user_address VARCHAR(30) NOT NULL,
    user_regdate DATETIME NOT NULL,
    user_rate INT NOT NULL,
    user_status BOOLEAN NOT NULL
);


INSERT INTO `User`(`user_name`, `user_loginId`, `user_pass`,`user_email`,`user_phone`,`user_gender`,`user_age`,`user_address`,`user_regdate`,`user_rate`,`user_status`) VALUES
('김중광','jg','1234', 'jg@ssafy.com', '010-1111-1111','남자',26,'경기도 화성시',now(),1043,FALSE),
('김소광','sg','1234', 'sg@ssafy.com', '010-1111-2222','남자',27,'경기도 화성시',now(),1230,FALSE),
('김대광','dg','1234', 'dg@ssafy.com', '010-1111-3333','남자',28,'경기도 화성시',now(),1190,FALSE),
('전금평','gp','1234', 'gp@ssafy.com', '010-2222-1111','남자',29,'서울시 양천구',now(),790,FALSE),
('전은평','ep','1234', 'ep@ssafy.com', '010-2222-2222','남자',28,'서울시 양천구',now(),936,FALSE),
('전동평','dp','1234', 'dp@ssafy.com', '010-2222-3333','남자',27,'서울시 양천구',now(),1341,FALSE),
('김유경','kim','1234', 'kim@ssafy.com', '010-3333-1111','여자',25,'서울시 서초구',now(),1230,FALSE),
('권유경','kwon','1234', 'kwon@ssafy.com', '010-3333-2222','여자',27,'서울시 강남구',now(),1278,FALSE),
('정유경','jeong','1234', 'jeong@ssafy.com', '010-3333-3333','여자',27,'서울시 관악구',now(),1018,FALSE),
('문성현','nanto','1234', 'nanto@ssafy.com', '010-4444-1111','여자',28,'서울시 마포구',now(),1823,FALSE),
('배유열','array','1234', 'array@ssafy.com', '010-4444-2222','남자',28,'경기도 과천시',now(),1983,FALSE),
('석지명','jm','1234', 'jm@ssafy.com', '010-5555-1111','남자',29,'서울시 성동구',now(),573,FALSE),
('석지순','js','1234', 'js@ssafy.com', '010-5555-2222','여자',29,'서울시 성동구',now(),680,FALSE),
('김남준','nj','1234', 'nj@ssafy.com', '010-5555-3333','남자',28,'서울시 관악구',now(),1326,FALSE),
('김남순','ns','1234', 'ns@ssafy.com', '010-5555-4444','여자',28,'서울시 관악구',now(),1490,FALSE),
('조용환','yh','1234', 'yh@ssafy.com', '010-5555-5555','남자',29,'경기도 성남시',now(),1978,FALSE),
('조용순','ys','1234', 'ys@ssafy.com', '010-5555-6666','여자',29,'경기도 성남시',now(),1632,FALSE),
('김갑현','gh','1234', 'gh@ssafy.com', '010-6666-1111','남자',29,'경기도 수원시',now(),349,FALSE),
('김을현','eh','1234', 'eh@ssafy.com', '010-6666-2222','남자',29,'경기도 수원시',now(),570,FALSE),
('김병현','bh','1234', 'bh@ssafy.com', '010-6666-3333','남자',29,'경기도 수원시',now(),934,FALSE);


CREATE TABLE MatchWait (
	 wait_Id INT PRIMARY KEY AUTO_INCREMENT,
     wait_receiver VARCHAR(50) NOT NULL ,
     wait_sender VARCHAR(50) NOT NULL,
     wait_status BOOLEAN NOT NULL,
     wait_match BOOLEAN NOT NULL,
     wait_mdate DATE NOT NULL,
     wait_user1phone VARCHAR(50) NOT NULL,
     wait_user2phone VARCHAR(50) NOT NULL,
     wait_receivername VARCHAR(50) NOT NULL,
     wait_sendername VARCHAR(50) NOT NULL
 --    FOREIGN KEY(`wait_receiver`) REFERENCES `User` (`user_loginId`),
-- 	FOREIGN KEY(`wait_sender`) REFERENCES `User` (`user_loginId`)
	
);


CREATE TABLE MatchResult (
	 match_Id INT PRIMARY KEY AUTO_INCREMENT,
     match_u1 VARCHAR(50) NOT NULL ,
     match_u2 VARCHAR(50) NOT NULL,
     match_date DATE NOT NULL,
	 match_u1phone VARCHAR(50) NOT NULL,
     match_u2phone VARCHAR(50) NOT NULL,
     match_u1name VARCHAR(50) NOT NULL,
     match_u2name VARCHAR(50) NOT NULL,
     match_fdate DATE ,
     match_result VARCHAR(30)
    
    --  FOREIGN KEY(`match_u1`) REFERENCES `MatchWait` (`wait_receiver`),
--      FOREIGN KEY(`match_u2`) REFERENCES `MatchWait` (`wait_sender`),
--     
--      FOREIGN KEY(`match_u1phone`) REFERENCES `User` (`user_phone`),
--      FOREIGN KEY(`match_u2phone`) REFERENCES `User` (`user_phone`)
);

INSERT INTO `MatchResult`(match_u1,match_u2,match_date,match_u1phone,match_u2phone,match_u1name,match_u2name,match_fdate,match_result) VALUES
('ssafy','array','2023-11-06','01012345678','01011111111','김중광','배유열',"2023-11-06",'ssafy'),
('ssafy','array','2023-11-23','01012345678','01011111111','김중광','배유열',"2023-11-24",'array'),
('ssafy','array','2023-11-23','01012345678','01011111111','김중광','배유열',"2023-11-24",'array'),
('ssafy','array','2023-11-23','01012345678','01011111111','김중광','배유열',"2023-11-24",'array'),
('ssafy','array','2023-11-23','01012345678','01011111111','김중광','배유열',"2023-11-24",'array'),
('dg','gp','2023-11-23','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-24",'dg'),
('dg','gp','2023-11-18','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-19",'dg'),
('dg','gp','2023-11-16','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-18",'dg'),
('dg','gp','2023-11-13','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-14",'dg'),
('dg','gp','2023-11-22','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-26",'gp'),
('dg','gp','2023-10-21','010-1111-3333','010-2222-1111','김대광','전금평',"2023-10-23",'dg'),
('dg','gp','2023-07-21','010-1111-3333','010-2222-1111','김대광','전금평',"2023-07-24",'gp'),
('dg','gp','2023-08-24','010-1111-3333','010-2222-1111','김대광','전금평',"2023-08-31",'gp'),
('dg','gp','2023-09-28','010-1111-3333','010-2222-1111','김대광','전금평',"2023-09-30",'dg'),
('dg','gp','2023-10-29','010-1111-3333','010-2222-1111','김대광','전금평',"2023-11-01",'gp'),
('dg','gp','2022-11-20','010-1111-3333','010-2222-1111','김대광','전금평',"2022-11-24",'dg'),
('dg','gp','2021-11-24','010-1111-3333','010-2222-1111','김대광','전금평',"2021-11-25",'gp'),
('dg','gp','2022-10-17','010-1111-3333','010-2222-1111','김대광','전금평',"2022-10-21",'gp'),
('js','ys','2022-10-17','010-5555-2222','010-5555-6666','석지순','조용순',"2022-10-21",'ys'),
('js','nanto','2023-10-17','010-5555-2222','0010-4444-1111','석지순','문성현',"2023-10-29",'nanto'),
('js','ys','2023-11-17','010-5555-2222','010-5555-6666','석지순','조용순',"2023-11-21",'ys'),
('js','ys','2023-11-27','010-5555-2222','010-5555-6666','석지순','조용순',"2023-12-01",'ys'),
('js','nanto','2023-08-14','010-5555-2222','010-4444-1111','석지순','문성현',"2023-08-21",'nanto'),
('js','jeong','2021-02-23','010-5555-2222','010-3333-3333','석지순','정유경',"2021-02-24",'jeong');







