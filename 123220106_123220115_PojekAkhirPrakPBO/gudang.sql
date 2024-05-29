-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2024 at 08:57 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gudang`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin1', 'admin1');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `nama`, `jumlah`, `harga`, `tanggal`, `subtotal`) VALUES
(1, 'Triplek', 12, 10000, '2024-04-25', 120000),
(2, 'Kayu', 10, 45000, '2024-04-22', 450000),
(4, 'Lem', 20, 8000, '2024-04-07', 160000),
(5, 'Kaca', 19, 50000, '2024-04-21', 950000),
(8, 'Palu', 5, 45000, '2024-04-11', 225000);

-- --------------------------------------------------------

--
-- Table structure for table `minggu`
--

CREATE TABLE `minggu` (
  `id` int(11) NOT NULL,
  `awal` date NOT NULL,
  `akhir` date NOT NULL,
  `deskripsi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `minggu`
--

INSERT INTO `minggu` (`id`, `awal`, `akhir`, `deskripsi`) VALUES
(1, '2024-05-01', '2024-05-07', 'minggu1'),
(2, '2024-05-08', '2024-05-14', 'minggu2'),
(6, '2024-05-15', '2024-05-22', 'minggu3'),
(7, '1999-12-12', '1999-12-19', 'minggu4');

-- --------------------------------------------------------

--
-- Table structure for table `presensi`
--

CREATE TABLE `presensi` (
  `id` int(11) NOT NULL,
  `idTukang` int(11) NOT NULL,
  `idMinggu` int(11) NOT NULL,
  `sn` varchar(1) NOT NULL,
  `sl` varchar(1) NOT NULL,
  `rb` varchar(1) NOT NULL,
  `km` varchar(1) NOT NULL,
  `jm` varchar(1) NOT NULL,
  `sb` varchar(1) NOT NULL,
  `mg` varchar(1) NOT NULL,
  `subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `presensi`
--

INSERT INTO `presensi` (`id`, `idTukang`, `idMinggu`, `sn`, `sl`, `rb`, `km`, `jm`, `sb`, `mg`, `subtotal`) VALUES
(7, 1, 1, '✓', '✓', 'x', 'x', '✓', '✓', 'x', 2800),
(8, 1, 2, '✓', '✓', '✓', '✓', '✓', '✓', '✓', 4900),
(9, 3, 2, '✓', 'x', 'x', '✓', '✓', '✓', 'x', 2400),
(11, 3, 6, 'x', '✓', '✓', '✓', 'x', 'x', 'x', 1800),
(13, 8, 1, '✓', '✓', '✓', 'x', 'x', 'x', 'x', 27000000),
(14, 1, 7, '✓', '✓', '✓', '✓', '✓', 'x', 'x', 3500);

-- --------------------------------------------------------

--
-- Table structure for table `tukang`
--

CREATE TABLE `tukang` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `notelp` varchar(15) NOT NULL,
  `gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tukang`
--

INSERT INTO `tukang` (`id`, `nama`, `alamat`, `notelp`, `gaji`) VALUES
(1, 'Tsani', 'rumah', '0888888', 700000),
(3, 'Rafly', 'rumah', '0888887', 600),
(7, 'andi', 'aa', '00999', 200),
(8, 'Huan', 'Chinese', '879000', 9000000),
(10, 'aaa', 'aaa', '123', -123);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `minggu`
--
ALTER TABLE `minggu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `presensi`
--
ALTER TABLE `presensi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `PresensiTukang` (`idTukang`),
  ADD KEY `Minggu` (`idMinggu`);

--
-- Indexes for table `tukang`
--
ALTER TABLE `tukang`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `minggu`
--
ALTER TABLE `minggu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `presensi`
--
ALTER TABLE `presensi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tukang`
--
ALTER TABLE `tukang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `presensi`
--
ALTER TABLE `presensi`
  ADD CONSTRAINT `Minggu` FOREIGN KEY (`idMinggu`) REFERENCES `minggu` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `PresensiTukang` FOREIGN KEY (`idTukang`) REFERENCES `tukang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
