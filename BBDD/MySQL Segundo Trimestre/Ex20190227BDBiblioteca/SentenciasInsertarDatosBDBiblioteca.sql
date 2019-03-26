INSERT INTO Idiomas (IdIdioma, Idioma) VALUES 
(1, 'Español'),(2, 'Francés'), (3, 'Inglés');

INSERT INTO Temas (IdTema, Tema) VALUES 
(1, 'Novela'),(2, 'Informática'), (3, 'Arte'),
(4, 'Historia'), (5, 'Novela Histórica'),
(6, 'Científico');

INSERT INTO Nacionalidades (IdNacionalidad, Nacionalidad) VALUES 
(1, 'Española'),(2, 'Británica'),
(3, 'Francesa'), (4, 'Norteamericana'), 
(5, 'Chilena'), (6, 'Peruana'), 
(7, 'Colombiana'), (8,'Australiana');

INSERT INTO Editoriales (IdEditorial, Nombre, Direccion,Telefono) VALUES
(1, 'Acanto, S.A.', 'Bertrán, 113-08023-Barcelona', '934189093'),
(2, 'Ediciones Aldeasa', 'Ayala, 42-28001-Madrid','915751611'),
(3, 'Alianza Editorial, S.A.', 'Juan Ignacio Luca de Tena, 15-28027-Madrid', '913938888'),
(4, 'Grupo Anaya', 'Juan Ignacio Luca de Tena, 15-28027-Madrid', '913938800'),
(5, 'Nova Galicia Edicions, S.L.', 'Avda. Ricardo Mella, 143 (Nave 3)-36330-Vigo','986462111'),
(6, 'Alba Editorial, S.L.U.','Camps i Fabre 3-11, 4-08006-Barcelona','934152929'),
(7, 'Temas de Hoy, S.A. Ediciones', 'Paseo de Recoletos 4, 4º-28001-Madrid', '914230318'),
(8, 'Alfaguara Editorial', 'Torrelaguna, 60-28043-Madrid', '917449060'),
(9, 'Elsevier', 'Paseo de Gracía, 24 - 23013- Barcelona', '93 241 59 60');

INSERT INTO Autores (IdAutor, Nombre, IdNacionalidad) VALUES
(1, 'María Dueñas', 1),
(2, 'Mario Vargas Llosa', 6),
(3, 'Gabriel García Márquez ', 7),
(4, 'Miguel de Cervantes', 1),
(5, 'Willa Cather', 4),
(6, 'Charlotte Brontë', 2),
(7, 'Rosa Montero', 1),
(8, 'Kate Morton', 8),
(9, 'Frank H. Stephenson', 4), 
(10, 'Patrick R. Murray', 4);

INSERT INTO LIBROS (IdLibro, Titulo, IdIdioma, IdEditorial, IdAutor, IdTema, AnhoPublicacion, DiasMaxPrestamo) VALUES
(1, 'El tiempo entre costuras', 1, 7, 1, 1, 2009, 15),
(2, 'La fiesta del Chivo', 1, 8, 2, 1, 2006, 20),
(3, 'El sueño del Celta', 1, 8, 2, 1, 2010, 20),
(4, 'Misión Olvido', 1,7,1,1, 2012, 15),
(5, '100 Años de Soledad', 1, 4, 3, 1, 2014, 20),
(6, 'Pioneros', 1, 6, 5, 1, 2001, 20),
(7, 'Mi Antonia', 1, 6, 5, 1, 2012, 20),
(8, 'El amor en los tiempos del colera', 1, 4, 3, 1, 2014, 20),
(9, 'Crónica de una muerte anunciada', 1,4,3, 1, 2014, 15),
(10, 'Cálculo en Biología Molecular y Biotecnología', 1, 9, 9, 6, 2012, 30),
(11, 'Microbiología médica básica', 1, 9, 10, 6, 2018, 30);

