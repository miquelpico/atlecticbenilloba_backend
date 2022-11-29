-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-11-2022 a las 18:59:17
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `atletic_benilloba_eoi`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembros`
--

CREATE TABLE `miembros` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `dorsal` tinyint(3) UNSIGNED DEFAULT NULL,
  `tipo` int(10) UNSIGNED DEFAULT NULL,
  `imagen_perfil` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `miembros`
--

INSERT INTO `miembros` (`id`, `nombre`, `dorsal`, `tipo`, `imagen_perfil`) VALUES
(16, 'Miquel Picó Gisbert', 21, 1, NULL),
(18, 'José Antonio Ponce Pascual', 1, 1, NULL),
(19, 'Roberto Reig julià', 4, 1, NULL),
(20, 'Alexandre Montava Masanet', 5, 1, NULL),
(21, 'Sergi Reig Domenech', 6, 1, NULL),
(22, 'Paco Picó Miquel', 7, 1, NULL),
(23, 'Ignacio Espinós Conejo', 9, 1, NULL),
(24, 'Sergio Cantó Carbonell', 11, 1, NULL),
(25, 'Daniel Guarner Verdú', 13, 1, NULL),
(26, 'Jorge Espinós Martínez', 14, 1, NULL),
(27, 'José Pascual Jiménez', 17, 1, NULL),
(28, 'Joan Salvador Aracil', 19, 1, NULL),
(29, 'Arnau Carbonell Mira', 32, 1, NULL),
(30, 'Noel Oltra Moreno', 69, 1, NULL),
(31, 'Joaquin Barrachina Verdú', NULL, 2, NULL),
(32, 'Iván Gutiérrez Buades', NULL, 2, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`id`, `nombre`) VALUES
(1, 'Jugador'),
(2, 'Cuerpo técnico');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `miembros`
--
ALTER TABLE `miembros`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tipo` (`tipo`) USING BTREE;

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `miembros`
--
ALTER TABLE `miembros`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `tipo`
--
ALTER TABLE `tipo`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `miembros`
--
ALTER TABLE `miembros`
  ADD CONSTRAINT `miembros_ibfk_1` FOREIGN KEY (`tipo`) REFERENCES `tipo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
