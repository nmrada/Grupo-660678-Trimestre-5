-- Ejemplo Selects anidados proyecto
select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=
(select max(i.Pedido_Factura_idFactura) from tiendaenlinea.item i);

select m.nombre  from tiendaenlinea.municipio m where m.Departamento_idDepartamento =
(select max(m.Departamento_idDepartamento) from tiendaenlinea.municipio m); 