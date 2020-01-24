CREATE TABLE Teacher_Account(
TA_ID INT IDENTITY(1,1) PRIMARY KEY,
TA_FName varchar(40) NOT NULL,
TA_LName varchar(40) NOT NULL,
TA_Username varchar(40) NOT NULL,
TA_Password varchar(40) NOT NULL,
);

CREATE TABLE QuizesTitle(
QT_ID  INT IDENTITY(1,1) PRIMARY KEY, 
TA_ID INT FOREIGN KEY REFERENCES Teacher_Account(TA_ID),
QT_Title varchar(50) NOT NULL
);

CREATE TABLE Questions(
QE_ID  INT IDENTITY(1,1) PRIMARY KEY, 
TA_ID INT FOREIGN KEY REFERENCES Teacher_Account(TA_ID),
QT_ID  INT FOREIGN KEY REFERENCES QuizesTitle(QT_ID), 
QE_Questions varchar(400) NOT NULL,
QE_Condition varchar(50) NOT NULL
);

CREATE TABLE AnswersSingle(
QE_ID  INT FOREIGN KEY REFERENCES Questions(QE_ID), 
QT_ID  INT FOREIGN KEY REFERENCES QuizesTitle(QT_ID), 
AN_Answers varchar(100),
AN_CorrectAns varchar(10),
AN_A varchar(100),
AN_B varchar(100),
AN_C varchar(100),
AN_D varchar(100)
);

SELECT * FROM Questions;
SELECT * FROM AnswersSingle;

SELECt * FROM Teacher_Account;
SELECT * FROM QuizesTitle;
SELECT *  FROM Questions;
SELECT *  FROM AnswersSingle;
SELECT TA_ID FROM Teacher_Account WHERE TA_Username = 'asd';


CREATE TABLE AnswersMulti(
QE_ID  INT FOREIGN KEY REFERENCES Questions(QE_ID), 
QT_ID  INT FOREIGN KEY REFERENCES QuizesTitle(QT_ID), 
QE_CorrectAns varchar(10) NOT NULL,
AN_A varchar(100) NOT NULL,
AN_B varchar(100) NOT NULL,
AN_C varchar(100) NOT NULL,
AN_D varchar(100) NOT NULL
);

SELECT Questions.TA_ID,Questions.QT_ID,Questions.QE_ID,Questions.QE_Questions,Questions.QE_Condition,AnswersSingle.AN_Answers,AnswersSingle.AN_CorrectAns,AnswersSingle.AN_A,AnswersSingle.AN_B,AnswersSingle.AN_C,AnswersSingle.AN_D
FROM Questions INNER JOIN AnswersSingle
ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = 1 AND Questions.QT_ID = 2 AND Questions.QE_ID = 8;