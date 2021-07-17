-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 17, 2021 at 04:18 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_ppbo_kelompok1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_tata_usaha`
--

CREATE TABLE `admin_tata_usaha` (
  `id_admin` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_tata_usaha`
--

INSERT INTO `admin_tata_usaha` (`id_admin`, `nama`, `password`) VALUES
('ADM001', 'Farah', 'farah'),
('ADM002', 'Boby', 'boby');

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `nip` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `kelas` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`nip`, `nama`, `password`, `kelas`) VALUES
('20001', 'Yenni', 'yenni', '1A'),
('20002', 'Rivaldo', 'rivaldo', '1B'),
('20003', 'Zaidarus', 'zaidarus', '2A'),
('20004', 'Rika', 'rika', '2B'),
('20005', 'Sebastian', 'sebastian', '3A'),
('20006', 'Idris', 'idris', '3B'),
('20007', 'Tia', 'tia', '4A'),
('20008', 'Rezka', 'rezka', '4B'),
('20009', 'Mei', 'mei', '5A'),
('20010', 'Titin', 'titin', '5B'),
('20011', 'Suzy', 'suzy', '6A'),
('20012', 'Victor', 'victor', '6B');

-- --------------------------------------------------------

--
-- Table structure for table `laporan_nilai`
--

CREATE TABLE `laporan_nilai` (
  `id_nilai` varchar(15) NOT NULL,
  `nisn` varchar(15) NOT NULL,
  `agama` decimal(3,2) NOT NULL,
  `pkn` decimal(3,2) NOT NULL,
  `b_indo` decimal(3,2) NOT NULL,
  `mtk` decimal(3,2) NOT NULL,
  `ipa` decimal(3,2) NOT NULL,
  `ips` decimal(3,2) NOT NULL,
  `b_ing` decimal(3,2) NOT NULL,
  `senbud` decimal(3,2) NOT NULL,
  `pjok` decimal(3,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `presensi_siswa`
--

CREATE TABLE `presensi_siswa` (
  `id_presensi` varchar(15) NOT NULL,
  `nisn` varchar(15) NOT NULL,
  `sakit` int(5) NOT NULL,
  `izin` int(5) NOT NULL,
  `alfa` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nisn` varchar(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `ttl` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `agama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kelas` varchar(3) NOT NULL,
  `semester` enum('1','2') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nisn`, `nama`, `ttl`, `jenis_kelamin`, `agama`, `alamat`, `kelas`, `semester`) VALUES
('21001', 'Niko Wijaya', 'Perawang, 14 Juni 2014', 'Laki-laki', 'Buddha', 'Jl. Singkong No. 1', '1A', '2'),
('21002', 'Sonia Putri', 'Pekanbaru, 28 Februari 2014', 'Perempuan', 'Islam', 'Jl. Petai No. 10', '1A', '2'),
('21003', 'Septian Rizqa', 'Pelalawan, 04 September 2014', 'Laki-laki', 'Islam', 'Jl. Tegal Sari No. 56', '1A', '2'),
('21004', 'Sarah Ayu', 'Duri, 10 Oktober 2014', 'Perempuan', 'Islam', 'Jl. Harapan No.77', '1B', '2'),
('21005', 'Hendra Putra', 'Begawan Solo, 23 April 2014', 'Laki-laki', 'Kristen', 'Jl. Singaraja Gg. Burik', '1B', '2'),
('21006', 'Vincent Rianto', 'Pekanbaru, 11 Juni 2014', 'Laki-laki', 'Hindu', 'Jl. Riau Gg. Damai', '1B', '2'),
('21007', 'Adinda Nola', 'Kampar, 15 September 2013', 'Perempuan', 'Kristen', 'Jl. Matahari No. 91', '2A', '2'),
('21008', 'Aditya Jati', 'Rumbai, 03 September 2013', 'Laki-laki', 'Islam', 'Jl. Sekolah Gg. Kecik', '2A', '2'),
('21009', 'Alrisya Putri', 'Pekanbaru, 17 Desember 2013', 'Perempuan', 'Islam', 'Jl. Riau Besar', '2A', '2'),
('21010', 'Amatullah Shafiyyah', 'Siak, 11 Januari 2013', 'Perempuan', 'Islam', 'Jl. Suci No. 45', '2B', '2'),
('21011', 'Ardi Septiyan', 'Rokan Hilir, 07 Mei 2013', 'Laki-laki', 'Islam', 'Jl. Berdikari No. 11', '2B', '2'),
('21012', 'Chaellia Cinta', 'Tanjung Pinang, 09 November 2013', 'Perempuan', 'Islam', 'Jl. Pelita Gg. Harapan', '2B', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_tata_usaha`
--
ALTER TABLE `admin_tata_usaha`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `laporan_nilai`
--
ALTER TABLE `laporan_nilai`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `nisn_ln` (`nisn`);

--
-- Indexes for table `presensi_siswa`
--
ALTER TABLE `presensi_siswa`
  ADD PRIMARY KEY (`id_presensi`),
  ADD KEY `nisn_ps` (`nisn`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `laporan_nilai`
--
ALTER TABLE `laporan_nilai`
  ADD CONSTRAINT `nisn_ln` FOREIGN KEY (`nisn`) REFERENCES `siswa` (`nisn`);

--
-- Constraints for table `presensi_siswa`
--
ALTER TABLE `presensi_siswa`
  ADD CONSTRAINT `nisn_ps` FOREIGN KEY (`nisn`) REFERENCES `siswa` (`nisn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
