-- Procedimiento crear carrito de Compras
DELIMITER /
create procedure tiendaenlinea.insertarCarritoDeCompras(subtotalCarrito float, totalCarrito float, impuestosCarrito float)
  begin
  INSERT INTO `tiendaenlinea`.`carritodecompras`
(`subtotal`,
`precioTotal`,
`impuestos`)
VALUES
(subtotalCarrito,
totalCarrito,
impuestosCarrito);
end/

-- Procedimiento crear catalogo
DELIMITER/
CREATE procedure tiendaenlinea.insertarCatalogo(nombre varchar(45),descripcionCatalogo varchar(500) )
begin
INSERT INTO `tiendaenlinea`.`catalogo`
(`nombreCatalogo`,
`descripcion`)
VALUES
(nombre,
descripcionCatalogo);
end/

-- Procedimiento crear Categoria
delimiter/
create procedure tiendaenlinea.insertarCategoria(id int(11), nombre varchar(100), activo bool,parienteCategoria int(11))
begin
INSERT INTO `tiendaenlinea`.`categoria`
(`idCategoria`,
`nombreCategoria`,
`activa`,
`pariente`)
VALUES
(id,
nombre,
activo,
parienteCategoria);
end/


-- Procedimiento crear Usuario
delimiter/
create procedure tiendaenlinea.insertarUsuario (id varchar(20), contra varchar(45),rolUsuario varchar(45),
estadoUsuario varchar(20))
begin
INSERT INTO `tiendaenlinea`.`usuario`
(`idUsuario`,
`contrasena`,
`rol`,
`estado`)
VALUES
(id,
contra,
rolUsuario,
estadoUsuario);
end/

-- Procedimiento crear Cuenta
delimiter/
create procedure tiendaenlinea.insertarCuenta(tipoD varchar(10),numeroD varchar(45),primerNo varchar(100),
segundoNo varchar(45),primerAp varchar(100),segundoAp varchar(45),contra varchar(45), correo varchar(45), 
idUsuario varchar(20))
begin
INSERT INTO `tiendaenlinea`.`cuenta`
(`tipoDocumento`,
`numeroDocumento`,
`primerNombre`,
`segundoNombre`,
`primerApellido`,
`segundoApellido`,
`contrasena`,
`email`,
`Usuario_idUsuario`)
VALUES
(tipoD,
numeroD,
primerNo,
segundoNo,
primerAp,
segundoAp,
contra,
correo,
idUsuario);
end/

-- Procedimiento crear Departamento
delimiter/
create procedure tiendaenlinea.insertarDepartamento(id varchar(2), nombreDepartamento varchar(45))
begin
INSERT INTO `tiendaenlinea`.`departamento`
(`idDepartamento`,
`nombre`)
VALUES
(id,
nombreDepartamento);
end/

