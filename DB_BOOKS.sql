CREATE DATABASE DB_BOOKS;

USE DB_BOOKS;

CREATE TABLE DB_BOOKS.Libros(
	codigoLibro INT NOT NULL AUTO_INCREMENT,
    nombreLibro VARCHAR(50) NOT NULL,
    autorLibro VARCHAR(100) NOT NULL,
    paginasLibro INT NOT NULL,
    editorialLibro VARCHAR(45) NOT NULL,
    categoriaLibro VARCHAR(20) NOT NULL,
    precioLibro DECIMAL(10,2) NOT NULL,
    PRIMARY KEY PK_codigoLibro (codigoLibro)
);