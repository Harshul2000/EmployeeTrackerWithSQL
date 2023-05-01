create database student_tracker_db;
use student_tracker_db;
create table employee(eid int primary key, full_name varchar(200), dept varchar(50),company varchar(20),salary int,desg varchar(50),gender varchar(10));


Insert into employee values(1102,'Napolean','Monarchy','France',2000000000,'Emperor','Male');
Insert into employee values(1103,'LUlu','Business','Georgia',20000,'tester','Female');


select * from employee;