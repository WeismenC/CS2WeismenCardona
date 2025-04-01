-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-04-2025 a las 08:12:12
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoices`
--

CREATE TABLE `invoices` (
  `id` bigint(20) NOT NULL,
  `amount` double NOT NULL,
  `order_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicalrecords`
--

CREATE TABLE `medicalrecords` (
  `medical_id` bigint(20) NOT NULL,
  `allergies` varchar(255) DEFAULT NULL,
  `diagnosis` varchar(255) NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `is_order_cancelled` bit(1) NOT NULL,
  `medication` varchar(255) DEFAULT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  `pet_id` bigint(20) NOT NULL,
  `procedure_details` varchar(255) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `record_date` date NOT NULL,
  `symptoms` varchar(255) NOT NULL,
  `vaccination_history` varchar(255) DEFAULT NULL,
  `veterinarian_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicalrecords_seq`
--

CREATE TABLE `medicalrecords_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `medicalrecords_seq`
--

INSERT INTO `medicalrecords_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orders`
--

CREATE TABLE `orders` (
  `order_id` bigint(20) NOT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `is_cancelled` bit(1) DEFAULT NULL,
  `medication` varchar(255) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `owner_id` bigint(20) DEFAULT NULL,
  `pet_id` bigint(20) DEFAULT NULL,
  `veterinarian_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persons`
--

CREATE TABLE `persons` (
  `id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `cell_phone` varchar(255) NOT NULL,
  `document` varchar(255) NOT NULL,
  `name_person` varchar(255) NOT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  `role_person` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pets`
--

CREATE TABLE `pets` (
  `pet_id` bigint(20) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `breed` varchar(255) DEFAULT NULL,
  `characteristics` varchar(255) DEFAULT NULL,
  `name_pet` varchar(255) DEFAULT NULL,
  `owner_id` bigint(20) DEFAULT NULL,
  `species` varchar(255) DEFAULT NULL,
  `weight_pet` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales_person`
--

CREATE TABLE `sales_person` (
  `sales_person_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `password_user` varchar(255) NOT NULL,
  `role_user` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `person_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `veterinarian`
--

CREATE TABLE `veterinarian` (
  `veterinarian_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `invoices`
--
ALTER TABLE `invoices`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `medicalrecords`
--
ALTER TABLE `medicalrecords`
  ADD PRIMARY KEY (`medical_id`);

--
-- Indices de la tabla `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indices de la tabla `persons`
--
ALTER TABLE `persons`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK3bkp3t4qv4l8d42xd1vdbc97` (`document`);

--
-- Indices de la tabla `pets`
--
ALTER TABLE `pets`
  ADD PRIMARY KEY (`pet_id`);

--
-- Indices de la tabla `sales_person`
--
ALTER TABLE `sales_person`
  ADD PRIMARY KEY (`sales_person_id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  ADD UNIQUE KEY `UK97ih1g5lcdf1s3fg7oo4e18jw` (`person_id`);

--
-- Indices de la tabla `veterinarian`
--
ALTER TABLE `veterinarian`
  ADD PRIMARY KEY (`veterinarian_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `invoices`
--
ALTER TABLE `invoices`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `persons`
--
ALTER TABLE `persons`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `FKmvbq8q4vpi6csivw9wcnq6ho5` FOREIGN KEY (`person_id`) REFERENCES `persons` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
