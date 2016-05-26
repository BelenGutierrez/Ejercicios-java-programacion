-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2016 a las 00:45:38
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cuentasbancarias`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clave`
--

CREATE TABLE `clave` (
  `usuario` varchar(5) COLLATE utf8_bin NOT NULL,
  `pass` varchar(4) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `clave`
--

INSERT INTO `clave` (`usuario`, `pass`) VALUES
('user1', '1111'),
('user2', '2222'),
('user3', '3333'),
('user4', '4444');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `numero` varchar(20) COLLATE utf8_bin NOT NULL,
  `banco` varchar(50) COLLATE utf8_bin NOT NULL,
  `titular` varchar(50) COLLATE utf8_bin NOT NULL,
  `origen` varchar(50) COLLATE utf8_bin NOT NULL,
  `apertura` varchar(10) COLLATE utf8_bin NOT NULL,
  `saldo` decimal(9,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`numero`, `banco`, `titular`, `origen`, `apertura`, `saldo`) VALUES
('BH665471241154999201', 'Hsbc', 'Adds SA', 'Las Bahamas', '2005-02-23', '2650000.00'),
('BK254896574859632145', 'Bank of America', 'Flat Investment SA', 'Usa', '2015-01-14', '960500.00'),
('ES541698247700155599', 'Bbva', 'Software SA', 'España', '2013-07-01', '182457.00'),
('ES650014789632541289', 'Santander', 'Adds SA', 'España', '2012-04-11', '1504362.00'),
('GC545456325147895155', 'Bank of China', 'Software SA', 'China', '2016-04-01', '12548.25'),
('GM363325478001222450', 'Deutsche Bank', 'Software SA', 'Alemania', '2011-04-23', '175000.00'),
('HA021654987556321450', 'Hsbc', 'Flat Investment SA', 'Panama', '2012-12-17', '1895000.00'),
('IC775489541254632487', 'Bnp Paribas', 'Software SA', 'Isla Caiman', '2012-11-08', '365000.00'),
('PL654785201335487963', 'Banco Andorrano', 'Skee Blue SL', 'Andorra', '2010-03-14', '765000.00'),
('SH251452187896325478', 'Icbc', 'Honey Moon Corporation', 'Sheychelles', '2016-02-02', '500000.00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clave`
--
ALTER TABLE `clave`
  ADD PRIMARY KEY (`usuario`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`numero`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
