-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Jul 2021 pada 17.36
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Struktur dari tabel `admin_tata_usaha`
--

CREATE TABLE `admin_tata_usaha` (
  `id_admin` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin_tata_usaha`
--

INSERT INTO `admin_tata_usaha` (`id_admin`, `nama`, `password`) VALUES
('ADM001', 'Farah', 'farah'),
('ADM002', 'Boby', 'boby');

-- --------------------------------------------------------

--
-- Struktur dari tabel `guru`
--

CREATE TABLE `guru` (
  `nip` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `kelas` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `guru`
--

INSERT INTO `guru` (`nip`, `nama`, `password`, `kelas`) VALUES
('20001', 'Yenni', 'yenni', '1A'),
('20002', 'Rivaldo Putra', 'rivaldo', '1B'),
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
-- Struktur dari tabel `laporan_nilai`
--

CREATE TABLE `laporan_nilai` (
  `id_nilai` varchar(15) NOT NULL,
  `nisn` varchar(15) NOT NULL,
  `agama` decimal(4,2) NOT NULL,
  `pkn` decimal(4,2) NOT NULL,
  `b_indo` decimal(4,2) NOT NULL,
  `mtk` decimal(4,2) NOT NULL,
  `ipa` decimal(4,2) NOT NULL,
  `ips` decimal(4,2) NOT NULL,
  `b_ing` decimal(4,2) NOT NULL,
  `senbud` decimal(4,2) NOT NULL,
  `pjok` decimal(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `laporan_nilai`
--

INSERT INTO `laporan_nilai` (`id_nilai`, `nisn`, `agama`, `pkn`, `b_indo`, `mtk`, `ipa`, `ips`, `b_ing`, `senbud`, `pjok`) VALUES
('N-21001', '21001', '78.00', '78.00', '91.00', '80.00', '66.00', '81.00', '72.00', '93.00', '83.00'),
('N_21002', '21002', '90.00', '85.00', '74.00', '92.00', '91.00', '87.00', '73.00', '94.00', '80.00'),
('N_21004', '21004', '86.00', '79.00', '90.00', '84.00', '90.00', '98.00', '79.00', '65.00', '83.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `presensi_siswa`
--

CREATE TABLE `presensi_siswa` (
  `id_presensi` varchar(15) NOT NULL,
  `nisn` varchar(15) NOT NULL,
  `sakit` int(5) NOT NULL,
  `izin` int(5) NOT NULL,
  `alfa` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `presensi_siswa`
--

INSERT INTO `presensi_siswa` (`id_presensi`, `nisn`, `sakit`, `izin`, `alfa`) VALUES
('P_21002', '21002', 1, 2, 0),
('P_21005', '21005', 1, 2, 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
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
-- Dumping data untuk tabel `siswa`
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
('21012', 'Chaellia Cinta', 'Tanjung Pinang, 09 November 2013', 'Perempuan', 'Islam', 'Jl. Pelita Gg. Harapan', '2B', '2'),
('21013', 'Dandy Islami', 'Kampung Bonjol, 14 Mei 2012', 'Laki-laki', 'Islam', 'JL.Tambusai', '3A', '2'),
('21014', 'Daffa Naufal', 'Pekanbaru, 4 Januari 2012', 'Laki-laki', 'Hindu', 'JL. Sekolah', '3A', '2'),
('21015', 'Fadil Army', 'Rengat, 11 Desember 2012', 'Laki-laki', 'Konghuchu', 'Jl. Rengan Api', '3A', '2'),
('21016', 'Fizhil Meutia', 'Rumbai, 17 Oktober 2012', 'Perempuan', 'Hindu', 'Jl. Berdikari', '3B', '2'),
('21017', 'Ardianto Hikmatia', 'Jakarta, 16 November 2012', 'Laki-laki', 'Islam', 'Jl. Besar Gg. Kecil', '3B', '2'),
('21018', 'Hidayatul Maukmin', 'Rokan Hilir, 29 Mei 2012', 'Laki-laki', 'Katolik', 'Jl. Hasibuan', '3B', '2'),
('21019', 'Khairul Piki', 'Rengat, 29 Februari 2011', 'Laki-laki', 'Kristen', 'Jl. Gatale', '4A', '2'),
('21020', 'Fadhilla Farah', 'Rumbai, 20 Agustus 2011', 'Perempuan', 'Islam', 'Jl. Merpati', '4A', '2'),
('21021', 'Irsandi Ridho', 'Pekambaru, 13 Maret 2011', 'Laki-laki', 'Buddha', 'Jl. Harapan Bakti', '4A', '2'),
('21022', 'Toni Renaldo', 'Duri, 7 September 2011', 'Laki-laki', 'Hindu', 'Jl. Durian No. 19', '4B', '2'),
('21023', 'Nuagi Rean', 'Dumai, 23 April 2011', 'Laki-laki', 'Buddha', 'Jl Seblak Sari No 56', '4B', '2'),
('21024', 'Fanny', 'Duri, 19 November 2011', 'Perempuan', 'Konghuchu', 'Jl. Inaya', '4B', '2'),
('21025', 'Rezky Epen', 'Dumai, 5 Mei 2010', 'Laki-laki', 'Islam', 'Jl. Serayawan', '5A', '2'),
('21026', 'Lady Nola', 'Solo, 26 Oktober 2010', 'Perempuan', 'Katolik', 'Jl. Begawan Solo', '5A', '2'),
('21027', 'Cici Holanda', 'Perawang, 14 September 2010', 'Perempuan', 'Hindu', 'Jl. Rayawan', '5A', '2'),
('21028', 'Samganto', 'Bukittinggi, 26 Agustus 2010', 'Laki-laki', 'Katolik', 'Jl. Suraya Mega', '5B', '2'),
('21029', 'Sholawati', 'Perawang, 15 Februari 2010', 'Perempuan', 'Kristen', 'Jl. Pilipala', '5B', '2'),
('21030', 'Markus Perganda', 'Perawang 1 Juni 2010', 'Laki-laki', 'Kristen', 'Jl. Sedangganta', '5B', '2'),
('21031', 'Santo Butique', 'Penangan,  23 Juli 2009', 'Laki-laki', 'Konghuchu', 'Jl. Indah Kiat', '6A', '2'),
('21032', 'Salsabila Winner', 'Rokan Hulu, 9 Juli 2009', 'Perempuan', 'Islam', 'Jl. Riau', '6A', '2'),
('21033', 'Nadia Septian', 'Bagansiapiapi, 6 April 2009', 'Perempuan', 'Katolik', 'Jl. Pasir Putih', '6A', '2'),
('21034', 'Barbara Husein', 'Semarang, 19 Juni 2009', 'Perempuan', 'Islam', 'Jl. Telaga Sari', '6B', '2'),
('21035', 'Wedrinaldo', 'Siak Kota, 17 Agustus 2009', 'Laki-laki', 'Buddha', 'Jl. Samsung Km. 10', '6B', '2'),
('21036', 'Zafirah Aulolo', 'Pelalawan, 4 Januari 2009', 'Perempuan', 'Islam', 'Jl. Perkasari', '6B', '2');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin_tata_usaha`
--
ALTER TABLE `admin_tata_usaha`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`nip`);

--
-- Indeks untuk tabel `laporan_nilai`
--
ALTER TABLE `laporan_nilai`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `nisn_ln` (`nisn`);

--
-- Indeks untuk tabel `presensi_siswa`
--
ALTER TABLE `presensi_siswa`
  ADD PRIMARY KEY (`id_presensi`),
  ADD KEY `nisn_ps` (`nisn`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `laporan_nilai`
--
ALTER TABLE `laporan_nilai`
  ADD CONSTRAINT `nisn_ln` FOREIGN KEY (`nisn`) REFERENCES `siswa` (`nisn`);

--
-- Ketidakleluasaan untuk tabel `presensi_siswa`
--
ALTER TABLE `presensi_siswa`
  ADD CONSTRAINT `nisn_ps` FOREIGN KEY (`nisn`) REFERENCES `siswa` (`nisn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
