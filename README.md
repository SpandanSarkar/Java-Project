# Java-Project
Tution management system with java swing and MySQL.


MySQL database is given below:


-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Aug 06, 2019 at 09:59 AM
-- Server version: 5.7.25
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE `post` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `uname` varchar(40) NOT NULL,
  `subject` varchar(30) NOT NULL,
  `area` varchar(40) NOT NULL,
  `salary` varchar(40) NOT NULL,
  `class` varchar(20) NOT NULL,
  `days` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `subject2` varchar(30) NOT NULL,
  `subject3` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `name`, `uname`, `subject`, `area`, `salary`, `class`, `days`, `gender`, `contact`, `subject2`, `subject3`) VALUES
(4, 'kk', 'kk', 'English', 'Banani', '4000-6000', '10', '5', 'Female', '000009', 'Math', 'Biology'),
(5, 'r', 'r', 'Math', 'Mirpur', '6000-10000', 'Inter', '5', 'Male', '', 'Chemistry', 'Physics'),
(6, 'x', 'x', 'Math', 'Dhanmondi', 'Bellow 2000', '1', '3', 'Male', '22223', 'No', 'No'),
(7, 'r', 'r', 'Math', 'Dhanmondi', '10000+', 'Inter', '3', 'Female', '0191919', 'English', 'Physics'),
(9, 'uuu', 'uuu', 'Math', 'Dhanmondi', 'Bellow 2000', '1', '3', 'Male', '1223', 'No', 'No'),
(12, 'b', 'b', 'Marketing', 'Banani', 'Negotiable', '10', '3', 'Male', '0001', 'Bangla', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `Remember_Pass`
--

CREATE TABLE `Remember_Pass` (
  `Serial` int(10) NOT NULL,
  `uname` varchar(500) NOT NULL,
  `pass` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Remember_Pass`
--

INSERT INTO `Remember_Pass` (`Serial`, `uname`, `pass`) VALUES
(1, 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(2, 'er', 'SxiAiCvkt/TToWD8s/qlQA=='),
(3, 't', '0iQq3FsK2vvuGWnMl1fv8g=='),
(4, 'i', 'ghKKSr/ci8UQYzxBPAvoIQ=='),
(5, 'x', 'VX2uyEe4d829SbnHHGCNIg=='),
(7, 'e', 'HGYHmXHIrSu7AEgdsyUwIQ=='),
(9, 'e', 'HGYHmXHIrSu7AEgdsyUwIQ=='),
(10, 'r', 'OMb1oNZgd2H0Y4hUm6/vLw=='),
(11, 'r', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(12, 'r', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(13, 'd', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(14, 'r', 'ePYKPo64xzY/Am6z1YO3gQ=='),
(15, 'r', 'RGcKiWDPcb7Giyfymr6FSA=='),
(16, 'r', 'wGvX5yQu9CxQqRLQH1UWGA=='),
(17, 'r', 'H/HQoOjft8bTY8FjNML4FQ=='),
(18, 'spandansarkar71@gmail.com', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(19, 'spandansarkar71@gmail.com', '3h9kIkp2Ig0RqbQfNude+g=='),
(20, 'spandansarkar71@gmail.com', 'nFzWMD3hDd0CwfH3xKf19Q=='),
(21, 'uuu', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(22, 'uuuu', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(23, 'likhonsarkar00@gmail.com', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(24, 't', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(25, 'o', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(26, 'y', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(27, 'b', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(28, 'sunandabiswas71@gmail.com', 'g0O1GpxJeVLRs5tvC5IB8g==');

-- --------------------------------------------------------

--
-- Table structure for table `student profile`
--

CREATE TABLE `student profile` (
  `Serial` int(50) NOT NULL,
  `Fname` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `Uname` varchar(500) NOT NULL,
  `Pass` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student profile`
--

INSERT INTO `student profile` (`Serial`, `Fname`, `Lname`, `Uname`, `Pass`) VALUES
(8, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(9, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(10, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(11, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(12, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(13, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(14, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(15, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(16, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(17, 'ccc', 'ccc', 'ccc', 'iQ56/SnkaG885x4ajKL8zg=='),
(18, 'tt', 'tt', 't', 'Pvbcd0H9dmLp1ddb/OHxPw=='),
(19, 'ii', 'ii', 'i', 'otixZlv6LfgeeTTAn9sLTQ=='),
(20, 'x', 'x', 'x', 'VX2uyEe4d829SbnHHGCNIg=='),
(21, 'r', 'r', 'r', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(22, 'Spandan', 'Sarkar', 'spandansarkar71@gmail.com', 'nFzWMD3hDd0CwfH3xKf19Q=='),
(23, 'uuu', 'uuu', 'uuuu', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(24, 't', 't', 'oo', 'g0O1GpxJeVLRs5tvC5IB8g=='),
(25, 'b', 'b', 'b', 'g0O1GpxJeVLRs5tvC5IB8g==');

-- --------------------------------------------------------

--
-- Table structure for table `tutor profile`
--

CREATE TABLE `tutor profile` (
  `Serial` int(6) NOT NULL,
  `Fname` varchar(20) NOT NULL,
  `Lname` varchar(20) NOT NULL,
  `Uname` varchar(500) NOT NULL,
  `Pass` varchar(500) NOT NULL,
  `Address` text NOT NULL,
  `Institution` text NOT NULL,
  `InShort` varchar(10) NOT NULL,
  `Qualification` text NOT NULL,
  `Offererd Courses` text NOT NULL,
  `Fees` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tutor profile`
--

INSERT INTO `tutor profile` (`Serial`, `Fname`, `Lname`, `Uname`, `Pass`, `Address`, `Institution`, `InShort`, `Qualification`, `Offererd Courses`, `Fees`) VALUES
(8, 'er', 'e', 'e', 'v443W6n4P4in8Kr8WfwND3j0zpUNDFyuvx1QMLFiRkI=', 'e', 'e', 'e', 'e', 'e', 4),
(9, 'er', 'er', 'er', 'oFZbTShsEAEdz4FWUUtJYwQk7cgtlSY3gT1D2iko6Co+1YVeGmk6Lc3ZMiBTMHjP4NzjPV8nbkgIwo3X6v6m2tMxpE7dN2Q3QCSzEPYbGTE=', 'er', 'er', 'er', 'er', 'er', 22),
(10, 'd', 'd', 'd', 'g0O1GpxJeVLRs5tvC5IB8g==', 'd', 'd', 'd', 'd', 'd', 444),
(11, 'likhon', 'sarkar', 'likhonsarkar00@gmail.com', 'g0O1GpxJeVLRs5tvC5IB8g==', 'dhaka', 'BRAC University', 'bracu', 'BSc', 'cse', 10000),
(12, 'y', 'y', 'yy', 'g0O1GpxJeVLRs5tvC5IB8g==', 'y', 'y', 'y', 'y', 'y', 5000),
(13, 'sunanda', 'biswas', 'sunandabiswas71@gmail.com', 'g0O1GpxJeVLRs5tvC5IB8g==', 'dhaka', 'bracu', 'bracu', 'BSc', 'CSE', 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Remember_Pass`
--
ALTER TABLE `Remember_Pass`
  ADD PRIMARY KEY (`Serial`);

--
-- Indexes for table `student profile`
--
ALTER TABLE `student profile`
  ADD PRIMARY KEY (`Serial`);

--
-- Indexes for table `tutor profile`
--
ALTER TABLE `tutor profile`
  ADD PRIMARY KEY (`Serial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `post`
--
ALTER TABLE `post`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `Remember_Pass`
--
ALTER TABLE `Remember_Pass`
  MODIFY `Serial` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `student profile`
--
ALTER TABLE `student profile`
  MODIFY `Serial` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tutor profile`
--
ALTER TABLE `tutor profile`
  MODIFY `Serial` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;







In java library add jconnector and rs2xml (for table) jar file.
