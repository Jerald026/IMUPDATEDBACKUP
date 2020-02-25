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
QT_Title varchar(50) NOT NULL,
QT_CODEGENERATE varchar(50) UNIQUE,
QT_TIME INT NOT NULL
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

CREATE TABLE Student_Account(
SA_ID  INT IDENTITY(1,1) PRIMARY KEY,
SA_FName varchar(50) NOT NULL,
SA_LName varchar(50) NOT NULL,
SA_Section varchar(50) NOT NULL,
QT_CODEGENERATE varchar(50) FOREIGN KEY REFERENCES QuizesTitle(QT_CODEGENERATE)
);

CREATE TABLE Answer_Student(
SA_ID INT FOREIGN KEY REFERENCES Student_Account(SA_ID),
AS_TextAnswer varchar(250),
AS_ChoicesAnswer varchar(10),
AS_Condition varchar(30) NOT NULL,
);

Create Table Answer_Student(
	AS_ID INT IDENTITY(1,1) PRIMARY KEY,
	
	INT FOREIGN KEY REFERENCES Student_Account(SA_ID),
	QE_ID INT FOREIGN KEY REFERENCES Questions(QE_ID),
	Answer NVARCHAR(70) NULL,
	Correct BIT NULL);

SELECT * FROM Student_Account;
SELECT * FROM Questions;
SELECT * FROM AnswersSingle;

SELECt * FROM Teacher_Account;
SELECT * FROM QuizesTitle;
SELECT *  FROM Questions;
SELECT *  FROM AnswersSingle;
SELECT * FROM Student_Account;

SELECT QE_Condition FROM Questions WHERE QT_ID = 5 AND TA_ID = 2; 

SELECT Questions.TA_ID,Questions.QT_ID,Questions.QE_ID,Questions.QE_Questions,Questions.QE_Condition,AnswersSingle.AN_Answers,AnswersSingle.AN_CorrectAns,AnswersSingle.AN_A,AnswersSingle.AN_B,AnswersSingle.AN_C,AnswersSingle.AN_D
FROM Questions INNER JOIN AnswersSingle
ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = 1 AND Questions.QT_ID = 2 AND Questions.QE_ID = 8;