-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost:3306
-- Tiempo de generación: 25-04-2012 a las 03:38:33
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd(copia)`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbajas`
--

CREATE TABLE IF NOT EXISTS `tbajas` (
  `NUMEM` int(11) NOT NULL,
  PRIMARY KEY (`NUMEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbajas`
--

INSERT INTO `tbajas` (`NUMEM`) VALUES
(130),
(190),
(270),
(330),
(400),
(550);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcentr`
--

CREATE TABLE IF NOT EXISTS `tcentr` (
  `NUMCE` int(11) NOT NULL,
  `NOMCE` varchar(25) NOT NULL,
  `SENAS` varchar(25) NOT NULL,
  PRIMARY KEY (`NUMCE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tcentr`
--

INSERT INTO `tcentr` (`NUMCE`, `NOMCE`, `SENAS`) VALUES
(10, 'SEDE CENTRAL', 'C. ALCALA, 820, MADRID'),
(20, 'RELACION CON CLIENTES', 'C. ATOCHA, 405, MADRID'),
(50, 'ALMACEN', 'C. LAVAPIES, 520, MADRID');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdepto`
--

CREATE TABLE IF NOT EXISTS `tdepto` (
  `NUMDE` int(11) NOT NULL,
  `NUMCE` int(11) DEFAULT NULL,
  `DIREC` int(11) DEFAULT NULL,
  `TIDIR` char(1) DEFAULT NULL,
  `PRESU` decimal(3,0) NOT NULL,
  `DEPDE` int(11) DEFAULT NULL,
  `NOMDE` varchar(20) NOT NULL,
  PRIMARY KEY (`NUMDE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tdepto`
--

INSERT INTO `tdepto` (`NUMDE`, `NUMCE`, `DIREC`, `TIDIR`, `PRESU`, `DEPDE`, `NOMDE`) VALUES
(100, 10, 260, 'P', '120', NULL, 'DIRECCION GENERAL'),
(110, 20, 180, 'P', '150', 100, 'DIRECCION COMERCIAL'),
(111, 20, 180, 'F', '110', 110, 'SECTOR INDUSTRIAL'),
(112, 20, 270, 'P', '90', 110, 'SECTOR SERVICIOS'),
(120, 10, 150, 'F', '30', 100, 'ORGANIZACION'),
(121, 10, 150, 'P', '20', 120, 'PERSONAL'),
(122, 10, 350, 'P', '60', 120, 'PROCESO DE DATOS'),
(123, NULL, 150, 'F', '100', 121, 'PERSONAL CONTRATADO'),
(130, 10, 310, 'P', '20', 100, 'FINANZAS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temple`
--

CREATE TABLE IF NOT EXISTS `temple` (
  `NUMEM` int(11) NOT NULL,
  `NUMDE` int(11) NOT NULL,
  `EXTEL` smallint(6) NOT NULL,
  `FECNA` datetime NOT NULL,
  `FECIN` datetime NOT NULL,
  `SALAR` decimal(4,0) NOT NULL,
  `COMIS` decimal(4,0) DEFAULT NULL,
  `NUMHI` smallint(6) NOT NULL,
  `NOMEM` varchar(20) NOT NULL,
  PRIMARY KEY (`NUMEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `temple`
--

INSERT INTO `temple` (`NUMEM`, `NUMDE`, `EXTEL`, `FECNA`, `FECIN`, `SALAR`, `COMIS`, `NUMHI`, `NOMEM`) VALUES
(110, 121, 350, '1929-11-10 00:00:00', '1950-02-15 00:00:00', '3100', NULL, 3, 'PONS, CESAR'),
(120, 112, 840, '1935-06-09 00:00:00', '1968-10-01 00:00:00', '3500', '1100', 1, 'LASA, MARIO'),
(130, 112, 810, '1945-09-09 00:00:00', '1969-02-01 00:00:00', '2900', '1100', 2, 'TEROL, LUCIANO'),
(150, 121, 340, '1930-08-10 00:00:00', '1948-01-15 00:00:00', '4400', NULL, 0, 'PEREZ, JULIO'),
(160, 110, 740, '1939-07-09 00:00:00', '1968-11-11 00:00:00', '3100', '1100', 2, 'AGUIRE, AUREO'),
(180, 110, 508, '1934-10-18 00:00:00', '1956-03-18 00:00:00', '4800', '500', 2, 'PEREZ, MARCOS'),
(190, 121, 350, '1932-05-12 00:00:00', '1962-02-11 00:00:00', '3000', NULL, 4, 'VEIGA, JULIANA'),
(210, 100, 200, '1940-08-28 00:00:00', '1959-01-22 00:00:00', '3800', NULL, 2, 'GALVEZ, PILAR'),
(240, 110, 760, '1942-02-26 00:00:00', '1966-02-24 00:00:00', '2800', '1000', 3, 'SANZ, LAVINIA'),
(250, 100, 250, '1946-10-27 00:00:00', '1967-03-01 00:00:00', '4500', NULL, 0, 'ALBA, ADRIANA'),
(260, 100, 220, '1943-12-03 00:00:00', '1968-07-12 00:00:00', '7200', NULL, 6, 'LOPEZ, ANTONIO'),
(270, 112, 800, '1945-05-21 00:00:00', '1966-09-10 00:00:00', '3800', '800', 3, 'GARCIA, OCTAVIO'),
(280, 130, 410, '1948-01-11 00:00:00', '1971-10-08 00:00:00', '2900', NULL, 5, 'FLOR, DOROTEA'),
(285, 122, 620, '1949-10-25 00:00:00', '1968-02-15 00:00:00', '3800', NULL, 0, 'POLO, OTILIA'),
(290, 120, 910, '1947-11-30 00:00:00', '1968-02-14 00:00:00', '2700', NULL, 3, 'GIL, GLORIA'),
(310, 130, 480, '1946-11-21 00:00:00', '1971-01-15 00:00:00', '4200', NULL, 0, 'GARCIA, AUGUSTO'),
(320, 122, 620, '1957-12-25 00:00:00', '1978-05-02 00:00:00', '4050', NULL, 2, 'SANZ, CORNELIO'),
(330, 112, 850, '1948-08-19 00:00:00', '1972-03-01 00:00:00', '2800', '900', 0, 'DIEZ,AMELIA'),
(350, 122, 610, '1949-04-13 00:00:00', '1984-09-10 00:00:00', '4500', NULL, 1, 'CAMPS, AURELIO'),
(360, 111, 750, '1958-10-29 00:00:00', '1968-10-10 00:00:00', '2500', '1000', 2, 'LARA,DORINDA'),
(370, 121, 360, '1967-06-22 00:00:00', '1987-01-20 00:00:00', '1900', NULL, 1, 'RUIZ, FABIOLA'),
(380, 112, 880, '1968-03-30 00:00:00', '1988-01-01 00:00:00', '1800', NULL, 0, 'MARTIN, MICAELA'),
(390, 110, 500, '1966-02-19 00:00:00', '1986-10-08 00:00:00', '2150', NULL, 1, 'MORAN, CARMEN'),
(400, 111, 780, '1969-08-18 00:00:00', '1987-11-01 00:00:00', '1850', NULL, 0, 'LARA, LUCRECIA'),
(410, 122, 660, '1968-07-14 00:00:00', '1988-10-13 00:00:00', '1750', NULL, 0, 'MUnOZ, AZUCENA'),
(420, 130, 450, '1966-10-22 00:00:00', '1988-11-19 00:00:00', '4000', NULL, 0, 'FIERRO, CLAUDIA'),
(430, 122, 650, '1967-10-26 00:00:00', '1988-11-19 00:00:00', '2100', NULL, 1, 'MORA, VALERIANA'),
(440, 111, 760, '1966-09-26 00:00:00', '1986-02-02 00:00:00', '2100', '1000', 0, 'DURAN, LIVIA'),
(450, 112, 880, '1966-10-21 00:00:00', '1986-02-28 00:00:00', '2100', '1000', 0, 'PEREZ, SABINA'),
(480, 111, 760, '1965-04-04 00:00:00', '1986-02-28 00:00:00', '2100', '1000', 1, 'PINO, DIANA'),
(490, 112, 880, '1964-06-06 00:00:00', '1988-01-01 00:00:00', '1800', '1000', 0, 'TORRES, HORACIO'),
(500, 111, 750, '1965-10-08 00:00:00', '1987-01-01 00:00:00', '2000', '1000', 0, 'VAZQUEZ, HONORIA'),
(510, 110, 550, '1966-05-04 00:00:00', '1986-11-01 00:00:00', '2000', NULL, 1, 'CAMPOS, ROMULO'),
(550, 111, 780, '1970-01-10 00:00:00', '1988-01-21 00:00:00', '1000', '1200', 0, 'SANTOS, SANCHO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temple2`
--

CREATE TABLE IF NOT EXISTS `temple2` (
  `NUMEM` int(11) NOT NULL,
  `NUMDE` int(11) NOT NULL,
  `EXTEL` smallint(6) NOT NULL,
  `FECNA` datetime NOT NULL,
  `FECIN` datetime NOT NULL,
  `SALAR` decimal(4,0) NOT NULL,
  `COMIS` decimal(4,0) DEFAULT NULL,
  `NUMHI` smallint(6) NOT NULL,
  `NOMEM` varchar(20) NOT NULL,
  PRIMARY KEY (`NUMEM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `temple2`
--

INSERT INTO `temple2` (`NUMEM`, `NUMDE`, `EXTEL`, `FECNA`, `FECIN`, `SALAR`, `COMIS`, `NUMHI`, `NOMEM`) VALUES
(130, 112, 810, '1945-09-09 00:00:00', '1969-02-01 00:00:00', '2900', '1100', 2, 'TEROL, LUCIANO'),
(190, 121, 350, '1932-05-12 00:00:00', '1962-02-11 00:00:00', '3000', NULL, 4, 'VEIGA, JULIANA'),
(270, 112, 800, '1945-05-21 00:00:00', '1966-09-10 00:00:00', '3800', '800', 3, 'GARCIA, OCTAVIO'),
(330, 112, 850, '1948-08-19 00:00:00', '1972-03-01 00:00:00', '2800', '900', 0, 'DIEZ,AMELIA'),
(400, 111, 780, '1969-08-18 00:00:00', '1987-11-01 00:00:00', '1850', NULL, 0, 'LARA, LUCRECIA'),
(550, 111, 780, '1970-01-10 00:00:00', '1988-01-21 00:00:00', '1000', '1200', 0, 'SANTOS, SANCHO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmasasal`
--

CREATE TABLE IF NOT EXISTS `tmasasal` (
  `NUMDE` int(11) NOT NULL,
  `NUMNIV` int(11) NOT NULL,
  `MASASAL` int(11) NOT NULL,
  PRIMARY KEY (`NUMDE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tsalar`
--

CREATE TABLE IF NOT EXISTS `tsalar` (
  `LIMINF` int(11) NOT NULL,
  `LIMSUP` int(11) NOT NULL,
  `NUMEMPS` int(11) NOT NULL,
  `SALMED` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
