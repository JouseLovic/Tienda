-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2023 at 08:10 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tienda`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizaFactura` (IN `idFactura` VARCHAR(50), IN `fechaE` VARCHAR(30), IN `precioE` DOUBLE, IN `cantidadE` INT, IN `Gestion` VARCHAR(30), IN `idFacturaOrigen` VARCHAR(50))   update factura set id_de_factura = idFactura, fecha = fechaE, precio = precioE, cantidad = cantidadE, E_S = Gestion where id_de_factura = idFacturaOrigen$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizaFacturaE` (IN `idFactura` VARCHAR(50), IN `fechaE` VARCHAR(30), IN `precioE` DOUBLE, IN `cantidadE` INT, IN `descripcion` VARCHAR(255), IN `idProveedor` VARCHAR(100), IN `idFacturaOrigen` VARCHAR(50))   Update factura_entrada set id_de_factura = idFactura, fecha = fechaE, precio = precioE, cantidad_productos = cantidadE, productos = descripcion, id_proveedor = idProveedor where id_de_factura = idFacturaOrigen$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizaFacturaS` (IN `idFactura` VARCHAR(50), IN `fechaS` VARCHAR(30), IN `precioS` DOUBLE, IN `cantidadS` INT(11), IN `idProducto` VARCHAR(50), IN `idCliente` VARCHAR(11), IN `idFacturaOrigen` VARCHAR(50))   update factura_salida set id_de_factura = idFactura, fecha = fechaS, precio = precioS, cantidad = cantidadS, id_producto = idProducto, cedula_cliente = idCliente where id_de_factura = idFacturaOrigen$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizaSalida` (IN `idFactura` VARCHAR(50), IN `idProducto` VARCHAR(50), IN `pDescripcion` VARCHAR(100), IN `fechaS` VARCHAR(30), IN `precioS` DOUBLE, IN `cantidadS` INT(11), IN `idCliente` VARCHAR(11), IN `idFacturaOriginal` VARCHAR(50))   update salida_de_productos set id_de_factura = idFactura, id_producto = idProducto, descripcion = pDescripcion, fecha = fechaS, precio = precioS, cantidad = cantidadS, cedula_cliente = idCliente where id_de_factura = idFacturaOriginal$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaEntrada` (IN `idFactura` VARCHAR(50) CHARSET utf8, IN `codigo_producto` VARCHAR(50) CHARSET utf8, IN `descripcion` VARCHAR(255) CHARSET utf8, IN `fecha` VARCHAR(50) CHARSET utf8, IN `precio` DOUBLE, IN `cantidad` INT(10), IN `seccion` VARCHAR(50) CHARSET utf8, IN `marca` VARCHAR(50) CHARSET utf8, IN `idProveedor` VARCHAR(100) CHARSET utf8)   insert into entrada_de_productos (id_de_factura, codigoProducto, descripcion_Producto, fecha, precio, cantidad, seccion, marca, id_proveedor) values(idFactura, codigo_producto, descripcion, fecha, precio, cantidad, seccion, marca, idProveedor)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaFactura` (IN `id_factura` VARCHAR(50), IN `fechaP` VARCHAR(30), IN `precioP` DOUBLE, IN `cantidadP` INT, IN `estadoP` VARCHAR(50))   insert into factura (id_de_factura, fecha, precio, cantidad, E_S) values(id_factura, fechaP, precioP, cantidadP, estadoP)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaFactura_Entrada` (IN `idFactura` VARCHAR(50), IN `fechaP` VARCHAR(30), IN `precioP` DOUBLE, IN `cantidadP` INT, IN `productosN` VARCHAR(50), IN `idProveedor` VARCHAR(100))   insert into factura_entrada (id_de_factura, fecha, precio, cantidad_productos, productos, id_proveedor) values(idFactura, fechaP, precioP, cantidadP, productosN, idProveedor)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaFactura_salida` (IN `idFactura` VARCHAR(50), IN `fechaP` VARCHAR(30), IN `precioP` DOUBLE, IN `cantidadP` INT(11), IN `productosN` VARCHAR(50), IN `cedulaCliente` VARCHAR(11))   insert into factura_salida (id_de_factura, fecha, precio, cantidad, id_producto, cedula_cliente) values(idFactura, fechaP, precioP, cantidadP, productosN, cedulaCliente)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaProducto_entrada` (IN `codigoproducto` VARCHAR(50), IN `descripcion` VARCHAR(255), IN `cantidad` INT(10), IN `seccion` VARCHAR(50), IN `marca` VARCHAR(50), IN `idProveedor` VARCHAR(100))   insert into productos_generales (id, descripcion, talla, marca, seccion, precio, edadDirigida, cantidad, sexo, id_proveedor, Producto_vendido) values (codigoproducto, descripcion, 'None', marca, seccion, '0', 'None', cantidad, 'N', idProveedor, 'No')$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `creaSalida` (IN `idFactura` VARCHAR(50), IN `idProducto` VARCHAR(50), IN `descripcionP` VARCHAR(255), IN `fechaS` VARCHAR(30), IN `precioS` DOUBLE, IN `cantidadS` INT(11), IN `CedulaCliente` VARCHAR(11))   insert into salida_de_productos (id_de_factura, id_producto, descripcion, fecha, precio, cantidad, cedula_cliente) values(idFactura, idProducto, descripcionP, fechaS, precioS, cantidadS, CedulaCliente)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaEntrada` (IN `idFactura` VARCHAR(50))   delete from entrada_de_productos where id_de_factura = idFactura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaFactura` (IN `idFactura` VARCHAR(50))   delete from factura where id_de_factura = idFactura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaFactura_entrada` (IN `idFactura` VARCHAR(50))   delete from factura_entrada where id_de_factura = idFactura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaFactura_salida` (IN `idFactura` VARCHAR(50))   Delete from factura_salida where id_de_factura = idFactura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaProducto_Entrada` (`codigoProducto` VARCHAR(50))   delete from productos_generales where id = codigoProducto$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminaSalida` (IN `idFactura` VARCHAR(50))   delete from salida_de_productos where id_de_factura = idFactura$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `restarCantidadProducto` (IN `idProducto` VARCHAR(50), IN `cantidadR` INT(11))   update productos_generales set cantidad = cantidad-cantidadR where id = idProducto$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sumaCantidadProducto` (IN `idProducto` VARCHAR(50), IN `cantidadS` INT(11))   update productos_generales set cantidad = cantidad+cantidadS where id = idProducto$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fecha_nacimiento` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cedula` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_general_ci COMMENT='Esta va relacionada con factura';

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`nombre`, `fecha_nacimiento`, `cedula`) VALUES
('\0\0\0K\0\0\0a\0\0\0m\0\0\0i\0\0\0l\0\0\0o\0\0\0 \0\0\0S\0\0\0a\0\0\0m\0\0\0u\0\0\0e\0\0\0l', '30/01/2001', '18.298.394'),
('\0\0\0E\0\0\0d\0\0\0u\0\0\0a\0\0\0r\0\0\0d\0\0\0o\0\0\0 \0\0\0C\0\0\0a\0\0\0m\0\0\0i\0\0\0l\0\0\0o', '03/03/2005', '20.397.923'),
('\0\0\0H\0\0\0e\0\0\0r\0\0\0n\0\0\0e\0\0\0s\0\0\0t\0\0\0o\0\0\0 \0\0\0R\0\0\0o\0\0\0j\0\0\0a\0\0\0s', '11/08/2002', '21.738.023'),
('\0\0\0R\0\0\0i\0\0\0c\0\0\0a\0\0\0r\0\0\0d\0\0\0o\0\0\0 \0\0\0D\0\0\0i\0\0\0a\0\0\0z', '20/03/2004', '30.283.983');

-- --------------------------------------------------------

--
-- Table structure for table `entrada_de_productos`
--

CREATE TABLE `entrada_de_productos` (
  `id_de_factura` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `codigoProducto` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `descripcion_Producto` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fecha` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int(10) NOT NULL,
  `seccion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `marca` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id_proveedor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `entrada_de_productos`
--

INSERT INTO `entrada_de_productos` (`id_de_factura`, `codigoProducto`, `descripcion_Producto`, `fecha`, `precio`, `cantidad`, `seccion`, `marca`, `id_proveedor`) VALUES
('2818232947F', '2001D', 'Pantalones', '20/11/2004', 2555, 300, 'Deportiva', 'Gucci', '201M'),
('28232947F', '19283M', 'Pantalones', '20/11/2004', 2555, 300, 'Deportiva', 'Gucci', '201M'),
('5682232229F', 'MD2835', 'Zapatos', '11/12/2007', 3000, 500, 'invierno', 'Gucci', '202M'),
('56829239F', 'MD2836', 'Zapatos', '11/12/2007', 2000, 100, 'Deportiva', 'Nike', '204M'),
('5682972239F', 'MD2837', 'Camisetas', '11/12/2007', 2000, 100, 'Deportiva', 'Nike', '202M');

-- --------------------------------------------------------

--
-- Table structure for table `factura`
--

CREATE TABLE `factura` (
  `id_de_factura` varchar(50) NOT NULL,
  `fecha` varchar(30) NOT NULL,
  `precio` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `E_S` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `factura`
--

INSERT INTO `factura` (`id_de_factura`, `fecha`, `precio`, `cantidad`, `E_S`) VALUES
('12322812278F', '10/11/2016', 2500, 50, 'Salida'),
('2322111228F', '10/11/2015', 2500, 10, 'Salida'),
('2818232947F', '20/11/2004', 2555, 300, 'Entrada'),
('28232947F', '20/11/2004', 2555, 300, 'Entrada'),
('5682232229F', '11/12/2007', 3000, 500, 'Entrada'),
('56829239F', '11/12/2007', 2000, 100, 'Entrada'),
('5682972239F', '11/12/2007', 2000, 100, 'Entrada');

-- --------------------------------------------------------

--
-- Table structure for table `factura_entrada`
--

CREATE TABLE `factura_entrada` (
  `id_de_factura` varchar(50) NOT NULL,
  `fecha` varchar(30) NOT NULL,
  `precio` double NOT NULL,
  `cantidad_productos` int(11) NOT NULL,
  `productos` text NOT NULL,
  `id_proveedor` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `factura_entrada`
--

INSERT INTO `factura_entrada` (`id_de_factura`, `fecha`, `precio`, `cantidad_productos`, `productos`, `id_proveedor`) VALUES
('2818232947F', '20/11/2004', 2555, 300, 'Pantalones', '201M'),
('28232947F', '20/11/2004', 2555, 300, 'Pantalones', '201M'),
('5682232229F', '11/12/2007', 3000, 500, 'Zapatos', '202M'),
('56829239F', '11/12/2007', 2000, 100, 'Zapatos', '204M'),
('5682972239F', '11/12/2007', 2000, 100, 'Camisetas', '202M');

-- --------------------------------------------------------

--
-- Table structure for table `factura_salida`
--

CREATE TABLE `factura_salida` (
  `Id_de_factura` varchar(50) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int(11) NOT NULL,
  `id_producto` varchar(50) NOT NULL,
  `cedula_cliente` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='Esta relacionada con venta y de alli saca el id del producto';

--
-- Dumping data for table `factura_salida`
--

INSERT INTO `factura_salida` (`Id_de_factura`, `fecha`, `precio`, `cantidad`, `id_producto`, `cedula_cliente`) VALUES
('12322812278F', '10/11/2016', 2500, 50, '2001D', '18.298.394');

-- --------------------------------------------------------

--
-- Table structure for table `productos_generales`
--

CREATE TABLE `productos_generales` (
  `id` varchar(50) NOT NULL,
  `descripcion` varchar(100) CHARACTER SET utf32 COLLATE utf32_general_ci NOT NULL,
  `talla` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `marca` varchar(50) NOT NULL,
  `seccion` varchar(50) NOT NULL,
  `precio` double DEFAULT NULL,
  `edadDirigida` varchar(10) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `sexo` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_proveedor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Producto_vendido` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `productos_generales`
