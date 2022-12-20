create table estado(
	id_estado int auto_increment primary key,
    nome varchar(20)
);
create table genero(
	id_genero int auto_increment primary key,
    nome varchar(60)
);
create table usuario(
	id_usuario int auto_increment primary key,
    nome varchar(60),
    email varchar(60),
    foto varchar(60),
    telefone varchar(20),
    localizacao varchar(60)
);
create table livro(
	id_livro int auto_increment primary key,
    nome varchar(60),
    autor varchar(60),
    descricao varchar(200),
    qtd_pags int,
    genero varchar(60),
    estado varchar(60),
    id_usuario int,
    foreign key (id_usuario) references usuario(id_usuario)
);
select * from livro;