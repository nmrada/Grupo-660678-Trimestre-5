-- Actualiza los subtotales, impuestos y total de Pedido
update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=1),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=1)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=1)*1.16 where p.Factura_idFactura=1;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=2),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=2)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=2)*1.16 where p.Factura_idFactura=2;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=3),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=3)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=3)*1.16 where p.Factura_idFactura=3;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=4),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=4)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=4)*1.16 where p.Factura_idFactura=4;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=5),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=5)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=5)*1.16 where p.Factura_idFactura=5;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=6),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=6)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=6)*1.16 where p.Factura_idFactura=6;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=7),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=7)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=7)*1.16 where p.Factura_idFactura=7;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=8),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=8)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=8)*1.16 where p.Factura_idFactura=8;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=9),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=9)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=9)*1.16 where p.Factura_idFactura=9;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10)*1.16 where p.Factura_idFactura=10;
