-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2021 at 05:40 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` varchar(50) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(50) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `tahun_terbit` int(50) NOT NULL,
  `penerbit` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `nama_buku`, `tahun_terbit`, `penerbit`) VALUES
(7001634, '26 Trik manipulasi objek dengan photoshop', 2007, 'Anderson'),
(7006103, '40 digital photo retouching techniques', 2005, 'YEM'),
(8008090, 'Absolute C++', 2008, 'Pearsin Education Prentice Hall'),
(8008188, 'Absolute java, Ed.3', 2008, 'Pearson / Longman'),
(9007693, 'Adobe illustrator CS3 untuk pemula', 2008, 'Andi & Elcom'),
(9011672, 'Adobe flash CS3 professional', 2008, 'Anderson'),
(9011674, 'Adobe flash CS3 professional', 2008, 'Anderson'),
(10017693, 'Administrasi database MySQL padaserver linux dan windows', 2005, 'Graha Ilmu'),
(11012934, '101 (Seratus satu) tips & trik registry editor untuk meningkatkan performa windows. Ed. 1', 2009, 'Gatra Pustaka'),
(13003339, '20 desain brosur kreatif coreldraw X5', 2011, 'Wadsworth Publ.'),
(18009724, '3D studi max 2010 dasar dan aplikasi', 2010, 'Andi'),
(19003996, 'Teknologi wireless communication dan wireless broadband', 2010, 'Andi'),
(19120807, '3D modeling profesional dengan autocad', 2016, 'Elex Media Komputindo'),
(19120809, '25 kreasi grafis populer dengan CorelDraw X6 : desain kartu nama, kartu ucapan, wallpaper, -shirt, p', 2012, 'Andi'),
(19120901, '4 (empat) pemrograman database dengan visual basic 2010 untuk orang awam', 2012, 'Maxikom');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_anggota` varchar(50) NOT NULL,
  `id_buku` varchar(50) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `tahun_terbit` varchar(50) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `tanggal_pinjam` varchar(100) NOT NULL,
  `tanggal_kembali` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_anggota`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
