CREATE DATABASE IF NOT EXISTS education;

-- create institution table

CREATE TABLE institution(
	`institutionid` INT(11) NOT NULL,
	`name` VARCHAR(250),
	
	CONSTRAINT PRIMARY KEY (`institutionid`)
);

-- create courses table

CREATE TABLE course(
	courseid INT(11) NOT NULL,
	`name` VARCHAR(250),
	`institution` INT(11) NOT NULL,
	
	CONSTRAINT `pk_course` PRIMARY KEY (`courseid`),
	CONSTRAINT `fk_institution` FOREIGN KEY (`institution`) REFERENCES institution(institutionid)
);

-- create  students table
	
CREATE TABLE student(
	`studentid` INT(11) NOT NULL,
	`NAME` VARCHAR(250),
	`course` INT(11) NOT NULL,
	
	CONSTRAINT `pk_student` PRIMARY KEY (`studentid`),
	CONSTRAINT `fk_course` FOREIGN KEY(`course`) REFERENCES course(courseid)
	
);

-- Question 4 (b)
SELECT i.name AS 'INSTITUTION NAME',c.name AS 'COURSE NAME', COUNT(s.studentid) AS 'NUMBER OF STUDENTS' 	
    FROM institution i 
	LEFT JOIN course c ON c.institution = i.institutionid
    LEFT JOIN student s ON s.course = c.courseid 
    GROUP BY i.institutionid,c.courseid