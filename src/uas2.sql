-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jul 2020 pada 13.13
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barangterjual`
--

CREATE TABLE `barangterjual` (
  `no_faktur` varchar(20) NOT NULL,
  `kode_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `harga` int(20) NOT NULL,
  `qty` int(20) NOT NULL,
  `total1` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barangterjual`
--

INSERT INTO `barangterjual` (`no_faktur`, `kode_barang`, `nama_barang`, `harga`, `qty`, `total1`) VALUES
('F0002', 'A016', 'BIBIT LIDAH BUAYA', 15000, 2, 30000),
('F0003', 'A002', 'POT BIRU', 100000, 10, 1000000),
('F0004', 'A004', 'POT PUTIH', 150000, 1, 150000),
('F0005', 'A015', 'BIBIT JERUK NIPIS', 20000, 4, 80000),
('F0006', 'A022', 'MEDIA TANAM', 25000, 4, 100000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `masterbarang`
--

CREATE TABLE `masterbarang` (
  `kode_barang` varchar(30) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `stok` int(10) NOT NULL,
  `harga` int(10) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `masterbarang`
--

INSERT INTO `masterbarang` (`kode_barang`, `nama_barang`, `stok`, `harga`, `keterangan`) VALUES
('A0001', 'POT HITAM', 90, 100000, 'UKURAN 50LT'),
('A0010', 'POT COKLAT', 50, 65000, 'UKURAN 30LT'),
('A002', 'POT BIRU', 10, 100000, 'UKURAN 50LT'),
('A003', 'POT GANTUNG', 15, 45000, 'UKURAN 20LT'),
('A004', 'POT PUTIH', 4, 150000, 'UKURAN 100LT'),
('A005', 'PENYIRAM TANAMAN', 9, 30000, 'UKURAN 5LT'),
('A006', 'SET ALAT BERKEBUN', 7, 55000, '--'),
('A007', 'PENGUKUR pH TANAH', 10, 75000, '--'),
('A008', 'BENIH DAUN BAWANG', 100, 12000, 'ISI 10/BUNGKUS'),
('A009', 'BENIH TOMAT', 70, 12000, 'ISI 5/BUNGKUS'),
('A011', 'BENIH KANGKUNG', 200, 10000, 'ISI 20/BUNGKUS'),
('A012', 'BENIH BAWANG MERAH', 100, 12000, 'ISI 10/BUNGKUS'),
('A013', 'BENIH CABAI', 30, 15000, 'ISI 5/BUNGKUS'),
('A014', 'BIBIT DAUN PANDAN', 10, 20000, '--'),
('A015', 'BIBIT JERUK NIPIS', 16, 20000, '--'),
('A016', 'BIBIT LIDAH BUAYA', 11, 15000, '--'),
('A017', 'BIBIT LIDAH MERTUA', 5, 10000, '--'),
('A018', 'PUPUK KNO3 MERAH', 5, 47500, 'NETTO 2KG'),
('A019', 'PUPUK KNO3 PUTIH', 8, 52500, 'NETTO 2KG'),
('A020', 'PUPUK HIDROPONIK', 5, 19000, 'UNTUK SAYURAN, NETTO 250GR'),
('A021', 'PUPUK HIDROPONIK CABAI', 8, 19000, 'KHUSUS CABAI, NETTO 250GR'),
('A022', 'MEDIA TANAM', 8, 25000, 'NETTO 15KG'),
('A023', 'TANAH LEMBANG', 7, 21000, 'NETTO 17KG');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `nomor` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `nomor`) VALUES
('P0001', 'LISA', 'BANDUNG', '083546289432'),
('P0002', 'JUN', 'BEKASI', '081234327654'),
('P0003', 'AHMAD', 'JAKARTA', '086496465687'),
('P0004', 'TIRA', 'BANDUNG', '081567987054'),
('P0005', 'AZKI', 'BANDUNG', '089765401235'),
('P0006', 'DESI', 'KAB. BANDUNG', '087689651209'),
('P0007', 'RUDI', 'TANGGERANG', '089765301234'),
('P0008', 'RINA', 'BANDUNG', '087584901234'),
('P0009', 'PUTRI', 'BANDUNG', '087462297312');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `no_faktur` varchar(10) NOT NULL,
  `kasir` varchar(30) NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(50) DEFAULT NULL,
  `diskon` int(10) NOT NULL,
  `total` int(10) NOT NULL,
  `bayar` int(10) NOT NULL,
  `kembali` int(10) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`no_faktur`, `kasir`, `id_pelanggan`, `nama_pelanggan`, `diskon`, `total`, `bayar`, `kembali`, `tanggal`) VALUES
('F0002', 'MERI NURHALIMAH', 'P0004', 'TIRA', 0, 30000, 50000, 20000, '2020-07-15'),
('F0003', 'USER', 'P0005', 'AZKI', 0, 1000000, 1000000, 0, '2020-07-15'),
('F0004', 'ALYA RAHMAWATI PUTRI', 'P0001', 'UMUM', 0, 150000, 150000, 0, '2020-07-15'),
('F0005', 'GITA ERIKA SUCI', 'P0006', 'DESI', 0, 80000, 100000, 20000, '2020-07-15'),
('F0006', 'MERI NURHALIMAH', 'P0009', 'PUTRI', 0, 100000, 100000, 0, '2020-07-15');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(5) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `nohp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `nama`, `nohp`) VALUES
(1, 'admin1', 'admin1', 'MERI NURHALIMAH', '089642637213'),
(2, 'admin2', 'admin2', 'ALYA RAHMAWATI PUTRI', '085486265912'),
(3, 'admin3', 'admin3', 'GITA ERIKA SUCI', '082345123465'),
(4, 'admin4', 'admin4', 'ERIKA', '098067512548');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barangterjual`
--
ALTER TABLE `barangterjual`
  ADD KEY `no_faktur` (`no_faktur`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indeks untuk tabel `masterbarang`
--
ALTER TABLE `masterbarang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`no_faktur`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
