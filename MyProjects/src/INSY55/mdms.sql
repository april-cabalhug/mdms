-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2022 at 10:03 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mdms`
--

-- --------------------------------------------------------

--
-- Table structure for table `drecord`
--

CREATE TABLE `drecord` (
  `stud_no` int(11) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(10) DEFAULT NULL,
  `gsec` varchar(50) NOT NULL,
  `adviser` varchar(50) NOT NULL,
  `quarter` varchar(50) NOT NULL,
  `handout` varchar(500) NOT NULL,
  `cname` varchar(500) NOT NULL,
  `crel` varchar(500) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drecord`
--

INSERT INTO `drecord` (`stud_no`, `lname`, `fname`, `mname`, `gsec`, `adviser`, `quarter`, `handout`, `cname`, `crel`, `date`) VALUES
(1, 'BIEBER', 'JUSTIN DREW', 'M', 'GRADE6-PERIDOT', 'MS. GOMEZ', 'THIRD', 'MODULES BOOKS ', 'JEREMY BIEBER', 'FATHER', '2021-12-28'),
(2, 'TORRECELLI', 'MASSIMO', '', 'GRADE1-RUBY', 'MS. BIEL', 'SECOND', 'MODULES BOOKS ', 'BLANKA LIPINSKA', 'AUNTIE', '2021-12-28'),
(3, 'BIEL', 'LAURA', 'E', 'ALS-EMERALD', 'MR. MORRONE', 'THIRD', 'MODULES WHLP BOOKS ', 'MAURA BIEL', 'MOTHER', '2021-12-28'),
(4, 'SCOTT', 'HARDIN', ' ', 'GRADE1-TOPAZ', 'MS. YOUNG', 'FOURTH', 'MODULES ', 'TRAVIS SCOTT', 'BROTHER', '2021-12-28'),
(5, 'YOUNG', 'TESSA', 'S', 'GRADE4-ONYX', 'MR. GREY', 'THIRD', 'MODULES WHLP ', 'MEGAN YOUNG', 'SISTER', '2021-12-29'),
(6, 'SANFORD', 'CROSS', 'S', 'GRADE3-RUBY', 'MS. RODRIGUEZ', 'THIRD', 'BOOKS ', 'CHRIS SANFORD', 'FATHER', '2021-12-31'),
(7, 'PARKER', 'PETER', 'S', 'GRADE2-PEARL', 'MS. LANE', 'FOURTH', 'MODULES BOOKS ', 'SANDARA PARKER', 'MOTHER', '2022-01-13');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `admin_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`admin_id`, `username`, `password`) VALUES
(1, 'admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `mlist`
--

CREATE TABLE `mlist` (
  `mstud_no` int(11) NOT NULL,
  `lrn` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(10) DEFAULT NULL,
  `gsec` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mlist`
--

INSERT INTO `mlist` (`mstud_no`, `lrn`, `lname`, `fname`, `mname`, `gsec`) VALUES
(1, '202011670', 'CYRUS', 'MILEY', '', 'GRADE1-RUBY'),
(2, '202011671', 'SCHNITTCKA', 'MARA HAUTEA', 'M', 'GRADE1-DIAMOND'),
(3, '202010580', 'LAUTNER', 'LAUTNER', ' ', 'GRADE4-PEARL'),
(4, '202110672', 'SMITH', 'ANNE', 'C', 'GRADE3-RUBY');

-- --------------------------------------------------------

--
-- Table structure for table `plist`
--

CREATE TABLE `plist` (
  `pstud_no` int(11) NOT NULL,
  `lrn` varchar(500) NOT NULL,
  `lname` varchar(500) NOT NULL,
  `fname` varchar(500) NOT NULL,
  `mname` varchar(50) DEFAULT NULL,
  `gsec` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `plist`
--

INSERT INTO `plist` (`pstud_no`, `lrn`, `lname`, `fname`, `mname`, `gsec`) VALUES
(1, '202110101', 'SOBERANO', 'HOPE ELIZABETH', 'H', 'GRADE4-RUBY'),
(2, '202111102', 'GIL', 'ENRIQUE', ' ', 'GRADE6-PERIDOT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `drecord`
--
ALTER TABLE `drecord`
  ADD PRIMARY KEY (`stud_no`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `mlist`
--
ALTER TABLE `mlist`
  ADD PRIMARY KEY (`mstud_no`) USING BTREE;

--
-- Indexes for table `plist`
--
ALTER TABLE `plist`
  ADD PRIMARY KEY (`pstud_no`,`lrn`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `drecord`
--
ALTER TABLE `drecord`
  MODIFY `stud_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `mlist`
--
ALTER TABLE `mlist`
  MODIFY `mstud_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `plist`
--
ALTER TABLE `plist`
  MODIFY `pstud_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
