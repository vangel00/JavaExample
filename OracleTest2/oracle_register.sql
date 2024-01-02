create table register(
	hakbun number(5) primary key,
	kwamok varchar2(30) default null,
	ezenclass varchar2(1) not null,
	medsungjuk number(3) default 0,
	finsungjuk number(3) default 0
);

insert into register values(23001, '데이터베이스', 'A', 90, 95);
insert into register values(23002, '운영체제', 'B', 95, 95);
insert into register values(23003, '논리회로', 'A', 80, 90);
insert into register values(23004, '자료구조', 'C', 85, 100);
insert into register values(23005, '자바프로그래밍', 'A', 70, 75);
insert into register values(23006, 'JSP프로그래밍', 'B', 0, 0);

select * from register;

--CRUD
1.registerSelect.java
2.registerInsert.java
3.registerUpdate.java
4.registerDelete.java
