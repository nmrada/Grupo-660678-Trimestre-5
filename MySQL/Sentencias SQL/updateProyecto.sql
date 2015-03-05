-- Actualizacion de Datos
UPDATE `tiendaenlinea`.`producto` SET `idProducto`='A0001' WHERE `idProducto`='589';

UPDATE `tiendaenlinea`.`cuenta` SET `tipoDocumento`='JH', `numeroDocumento`='11115555' WHERE `tipoDocumento`='CC' and`numeroDocumento`='11115555';

UPDATE `tiendaenlinea`.`proveedor` SET `idProveedor`='11119999', `tipoDeIdentificacion`='CC' WHERE `idProveedor`='6789' and`tipoDeIdentificacion`='NIT';

UPDATE `tiendaenlinea`.`departamento` SET `idDepartamento`='96' WHERE `idDepartamento`='99';

UPDATE `tiendaenlinea`.`municipio` SET `idMunicipio`='100' WHERE `idMunicipio`='5000';

update tiendaenlinea.producto pro set pro.nombre ='piano' where pro.idProducto = 'A0001';

update tiendaenlinea.producto pro set pro.nombre = 'teclado' where pro.idProducto = 'A0002';

update tiendaenlinea.producto pro set pro.nombre = 'flauta' where pro.idProducto = 'A0003';

update tiendaenlinea.cuenta cu set cu.primerNombre = 'Diana', cu.segundoNombre = 'Carolina', cu.primerApellido = 'Ramirez', cu.segundoApellido = 'Perez' where cu.tipoDocumento = 'CC' and cu.numeroDocumento = '1008273458';

update tiendaenlinea.cuenta cu set cu.primerNombre = 'Carlos', cu.segundoNombre = 'Andres', cu.primerApellido = 'Cuevas', cu.segundoApellido = 'Perez' where cu.tipoDocumento = 'JH' and cu.numeroDocumento = '11115555';

update tiendaenlinea.cuenta cu set cu.primerNombre = 'Hernan', cu.segundoNombre = 'Antonio', cu.primerApellido = 'Diaz', cu.segundoApellido = 'Perez' where cu.tipoDocumento = 'CC' and cu.numeroDocumento = '10254987562';