/* Ejercicio 1 */
/* Crea tablas según el siguiente esquema */

DROP DATABASE IF EXISTS EXAMENEFRENALONSO;
CREATE DATABASE EXAMENEFRENALONSO;
USE EXAMENEFRENALONSO;

CREATE TABLE CUENTAS (
codCuenta INTEGER PRIMARY KEY,
nifCliente CHAR(9),
fechaCreacion DATE,
saldo int
);

CREATE TABLE MOVIMIENTOS (
idMovimiento INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
codCuenta int,
fechaHora DATE, /* Fecha y hora en la que se realiza la operación en la cuenta */
cantidad int, /* +ingreso -reintegro */
descripcion VARCHAR(50)
);

/* Añadir a MOVIMIENTOS la columna nifOperacion */
alter table movimientos add nifOperacion CHAR(9) not null;

/* Añadir la relación de las tablas cuentas y movimientos */
alter table movimientos add constraint codCuenta FOREIGN KEY(codCuenta) REFERENCES CUENTAS(codCuenta);

alter table CUENTAS add constraint fechaCreacion FOREIGN KEY(fechaHora) REFERENCES MOVIMIENTOS(fechaHora);

/* Modificar cantidad de MOVIMIENTOS para que no sea nulla */
alter table movimientos change cantidad cantidad int not null;

/* Modificar fechaHora para ser tipo DATETIME */
alter table movimientos change fechaHora fechaHora DATETIME;

/* Cambiar cantidad por importe */
alter table movimientos change cantidad importe int;

/* Eliminar Descripción */
alter table movimientos drop descripcion;



/* EJERCICIO 2: BASE DE DATOS BIBLIOTECA */

use BIBLIOTECAEXAMEN;

/* Consulta 1, listado de libros prestados a día de hoy */
select nombre as Editorial, titulo, idSocio, precio as PrecioBase, precio*0.21 as IVA, precio+precio*0.21 as PrecioTotal
from prestamos join ejemplares on prestamos.idPrestamo = ejemplares.idLibro join libros on ejemplares.idLibro = libros.idLibro join editoriales on libros.idEditorial = editoriales.idEditorial
where devuelto = false;

/* Consulta 2, Total ejemplares: cantidad, total gastado y precio medio*/
select count(idEjemplar) as Numero_De_Ejemplares, sum(precio) as Total_Gastado, avg(precio) as Media_Precio
from ejemplares;

/* Consulta 3, libro(s) más caros y su autor */
select nombre, titulo, precio 
from ejemplares join libros on ejemplares.idLibro = libros.idLibro join autores on libros.idAutor = autores.idAutor
where precio = (select precio from ejemplares order by precio desc limit 1);

/* Consulta 4, total gastado por editorial */
select ideditorial, sum(precio)
from ejemplares join libros on ejemplares.idLibro = libros.idLibro
group by ideditorial;

/* Consulta 5 aumentar 10 dias el plazo de entrega de los libros científicos */
update libros set diasmaxprestamo = diasmaxprestamo+10
where idTema=6;

/* Consulta 6 crear tabla informacionBasica */


/* Consulta 7, socios que en la actualidad no tienen ningun prestamo */
select distinct nombre
from socios join prestamos on socios.idSocio = prestamos.idSocio
where fechaDevolucion < curdate();

/* Consulta 8, nueva compra con información asociada */
start transaction;

INSERT INTO LIBROS (IdLibro, Titulo, IdIdioma, IdEditorial, IdAutor, IdTema, AnhoPublicacion, DiasMaxPrestamo) VALUES
(9999, 'El juego de Ripper', 1, 6, 11, 1, 2018, 20);
INSERT INTO EJEMPLARES(IdLibro, IdEjemplar, Ubicacion, Edicion, Precio, Disponible) VALUES
(9999, 1, 'A1', '1ª', 23, TRUE),
(9999, 2, 'A2', '1ª', 23, TRUE),
(9999, 3, 'A3', '1ª', 23, TRUE),
(9999, 4, 'A4', '1ª', 23, TRUE);
INSERT INTO Autores (IdAutor, Nombre, IdNacionalidad) VALUES
(11, 'Isabel Allende', 5);

COMMIT;

/* Consulta 9, datos de los prestamos que están pendientes */

select distinct socios.idsocio, concat(nombre,' ',apellidos) as nombre_completo, titulo, fechaPrestamo, fechaPrestamo+DiasMaxprestamo as fecha_esperada_de_devolucion, curdate()-(fechaPrestamo+DiasMaxPrestamo) as dias_de_retraso
from socios join prestamos on socios.idSocio = prestamos.idSocio join ejemplares on prestamos.idPrestamo = ejemplares.idLibro join libros on ejemplares.idLibro = libros.idLibro
where devuelto = false && curdate()-(fechaPrestamo+DiasMaxPrestamo) > 0;

/* Consulta 10, comprobación de estado */

select titulo, nombre, anhoPublicacion, insert(' ',1,1,if (year(curdate())-anhoPublicacion > 10,'Libro muy antiguo. Revisar estado',if (year(curdate())-anhoPublicacion >= 5,'Atencion al estado',if (year(curdate())-anhoPublicacion >=2,'Libro seminuevo','')))) as estado_revision
from libros join autores on libros.idAutor = autores.idAutor;