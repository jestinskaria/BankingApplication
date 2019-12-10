-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2019 at 04:36 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_account_balance_details`
--

CREATE TABLE `tbl_account_balance_details` (
  `USER_ID` int(10) NOT NULL,
  `ACC_NO` varchar(30) NOT NULL,
  `C_BALANCE` double(16,2) NOT NULL,
  `S_BALANCE` double(16,2) NOT NULL,
  `LAST_UPDATE_DATE` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_account_balance_details`
--

INSERT INTO `tbl_account_balance_details` (`USER_ID`, `ACC_NO`, `C_BALANCE`, `S_BALANCE`, `LAST_UPDATE_DATE`) VALUES
(1, 'DBC001', 2000.00, 7000.00, '2019-12-09 18:30:40'),
(1, 'DBC002', 590.00, 500.00, '2019-12-09 18:30:40');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_account_details`
--

CREATE TABLE `tbl_account_details` (
  `USER_ID` int(10) NOT NULL,
  `ACC_NO` varchar(30) NOT NULL,
  `IS_CHEQUING` int(11) NOT NULL,
  `IS_SAVING` int(11) NOT NULL,
  `ACC_BRANCH_ADDRESS` varchar(50) DEFAULT NULL,
  `CREATED_DATE` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_account_details`
--

INSERT INTO `tbl_account_details` (`USER_ID`, `ACC_NO`, `IS_CHEQUING`, `IS_SAVING`, `ACC_BRANCH_ADDRESS`, `CREATED_DATE`) VALUES
(1, 'DBC001', 1, 1, NULL, '0000-00-00'),
(1, 'DBC002', 1, 1, NULL, '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_clients`
--

CREATE TABLE `tbl_clients` (
  `CLIENT_USER_ID` int(10) NOT NULL,
  `CLIENT_F_NAME` varchar(30) NOT NULL,
  `CLIENT_L_NAME` varchar(30) NOT NULL,
  `CLIENT_EMAIL` varchar(30) NOT NULL,
  `CLIENT_USER_NAME` varchar(40) NOT NULL,
  `CLIENT_USER_PASSWORD` varchar(30) NOT NULL,
  `CLIENT_ADDRESS` varchar(30) NOT NULL,
  `CLIENT_ZIP_CODE` varchar(30) NOT NULL,
  `CLIENT_DOB` date NOT NULL,
  `CLIENT_PHONE_NO` varchar(30) NOT NULL,
  `CREATED_USER_ID` int(10) NOT NULL,
  `CREATED_DATE` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_clients`
--

INSERT INTO `tbl_clients` (`CLIENT_USER_ID`, `CLIENT_F_NAME`, `CLIENT_L_NAME`, `CLIENT_EMAIL`, `CLIENT_USER_NAME`, `CLIENT_USER_PASSWORD`, `CLIENT_ADDRESS`, `CLIENT_ZIP_CODE`, `CLIENT_DOB`, `CLIENT_PHONE_NO`, `CREATED_USER_ID`, `CREATED_DATE`) VALUES
(1, 'Jon', 'Alex', 'alex@gmail.com', 'alex123', 'qwe@123', '33Village green square', 'M1B1A3', '1993-10-02', '6475492785', 2, '2019-12-09 12:04:41');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaction_details`
--

CREATE TABLE `transaction_details` (
  `USER_ID` int(11) NOT NULL,
  `ACC_NO` varchar(30) NOT NULL,
  `AMOUNT` double(16,2) NOT NULL,
  `IS_DEBIT` int(11) NOT NULL,
  `IS_CREDIT` int(11) NOT NULL,
  `COMMENTS` varchar(40) NOT NULL,
  `TRANSACTION_TIME` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_clients`
--
ALTER TABLE `tbl_clients`
  ADD PRIMARY KEY (`CLIENT_USER_ID`);

--
-- Indexes for table `transaction_details`
--
ALTER TABLE `transaction_details`
  ADD PRIMARY KEY (`USER_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_clients`
--
ALTER TABLE `tbl_clients`
  MODIFY `CLIENT_USER_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
