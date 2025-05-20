-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2025 at 07:26 AM
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
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_number` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_roles` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_number`, `u_username`, `u_password`, `u_roles`, `u_status`) VALUES
(1, 'angelo', 'mendoza', 'mendozaangelo@gmai.com', '', 'angelo', 'angelo', 'admin', 'active'),
(2, 'asddd', 'asdddaa', 'menasd@gmail.com', '09454510122', 'admin', 'admin', 'admin', 'Active'),
(5, 'asd', 'asd', 'mendozaangelo@gmai.com', '09112223312', 'qweqwe', 'qweqweqwe', 'admin', 'active'),
(6, 'qweqweqwe', 'qweqweqwe', 'mendozaangeloa12@gmail.com', '09123123123', '', 'qweqweqwe', 'admin', 'active'),
(10, 'raffy', 'asdasd', 'mendozaangeloa@gmail.com', '09454512122', 'raffy', 'asdasdasd', 'admin', 'active'),
(11, 'asdasd', 'asdasd', 'mendozaa@gmail.con', '09107922772', 'gwapo', 'asdasdasd', 'admin', 'active'),
(12, 'gwapo', 'gwapo', 'mendasd@gmail.com', '09123456789', '', 'gwapogwapo', 'applicant', 'Pending'),
(13, 'gwapotalaga', 'gwapo', 'mendozasd@gmail.com', '09123456789', 'gwapogwapo', 'gwapogwapo', 'admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
