-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.20-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para estudocaso3si
DROP DATABASE IF EXISTS `estudocaso3si`;
CREATE DATABASE IF NOT EXISTS `estudocaso3si` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `estudocaso3si`;

-- Copiando estrutura para tabela estudocaso3si.cidade
DROP TABLE IF EXISTS `cidade`;
CREATE TABLE IF NOT EXISTS `cidade` (
  `codCidade` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL DEFAULT '',
  `UF` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`codCidade`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela estudocaso3si.cidade: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` (`codCidade`, `nome`, `UF`) VALUES
	(1, 'Machado', 'MG'),
	(2, 'Paraguaçu', 'MG'),
	(4, 'São Paulo', 'SP');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;

-- Copiando estrutura para tabela estudocaso3si.funcionario
DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `codFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `salario` double NOT NULL,
  `nascimento` date NOT NULL,
  `cidade_codCidade` int(11) NOT NULL,
  PRIMARY KEY (`codFuncionario`),
  KEY `FK_funcionario_cidade` (`cidade_codCidade`),
  CONSTRAINT `FK_funcionario_cidade` FOREIGN KEY (`cidade_codCidade`) REFERENCES `cidade` (`codCidade`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela estudocaso3si.funcionario: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`codFuncionario`, `nome`, `salario`, `nascimento`, `cidade_codCidade`) VALUES
	(1, 'Luiz Henrique', 3500, '1999-11-25', 4);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