INSERT INTO EJEMPLARES(IdLibro, IdEjemplar, Ubicacion, Edicion, Precio, Disponible) VALUES
(1, 1, 'A1', '1ª', 21.50, TRUE),
(1, 2, 'A2', '1ª', 21.50, TRUE),
(1, 3, 'A3', '2ª', 23.50, TRUE),
(1, 4, 'A4', '2ª', 23.50, TRUE),
(1, 5, 'A5', '3ª', 25.50, TRUE),
(1, 6, 'A6', '4ª', 25.50, TRUE),
(2, 1, 'B1', '1ª', 15.00, TRUE),
(2, 2, 'B2', '1ª', 15.50, TRUE),
(2, 3, 'B3', '2ª', 18.50, TRUE),
(2, 4, 'B4', '2ª', 18.50, TRUE),
(2, 5, 'B5', '3ª', 23.50, TRUE),
(2, 6, 'B6', '4ª', 23.50, TRUE),
(3, 1, 'C1', '1ª', 21.50, TRUE),
(3, 2, 'C2', '1ª', 21.50, TRUE),
(3, 3, 'C3', '2ª', 23.50, TRUE),
(3, 4, 'C4', '2ª', 23.50, TRUE),
(4, 1, 'C5', '1ª', 25.50, TRUE),
(4, 2, 'C6', '1ª', 25.50, TRUE),
(4, 3, 'C7', '2ª', 25.50, TRUE),
(5, 1, 'D1', '1ª', 24.50, TRUE),
(5, 2, 'D2', '1ª', 24.50, TRUE),
(5, 3, 'D3', '2ª', 26.50, TRUE),
(5, 4, 'D4', '2ª', 26.50, TRUE),
(5, 5, 'D5', '3ª', 26.50, TRUE),
(6, 1, 'E1', '1ª', 22.50, TRUE),
(6, 2, 'E2', '1ª', 22.50, TRUE),
(6, 3, 'E3', '2ª', 22.50, TRUE),
(6, 4, 'E4', '2ª', 22.00, TRUE),
(7, 1, 'F1', '1ª', 21.00, TRUE),
(7, 2, 'F2', '1ª', 21.00, TRUE),
(7, 3, 'F3', '2ª', 23.00, TRUE),
(7, 4, 'F4', '2ª', 23.00, TRUE),
(7, 5, 'F5', '3ª', 25.00, TRUE),
(7, 6, 'F6', '4ª', 25.00, TRUE),
(8, 1, 'F7', '1ª', 21.00, TRUE),
(8, 2, 'F8', '1ª', 21.00, TRUE),
(9, 1, 'G1', '1ª', 21.00, TRUE),
(9, 2, 'G2', '1ª', 21.00, TRUE),
(9, 3, 'G3', '2ª', 23.00, TRUE),
(9, 4, 'G4', '2ª', 23.00, TRUE),
(9, 5, 'G5', '3ª', 25.00, TRUE),
(9, 6, 'G6', '4ª', 25.00, TRUE),
(10, 1, 'H1', '2ª', 65.00, TRUE),
(10, 2, 'H2', '2ª', 60.00, TRUE),
(11, 1, 'H3', '1ª', 65.00, TRUE),
(11, 2, 'H4', '2ª', 63.00, TRUE);

INSERT INTO SOCIOS (IdSocio, Nombre, Apellidos, Direccion, Telefono) VALUES
(1,'María','García Barrenechea','Principe, 38-36201-Vigo','986454545'),
(2,'Juan','Santos Gutierrez','Hispanidad, 32-36203-Vigo','986757471'),
(3,'Pedro','Astigarraga Marcaide','Pez Volador, 84-28041-Madrid','91565254'),
(4,'Marta','Berraondo Ojanguren','Diagonal, 125-23045-Barcelona','93828148'),
(5,'Isabel','Ormaechea Garate','Plaza de Galicia, 2-31254-Santiago de Compostela','981232526'),
(6,'Carmen','Chinchetru Ochoa','Ronda de Sobradiel,16-28080-Madrid','91656463'),
(7,'Iciar','Aguirre Guisasola','Jardines, 17-20020-Eibar','943178545'),
(8,'Santiago','Arrieta Andonegui','Marquiegui,10-24561-Deba','943522116'),
(9,'Carlos','Barret Sanjurjo','García Barbón, 4-36201-Vigo','986705060'),
(10,'Nicolas','Fernández Santos','Rosalía Castro, 14-36201-Vigo','986414243'),
(11,'Margarita','Pastoriza Pereira','Camelias, 23-36205-Vigo','986959493'),
(12,'Jorge','Sobrina Santos','Serafín Avendaño, 4-36201-Vigo','986525758');

INSERT INTO Prestamos (IdPrestamo, IdLibro, IdEjemplar, IdSocio, FechaPrestamo, FechaDevolucion, Devuelto) VALUES
(1, 9, 1, 12, '2018/10/05', '2018/10/15', TRUE),
(2, 9, 1, 1, '2018/11/15','2018/11/28', TRUE),
(3, 9, 1, 8, '2018/12/01', NULL, FALSE),
(4, 1, 6, 12, '2019/02/15', '2016/02/24', TRUE),
(5, 1, 1, 5, '2019/01/12', '2019/02/14', TRUE),
(6, 1, 3, 6, '2019/02/10',NULL, FALSE),
(7, 1, 2, 7, '2019/01/05', '2019/01/25', TRUE),
(8, 2, 1, 2, '2019/01/17', '2019/02/27', TRUE),
(9, 2, 2, 4, '2019/02/05', '2019/02/28', TRUE),
(10, 2, 1, 1, '2019/02/14',NULL, FALSE),
(11, 2, 2, 2, '2019/01/10',NULL,FALSE),
(12, 3, 1, 8, '2019/01/09', '2019/01/30', TRUE),
(13, 3, 2, 7, '2019/02/05', '2019/02/18', TRUE),
(14, 3, 2, 1, '2019/02/25', NULL, FALSE),
(15, 3, 3, 3, '2019/02/05', NULL, FALSE),
(16, 4, 1, 5, '2019/01/05','2019/01/18', TRUE),
(17, 4, 2, 6, '2019/02/12',NULL, FALSE),
(18, 4, 3, 7, '2019/02/27', NULL, FALSE),
(19, 4, 1, 12, '2019/02/05', NULL, FALSE);

INSERT INTO SANCIONES (idSancion, IdSocio, FechaSancion)
VALUES
(1, 1, '2019-01-31'),
(2, 12, '2019-02-05'),
(3, 6, '2019-01-31'),
(4, 2, date_add((SELECT fechaDevolucion FROM Prestamos 
WHERE idPrestamo = 8), INTERVAL 10 DAY)), 
(5, 4, date_add((SELECT fechaDevolucion FROM Prestamos 
WHERE idPrestamo = 9), INTERVAL 10 DAY));
