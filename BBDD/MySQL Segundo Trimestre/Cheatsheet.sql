/* Reference sheet to not die terribly */

Use empresasABC;

select * from empleados;

/* DISTINCT */
select distinct * from empleados;

/* WHERE, nulls, iguales, where not */
select nombre from empleados where oficina is null;
select nombre from empleados where oficina = 12;
select nombre from empleados where not oficina = 12;

select * from empleados where oficina = 12;

/* AND // OR dentro de los where */
select * from empleados where oficina = 12 and categoria = 'representante';
select * from empleados where oficina = 12 or oficina = 21;

/* Order by y order by desc */
select * from empleados where oficina = 21 order by nombre;
select * from empleados where oficina = 21 order by nombre desc;

/* Order con dos condiciones */
select * from empleados where oficina = 21 order by nombre, categoria;

/* Marcarse un insert de datos rico rico */
INSERT INTO Empleados (codEmpleado,nombre, fecNacimiento, oficina, 
categoria, fecContrato,codJefe, sueldo, comision, 
retencionesIRPF, retencionesSS) VALUES
('001', 'Alonso Mariño, Luis Efrén', '1993-03-25', '11', 'Pisacharcos',
'1993-03-25', NULL, 5600,NULL, 0.12, 0.07);

/* Update y delete que son movidas y están protegidos así que no toques */
update Empleados set oficina = lugar where oficina = 12;
update Empleados set oficina = 22, fecNacimiento = '1889-20-03' where codEmpleado = 001;
delete from Empleados where codEmpleado = 001;

/* Limit para que salgan solo unos pocos */
select * from empleados limit 3;


select nombre, min(sueldo) from empleados;
select nombre, max(sueldo) from empleados;

select count(*) from empleados where sueldo > 2000;
select avg(sueldo) from empleados;
select sum(sueldo) from empleados;

select nombre from empleados where nombre NOT like 'a%';
select nombre from empleados where nombre like '%a';

/*
LIKE Operator	Description
WHERE CustomerName LIKE 'a%'	Finds any values that start with "a"
WHERE CustomerName LIKE '%a'	Finds any values that end with "a"
WHERE CustomerName LIKE '%or%'	Finds any values that have "or" in any position
WHERE CustomerName LIKE '_r%'	Finds any values that have "r" in the second position
WHERE CustomerName LIKE 'a_%_%'	Finds any values that start with "a" and are at least 3 characters in length
WHERE ContactName LIKE 'a%o'	Finds any values that start with "a" and ends with "o"
*/

/*
Symbol	Description	Example
*	Represents zero or more characters	bl* finds bl, black, blue, and blob
?	Represents a single character	h?t finds hot, hat, and hit
[]	Represents any single character within the brackets	h[oa]t finds hot and hat, but not hit
!	Represents any character not in the brackets	h[!oa]t finds hit, but not hot and hat
-	Represents a range of characters	c[a-b]t finds cat and cbt
#	Represents any single numeric character	2#5 finds 205, 215, 225, 235, 245, 255, 265, 275, 285, and 295
*/

select * from empleados where categoria in ('Representante');

select nombre from empleados where oficina between 10 and 20;
select nombre from empleados where oficina not between 10 and 20;
select * from empleados where (sueldo between 1000 and 2000) and not oficina in (12,13,14);

select nombre from empleados where nombre between 'Tellería Lejardi, Juan Victor' and
'Viguer Gardía, Antonio' order by nombre;

select * from pedidos where fecPedido between '01-05-2018' and '01-07-2018';

/* Meter cambios sin liarla */
/* Esto declara que vas a empezar a hacer movidas pero que son de broma */
Start transaction;

/* Rollback es un "es broma" definitivo que deshace todo lo que tengas hecho
te vale tambien por si la lías para que no sea un lío definitivo*/
rollback;

/* Commit hace que no sea broma ya del todo y es oficial ahora vive con ello */
commit;


/* Preguntas para Pancho:
Añadir columnas a una tabla que ya hemos creado. (Alter table? Update?)
Borrar cosas, dónde se ponen los permisos y tal porque dice que no tengo.
*/

select death
from miVida
where date= 'prontito';