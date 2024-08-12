CREATE TABLE IF NOT EXISTS users (
    id INT auto_increment NOT NULL,
    nombreApellido varchar(100) NOT NULL,
    mail varchar(100) NULL,
    direccion varchar(100) NULL,
    clave varchar(100) NULL,
    CONSTRAINT users_PK PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS departments (
     id INT auto_increment NOT NULL,
     name varchar(100) NOT NULL,
     description varchar(100) NULL,
     CONSTRAINT departments_PK PRIMARY KEY (id)
);