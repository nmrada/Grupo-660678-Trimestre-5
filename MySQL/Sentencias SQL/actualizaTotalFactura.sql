-- Actualiza el total de la factura con el campo total de la tabla pedido.

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =1)
where f.idFactura =1;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =2)
where f.idFactura =2;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =3)
where f.idFactura =3;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =4)
where f.idFactura =4;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =5)
where f.idFactura =5;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =6)
where f.idFactura =6;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =7)
where f.idFactura =7;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =8)
where f.idFactura =8;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =9)
where f.idFactura =9;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =10)
where f.idFactura =10;