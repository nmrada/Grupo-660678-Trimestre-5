CREATE DATABASE  IF NOT EXISTS `tiendaenlinea` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tiendaenlinea`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: tiendaenlinea
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carritodecompras`
--

DROP TABLE IF EXISTS `carritodecompras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carritodecompras` (
  `idCarritoDeCompras` varchar(255) NOT NULL COMMENT 'Llave primaria de carrito de compras ',
  `subtotal` float NOT NULL COMMENT 'Subtotasl del carrito',
  `precioTotal` float NOT NULL COMMENT 'Precio total del carrito',
  `impuestos` float NOT NULL COMMENT 'Impuestos carritos',
  PRIMARY KEY (`idCarritoDeCompras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carritodecompras`
--

LOCK TABLES `carritodecompras` WRITE;
/*!40000 ALTER TABLE `carritodecompras` DISABLE KEYS */;
/*!40000 ALTER TABLE `carritodecompras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo`
--

DROP TABLE IF EXISTS `catalogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo` (
  `idCatalogo` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave priamria catalogo',
  `nombreCatalogo` varchar(45) NOT NULL COMMENT 'Nombre Catalogo',
  `descripcion` varchar(500) NOT NULL COMMENT 'Desscripción Catalogo',
  PRIMARY KEY (`idCatalogo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo`
--

LOCK TABLES `catalogo` WRITE;
/*!40000 ALTER TABLE `catalogo` DISABLE KEYS */;
/*!40000 ALTER TABLE `catalogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL COMMENT 'Llave primaria de categoria',
  `nombreCategoria` varchar(100) NOT NULL COMMENT 'Nombre de la categoria',
  `activa` tinyint(1) NOT NULL,
  `pariente` int(11) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuenta` (
  `tipoDocumento` varchar(10) NOT NULL COMMENT 'Llave priamria tipo documento cuenta',
  `numeroDocumento` varchar(45) NOT NULL COMMENT 'Llave priamria número documento cuenta',
  `primerNombre` varchar(100) NOT NULL COMMENT 'Primer nombre de la persona',
  `segundoNombre` varchar(45) DEFAULT NULL COMMENT 'Segundo nombre de la persona',
  `primerApellido` varchar(100) NOT NULL COMMENT 'Primer apellido de la persona',
  `segundoApellido` varchar(45) DEFAULT NULL COMMENT 'Segundo apellido de la persona',
  `contrasena` varchar(45) NOT NULL COMMENT 'Contraseña de la cuenta',
  `email` varchar(45) NOT NULL COMMENT 'Correo electrónico de la cuenta',
  `Usuario_idUsuario` varchar(20) NOT NULL COMMENT 'Llave foránea ID usuario',
  PRIMARY KEY (`tipoDocumento`,`numeroDocumento`),
  KEY `fk_Cuenta_Usuario1` (`Usuario_idUsuario`),
  CONSTRAINT `fk_Cuenta_Usuario1` FOREIGN KEY (`Usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamento` (
  `idDepartamento` varchar(2) NOT NULL COMMENT 'Llave primaria del departamento',
  `nombre` varchar(45) NOT NULL COMMENT 'Nombre del departamento',
  PRIMARY KEY (`idDepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES ('1','AMAZONAS'),('10','CAUCA'),('11','CESAR'),('12','CHOCÓ'),('13','CÓRDOBA'),('14','CUNDINAMARCA'),('15','GUAINÍA'),('16','GUAVIARE'),('17','HUILA'),('18','LA GUAJIRA'),('19','MAGDALENA'),('2','ANTIOQUIA'),('20','META'),('21','NARIÑO'),('22','NORTE DE SANTANDER'),('23','PUTUMAYO'),('24','QUINDÍO'),('25','RISARALDA'),('26','SAN ANDRÉS Y ROVIDENCIA'),('27','SANTANDER'),('28','SUCRE'),('29','TOLIMA'),('3','ARAUCA'),('30','VALLE DEL CAUCA'),('31','VAUPÉS'),('32','VICHADA'),('4','ATLÁNTICO'),('5','BOLÍVAR'),('6','BOYACÁ'),('7','CALDAS'),('8','CAQUETÁ'),('9','CASANARE');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domicilio_cuenta`
--

DROP TABLE IF EXISTS `domicilio_cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `domicilio_cuenta` (
  `Cuenta_tipoDocumento` varchar(10) NOT NULL COMMENT 'Llave primaria Cuenta tipo Documento',
  `Cuenta_numeroDocumento` varchar(45) NOT NULL COMMENT 'Llave primaria Cuenta Número docuemnto',
  `telefono` varchar(45) NOT NULL COMMENT 'Teléfono del domicilio',
  `direccion` varchar(200) NOT NULL COMMENT 'Dirección del domicilio',
  `barrio` varchar(100) NOT NULL COMMENT 'Barrio del Domicilio',
  `localidad` varchar(100) DEFAULT NULL COMMENT 'Localidad del domicilio',
  `Municipio_idMunicipio` varchar(4) NOT NULL,
  PRIMARY KEY (`Cuenta_tipoDocumento`,`Cuenta_numeroDocumento`),
  KEY `fk_Domicilio_Municipio1` (`Municipio_idMunicipio`),
  CONSTRAINT `fk_Domicilio_Cuenta1` FOREIGN KEY (`Cuenta_tipoDocumento`, `Cuenta_numeroDocumento`) REFERENCES `cuenta` (`tipoDocumento`, `numeroDocumento`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_Domicilio_Municipio1` FOREIGN KEY (`Municipio_idMunicipio`) REFERENCES `municipio` (`idMunicipio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilio_cuenta`
--

LOCK TABLES `domicilio_cuenta` WRITE;
/*!40000 ALTER TABLE `domicilio_cuenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilio_cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domicilio_proveedor`
--

DROP TABLE IF EXISTS `domicilio_proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `domicilio_proveedor` (
  `Proveedor_idProveedor` varchar(45) NOT NULL,
  `Proveedor_tipoDeIdentificacion` varchar(20) NOT NULL,
  `telefono` varchar(45) NOT NULL COMMENT 'Teléfono del domicilio',
  `direccion` varchar(200) NOT NULL COMMENT 'Dirección del domicilio',
  `barrio` varchar(100) NOT NULL COMMENT 'Barrio del Domicilio',
  `localidad` varchar(100) DEFAULT NULL COMMENT 'Localidad del domicilio',
  `Municipio_idMunicipio` varchar(4) NOT NULL,
  PRIMARY KEY (`Proveedor_idProveedor`,`Proveedor_tipoDeIdentificacion`),
  KEY `fk_Domicilio_Municipio10` (`Municipio_idMunicipio`),
  CONSTRAINT `fk_Domicilio_Municipio10` FOREIGN KEY (`Municipio_idMunicipio`) REFERENCES `municipio` (`idMunicipio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Domicilio_Proveedor_Proveedor1` FOREIGN KEY (`Proveedor_idProveedor`, `Proveedor_tipoDeIdentificacion`) REFERENCES `proveedor` (`idProveedor`, `tipoDeIdentificacion`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domicilio_proveedor`
--

LOCK TABLES `domicilio_proveedor` WRITE;
/*!40000 ALTER TABLE `domicilio_proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `domicilio_proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la factura',
  `fecha` datetime NOT NULL COMMENT 'Fecha y Hora de la factura',
  `total` float NOT NULL COMMENT 'Total de la factura',
  `Cuenta_tipoDocumento` varchar(10) NOT NULL COMMENT 'Llave foránea tipo Documento de cuenta',
  `Cuenta_numeroDocumento` varchar(45) NOT NULL COMMENT 'Llave foránea número de docuemnto de cuenta',
  PRIMARY KEY (`idFactura`),
  KEY `fk_Factura_Cuenta1` (`Cuenta_tipoDocumento`,`Cuenta_numeroDocumento`),
  CONSTRAINT `fk_Factura_Cuenta1` FOREIGN KEY (`Cuenta_tipoDocumento`, `Cuenta_numeroDocumento`) REFERENCES `cuenta` (`tipoDocumento`, `numeroDocumento`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventario` (
  `idInventario` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria inventario',
  `fecha` date NOT NULL COMMENT 'Fecha de la compra',
  `cantidad` int(11) NOT NULL COMMENT 'Cantidad comprada',
  `Producto_idProducto` varchar(100) NOT NULL COMMENT 'Llave foranea ID Producto',
  `Proveedor_idProveedor` varchar(45) NOT NULL COMMENT 'Llave foranea Id Proveedor',
  `Proveedor_tipoDeIdentificacion` varchar(20) NOT NULL COMMENT 'Llave foraena Proveedor tipo de Identificacion',
  PRIMARY KEY (`idInventario`,`Producto_idProducto`,`Proveedor_idProveedor`,`Proveedor_tipoDeIdentificacion`),
  KEY `fk_Inventario_Producto1` (`Producto_idProducto`),
  KEY `fk_Inventario_Proveedor1` (`Proveedor_idProveedor`,`Proveedor_tipoDeIdentificacion`),
  CONSTRAINT `fk_Inventario_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_Inventario_Proveedor1` FOREIGN KEY (`Proveedor_idProveedor`, `Proveedor_tipoDeIdentificacion`) REFERENCES `proveedor` (`idProveedor`, `tipoDeIdentificacion`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `Producto_idProducto` varchar(100) NOT NULL COMMENT 'Llave foránea ID producto\n',
  `Pedido_Factura_idFactura` int(11) NOT NULL COMMENT 'Llave foránea Pedido',
  `cantidad` int(11) NOT NULL COMMENT 'Cantidad del producto',
  `costoUnitario` float NOT NULL COMMENT 'Costo Unitario del producto',
  `costoTotal` float NOT NULL COMMENT 'Costo Total del Item',
  PRIMARY KEY (`Producto_idProducto`,`Pedido_Factura_idFactura`),
  KEY `fk_Item_Pedido1` (`Pedido_Factura_idFactura`),
  CONSTRAINT `fk_Item_Pedido1` FOREIGN KEY (`Pedido_Factura_idFactura`) REFERENCES `pedido` (`Factura_idFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Item_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_carrito`
--

DROP TABLE IF EXISTS `item_carrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_carrito` (
  `Producto_idProducto` varchar(100) NOT NULL COMMENT 'Llave foránea ID producto',
  `CarritoDeCompras_idCarritoDeCompras` varchar(255) NOT NULL,
  `cantidad` int(11) NOT NULL COMMENT 'Cantidad del producto',
  `costoUnitario` float NOT NULL COMMENT 'Costo Unitario del producto',
  `costoTotal` float NOT NULL COMMENT 'Costo Total del Item',
  PRIMARY KEY (`Producto_idProducto`,`CarritoDeCompras_idCarritoDeCompras`),
  KEY `fk_Item_Carrito_CarritoDeCompras1` (`CarritoDeCompras_idCarritoDeCompras`),
  CONSTRAINT `fk_Item_Carrito_CarritoDeCompras1` FOREIGN KEY (`CarritoDeCompras_idCarritoDeCompras`) REFERENCES `carritodecompras` (`idCarritoDeCompras`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Producto_has_CarritoDeCompras_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_carrito`
--

LOCK TABLES `item_carrito` WRITE;
/*!40000 ALTER TABLE `item_carrito` DISABLE KEYS */;
/*!40000 ALTER TABLE `item_carrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipio`
--

DROP TABLE IF EXISTS `municipio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `municipio` (
  `idMunicipio` varchar(4) NOT NULL COMMENT 'Llave primaria municipio',
  `nombre` varchar(45) NOT NULL COMMENT 'Nombre del municipio',
  `Departamento_idDepartamento` varchar(2) NOT NULL,
  PRIMARY KEY (`idMunicipio`),
  KEY `fk_Municipio_Departamento1` (`Departamento_idDepartamento`),
  CONSTRAINT `fk_Municipio_Departamento1` FOREIGN KEY (`Departamento_idDepartamento`) REFERENCES `departamento` (`idDepartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipio`
--

LOCK TABLES `municipio` WRITE;
/*!40000 ALTER TABLE `municipio` DISABLE KEYS */;
INSERT INTO `municipio` VALUES ('1','EL ENCANTO','1'),('10','PUERTO SANTANDER','1'),('100','SAN ANDRES DE CUERQUIA','2'),('1000','LOS PALMITOS','28'),('1001','MAJAGUAL','28'),('1002','MORROA','28'),('1003','OVEJAS','28'),('1004','PALMITO','28'),('1005','SAMPUES','28'),('1006','SAN BENITO ABAD','28'),('1007','SAN JUAN DE BETULIA','28'),('1008','SAN MARCOS','28'),('1009','SAN ONOFRE','28'),('101','SAN CARLOS','2'),('1010','SAN PEDRO','28'),('1011','SINCÉ','28'),('1012','SINCELEJO','28'),('1013','SUCRE','28'),('1014','TOLÚ','28'),('1015','TOLUVIEJO','28'),('1016','ALPUJARRA','29'),('1017','ALVARADO','29'),('1018','AMBALEMA','29'),('1019','ANZOATEGUI','29'),('102','SAN FRANCISCO','2'),('1020','ARMERO (GUAYABAL)','29'),('1021','ATACO','29'),('1022','CAJAMARCA','29'),('1023','CARMEN DE APICALÁ','29'),('1024','CASABIANCA','29'),('1025','CHAPARRAL','29'),('1026','COELLO','29'),('1027','COYAIMA','29'),('1028','CUNDAY','29'),('1029','DOLORES','29'),('103','SAN JERONIMO','2'),('1030','ESPINAL','29'),('1031','FALÁN','29'),('1032','FLANDES','29'),('1033','FRESNO','29'),('1034','GUAMO','29'),('1035','HERVEO','29'),('1036','HONDA','29'),('1037','IBAGUÉ','29'),('1038','ICONONZO','29'),('1039','LÉRIDA','29'),('104','SAN JOSE DE LA MONTAÑA','2'),('1040','LÍBANO','29'),('1041','MARIQUITA','29'),('1042','MELGAR','29'),('1043','MURILLO','29'),('1044','NATAGAIMA','29'),('1045','ORTEGA','29'),('1046','PALOCABILDO','29'),('1047','PIEDRAS PLANADAS','29'),('1048','PRADO','29'),('1049','PURIFICACIÓN','29'),('105','SAN JUAN DE URABA','2'),('1050','RIOBLANCO','29'),('1051','RONCESVALLES','29'),('1052','ROVIRA','29'),('1053','SALDAÑA','29'),('1054','SAN ANTONIO','29'),('1055','SAN LUIS','29'),('1056','SANTA ISABEL','29'),('1057','SUÁREZ','29'),('1058','VALLE DE SAN JUAN','29'),('1059','VENADILLO','29'),('106','SAN LUIS','2'),('1060','VILLAHERMOSA','29'),('1061','VILLARRICA','29'),('1062','ALCALÁ','30'),('1063','ANDALUCÍA','30'),('1064','ANSERMA NUEVO','30'),('1065','ARGELIA','30'),('1066','BOLÍVAR','30'),('1067','BUENAVENTURA','30'),('1068','BUGA','30'),('1069','BUGALAGRANDE','30'),('107','SAN PEDRO DE LOS MILAGROS','2'),('1070','CAICEDONIA','30'),('1071','CALI','30'),('1072','CALIMA (DARIEN)','30'),('1073','CANDELARIA','30'),('1074','CARTAGO','30'),('1075','DAGUA','30'),('1076','EL AGUILA','30'),('1077','EL CAIRO','30'),('1078','EL CERRITO','30'),('1079','EL DOVIO','30'),('108','SAN PEDRO DE URABA','2'),('1080','FLORIDA','30'),('1081','GINEBRA GUACARI','30'),('1082','JAMUNDÍ','30'),('1083','LA CUMBRE','30'),('1084','LA UNIÓN','30'),('1085','LA VICTORIA','30'),('1086','OBANDO','30'),('1087','PALMIRA','30'),('1088','PRADERA','30'),('1089','RESTREPO','30'),('109','SAN RAFAEL','2'),('1090','RIO FRÍO','30'),('1091','ROLDANILLO','30'),('1092','SAN PEDRO','30'),('1093','SEVILLA','30'),('1094','TORO','30'),('1095','TRUJILLO','30'),('1096','TULÚA','30'),('1097','ULLOA','30'),('1098','VERSALLES','30'),('1099','VIJES','30'),('11','TURAPACA','1'),('110','SAN ROQUE','2'),('1100','YOTOCO','30'),('1101','YUMBO','30'),('1102','ZARZAL','30'),('1103','CARURÚ','31'),('1104','MITÚ','31'),('1105','PACOA','31'),('1106','PAPUNAUA','31'),('1107','TARAIRA','31'),('1108','YAVARATÉ','31'),('1109','CUMARIBO','32'),('111','SAN VICENTE','2'),('1110','LA PRIMAVERA','32'),('1111','PUERTO CARREÑO','32'),('1112','SANTA ROSALIA','32'),('112','SANTA BARBARA','2'),('113','SANTA ROSA DE OSOS','2'),('114','SANTO DOMINGO','2'),('115','SANTUARIO','2'),('116','SEGOVIA','2'),('117','SONSON','2'),('118','SOPETRAN','2'),('119','TAMESIS','2'),('12','ABEJORRAL','2'),('120','TARAZA','2'),('121','TARSO','2'),('122','TITIRIBI','2'),('123','TOLEDO','2'),('124','TURBO','2'),('125','URAMITA','2'),('126','URRAO','2'),('127','VALDIVIA','2'),('128','VALPARAISO','2'),('129','VEGACHI','2'),('13','ABRIAQUI','2'),('130','VENECIA','2'),('131','VIGIA DEL FUERTE','2'),('132','YALI','2'),('133','YARUMAL','2'),('134','YOLOMBO','2'),('135','YONDO','2'),('136','ZARAGOZA','2'),('137','ARAUCA','3'),('138','ARAUQUITA','3'),('139','CRAVO NORTE','3'),('14','ALEJANDRIA','2'),('140','FORTUL','3'),('141','PUERTO RONDON','3'),('142','SARAVENA','3'),('143','TAME','3'),('144','BARANOA','4'),('145','BARRANQUILLA','4'),('146','CAMPO DE LA CRUZ','4'),('147','CANDELARIA','4'),('148','GALAPA','4'),('149','JUAN DE ACOSTA','4'),('15','AMAGA','2'),('150','LURUACO','4'),('151','MALAMBO','4'),('152','MANATI','4'),('153','PALMAR DE VARELA','4'),('154','PIOJO','4'),('155','POLO NUEVO','4'),('156','PONEDERA','4'),('157','PUERTO COLOMBIA','4'),('158','REPELON','4'),('159','SABANAGRANDE','4'),('16','AMALFI','2'),('160','SABANALARGA','4'),('161','SANTA LUCIA','4'),('162','SANTO TOMAS','4'),('163','SOLEDAD','4'),('164','SUAN','4'),('165','TUBARA','4'),('166','USIACURI','4'),('167','ACHI','5'),('168','ALTOS DEL ROSARIO','5'),('169','ARENAL','5'),('17','ANDES','2'),('170','ARJONA','5'),('171','ARROYOHONDO','5'),('172','BARRANCO DE LOBA','5'),('173','BRAZUELO DE PAPAYAL','5'),('174','CALAMAR','5'),('175','CANTAGALLO','5'),('176','CARTAGENA DE INDIAS','5'),('177','CICUCO','5'),('178','CLEMENCIA','5'),('179','CORDOBA','5'),('18','ANGELOPOLIS','2'),('180','EL CARMEN DE BOLIVAR','5'),('181','EL GUAMO','5'),('182','EL PENION','5'),('183','HATILLO DE LOBA','5'),('184','MAGANGUE','5'),('185','MAHATES','5'),('186','MARGARITA','5'),('187','MARIA LA BAJA','5'),('188','MONTECRISTO','5'),('189','MORALES','5'),('19','ANGOSTURA','2'),('190','MORALES','5'),('191','NOROSI','5'),('192','PINILLOS','5'),('193','REGIDOR','5'),('194','RIO VIEJO','5'),('195','SAN CRISTOBAL','5'),('196','SAN ESTANISLAO','5'),('197','SAN FERNANDO','5'),('198','SAN JACINTO ','5'),('199','SAN JACINTO  DEL CAUCA','5'),('2','LA CHORRERA','1'),('20','ANORI','2'),('200','SAN JUAN DE NEPOMUCENO','5'),('201','SAN MARTIN DE LOBA','5'),('202','SAN PABLO','5'),('203','SAN PABLO NORTE','5'),('204','SANTA CATALINA','5'),('205','SANTA CRUZ DE MOMPOX','5'),('206','SANTA ROSA','5'),('207','SANTA ROSA DEL SUR','5'),('208','SIMITI','5'),('209','SOPLAVIENTO','5'),('21','ANTIOQUIA','2'),('210','TALAIGUA NUEVO','5'),('211','TUQUISIO','5'),('212','TURBACO','5'),('213','TURBANA','5'),('214','VILLANUEVA','5'),('215','ZAMBRANO','5'),('216','AQUITANIA','6'),('217','ARCABUCO','6'),('218','BELÉN','6'),('219','BERBEO','6'),('22','ANZA','2'),('220','BETÉITIVA','6'),('221','BOAVITA','6'),('222','BOYACÁ','6'),('223','BRICEÑO','6'),('224','BUENAVISTA','6'),('225','BUSBANZÁ','6'),('226','CALDAS','6'),('227','CAMPO HERMOSO','6'),('228','CERINZA','6'),('229','CHINAVITA','6'),('23','APARTADO','2'),('230','CHIQUINQUIRÁ','6'),('231','CHÍQUIZA','6'),('232','CHISCAS','6'),('233','CHITA','6'),('234','CHITARAQUE','6'),('235','CHIVATÁ','6'),('236','CIÉNEGA','6'),('237','CÓMBITA','6'),('238','COPER','6'),('239','CORRALES','6'),('24','ARBOLETES','2'),('240','COVARACHÍA','6'),('241','CUBARA','6'),('242','CUCAITA','6'),('243','CUITIVA','6'),('244','DUITAMA','6'),('245','EL COCUY','6'),('246','EL ESPINO','6'),('247','FIRAVITOBA','6'),('248','FLORESTA','6'),('249','GACHANTIVÁ','6'),('25','ARGELIA','2'),('250','GÁMEZA','6'),('251','GARAGOA','6'),('252','GUACAMAYAS','6'),('253','GÜICÁN','6'),('254','IZA','6'),('255','JENESANO','6'),('256','JERICÓ','6'),('257','LA UVITA','6'),('258','LA VICTORIA','6'),('259','LABRANZA GRANDE','6'),('26','ARMENIA','2'),('260','MACANAL','6'),('261','MARIPÍ','6'),('262','MIRAFLORES','6'),('263','MONGUA','6'),('264','MONGUÍ','6'),('265','MONIQUIRÁ','6'),('266','MOTAVITA','6'),('267','MUZO','6'),('268','NOBSA','6'),('269','NUEVO COLÓN','6'),('27','BARBOSA','2'),('270','OICATÁ','6'),('271','OTANCHE','6'),('272','PACHAVITA','6'),('273','PÁEZ','6'),('274','PAIPA','6'),('275','PAJARITO','6'),('276','PANQUEBA','6'),('277','PAUNA','6'),('278','PAYA','6'),('279','PAZ DE RÍO','6'),('28','BELLO','2'),('280','PESCA','6'),('281','PISBA','6'),('282','PUERTO BOYACA','6'),('283','QUÍPAMA','6'),('284','RAMIRIQUÍ','6'),('285','RÁQUIRA','6'),('286','RONDÓN','6'),('287','SABOYÁ','6'),('288','SÁCHICA','6'),('289','SAMACÁ','6'),('29','BELMIRA','2'),('290','SAN EDUARDO','6'),('291','SAN JOSÉ DE PARE','6'),('292','SAN LUÍS DE GACENO','6'),('293','SAN MATEO','6'),('294','SAN MIGUEL DE SEMA','6'),('295','SAN PABLO DE BORBUR','6'),('296','SANTA MARÍA','6'),('297','SANTA ROSA DE VITERBO','6'),('298','SANTA SOFÍA','6'),('299','SANTANA','6'),('3','LA PEDRERA','1'),('30','BETANIA','2'),('300','SATIVANORTE','6'),('301','SATIVASUR','6'),('302','SIACHOQUE','6'),('303','SOATÁ','6'),('304','SOCHA','6'),('305','SOCOTÁ','6'),('306','SOGAMOSO','6'),('307','SORA','6'),('308','SORACÁ','6'),('309','SOTAQUIRÁ','6'),('31','BETULIA','2'),('310','SUSACÓN','6'),('311','SUTARMACHÁN','6'),('312','TASCO','6'),('313','TIBANÁ','6'),('314','TIBASOSA','6'),('315','TINJACÁ','6'),('316','TIPACOQUE','6'),('317','TOCA','6'),('318','TOGÜÍ','6'),('319','TÓPAGA','6'),('32','BOLIVAR','2'),('320','TOTA','6'),('321','TUNJA','6'),('322','TUNUNGUÁ','6'),('323','TURMEQUÉ','6'),('324','TUTA','6'),('325','TUTAZÁ','6'),('326','UMBITA','6'),('327','VENTA QUEMADA','6'),('328','VILLA DE LEYVA','6'),('329','VIRACACHÁ','6'),('33','BRICEÑO','2'),('330','ZETAQUIRA','6'),('331','AGUADAS','7'),('332','ANSERMA','7'),('333','ARANZAZU','7'),('334','BELALCAZAR','7'),('335','CHINCHINÁ','7'),('336','FILADELFIA','7'),('337','LA DORADA','7'),('338','LA MERCED','7'),('339','MANIZALES','7'),('34','BURITICA','2'),('340','MANZANARES','7'),('341','MARMATO','7'),('342','MARQUETALIA','7'),('343','MARULANDA','7'),('344','NEIRA','7'),('345','NORCASIA','7'),('346','PACORA','7'),('347','PALESTINA','7'),('348','PENSILVANIA','7'),('349','RIOSUCIO','7'),('35','CACERES','2'),('350','RISARALDA','7'),('351','SALAMINA','7'),('352','SAMANA','7'),('353','SAN JOSE','7'),('354','SUPÍA','7'),('355','VICTORIA','7'),('356','VILLAMARÍA','7'),('357','VITERBO','7'),('358','ALBANIA','8'),('359','BELÉN ANDAQUIES','8'),('36','CAICEDO','2'),('360','CARTAGENA DEL CHAIRA','8'),('361','CURILLO','8'),('362','EL DONCELLO','8'),('363','EL PAUJIL','8'),('364','FLORENCIA','8'),('365','LA MONTAÑITA','8'),('366','MILÁN','8'),('367','MORELIA','8'),('368','PUERTO RICO','8'),('369','SAN  VICENTE DEL CAGUAN','8'),('37','CALDAS','2'),('370','SAN JOSÉ DE FRAGUA','8'),('371','SOLANO','8'),('372','SOLITA','8'),('373','VALPARAÍSO','8'),('374','AGUAZUL','9'),('375','CHAMEZA','9'),('376','HATO COROZAL','9'),('377','LA SALINA','9'),('378','MANÍ','9'),('379','MONTERREY','9'),('38','CAMPAMENTO','2'),('380','NUNCHIA','9'),('381','OROCUE','9'),('382','PAZ DE ARIPORO','9'),('383','PORE','9'),('384','RECETOR','9'),('385','SABANA LARGA','9'),('386','SACAMA','9'),('387','SAN LUIS DE PALENQUE','9'),('388','TAMARA','9'),('389','TAURAMENA','9'),('39','CANASGORDAS','2'),('390','TRINIDAD','9'),('391','VILLANUEVA','9'),('392','YOPAL','9'),('393','ALMAGUER','10'),('394','ARGELIA','10'),('395','BALBOA','10'),('396','BOLÍVAR','10'),('397','BUENOS AIRES','10'),('398','CAJIBIO','10'),('399','CALDONO','10'),('4','LA VICTORIA','1'),('40','CARACOLI','2'),('400','CALOTO','10'),('401','CORINTO ','10'),('402','EL TAMBO','10'),('403','FLORENCIA','10'),('404','GUAPI','10'),('405','INZA','10'),('406','JAMBALÓ','10'),('407','LA SIERRA','10'),('408','LA VEGA','10'),('409','LÓPEZ','10'),('41','CARAMANTA','2'),('410','MERCADERES','10'),('411','MIRANDA','10'),('412','MORALES','10'),('413','PADILLA','10'),('414','PÁEZ','10'),('415','PATIA (EL BORDO)','10'),('416','PIAMONTE','10'),('417','PIENDAMO','10'),('418','POPAYÁN','10'),('419','PUERTO TEJADA','10'),('42','CAREPA','2'),('420','PURACE','10'),('421','ROSAS','10'),('422','SAN SEBASTIÁN','10'),('423','SANTA ROSA','10'),('424','SANTANDER DE QUILICHAO','10'),('425','SILVIA','10'),('426','SOTARA','10'),('427','SUÁREZ','10'),('428','SUCRE','10'),('429','TIMBÍO','10'),('43','CARMEN DE VIBORAL','2'),('430','TIMBIQUÍ','10'),('431','TORIBIO','10'),('432','TOTORO','10'),('433','VILLA RICA','10'),('434','AGUACHICA','11'),('435','AGUSTÍN CODAZZI','11'),('436','ASTREA','11'),('437','BECERRIL','11'),('438','BOSCONIA','11'),('439','CHIMICHAGUA','11'),('44','CAROLINA DEL PRINCIPE','2'),('440','CHIRIGUANÁ','11'),('441','CURUMANÍ','11'),('442','EL COPEY','11'),('443','EL PASO','11'),('444','GAMARRA','11'),('445','GONZÁLEZ','11'),('446','LA GLORIA','11'),('447','LA JAGUA IBIRICO','11'),('448','MANAURE BALCÓN DEL CESAR','11'),('449','PAILITAS','11'),('45','CAUCASIA','2'),('450','PELAYA','11'),('451','PUEBLO BELLO','11'),('452','RÍO DE ORO','11'),('453','ROBLES (LA PAZ)','11'),('454','SAN ALBERTO','11'),('455','SAN DIEGO','11'),('456','SAN MARTÍN','11'),('457','TAMALAMEQUE','11'),('458','VALLEDUPAR','11'),('459','ACANDI','12'),('46','CHIGORODO','2'),('460','ALTO BAUDO (PIE DE PATO)','12'),('461','ATRATO','12'),('462','BAGADO','12'),('463','BAHIA SOLANO (MUTIS)','12'),('464','BAJO BAUDO (PIZARRO)','12'),('465','BOJAYA (BELLAVISTA)','12'),('466','CANTON DE SAN PABLO','12'),('467','CARMEN DEL DARIEN','12'),('468','CERTEGUI','12'),('469','CONDOTO','12'),('47','CISNEROS','2'),('470','EL CARMEN','12'),('471','ISTMINA','12'),('472','JURADO','12'),('473','LITORAL DEL SAN JUAN','12'),('474','LLORO','12'),('475','MEDIO ATRATO','12'),('476','MEDIO BAUDO (BOCA DE PEPE)','12'),('477','MEDIO SAN JUAN','12'),('478','NOVITA','12'),('479','NUQUI','12'),('48','COCORNA','2'),('480','QUIBDO','12'),('481','RIO IRO','12'),('482','RIO QUITO','12'),('483','RIOSUCIO','12'),('484','SAN JOSE DEL PALMAR','12'),('485','SIPI','12'),('486','TADO','12'),('487','UNGUIA','12'),('488','UNIÓN PANAMERICANA','12'),('489','AYAPEL','13'),('49','CONCEPCION','2'),('490','BUENAVISTA','13'),('491','CANALETE','13'),('492','CERETÉ','13'),('493','CHIMA','13'),('494','CHINÚ','13'),('495','CIENAGA DE ORO','13'),('496','COTORRA','13'),('497','LA APARTADA','13'),('498','LORICA','13'),('499','LOS CÓRDOBAS','13'),('5','LETICIA','1'),('50','CONCORDIA','2'),('500','MOMIL','13'),('501','MONTELÍBANO','13'),('502','MONTERÍA','13'),('503','MOÑITOS','13'),('504','PLANETA RICA','13'),('505','PUEBLO NUEVO','13'),('506','PUERTO ESCONDIDO','13'),('507','PUERTO LIBERTADOR','13'),('508','PURÍSIMA','13'),('509','SAHAGÚN','13'),('51','COPACABANA','2'),('510','SAN ANDRÉS SOTAVENTO','13'),('511','SAN ANTERO','13'),('512','SAN BERNARDO VIENTO','13'),('513','SAN CARLOS','13'),('514','SAN PELAYO','13'),('515','TIERRALTA','13'),('516','VALENCIA','13'),('517','AGUA DE DIOS','14'),('518','ALBAN','14'),('519','ANAPOIMA','14'),('52','DABEIBA','2'),('520','ANOLAIMA','14'),('521','ARBELAEZ','14'),('522','BELTRÁN','14'),('523','BITUIMA','14'),('524','BOGOTÁ DC','14'),('525','BOJACÁ','14'),('526','CABRERA','14'),('527','CACHIPAY','14'),('528','CAJICÁ','14'),('529','CAPARRAPÍ','14'),('53','DONMATIAS','2'),('530','CAQUEZA','14'),('531','CARMEN DE CARUPA','14'),('532','CHAGUANÍ','14'),('533','CHIA','14'),('534','CHIPAQUE','14'),('535','CHOACHÍ','14'),('536','CHOCONTÁ','14'),('537','COGUA','14'),('538','COTA','14'),('539','CUCUNUBÁ','14'),('54','EBEJICO','2'),('540','EL COLEGIO','14'),('541','EL PEÑÓN','14'),('542','EL ROSAL1','14'),('543','FACATATIVA','14'),('544','FÓMEQUE','14'),('545','FOSCA','14'),('546','FUNZA','14'),('547','FÚQUENE','14'),('548','FUSAGASUGA','14'),('549','GACHALÁ','14'),('55','EL BAGRE','2'),('550','GACHANCIPÁ','14'),('551','GACHETA','14'),('552','GAMA','14'),('553','GIRARDOT','14'),('554','GRANADA2','14'),('555','GUACHETÁ','14'),('556','GUADUAS','14'),('557','GUASCA','14'),('558','GUATAQUÍ','14'),('559','GUATAVITA','14'),('56','EL PENOL','2'),('560','GUAYABAL DE SIQUIMA','14'),('561','GUAYABETAL','14'),('562','GUTIÉRREZ','14'),('563','JERUSALÉN','14'),('564','JUNÍN','14'),('565','LA CALERA','14'),('566','LA MESA','14'),('567','LA PALMA','14'),('568','LA PEÑA','14'),('569','LA VEGA','14'),('57','EL RETIRO','2'),('570','LENGUAZAQUE','14'),('571','MACHETÁ','14'),('572','MADRID','14'),('573','MANTA','14'),('574','MEDINA','14'),('575','MOSQUERA','14'),('576','NARIÑO','14'),('577','NEMOCÓN','14'),('578','NILO','14'),('579','NIMAIMA','14'),('58','ENTRERRIOS','2'),('580','NOCAIMA','14'),('581','OSPINA PÉREZ','14'),('582','PACHO','14'),('583','PAIME','14'),('584','PANDI','14'),('585','PARATEBUENO','14'),('586','PASCA','14'),('587','PUERTO SALGAR','14'),('588','PULÍ','14'),('589','QUEBRADANEGRA','14'),('59','ENVIGADO','2'),('590','QUETAME','14'),('591','QUIPILE','14'),('592','RAFAEL REYES','14'),('593','RICAURTE','14'),('594','SAN  ANTONIO DEL  TEQUENDAMA','14'),('595','SAN BERNARDO','14'),('596','SAN CAYETANO','14'),('597','SAN FRANCISCO','14'),('598','SAN JUAN DE RIOSECO','14'),('599','SASAIMA','14'),('6','MIRITI','1'),('60','FREDONIA','2'),('600','SESQUILÉ','14'),('601','SIBATÉ','14'),('602','SILVANIA','14'),('603','SIMIJACA','14'),('604','SOACHA','14'),('605','SOPO','14'),('606','SUBACHOQUE','14'),('607','SUESCA','14'),('608','SUPATÁ','14'),('609','SUSA','14'),('61','FRONTINO','2'),('610','SUTATAUSA','14'),('611','TABIO','14'),('612','TAUSA','14'),('613','TENA','14'),('614','TENJO','14'),('615','TIBACUY','14'),('616','TIBIRITA','14'),('617','TOCAIMA','14'),('618','TOCANCIPÁ','14'),('619','TOPAIPÍ','14'),('62','GIRALDO','2'),('620','UBALÁ','14'),('621','UBAQUE','14'),('622','UBATÉ','14'),('623','UNE','14'),('624','UTICA','14'),('625','VERGARA','14'),('626','VIANI','14'),('627','VILLA GOMEZ','14'),('628','VILLA PINZÓN','14'),('629','VILLETA','14'),('63','GIRARDOTA','2'),('630','VIOTA','14'),('631','YACOPÍ','14'),('632','ZIPACÓN','14'),('633','ZIPAQUIRÁ','14'),('634','BARRANCO MINAS','15'),('635','CACAHUAL','15'),('636','INÍRIDA','15'),('637','LA GUADALUPE','15'),('638','MAPIRIPANA','15'),('639','MORICHAL','15'),('64','GOMEZ PLATA','2'),('640','PANA PANA','15'),('641','PUERTO COLOMBIA','15'),('642','SAN FELIPE','15'),('643','CALAMAR','16'),('644','EL RETORNO','16'),('645','MIRAFLOREZ','16'),('646','SAN JOSÉ DEL GUAVIARE','16'),('647','ACEVEDO','17'),('648','AGRADO','17'),('649','AIPE','17'),('65','GRANADA','2'),('650','ALGECIRAS','17'),('651','ALTAMIRA','17'),('652','BARAYA','17'),('653','CAMPO ALEGRE','17'),('654','COLOMBIA','17'),('655','ELIAS','17'),('656','GARZÓN','17'),('657','GIGANTE','17'),('658','GUADALUPE','17'),('659','HOBO','17'),('66','GUADALUPE','2'),('660','IQUIRA','17'),('661','ISNOS','17'),('662','LA ARGENTINA','17'),('663','LA PLATA','17'),('664','NATAGA','17'),('665','NEIVA','17'),('666','OPORAPA','17'),('667','PAICOL','17'),('668','PALERMO','17'),('669','PALESTINA','17'),('67','GUARNE','2'),('670','PITAL','17'),('671','PITALITO','17'),('672','RIVERA','17'),('673','SALADO BLANCO','17'),('674','SAN AGUSTÍN','17'),('675','SANTA MARIA','17'),('676','SUAZA','17'),('677','TARQUI','17'),('678','TELLO','17'),('679','TERUEL','17'),('68','GUATAQUE','2'),('680','TESALIA','17'),('681','TIMANA','17'),('682','VILLAVIEJA','17'),('683','YAGUARA','17'),('684','ALBANIA','18'),('685','BARRANCAS','18'),('686','DIBULLA','18'),('687','DISTRACCIÓN','18'),('688','EL MOLINO','18'),('689','FONSECA','18'),('69','HELICONIA','2'),('690','HATO NUEVO','18'),('691','LA JAGUA DEL PILAR','18'),('692','MAICAO','18'),('693','MANAURE','18'),('694','RIOHACHA','18'),('695','SAN JUAN DEL CESAR','18'),('696','URIBIA','18'),('697','URUMITA','18'),('698','VILLANUEVA','18'),('699','ALGARROBO','19'),('7','PUERTO ALEGRIA','1'),('70','HISPANIA','2'),('700','ARACATACA','19'),('701','ARIGUANI','19'),('702','CERRO SAN ANTONIO','19'),('703','CHIVOLO','19'),('704','CIENAGA','19'),('705','CONCORDIA','19'),('706','EL BANCO','19'),('707','EL PIÑON','19'),('708','EL RETEN','19'),('709','FUNDACION','19'),('71','ITAGUI','2'),('710','GUAMAL','19'),('711','NUEVA GRANADA','19'),('712','PEDRAZA','19'),('713','PIJIÑO DEL CARMEN','19'),('714','PIVIJAY','19'),('715','PLATO','19'),('716','PUEBLO VIEJO','19'),('717','REMOLINO','19'),('718','SABANAS DE SAN ANGEL','19'),('719','SALAMINA','19'),('72','ITUANGO','2'),('720','SAN SEBASTIAN DE BUENAVISTA','19'),('721','SAN ZENON','19'),('722','SANTA ANA','19'),('723','SANTA BARBARA DE PINTO ','19'),('724','SANTA MARTA','19'),('725','SITIONUEVO','19'),('726','TENERIFE','19'),('727','ZAPAYAN','19'),('728','ZONA BANANERA','19'),('729','ACACIAS','20'),('73','JARDIN','2'),('730','BARRANCA DE UPIA','20'),('731','CABUYARO','20'),('732','CASTILLA LA NUEVA','20'),('733','CUBARRAL','20'),('734','CUMARAL','20'),('735','EL CALVARIO','20'),('736','EL CASTILLO','20'),('737','EL DORADO','20'),('738','FUENTE DE ORO','20'),('739','GRANADA','20'),('74','JERICO','2'),('740','GUAMAL','20'),('741','LA MACARENA','20'),('742','LA URIBE','20'),('743','LEJANÍAS','20'),('744','MAPIRIPÁN','20'),('745','MESETAS','20'),('746','PUERTO CONCORDIA','20'),('747','PUERTO GAITÁN','20'),('748','PUERTO LLERAS','20'),('749','PUERTO LÓPEZ','20'),('75','LA CEJA','2'),('750','PUERTO RICO','20'),('751','RESTREPO','20'),('752','SAN  JUAN DE ARAMA','20'),('753','SAN CARLOS GUAROA','20'),('754','SAN JUANITO','20'),('755','SAN MARTÍN','20'),('756','VILLAVICENCIO','20'),('757','VISTA HERMOSA','20'),('758','ALBAN','21'),('759','ALDAÑA','21'),('76','LA ESTRELLA','2'),('760','ANCUYA','21'),('761','ARBOLEDA','21'),('762','BARBACOAS','21'),('763','BELEN','21'),('764','BUESACO','21'),('765','CHACHAGUI','21'),('766','COLON (GENOVA)','21'),('767','CONSACA','21'),('768','CONTADERO','21'),('769','CORDOBA','21'),('77','LA PINTADA','2'),('770','CUASPUD','21'),('771','CUMBAL','21'),('772','CUMBITARA','21'),('773','EL CHARCO','21'),('774','EL PEÑOL','21'),('775','EL ROSARIO','21'),('776','EL TABLÓN','21'),('777','EL TAMBO','21'),('778','FUNES','21'),('779','GUACHUCAL','21'),('78','LA UNION','2'),('780','GUAITARILLA','21'),('781','GUALMATAN','21'),('782','ILES','21'),('783','IMUES','21'),('784','IPIALES','21'),('785','LA CRUZ','21'),('786','LA FLORIDA','21'),('787','LA LLANADA','21'),('788','LA TOLA','21'),('789','LA UNION','21'),('79','LIBORINA','2'),('790','LEIVA','21'),('791','LINARES','21'),('792','LOS ANDES','21'),('793','MAGUI','21'),('794','MALLAMA','21'),('795','MOSQUEZA','21'),('796','NARIÑO','21'),('797','OLAYA HERRERA','21'),('798','OSPINA','21'),('799','PASTO','21'),('8','PUERTO ARICA','1'),('80','MACEO','2'),('800','PIZARRO','21'),('801','POLICARPA','21'),('802','POTOSI','21'),('803','PROVIDENCIA','21'),('804','PUERRES','21'),('805','PUPIALES','21'),('806','RICAURTE','21'),('807','ROBERTO PAYAN','21'),('808','SAMANIEGO','21'),('809','SAN BERNARDO','21'),('81','MARINILLA','2'),('810','SAN LORENZO','21'),('811','SAN PABLO','21'),('812','SAN PEDRO DE CARTAGO','21'),('813','SANDONA','21'),('814','SANTA BARBARA','21'),('815','SANTACRUZ','21'),('816','SAPUYES','21'),('817','TAMINANGO','21'),('818','TANGUA','21'),('819','TUMACO','21'),('82','MEDELLIN','2'),('820','TUQUERRES','21'),('821','YACUANQUER','21'),('822','ABREGO','22'),('823','ARBOLEDAS','22'),('824','BOCHALEMA','22'),('825','BUCARASICA','22'),('826','CÁCHIRA','22'),('827','CÁCOTA','22'),('828','CHINÁCOTA','22'),('829','CHITAGÁ','22'),('83','MONTEBELLO','2'),('830','CONVENCIÓN','22'),('831','CÚCUTA','22'),('832','CUCUTILLA','22'),('833','DURANIA','22'),('834','EL CARMEN','22'),('835','EL TARRA','22'),('836','EL ZULIA','22'),('837','GRAMALOTE','22'),('838','HACARI','22'),('839','HERRÁN','22'),('84','MURINDO','2'),('840','LA ESPERANZA','22'),('841','LA PLAYA','22'),('842','LABATECA','22'),('843','LOS PATIOS','22'),('844','LOURDES','22'),('845','MUTISCUA','22'),('846','OCAÑA','22'),('847','PAMPLONA','22'),('848','PAMPLONITA','22'),('849','PUERTO SANTANDER','22'),('85','MUTATA','2'),('850','RAGONVALIA','22'),('851','SALAZAR','22'),('852','SAN CALIXTO','22'),('853','SAN CAYETANO','22'),('854','SANTIAGO','22'),('855','SARDINATA','22'),('856','SILOS','22'),('857','TEORAMA','22'),('858','TIBÚ','22'),('859','TOLEDO','22'),('86','NARINO','2'),('860','VILLA CARO','22'),('861','VILLA DEL ROSARIO','22'),('862','COLÓN','23'),('863','MOCOA','23'),('864','ORITO','23'),('865','PUERTO ASÍS','23'),('866','PUERTO CAYCEDO','23'),('867','PUERTO GUZMÁN','23'),('868','PUERTO LEGUÍZAMO','23'),('869','SAN FRANCISCO','23'),('87','NECHI','2'),('870','SAN MIGUEL','23'),('871','SANTIAGO','23'),('872','SIBUNDOY','23'),('873','VALLE DEL GUAMUEZ','23'),('874','VILLAGARZÓN','23'),('875','ARMENIA','24'),('876','BUENAVISTA','24'),('877','CALARCÁ','24'),('878','CIRCASIA','24'),('879','CÓRDOBA','24'),('88','NECOCLI','2'),('880','FILANDIA','24'),('881','GÉNOVA','24'),('882','LA TEBAIDA','24'),('883','MONTENEGRO','24'),('884','PIJAO','24'),('885','QUIMBAYA','24'),('886','SALENTO','24'),('887','APIA','25'),('888','BALBOA','25'),('889','BELÉN DE UMBRÍA','25'),('89','OLAYA','2'),('890','DOS QUEBRADAS','25'),('891','GUATICA','25'),('892','LA CELIA','25'),('893','LA VIRGINIA','25'),('894','MARSELLA','25'),('895','MISTRATO','25'),('896','PEREIRA','25'),('897','PUEBLO RICO','25'),('898','QUINCHÍA','25'),('899','SANTA ROSA DE CABAL','25'),('9','PUERTO NARIÑO','1'),('90','PEQUE','2'),('900','SANTUARIO','25'),('901','PROVIDENCIA','26'),('902','SAN ANDRES','26'),('903','SANTA CATALINA','26'),('904','AGUADA','27'),('905','ALBANIA','27'),('906','ARATOCA','27'),('907','BARBOSA','27'),('908','BARICHARA','27'),('909','BARRANCABERMEJA','27'),('91','PUEBLORRICO','2'),('910','BETULIA','27'),('911','BOLÍVAR','27'),('912','BUCARAMANGA','27'),('913','CABRERA','27'),('914','CALIFORNIA','27'),('915','CAPITANEJO','27'),('916','CARCASI','27'),('917','CEPITA','27'),('918','CERRITO','27'),('919','CHARALÁ','27'),('92','PUERTO BERRIO','2'),('920','CHARTA','27'),('921','CHIMA','27'),('922','CHIPATÁ','27'),('923','CIMITARRA','27'),('924','CONCEPCIÓN','27'),('925','CONFINES','27'),('926','CONTRATACIÓN','27'),('927','COROMORO','27'),('928','CURITÍ','27'),('929','EL CARMEN','27'),('93','PUERTO NARE','2'),('930','EL GUACAMAYO','27'),('931','EL PEÑÓN','27'),('932','EL PLAYÓN','27'),('933','ENCINO','27'),('934','ENCISO','27'),('935','FLORIÁN','27'),('936','FLORIDABLANCA','27'),('937','GALÁN','27'),('938','GAMBITA','27'),('939','GIRÓN','27'),('94','PUERTO TRIUNFO','2'),('940','GUACA','27'),('941','GUADALUPE','27'),('942','GUAPOTA','27'),('943','GUAVATÁ','27'),('944','GUEPSA','27'),('945','HATO','27'),('946','JESÚS MARIA','27'),('947','JORDÁN','27'),('948','LA BELLEZA','27'),('949','LA PAZ','27'),('95','REMEDIOS','2'),('950','LANDAZURI','27'),('951','LEBRIJA','27'),('952','LOS SANTOS','27'),('953','MACARAVITA','27'),('954','MÁLAGA','27'),('955','MATANZA','27'),('956','MOGOTES','27'),('957','MOLAGAVITA','27'),('958','OCAMONTE','27'),('959','OIBA','27'),('96','RIONEGRO','2'),('960','ONZAGA','27'),('961','PALMAR','27'),('962','PALMAS DEL SOCORRO','27'),('963','PÁRAMO','27'),('964','PIEDECUESTA','27'),('965','PINCHOTE','27'),('966','PUENTE NACIONAL','27'),('967','PUERTO PARRA','27'),('968','PUERTO WILCHES','27'),('969','RIONEGRO','27'),('97','SABANALARGA','2'),('970','SABANA DE TORRES','27'),('971','SAN ANDRÉS','27'),('972','SAN BENITO','27'),('973','SAN GIL','27'),('974','SAN JOAQUÍN','27'),('975','SAN JOSÉ DE MIRANDA','27'),('976','SAN MIGUEL','27'),('977','SAN VICENTE DE CHUCURÍ','27'),('978','SANTA BÁRBARA','27'),('979','SANTA HELENA','27'),('98','SABANETA','2'),('980','SIMACOTA','27'),('981','SOCORRO','27'),('982','SUAITA','27'),('983','SUCRE','27'),('984','SURATA','27'),('985','TONA','27'),('986','VALLE SAN JOSÉ','27'),('987','VÉLEZ','27'),('988','VETAS','27'),('989','VILLANUEVA','27'),('99','SALGAR','2'),('990','ZAPATOCA','27'),('991','BUENAVISTA','28'),('992','CAIMITO','28'),('993','CHALÁN','28'),('994','COLOSO','28'),('995','COROZAL','28'),('996','EL ROBLE','28'),('997','GALERAS','28'),('998','GUARANDA','28'),('999','LA UNIÓN','28');
/*!40000 ALTER TABLE `municipio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pago` (
  `Factura_idFactura` int(11) NOT NULL COMMENT 'Llave foranea primaria de ID Factura',
  `numTarCredito` varchar(45) NOT NULL COMMENT 'Número Tarjeta del pago',
  `banco` varchar(100) NOT NULL COMMENT 'Banco Tarjeta',
  `tipoCuentaTar` varchar(20) NOT NULL COMMENT 'Tipo de Cuenta Tarjeta',
  `tipoTransaccion` varchar(10) NOT NULL,
  PRIMARY KEY (`Factura_idFactura`),
  CONSTRAINT `fk_Pago_Factura1` FOREIGN KEY (`Factura_idFactura`) REFERENCES `factura` (`idFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `Factura_idFactura` int(11) NOT NULL COMMENT 'Llave foránea primaria ID factura',
  `total` float NOT NULL COMMENT 'Precio Total del pedido',
  `subtotal` float NOT NULL COMMENT 'Subtotal del pedido',
  `impuestos` float NOT NULL COMMENT 'Impuestos del pedido',
  PRIMARY KEY (`Factura_idFactura`),
  CONSTRAINT `fk_Pedido_Factura1` FOREIGN KEY (`Factura_idFactura`) REFERENCES `factura` (`idFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `idProducto` varchar(100) NOT NULL COMMENT 'Llave primaria producto',
  `nombre` varchar(300) NOT NULL COMMENT 'Nombre del producto',
  `marca` varchar(45) NOT NULL COMMENT 'Marca del producto',
  `referencia` varchar(45) NOT NULL COMMENT 'Referencia del producto ',
  `descripcion` varchar(500) NOT NULL COMMENT 'Descripcion del producto',
  `material` varchar(45) NOT NULL COMMENT 'Material del producto',
  `color` varchar(45) NOT NULL COMMENT 'Color del producto',
  `foto` longblob COMMENT 'Foto del producto',
  `cantidad` int(11) NOT NULL COMMENT 'Unidades existentes del producto',
  `activo` tinyint(1) NOT NULL COMMENT 'Estado del producto',
  `precioUnitario` float NOT NULL COMMENT 'Precio Unitario del producto',
  `descuento` float NOT NULL COMMENT 'Descuento del producto',
  `Categoria_idCategoria` int(11) NOT NULL,
  `Catalogo_idCatalogo` int(11) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `fk_Producto_Categoria1` (`Categoria_idCategoria`),
  KEY `fk_Producto_Catalogo1` (`Catalogo_idCatalogo`),
  CONSTRAINT `fk_Producto_Catalogo1` FOREIGN KEY (`Catalogo_idCatalogo`) REFERENCES `catalogo` (`idCatalogo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Categoria1` FOREIGN KEY (`Categoria_idCategoria`) REFERENCES `categoria` (`idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `idProveedor` varchar(45) NOT NULL COMMENT 'Llave primaria compuesta de proveedor ',
  `tipoDeIdentificacion` varchar(20) NOT NULL COMMENT 'Llave primaria compuesta de proveedor',
  `nombre` varchar(200) NOT NULL COMMENT 'Nombre del proveedor',
  `telefono` varchar(20) NOT NULL COMMENT 'Teléfono del proveedor',
  `email` varchar(45) NOT NULL COMMENT 'Correo electrónico del proveedor',
  PRIMARY KEY (`idProveedor`,`tipoDeIdentificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` varchar(20) NOT NULL COMMENT 'Llave primaria del usuario',
  `contrasena` varchar(45) NOT NULL COMMENT 'Contraseña del usuario',
  `rol` varchar(45) NOT NULL COMMENT 'Rol del Usuario',
  `estado` varchar(20) NOT NULL COMMENT 'Estado del usuario',
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-10 11:03:46
