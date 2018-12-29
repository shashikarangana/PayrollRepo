# repo_Payroll

drop database payroll;

create database payroll;

use payroll;



CREATE TABLE Employee(
	EmpID varchar(6) NOT NULL,
	EmpName varchar(30) NOT NULL,
	Designation varchar(30) NOT NULL, 
	Salary decimal(10,2), 
	MaritalStatus varchar(30),
	Address varchar(30),
	ContactNo int(10),
	JoinDate DATE,
	DOB DATE,
	Gender varchar(6),
	CONSTRAINT PRIMARY KEY(EmpID)
);




CREATE TABLE Attendance(
	AID varchar(6)NOT NULL,
	EmpID varchar(6),
	EmpName varchar(30),
	Present varchar(20),
	LeaveDay varchar(20),
	Date DATE,
	OThrs varchar(20),
	Latehrs varchar(20),
	InTime varchar(20),
	OutTime varchar(20),	
	HalfDay varchar(20),
	FullDay varchar(20),
	CONSTRAINT PRIMARY KEY (AID),
	CONSTRAINT FOREIGN KEY(EmpID) REFERENCES Employee(EmpId)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Designation(
	DesID varchar(6), 
	DesName varchar(30)NOT NULL, 
	CONSTRAINT PRIMARY KEY (DesId)
	
);

INSERT INTO Designation VALUES('D001','Manager');
INSERT INTO Designation VALUES('D002','Accountant');
INSERT INTO Designation VALUES('D003','Tea-Maker');
INSERT INTO Designation VALUES('D004','Assitance');
INSERT INTO Designation VALUES('D005','Driver');



CREATE TABLE Loan(
	LId varchar(10),
	Empid varchar(10),
	LoanAmount decimal(10,2),
	LoanDate DATE,
	CONSTRAINT PRIMARY KEY (LID),
	CONSTRAINT FOREIGN KEY(EmpId) REFERENCES Employee(EmpId)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE LoanDetail(
	LDID varchar(6),
	LID varchar(6),
	EmpId varchar(6),
	EmpName varchar(30),
	LoanAmount decimal(10,2),
	LoanDate DATE,
	CONSTRAINT PRIMARY KEY (LDID),
	CONSTRAINT FOREIGN KEY(LID) REFERENCES Lone(LID)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FOREIGN KEY(EmpId) REFERENCES Employee(EmpId)
	ON UPDATE CASCADE ON DELETE CASCADE
);
	

CREATE TABLE Salary(
	SID varchar(6),
	EmpId varchar(6)NOT NULL,
	EmpName varchar(30),
	BasicSalary decimal(10,2)NOT NULL,
	NetSalary decimal(10,2)NOT NULL,
	GrossSalary decimal(10,2)NOT NULL,
	CONSTRAINT PRIMARY KEY (SID),
	CONSTRAINT FOREIGN KEY(EmpId) REFERENCES Employee(EmpId)
	ON UPDATE CASCADE ON DELETE CASCADE
);




	
