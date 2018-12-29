/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Chamil
 * Created: Jun 7, 2018
 */

drop database payroll;

create database payroll;

use payroll;



CREATE TABLE Employee(
	Id varchar(6) NOT NULL,
	EmpName varchar(30) NOT NULL,
	Designation varchar(30) NOT NULL, 
	Salary decimal(10.2),
	MaritalStatus varchar(30),
	Address varchar(30),
	ContactNo int(10),
	JoinDate DATE,
	DOB varchar,
	Gender varchar(6),
	LateHoursRate decimal(10,2), 
	OtHoursRate decimal(10,2), 
	CONSTRAINT PRIMARY KEY(Id)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;




CREATE TABLE Attendance(
	Id varchar(6)NOT NULL,
	EmployeeID varchar(6),
	DayStatus varchar(10),
	DayType varchar(10),
	Date DATE ,
	OThrs varchar(20),
	Latehrs varchar(20),
	InTime varchar(20),
	OutTime varchar(20),	
	CONSTRAINT PRIMARY KEY (Id),
	CONSTRAINT FOREIGN KEY(EmployeeID) REFERENCES Employee(Id)
	ON Delete Cascade On update cascade
);

CREATE TABLE Designation(
	DesID varchar(6)NOT NULL, 
	DesName varchar(30)NOT NULL, 
	CONSTRAINT PRIMARY KEY (DesId)
	
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO Designation VALUES('D001','Manager');
INSERT INTO Designation VALUES('D002','Accountant');
INSERT INTO Designation VALUES('D003','Tea-Maker');
INSERT INTO Designation VALUES('D004','Assitance');
INSERT INTO Designation VALUES('D005','Driver');

CREATE TABLE Deduction(
	ID varchar(6)NOT NULL, 
	EmployeeId varchar(6),
	BasicSalary decimal(10.2),
	date DATE,
	EPF decimal(10.2),
	WelFare decimal(10.2),
	Insuarance decimal(10.20),
	Total decimal(10.2),
	CONSTRAINT PRIMARY KEY (ID),
	CONSTRAINT FOREIGN KEY(EmployeeId) REFERENCES Employee(Id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Allowance(
	Id varchar(6)NOT NULL, 
	EmployeeId varchar(6),
	BasicSalary decimal(10.2),
	date DATE,
	HRA decimal(10.2),
	VA decimal(10.2),
	Medical decimal(10.2),
	Total decimal(10.2),
	CONSTRAINT PRIMARY KEY (Id),
	CONSTRAINT FOREIGN KEY(EmployeeId) REFERENCES Employee(Id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

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




	