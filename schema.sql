
    create table Cancha (
        id_cancha integer not null auto_increment,
        esta_iluminada bit,
        nombre varchar(255),
        primary key (id_cancha)
    )

    create table Color (
        cod_color integer not null auto_increment,
        descripcion varchar(255),
        primary key (cod_color)
    )

    create table Constructor (
        cod_constructor integer not null auto_increment,
        domicilio integer,
        nombre varchar(255),
        primary key (cod_constructor)
    )

    create table Jugadores (
        id_jugador integer not null auto_increment,
        apellido varchar(255),
        domicilo varchar(255),
        nacimiento integer,
        nombre varchar(255),
        primary key (id_jugador)
    )

    create table Paletas (
        cod_paleta integer not null auto_increment,
        grosor integer,
        nombre varchar(255),
        primary key (cod_paleta)
    )

    create table Participacion (
        partido_id_partido integer not null,
        jugador_id_jugador integer not null,
        primary key (partido_id_partido, jugador_id_jugador)
    )

    create table Partidos (
        id_partido integer not null auto_increment,
        fin_partido integer,
        inicio_partido integer,
        primary key (id_partido)
    )

    alter table Participacion 
        add constraint FK_5c53vc32mkiy9bj4kdpk11udp 
        foreign key (partido_id_partido) 
        references Partidos (id_partido)

    alter table Participacion 
        add constraint FK_ok0xruxsa70uaffkwimt9wvuk 
        foreign key (jugador_id_jugador) 
        references Jugadores (id_jugador)
