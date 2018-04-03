drop table STUDENT if exists;
drop sequence hibernate_sequence if exists;
    create table STUDENT(
		id bigint not null primary key,
		name varchar_ignorecase(52) not null,
		passport_number varchar_ignorecase(55) not null
	);
CREATE SEQUENCE hibernate_sequence;


insert into student
values(10001,'Ranga2', 'E1234567');

insert into student
values(10002,'Ravi2', 'A1234568');