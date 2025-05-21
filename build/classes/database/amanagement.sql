-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 11:11 AM
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
-- Table structure for table `application`
--

CREATE TABLE `application` (
  `application_id` int(11) NOT NULL,
  `job_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `application_status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `application`
--

INSERT INTO `application` (`application_id`, `job_id`, `user_id`, `application_status`) VALUES
(1, 1, 37, '0'),
(2, 2, 37, 'Accepted');

-- --------------------------------------------------------

--
-- Table structure for table `jobs`
--

CREATE TABLE `jobs` (
  `job_id` int(11) NOT NULL,
  `job_name` varchar(255) NOT NULL,
  `job_salary` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jobs`
--

INSERT INTO `jobs` (`job_id`, `job_name`, `job_salary`) VALUES
(1, 'nurse', '30000'),
(2, 'teacher', '25000');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL,
  `action` text NOT NULL,
  `action_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  `u_password` varchar(999) NOT NULL,
  `u_roles` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_image` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_number`, `u_username`, `u_password`, `u_roles`, `u_status`, `u_image`) VALUES
(31, 'asdasd', 'asdasd', 'asdweq@gmail.com', '09107922772', 'asdasd', '5fd924625f6ab16a19cc9807c7c506ae1813490e4ba675f843d5a10e0baacdb8', 'applicant', 'Active', NULL),
(33, 'asdasdasd', 'asdasdasd', 'mendioza@gmail.com', '09107255631', 'qweqweqwe', '0d1ea4c256cd50a2a7ccbfd22b3d9959f6fd30bd840b9ff3c7c65ee4e21df06d', 'applicant', 'pending', NULL),
(34, 'gwapo', 'gwapo', 'asd@gmail.com', '09123456789', 'asdasd', 'd8a928b2043db77e340b523547bf16cb4aa483f0645fe0a290ed1f20aab76257', 'applicant', 'Active', NULL),
(35, 'angelo', 'mendoza', 'mendopza@gmail.com', '09107922772', '', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'admin', 'Pending', NULL),
(36, 'test', 'test', 'test@gmail.com', '09107922552', 'test', '37268335dd6931045bdcdf92623ff819a64244b53d0e746d438797349d4da578', 'admin', 'active', NULL),
(37, 'angelo', 'mednoza', 'menedoza@gmail.com', '09454512031', 'admin', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'applicant', 'active', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `application`
--
ALTER TABLE `application`
  ADD PRIMARY KEY (`application_id`),
  ADD KEY `job_id` (`job_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `jobs`
--
ALTER TABLE `jobs`
  ADD PRIMARY KEY (`job_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `application`
--
ALTER TABLE `application`
  MODIFY `application_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `jobs`
--
ALTER TABLE `jobs`
  MODIFY `job_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `application`
--
ALTER TABLE `application`
  ADD CONSTRAINT `application_ibfk_1` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `application_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`u_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