--

INSERT INTO `productos_generales` (`id`, `descripcion`, `talla`, `marca`, `seccion`, `precio`, `edadDirigida`, `cantidad`, `sexo`, `id_proveedor`, `Producto_vendido`) VALUES
('19283M', 'Pantalones', 'M', 'Gucci', 'Deportiva', 60, '20-25', 250, 'M', '201M', 'No'),
('2001D', 'Pantalones azules', 'N', 'Gucci', 'Deportiva', 200, '20-17', 915, 'M', '201M', 'No'),
('4010F', 'Camisetas negras', 'M', 'Gucci', 'Deportiva', 50.25, '20-25', 155, 'FM', '', 'No'),
('MD2835', 'Zapatos', 'M', 'Gucci', 'invierno', 70.2, '19-24', 500, 'F', '202M', 'No'),
('MD2836', 'Zapatos', 'L', 'Nike', 'Deportiva', 40.3, '25-30', 600, 'M', '204M', 'No'),
('MD2837', 'Camisetas', 'S', 'Nike', 'Deportiva', 50, '20-17', 3201, 'F', '202M', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombre` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fechaNacimiento` varchar(20) NOT NULL,
  `cedula` varchar(10) NOT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `empresa` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `articulos` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `nombre`, `fechaNacimiento`, `cedula`, `email`, `empresa`, `articulos`) VALUES
