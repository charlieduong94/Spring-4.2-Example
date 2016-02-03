create table users(
	id int auto_increment,
	name varchar(50) not null,
	age int not null,
	constraint pk primary key(id)
);

create unique index users_na_index on users(name, age);

insert into users(name, age) values ('Charlie', 21);
