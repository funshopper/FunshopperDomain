create sequence hibernate_sequence start with 1 increment by 1
create table category (id integer not null, description varchar(255), name varchar(255), primary key (id))
create table product (id integer not null, comment varchar(255), description varchar(255), link varchar(255), name varchar(255), price double not null, create_timestamp date, long_description varchar(255), update_timestamp date, category_id integer, primary key (id))
alter table product add constraint FK1mtsbur82frn64de7balymq9s foreign key (category_id) references category
create sequence hibernate_sequence start with 1 increment by 1
create table category (id integer not null, description varchar(255), name varchar(255), primary key (id))
create table product (id integer not null, comment varchar(255), description varchar(255), link varchar(255), name varchar(255), price double not null, create_timestamp date, long_description varchar(255), update_timestamp date, category_id integer, primary key (id))
alter table product add constraint FK1mtsbur82frn64de7balymq9s foreign key (category_id) references category
create sequence hibernate_sequence start with 1 increment by 1
create table category (id integer not null, description varchar(255), name varchar(255), primary key (id))
create table product (id integer not null, comment varchar(255), description varchar(255), link varchar(255), name varchar(255), price double not null, create_timestamp date, long_description varchar(255), update_timestamp date, category_id integer, primary key (id))
alter table product add constraint FK1mtsbur82frn64de7balymq9s foreign key (category_id) references category
create sequence hibernate_sequence start with 1 increment by 1
create table category (id integer not null, description varchar(255), name varchar(255), primary key (id))
create table product (id integer not null, comment varchar(255), description varchar(255), link varchar(255), name varchar(255), price double not null, create_timestamp date, long_description varchar(255), update_timestamp date, category_id integer, primary key (id))
alter table product add constraint FK1mtsbur82frn64de7balymq9s foreign key (category_id) references category
