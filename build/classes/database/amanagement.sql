-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2025 at 02:05 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `amanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `amanagement`
--

CREATE TABLE `amanagement` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_roles` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `amanagement`
--

INSERT INTO `amanagement` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_roles`) VALUES
(1, 'angelo', 'mendoza', 'mendozaangelo@gmai.com', 'angelo', 'angelo', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `amanagement`
--
ALTER TABLE `amanagement`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `amanagement`
--
ALTER TABLE `amanagement`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
