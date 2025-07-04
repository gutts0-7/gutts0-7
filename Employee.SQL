CREATE TABLE Employee (
    Emp_no INT(10),
    name VARCHAR(30),
    designation VARCHAR(30),
    dob DATE,
    dept_no INT(10)
);

DESC Employee;

-- Step 1: Create database (if not already)
CREATE DATABASE Company;

-- Step 2: Use the database
USE Company;

CREATE TABLE Employee (
    Emp_no INT(10),
    name VARCHAR(30),
    designation VARCHAR(30),
    dob DATE,
    dept_no INT(10)
);
DESC Employee;

ALTER TABLE Employee
ADD dob DATE,
ADD address VARCHAR(60);

ALTER TABLE Employee
DROP COLUMN address;
DESC EMPLOYEE:

INSERT INTO Employee (Emp_no, name, designation, dob, dept_no, hiredate)
VALUES 
(1, 'Leo', 'Engineer', '1991-10-01', 3, '2015-07-12'),
(2, 'Joy', 'Driver', '1988-12-12', 1, '2016-01-14');


ALTER TABLE Employee ADD hiredate DATE;
SELECT * FROM Employee;
RENAME TABLE Employee TO Employee_New;
SELECT * FROM Employee_New;

CREATE TABLE Employee_Backup (
    Emp_no INT,
    name VARCHAR(30),
    designation VARCHAR(30),
    dob DATE,
    dept_no INT,
    hiredate DATE
);

INSERT INTO Employee_Backup
SELECT * FROM Employee_New;

SELECT * FROM Employee_Backup;
DROP TABLE Employee_Backup;
