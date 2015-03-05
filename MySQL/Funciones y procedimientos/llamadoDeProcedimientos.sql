-- Llamado insertar Carrito de Compras
CALL `tiendaenlinea`.`insertarCarritoDeCompras`(100000, 
116000, 
16000);

-- Llamado insaertar Catalogo

CALL `tiendaenlinea`.`insertarCatalogo`("Catalogo América", 
"Catalogo para todo el continente Americano");

-- Llamado insertar Categoria

CALL `tiendaenlinea`.`insertarCategoria`(9, 
"Bajos", 
true,
2);

-- Llamado insertar Usuario
CALL `tiendaenlinea`.`insertarUsuario`("El Tripas", 
"124578",
"Cliente", 
"Activo");

-- Llamado insertar Cuenta
CALL `tiendaenlinea`.`insertarCuenta`("CC", 
"101122233", 
"Antonio", 
"Jose",
 "Caballero",
 "Gonzalez",
 "124578", 
 "Antonio@gmail.com", 
"El Tripas");

-- Llamado insertar Departamento
CALL `tiendaenlinea`.`insertarDepartamento`("95",
"Guatape");


-- Llamado insertar Producto
CALL `tiendaenlinea`.`insertarProducto`('0001', 
'Flauta', 
'Yamaha', 
'60000', 
'Flauta Yamaha 6000',
'Acrilico', 
'Negro',
5, 
true,
50000, 
0, 
8, 
1,
load_file("C:/Imagenes/Acustica/acustic2.jpg"));

-- Llamado insertar Domicilio Cuenta

CALL `tiendaenlinea`.`insertarDomicilioCuenta`("CC", 
"101122233", 
"5678945", 
"Cr 23L # 58-47 Sur", 
"Quirigua",
"Fontibon",
"524");

-- Llamado insertar Proveedor

CALL `tiendaenlinea`.`insertarProveedor`("56897412350",
"CC", 
"Pedro Infante",
"3125648792",
"pedrito@yahoo.com");

-- Llamado insertar Domicilio Proveedor
CALL `tiendaenlinea`.`insertarDomicilioProveedor`("56897412350",
"CC",
"58742169", 
"Cr 1 b Este # 6-05 Sur", 
"Los Laches", 
"San Cristobal", 
"524");

-- Llamado insertar Item Carrito
CALL `tiendaenlinea`.`insertarItemCarrito`("0001",
 5,
 1,
 60000, 
 60000);
 
 -- Llamado insertar Municipio
 CALL `tiendaenlinea`.`insertarMunicipio`("1200",
 "Valparaiso", 
 "95");
 
 -- Llamado insertar Inventario
 CALL `tiendaenlinea`.`insertarInventario`("2015-02-26", 
 5, 
 "0001", 
 "56897412350",
 "CC");
 
 -- Llamado insertar Factura 
 CALL `tiendaenlinea`.`insertarFactura`("2015-02-26",
 0, 
 "CC", 
 "101122233");
 
 -- Llamado insertar Pago
 CALL `tiendaenlinea`.`insertarPago`(11, 
 "5558966558", 
 "Banco Popular", 
 "Corriente",
 "ATH");
 
 -- Llamado insertar Pedido
 CALL `tiendaenlinea`.`insertarPedido`(11,
 0,
 0,
 0);

-- Llamado insertar Item
CALL `tiendaenlinea`.`insertarItem`("0001", 
11, 
1, 
60000,
60000);