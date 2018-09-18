create database ficha;
use ficha;

create table ficha (
 id int(10) auto_increment primary key,
  ativo boolean,
  observacao varchar(1000),
  dataDeCadastro timestamp
);

create table animal(
	id int (10) auto_increment primary key,
  ficha_id int (10),
	nome varchar(50),
    FOREIGN KEY (ficha_id) REFERENCES ficha (id) on delete cascade
);

insert into animal values(1,null,"cachorro");
insert into animal values(2,null,"gato");
insert into animal values(3,null,"cabrito");
insert into animal values(4,null,"papagaio");
insert into animal values(5,null,"galo");
insert into animal values(6,null,"tigre");
insert into animal values(7,null,"elefante");
insert into animal values(8,null,"zebra");
insert into animal values(9,null,"girafa");
insert into animal values(10,null,"puma");


