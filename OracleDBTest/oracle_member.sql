
create table member(
	id varchar(10) primary key,
	name varchar(30),  
	height float,
	weight float,
	age int
);

insert into member values('hyun', '현대빈', 169.9, 68.4, 55);
insert into member values('kim', '김정은', 158.9, 58.4, 25);
insert into member values('lee', '이정은', 179.9, 68.4, 35);
insert into member values('park', '박정은', 189.9, 78.4, 45);
insert into member values('choi', '최정은', 199.9, 88.4, 34);

select * from member;

commit;

drop table member;