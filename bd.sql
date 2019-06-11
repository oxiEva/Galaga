-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Temps de generació: 02-05-2019 a les 13:34:51
-- Versió del servidor: 5.7.26-0ubuntu0.16.04.1
-- Versió de PHP: 7.1.27-1+ubuntu16.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de dades: `galaga`
--

-- --------------------------------------------------------

--
-- Estructura de la taula `Arma`
--

CREATE TABLE `Arma` (
  `idArma` int(11) NOT NULL,
  `ataque` int(11) NOT NULL,
  `nombreArma` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Equipo`
--

CREATE TABLE `Equipo` (
  `idEquipo` int(11) NOT NULL,
  `nivel` int(11) NOT NULL,
  `experiencia` int(11) NOT NULL,
  `victorias` int(11) NOT NULL,
  `idJugador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Escudo`
--

CREATE TABLE `Escudo` (
  `idEscudo` int(11) NOT NULL,
  `defensa` int(11) NOT NULL,
  `nombreEscudo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `HabilidadEspecial`
--

CREATE TABLE `HabilidadEspecial` (
  `idHabilidadEspecial` int(11) NOT NULL,
  `nombreHabEsp` varchar(45) NOT NULL,
  `idRaza` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Jugador`
--

CREATE TABLE `Jugador` (
  `idJugador` int(11) NOT NULL,
  `idNave` int(11) NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `experiencia` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Lucha`
--

CREATE TABLE `Lucha` (
  `idLucha` int(11) NOT NULL,
  `idJugador` int(11) NOT NULL,
  `idEquipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Nave`
--

CREATE TABLE `Nave` (
  `idNave` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `raza` varchar(40) NOT NULL,
  `subraza` varchar(40) NOT NULL,
  `medioNatural` varchar(20) NOT NULL,
  `imagen` varchar(20) DEFAULT NULL,
  `ataque` int(11) NOT NULL,
  `defensa` int(11) NOT NULL,
  `disponibilida` tinyint(1) NOT NULL,
  `habilidfadEspecial` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Raza`
--

CREATE TABLE `Raza` (
  `idRaza` int(11) NOT NULL,
  `raza` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Rol`
--

CREATE TABLE `Rol` (
  `idRol` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `rol` enum('USUARIO','ADMIN') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Subraza`
--

CREATE TABLE `Subraza` (
  `idSubraza` int(11) NOT NULL,
  `raza` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de la taula `Usuario`
--

CREATE TABLE `Usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `contraseña` varchar(10) NOT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `fechaRegistro` date NOT NULL,
  `idRol` int(11) NOT NULL,
  `lema` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexos per taules bolcades
--

--
-- Index de la taula `Arma`
--
ALTER TABLE `Arma`
  ADD PRIMARY KEY (`idArma`);

--
-- Index de la taula `Equipo`
--
ALTER TABLE `Equipo`
  ADD PRIMARY KEY (`idEquipo`),
  ADD KEY `fk_Categoria_1_idx` (`experiencia`);

--
-- Index de la taula `Escudo`
--
ALTER TABLE `Escudo`
  ADD PRIMARY KEY (`idEscudo`);

--
-- Index de la taula `HabilidadEspecial`
--
ALTER TABLE `HabilidadEspecial`
  ADD PRIMARY KEY (`idHabilidadEspecial`),
  ADD KEY `fk_Puntuacion_2_idx` (`idRaza`);

--
-- Index de la taula `Jugador`
--
ALTER TABLE `Jugador`
  ADD PRIMARY KEY (`idJugador`);

--
-- Index de la taula `Lucha`
--
ALTER TABLE `Lucha`
  ADD PRIMARY KEY (`idLucha`,`idJugador`),
  ADD KEY `fk_juegoCategoria_2_idx` (`idJugador`);

--
-- Index de la taula `Nave`
--
ALTER TABLE `Nave`
  ADD PRIMARY KEY (`idNave`),
  ADD KEY `fk_Juego_1_idx` (`defensa`);

--
-- Index de la taula `Raza`
--
ALTER TABLE `Raza`
  ADD PRIMARY KEY (`idRaza`);

--
-- Index de la taula `Rol`
--
ALTER TABLE `Rol`
  ADD PRIMARY KEY (`idRol`),
  ADD KEY `fk_Rol_1_idx` (`idUsuario`);

--
-- Index de la taula `Subraza`
--
ALTER TABLE `Subraza`
  ADD PRIMARY KEY (`idSubraza`);

--
-- Index de la taula `Usuario`
--
ALTER TABLE `Usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT per les taules bolcades
--

--
-- AUTO_INCREMENT per la taula `Usuario`
--
ALTER TABLE `Usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
