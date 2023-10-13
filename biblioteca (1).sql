-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 13-Out-2023 às 15:14
-- Versão do servidor: 8.0.31
-- versão do PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimo`
--

DROP TABLE IF EXISTS `emprestimo`;
CREATE TABLE IF NOT EXISTS `emprestimo` (
  `isbn` bigint NOT NULL,
  `cpf_leitor` char(11) NOT NULL,
  `dataEmpres` varchar(20) NOT NULL,
  `dataDevol` varchar(20) NOT NULL,
  `livroDevolvido` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `emprestimo`
--

INSERT INTO `emprestimo` (`isbn`, `cpf_leitor`, `dataEmpres`, `dataDevol`, `livroDevolvido`) VALUES
(12345678910, '14764081652', '18-10-2023', '07-11-2023', 'Sim'),
(97676436789, '23045061267', '15-08-2023', '05-10-2023', 'Nao'),
(99564743212, '54072045678', '17-07-2023', '20-12-2023', 'Sim');

-- --------------------------------------------------------

--
-- Estrutura da tabela `leitor`
--

DROP TABLE IF EXISTS `leitor`;
CREATE TABLE IF NOT EXISTS `leitor` (
  `cpf_leitor` char(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `celular` bigint NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  PRIMARY KEY (`cpf_leitor`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `leitor`
--

INSERT INTO `leitor` (`cpf_leitor`, `nome`, `email`, `senha`, `celular`, `cidade`, `estado`, `endereco`) VALUES
('12343056754', 'Kauan Rei Delas', 'kauankkkk@gmail.com', 'kauuuan', 9986540352, 'Caruaru', 'Pernambuco', 'Fodase'),
('54082632064', 'Vaguinho Pao com Ovo', 'vaguin123@hotmail.com', 'issoqueefoda', 99654321, 'Campo Belo', 'MG', 'Varginha 123'),
('54081663089', 'Random teste', 'randonzim@outlook.com', 'random345677', 99654890, 'São Paulo', 'SP', 'Rua Augusta 45'),
('23045061267', 'Leandro Tavares Silva', 'leandrinho567@gmail.com', 'l34ndr0', 99880023, 'Osasco', 'SP', 'Rua Adalberto Lopes, 56'),
('54072045678', 'Kauan Kawai Strxyer', 'gears5lixo@gmail.com', 'pqpppp', 52254355363, 'Caruaru', 'PE', 'Fdasee'),
('13215678090', 'Davy Jones Silva', 'davanoob@outlook.com', 'blzkkk', 9980764532, 'Uberlandia', 'MG', 'Rua Liberdade, Bairro Treze');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

DROP TABLE IF EXISTS `livro`;
CREATE TABLE IF NOT EXISTS `livro` (
  `isbn` bigint NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `editora` varchar(100) NOT NULL,
  `preco` decimal(5,2) NOT NULL,
  `edicao` varchar(30) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`isbn`, `titulo`, `editora`, `preco`, `edicao`, `genero`, `autor`) VALUES
(12345678910, 'Harry Potter', 'Vozes', '25.50', 'Primeira', 'Fantasia', 'JK Rowling'),
(97676436789, 'A Republica', 'Companhia das Letras', '50.00', 'Generica', 'Filosofia', 'Platão'),
(99564743212, 'Percy Jackson', 'Companhia das Letras', '19.30', 'Primeira', 'Fantasia/Romance', 'Sei la fodase'),
(99856432312, 'A Culpa é Das Estrelas', 'Caminhos', '30.20', '2012', 'Romance/Drama', 'Paullins Robertson'),
(98754356789, 'Piratas do Caribe', 'Vozes', '40.20', 'Primeira', 'Aventura', 'Simons Bnedet');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
