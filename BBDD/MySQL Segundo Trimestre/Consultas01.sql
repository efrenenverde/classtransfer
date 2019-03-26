Use empresasABC;

/* 01 */
select idfabricante, idproducto,descripcion, precioCompra, (precioCompra * 1.21)
from productos;

/* 02 */
select numLinea, fabricante, producto, cantidad, precioVenta, precioventa*cantidad
from lineaspedido;

/* 03 */
select nombre, curdate()-fecContrato
from empleados;

/* 07 Listar las ocho líneas de pedido más caras (las de mayor importe). */
select distinct codPedido
from lineaspedido order by cantidad*precioVenta limit 8;