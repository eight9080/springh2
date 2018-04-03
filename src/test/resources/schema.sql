drop table STUDENT if exists;
drop sequence hibernate_sequence if exists;

    create table STUDENT(
		id bigint not null primary key,
		name varchar_ignorecase(51) not null,
		passport_number varchar_ignorecase(55) not null
	);
CREATE SEQUENCE hibernate_sequence;