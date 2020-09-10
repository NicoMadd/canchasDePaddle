
    create table Cancha (
        id_cancha integer generated by default as identity (start with 1),
        esta_iluminada boolean,
        nombre varchar(255),
        primary key (id_cancha)
    )

    create table Color (
        cod_color integer generated by default as identity (start with 1),
        descripcion varchar(255),
        primary key (cod_color)
    )

    create table Constructor (
        cod_constructor integer generated by default as identity (start with 1),
        domicilio integer,
        nombre varchar(255),
        primary key (cod_constructor)
    )

    create table Jugadores (
        id_jugador integer generated by default as identity (start with 1),
        apellido varchar(255),
        domicilo varchar(255),
        nacimiento integer,
        nombre varchar(255),
        primary key (id_jugador)
    )

    create table Paletas (
        cod_paleta integer generated by default as identity (start with 1),
        grosor integer,
        nombre varchar(255),
        primary key (cod_paleta)
    )

    create table Participacion (
        id_partipacion integer generated by default as identity (start with 1),
        primary key (id_partipacion)
    )

    create table Partidos (
        id_partido integer generated by default as identity (start with 1),
        fin_partido integer,
        inicio_partido integer,
        primary key (id_partido)
    )
