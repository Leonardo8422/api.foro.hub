
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(500) not null,
    fecha_creacion datetime not null,
    estado_topico varchar(100) not null,
    autor varchar(100),
    curso varchar(20),

    primary key(id)

);