('201M', 'Hector Oscuro', '07/05/2001', '10.293.956', 'Mask@gmail.com', 'Garrys corp', 'Pantalones/Zapatos Deportivos'),
('202M', 'Christian Rojas', '10/11/2001', '9.345.847', 'Christian@gmail.com', 'Haritas corp', 'Zapatos de cuero'),
('203M', 'Christian Alfaron', '10/11/2005', '10.234.958', 'ChristianMarks@gmail.com', 'Knagu corp', 'Camisetas'),
('204M', 'Edgar Ramirez', '20/11/2003', '3.473.984', 'EdgarRaKS@gmail.com', 'JKlaun corp', 'Shorts/Sueters inviernales'),
('205M', 'Julian Rojas', '11/07/1996', '2.348.392', 'RojasJ@gmail.com', 'Nike', 'Zapatos invernales'),
('206M', 'Karmalosky Rusmar', '11/11/2003', '32.293.974', 'Ruskosky@gmail.com', 'Rusk corp', 'Sueters de piel'),
('207M', 'Hector Marcus', '17/03/2001', '30.293.298', 'HMarcus@gmail.com', 'Pasta Alegre ', 'Shorts de verano');

-- --------------------------------------------------------

--
-- Table structure for table `salida_de_productos`
--

CREATE TABLE `salida_de_productos` (
  `id_de_factura` varchar(50) NOT NULL,
  `id_producto` varchar(100) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `fecha` varchar(30) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int(11) NOT NULL,
  `cedula_cliente` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `salida_de_productos`
--

INSERT INTO `salida_de_productos` (`id_de_factura`, `id_producto`, `descripcion`, `fecha`, `precio`, `cantidad`, `cedula_cliente`) VALUES
('2322111228F', '2001D', 'Pantalones', '10/11/2015', 2500, 10, '18.298.394');

-- --------------------------------------------------------

--
-- Table structure for table `venta`
--

CREATE TABLE `venta` (
  `id_venta` int(20) NOT NULL,
  `id_producto` varchar(50) NOT NULL,
  `id_de _factura` varchar(50) NOT NULL,
  `seccion` varchar(30) NOT NULL,
  `cantidad` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci COMMENT='Esta estara relacionada con productos_generales y factura';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedula`);

--
-- Indexes for table `entrada_de_productos`
--
ALTER TABLE `entrada_de_productos`
  ADD PRIMARY KEY (`id_de_factura`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indexes for table `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id_de_factura`);

--
-- Indexes for table `factura_entrada`
--
ALTER TABLE `factura_entrada`
  ADD PRIMARY KEY (`id_de_factura`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indexes for table `factura_salida`
--
ALTER TABLE `factura_salida`
  ADD KEY `Id_de_factura` (`Id_de_factura`);

--
-- Indexes for table `productos_generales`
--
ALTER TABLE `productos_generales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_proveedor` (`id_proveedor`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indexes for table `salida_de_productos`
--
ALTER TABLE `salida_de_productos`
  ADD PRIMARY KEY (`id_de_factura`);

--
-- Indexes for table `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id_venta`),
  ADD KEY `id_de _factura` (`id_de _factura`),
  ADD KEY `id_de_producto` (`id_producto`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `entrada_de_productos`
--
ALTER TABLE `entrada_de_productos`
  ADD CONSTRAINT `entrada_de_productos_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`);

--
-- Constraints for table `factura_entrada`
--
ALTER TABLE `factura_entrada`
  ADD CONSTRAINT `factura_entrada_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`);

--
-- Constraints for table `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_de _factura`) REFERENCES `factura_salida` (`Id_de_factura`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
