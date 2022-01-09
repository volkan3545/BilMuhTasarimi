-- --------------------------------------------------------
-- Sunucu:                       127.0.0.1
-- Sunucu sürümü:                10.4.11-MariaDB - mariadb.org binary distribution
-- Sunucu İşletim Sistemi:       Win64
-- HeidiSQL Sürüm:               11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- arackiralama için veritabanı yapısı dökülüyor
CREATE DATABASE IF NOT EXISTS `arackiralama` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `arackiralama`;

-- tablo yapısı dökülüyor arackiralama.arac
CREATE TABLE IF NOT EXISTS `arac` (
  `resimID` int(11) NOT NULL AUTO_INCREMENT,
  `plaka` varchar(50) DEFAULT NULL,
  `marka` varchar(50) DEFAULT NULL,
  `seri` varchar(50) DEFAULT NULL,
  `yil` varchar(50) DEFAULT NULL,
  `renk` varchar(50) DEFAULT NULL,
  `km` varchar(50) DEFAULT NULL,
  `yakit` varchar(50) DEFAULT NULL,
  `kiraucreti` varchar(50) DEFAULT NULL,
  `durum` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`resimID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- arackiralama.arac: ~1 rows (yaklaşık) tablosu için veriler indiriliyor
DELETE FROM `arac`;
/*!40000 ALTER TABLE `arac` DISABLE KEYS */;
INSERT INTO `arac` (`resimID`, `plaka`, `marka`, `seri`, `yil`, `renk`, `km`, `yakit`, `kiraucreti`, `durum`) VALUES
	(1, '3132', 'peugeot', '556862', '2020', 'gri', '10', 'Dizel', '200', 'Musait');
/*!40000 ALTER TABLE `arac` ENABLE KEYS */;

-- tablo yapısı dökülüyor arackiralama.musteri
CREATE TABLE IF NOT EXISTS `musteri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `TC` varchar(50) DEFAULT NULL,
  `adsoyad` varchar(50) DEFAULT NULL,
  `adres` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefon` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- arackiralama.musteri: ~2 rows (yaklaşık) tablosu için veriler indiriliyor
DELETE FROM `musteri`;
/*!40000 ALTER TABLE `musteri` DISABLE KEYS */;
INSERT INTO `musteri` (`id`, `TC`, `adsoyad`, `adres`, `email`, `telefon`) VALUES
	(1, '41713130066', 'taha tan', 'elazig', 'tan@g.com', '5319220296');
/*!40000 ALTER TABLE `musteri` ENABLE KEYS */;

-- tablo yapısı dökülüyor arackiralama.resim
CREATE TABLE IF NOT EXISTS `resim` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- arackiralama.resim: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
DELETE FROM `resim`;
/*!40000 ALTER TABLE `resim` DISABLE KEYS */;
/*!40000 ALTER TABLE `resim` ENABLE KEYS */;

-- tablo yapısı dökülüyor arackiralama.sozlesme
CREATE TABLE IF NOT EXISTS `sozlesme` (
  `Plaka` varchar(50) DEFAULT NULL,
  `Marka` varchar(50) DEFAULT NULL,
  `Seri` varchar(50) DEFAULT NULL,
  `Yil` varchar(50) DEFAULT NULL,
  `Renk` varchar(50) DEFAULT NULL,
  `KiraUcreti` int(11) DEFAULT NULL,
  `Gun` int(11) DEFAULT NULL,
  `Tutar` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- arackiralama.sozlesme: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
DELETE FROM `sozlesme`;
/*!40000 ALTER TABLE `sozlesme` DISABLE KEYS */;
/*!40000 ALTER TABLE `sozlesme` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