-- Procedimiento para crear un Domicilio para la cuenta
delimiter/
create procedure tiendaenlinea.insertarDomicilioCuenta(cuentaTipo varchar(10),cuentaNum varchar(45),telefonoDo varchar(45),
direccionDo varchar(200), barrioDo varchar(100),localidadDo varchar(100), idMunicipio varchar(4))
begin
INSERT INTO `tiendaenlinea`.`domicilio_cuenta`
(`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(cuentaTipo,
cuentaNum,
telefonoDo,
direccionDo,
barrioDo,
localidadDo,
idMunicipio);
end/

-- Procedimiento crear Producto
DELIMITER /
create procedure tiendaenlinea.insertarProducto(id varchar(100), nombre varchar(300),marca2 varchar(45),referencia varchar(45),
	descripcion varchar(300), material varchar(45),color varchar(45), cantidad int(11),
  activo bool,precio float,  descuento float,idCategoria int(11),idCatalogo int(11),imagen longblob )
  begin 
  INSERT INTO `tiendaenlinea`.`producto`
(`idProducto`,`nombre`,`marca`,`referencia`,`descripcion`,`material`,`color`,foto,`cantidad`,`activo`,`precioUnitario`,
`descuento`,`Categoria_idCategoria`,`Catalogo_idCatalogo`)
VALUES
(id,nombre,
marca2,
referencia,
descripcion,
material,
color,
imagen,
cantidad,
activo,
precio,
descuento,
idCategoria,
idCatalogo);
end/

-- Procedimiento Crear Proveedor
delimiter/
create procedure tiendaenlinea.insertarProveedor(id varchar(45),tipoIdentificacion varchar(20), nombrePro varchar(200),
telefonoPro varchar(20), correo varchar(45))
begin
INSERT INTO `tiendaenlinea`.`proveedor`
(`idProveedor`,
`tipoDeIdentificacion`,
`nombre`,
`telefono`,
`email`)
VALUES
(id,
tipoIdentificacion,
nombrePro,
telefonoPro,
correo);
end/

-- Procedimiento Crear Domicilio Proveedor
delimiter/
create procedure tiendaenlinea.insertarDomicilioProveedor(idPro varchar(45), tipoIdentificacionPro varchar(20),
telefonoPro varchar(45), direccionPro varchar(200), barrioPro varchar(100), localidadPro varchar(100), idMunicipio varchar(4))
begin
INSERT INTO `tiendaenlinea`.`domicilio_proveedor`
(`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(idPro,
tipoIdentificacionPro,
telefonoPro,
direccionPro,
barrioPro,
localidadPro,
idMunicipio);
end/

-- Procedimiento Crear Item Carrito
delimiter/
create procedure tiendaenlinea.insertarItemCarrito(idProducto varchar(100), idCarrito int(11),cantidadPro int (11),
 costoUnitarioPro float, costoTotalItem float)
begin
INSERT INTO `tiendaenlinea`.`item_carrito`
(`Producto_idProducto`,
`CarritoDeCompras_idCarritoDeCompras`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idProducto,
idCarrito,
cantidadPro,
costoUnitarioPro,
costoTotalItem);
end/

-- Procedimiento crear Municipio
delimiter/
create procedure tiendaenlinea.insertarMunicipio(id varchar(4), nombreMun varchar(45), idDepartamento varchar(2))
begin
INSERT INTO `tiendaenlinea`.`municipio`
(`idMunicipio`,
`nombre`,
`Departamento_idDepartamento`)
VALUES
(id,
nombreMun,
idDepartamento);
end/

-- Procedimiento crear Inventario
delimiter/
create procedure tiendaenlinea.insertarInventario(fechaCompra date, cantidadPro int(11),idProducto varchar(100),
 idProveedor varchar(45),tipoDeIdentificacionPro varchar(20) )
begin
INSERT INTO `tiendaenlinea`.`inventario`
(`fecha`,
`cantidad`,
`Producto_idProducto`,
`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`)
VALUES
(fechaCompra,
cantidadPro,
idProducto,
idProveedor,
tipoDeIdentificacionPro);
end/

-- Procedimiento Crear Factura
delimiter/
create procedure tiendaenlinea.insertarFactura(fechaFac datetime, totalFac float,tipoDocumentoCuen varchar(10),
 numeroDocumentoCuen varchar(45))
begin
INSERT INTO `tiendaenlinea`.`factura`
(`fecha`,
`total`,
`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`)
VALUES
(fechaFac,
totalFac,
tipoDocumentoCuen,
numeroDocumentoCuen);
end/

-- Procedimiento Crear Pago
delimiter/
create procedure tiendaenlinea.insertarPago(idFactura int(11),numTar varchar(45), bancoPago varchar(100),
tipoCuenta varchar(20),tipoTransaccionPago varchar(10))
begin
INSERT INTO `tiendaenlinea`.`pago`
(`Factura_idFactura`,
`numTarCredito`,
`banco`,
`tipoCuentaTar`,
`tipoTransaccion`)
VALUES
(idFactura,
numTar,
bancoPago,
tipoCuenta,
tipoTransaccionPago);
end/

-- Procedimiento Crear Pedido
delimiter/
create procedure tiendaenlinea.insertarPedido(idFactura int(11), totalPe float, subtotalPe float, impuestosPe float)
begin
INSERT INTO `tiendaenlinea`.`pedido`
(`Factura_idFactura`,
`total`,
`subtotal`,
`impuestos`)
VALUES
(idFactura,
totalPe,
subtotalPe,
impuestosPe);
end/

-- Procedimiento Crear Item
delimiter/
create procedure tiendaenlinea.insertarItem(idProducto varchar(100),idFactura int(11), cantidadItem int(11),
costoUnitarioPro float, costoTotalItem float)
begin
INSERT INTO `tiendaenlinea`.`item`
(`Producto_idProducto`,
`Pedido_Factura_idFactura`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idProducto,
idFactura,
cantidadItem,
costoUnitarioPro,
costoTotalItem);
end/