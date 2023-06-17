create table artist (id bigint not null, bio varchar(2000), date_of_birth date, email varchar(255), fist_name varchar(255) not null, last_name varchar(255) not null, primary key (id));
create table t_address (id bigint not null, street1 varchar(255), street2 varchar(255), primary key (id));
create table t_book (id bigint not null, description varchar(255), illustrations boolean, isbn varchar(255), nb_of_pages integer, price float4, title varchar(255), primary key (id));
create table t_city (city varchar(255), state varchar(255), zipcode varchar(255), city_id bigint not null, primary key (city_id));
create table t_country (country varchar(255), country_id bigint not null, primary key (country_id));
create table t_new (id bigint not null, language varchar(255) not null, content varchar(255), primary key (id, language));
alter table if exists t_city add constraint FK8a66c47tt6dwujmvlrdxrwp7b foreign key (city_id) references t_address;
alter table if exists t_country add constraint FKoc2hu83n580q05ee94nc2wv9c foreign key (country_id) references t_address;
