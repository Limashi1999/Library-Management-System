-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 11, 2020 at 04:28 PM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `customer_ms`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_reference_id` varchar(500) NOT NULL,
  `first_name` varchar(500) NOT NULL,
  `last_name` varchar(500) NOT NULL,
  `nic` varchar(500) NOT NULL,
  `address` varchar(500) NOT NULL,
  `telephone` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `user_reference_id`, `first_name`, `last_name`, `nic`, `address`, `telephone`) VALUES
(1, '1587804352', 'Limashi', 'Rashmika', '077855426', 'Galle, Srilanka', 773387542),
(3, '003', 'Rashmika', 'Thilini', '1959582345', 'Matara, Srilanka', 778524568),
(4, '007', 'ghgh', 'gg', '54344', 'Matara, Srilanka', 685),
(5, '0057', 'hfh', 'jhg', '6456456', 'Matara, Srilanka', 455462),
(7, '1587799816', 'Sahan', 'Thilina', '19958742V', 'New York', 77854685),
(8, '1587750529', 'Kolam', 'manika', '1875426', 'Galle, Srilanka', 77521436),
(9, '1587799988', 'Sahan', 'Thilina', '19991201V', 'New York', 772870143),
(10, '1587750913', 'Kamaj', 'Silva', '457449785', 'Canada', 292221945),
(11, '1587750981', 'Dilshan', 'Modaya', '21123123123', 'Rathnapura', 875695);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
