-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2024 at 04:51 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `flashcards`
--

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `idcard` int(11) NOT NULL,
  `title` mediumtext NOT NULL,
  `paragraph` longtext NOT NULL,
  `T/F` int(11) DEFAULT NULL,
  `idsubgroup` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `card`
--

INSERT INTO `card` (`idcard`, `title`, `paragraph`, `T/F`, `idsubgroup`) VALUES
(1, 'foo', 'lorem ipsum lkasdjflsadj lfsjd lfčjasdčlfj lasdjflsdkjflsdjfl kdjfalksdjflas', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `grupa`
--

CREATE TABLE `grupa` (
  `idgroup` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `iduser` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `grupa`
--

INSERT INTO `grupa` (`idgroup`, `name`, `iduser`) VALUES
(1, 'Ostalo', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subgroup`
--

CREATE TABLE `subgroup` (
  `idsubgroup` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `boja` varchar(45) NOT NULL,
  `idgroup` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `subgroup`
--

INSERT INTO `subgroup` (`idsubgroup`, `name`, `boja`, `idgroup`) VALUES
(1, 'random', '#00000000', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `iduser` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(128) NOT NULL,
  `create_time` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`iduser`, `username`, `email`, `password`, `create_time`) VALUES
(1, 'Admin', 'mbedi@uniri.hr', '$2y$10$g5fdd0uGnBXT.NFyBiKHb.2TYfXV77jZbBRkvgUQ05pVCszJiFbc6', '2024-04-02 13:29:15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`idcard`),
  ADD KEY `fk_card_subgroup1` (`idsubgroup`);

--
-- Indexes for table `grupa`
--
ALTER TABLE `grupa`
  ADD PRIMARY KEY (`idgroup`),
  ADD KEY `fk_group_user` (`iduser`);

--
-- Indexes for table `subgroup`
--
ALTER TABLE `subgroup`
  ADD PRIMARY KEY (`idsubgroup`),
  ADD KEY `fk_subgroup_grupa` (`idgroup`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`iduser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `card`
--
ALTER TABLE `card`
  MODIFY `idcard` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `grupa`
--
ALTER TABLE `grupa`
  MODIFY `idgroup` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `subgroup`
--
ALTER TABLE `subgroup`
  MODIFY `idsubgroup` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `iduser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `fk_card_subgroup1` FOREIGN KEY (`idsubgroup`) REFERENCES `subgroup` (`idsubgroup`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `grupa`
--
ALTER TABLE `grupa`
  ADD CONSTRAINT `fk_group_user` FOREIGN KEY (`iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subgroup`
--
ALTER TABLE `subgroup`
  ADD CONSTRAINT `fk_subgroup_grupa` FOREIGN KEY (`idgroup`) REFERENCES `grupa` (`idgroup`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
