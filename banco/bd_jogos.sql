-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Nov-2022 às 03:04
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_jogos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nome` varchar(32) NOT NULL,
  `usuario` varchar(14) NOT NULL,
  `senha` bigint(8) NOT NULL,
  `telefone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `admin`
--

INSERT INTO `admin` (`id_admin`, `nome`, `usuario`, `senha`, `telefone`) VALUES
(1, 'Umberto', '@umbumb', 123654, '+11 98751-2365'),
(2, 'Eurico', '@ricoeu', 123456, '+11 56872-1230');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(32) NOT NULL,
  `usuario` varchar(14) NOT NULL,
  `senha` bigint(8) NOT NULL,
  `endereco` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `cnpj` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `usuario`, `senha`, `endereco`, `telefone`, `cnpj`) VALUES
(1, 'Julião\' Games Center', 'juliosn', 123789, 'Rua Santa, 51', '+11 96446-2480', '15.610.918/5909-16'),
(2, 'Maria\'s Games', 'dudawerlang', 152678, 'Rua Amor, 15', '+11 94856-2187', '56.089.098/4894-09'),
(3, 'Lorena e Daniel Jogos', 'Ldgames', 171322, 'Rua Maria Nida Bordi', '+19 26760-5850', '37.907.966/0001-17'),
(4, 'Liz e Cristiane Playing', 'Crislianeplay', 256652, 'Rua Flávio Iazzetti,', '+11 99714-1584', '64.532.804/0001-14'),
(5, 'Analu e Samuel Games', 'Analueljg', 789, 'Rua Aléssio Zomignan', '+11 98812-0667', '29.116.802/0001-43'),
(6, 'Heloise e Alana Advanced Plays', 'helanaadvpl', 325, 'Avenida Cumbica, 610', '+11 99765-3707', '73.480.101/0001-80');

-- --------------------------------------------------------

--
-- Estrutura da tabela `comprar`
--

CREATE TABLE `comprar` (
  `id_comprar` int(11) NOT NULL,
  `ocd_cliente` int(11) NOT NULL,
  `cod_jogos` int(11) NOT NULL,
  `data_compra` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `comprar`
--

INSERT INTO `comprar` (`id_comprar`, `ocd_cliente`, `cod_jogos`, `data_compra`) VALUES
(1, 1, 1, '2022-11-09'),
(2, 2, 2, '2019-11-08'),
(3, 4, 10, '2018-11-17'),
(4, 5, 7, '2019-05-20'),
(5, 4, 13, '2021-11-11'),
(6, 2, 10, '2015-05-25'),
(7, 4, 1, '2011-07-05'),
(8, 2, 4, '2022-01-17'),
(9, 6, 5, '2022-06-18'),
(10, 1, 9, '2020-10-20');

-- --------------------------------------------------------

--
-- Estrutura da tabela `constituir`
--

CREATE TABLE `constituir` (
  `id_constituir` int(11) NOT NULL,
  `ocd-venda` int(11) NOT NULL,
  `cod-jogos` int(11) NOT NULL,
  `tipo_pagamento` enum('Crédito','Débito','PIX') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `constituir`
--

INSERT INTO `constituir` (`id_constituir`, `ocd-venda`, `cod-jogos`, `tipo_pagamento`) VALUES
(1, 4, 13, 'Débito'),
(2, 2, 2, 'Débito'),
(3, 5, 13, 'PIX'),
(4, 3, 13, 'Crédito'),
(5, 1, 9, 'PIX');

-- --------------------------------------------------------

--
-- Estrutura da tabela `gerenciar`
--

CREATE TABLE `gerenciar` (
  `id_gerenciar` int(11) NOT NULL,
  `cod_admin` int(11) NOT NULL,
  `cod_venda` int(11) NOT NULL,
  `data_admin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `gerenciar`
--

INSERT INTO `gerenciar` (`id_gerenciar`, `cod_admin`, `cod_venda`, `data_admin`) VALUES
(1, 1, 1, '2022-11-09'),
(2, 2, 2, '2022-11-10'),
(3, 2, 3, '2022-11-11'),
(4, 1, 4, '2022-11-17'),
(5, 2, 5, '2022-10-18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `jogos`
--

CREATE TABLE `jogos` (
  `id_jogos` int(11) NOT NULL,
  `nome` varchar(32) NOT NULL,
  `data_lancamento` date NOT NULL,
  `empresa` varchar(30) NOT NULL,
  `classificacao` enum('Livre','10','12','14','16','18') NOT NULL,
  `preco` int(11) NOT NULL,
  `plataforma` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `jogos`
--

INSERT INTO `jogos` (`id_jogos`, `nome`, `data_lancamento`, `empresa`, `classificacao`, `preco`, `plataforma`) VALUES
(1, 'Naruto Storm 4', '2016-02-04', 'Bandai Namco', '14', 250, 'Xbox One'),
(2, 'GTA V', '2013-09-17', 'Rockstar Games', '18', 250, 'Multiplataforma'),
(3, 'Celeste', '2018-01-25', 'Matt Makes Games', 'Livre', 50, 'Multiplataforma'),
(4, 'Hollow Knight', '2017-02-24', 'Team Cherry', '10', 65, 'Multiplataforma'),
(5, 'Dragon Ball Z: Budokai 3', '2004-11-16', 'Bandai Namco', '10', 20, 'PlayStation 2'),
(6, 'God of War Ragnarök', '2022-11-09', 'Santa Monica Studio', '18', 350, 'PlayStation 5'),
(7, 'The Witcher 3: Wild Hunt', '2015-05-18', 'CD Projekt', '16', 200, 'Multiplataforma'),
(8, 'Pokémon Scarlet/Violet', '2022-11-18', 'Game Freak', 'Livre', 300, 'Nintendo Switch'),
(9, 'Fifa 23', '2022-09-26', 'Eletronic Arts', '10', 350, 'Multiplataforma'),
(10, ' Mortal Kombat 11', '2019-04-23', 'Warner Bros', '18', 200, 'Multiplataforma'),
(11, ' Mineirinho Ultra Adventures', '2017-01-27', 'Sinned Games', 'Livre', 5, 'Microsoft Windows'),
(12, 'Guitar Hero: Warriors of Rock', '2010-09-24', 'Activision', '12', 20, 'Xbox 360'),
(13, 'Cuphead', '2017-09-29', 'Studio MDHR', '14', 80, 'Multiplataforma');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `id_venda` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `cod_jog` int(11) NOT NULL,
  `qtd_jogos` int(5) NOT NULL,
  `data_venda` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`id_venda`, `id_cliente`, `cod_jog`, `qtd_jogos`, `data_venda`, `total`) VALUES
(1, 1, 1, 10, '2022-11-09', 2550),
(2, 2, 2, 5, '2022-11-08', 1250),
(3, 5, 7, 100, '2022-11-17', 20000),
(4, 6, 5, 100, '2022-10-15', 2000),
(5, 1, 9, 2, '2020-10-21', 700);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `comprar`
--
ALTER TABLE `comprar`
  ADD PRIMARY KEY (`id_comprar`),
  ADD KEY `comprar-fk-cliente` (`ocd_cliente`),
  ADD KEY `comprar-fk-jogos` (`cod_jogos`);

--
-- Índices para tabela `constituir`
--
ALTER TABLE `constituir`
  ADD PRIMARY KEY (`id_constituir`),
  ADD KEY `constituir-fk-jogos` (`cod-jogos`),
  ADD KEY `constituir-fk-vendas` (`ocd-venda`);

--
-- Índices para tabela `gerenciar`
--
ALTER TABLE `gerenciar`
  ADD PRIMARY KEY (`id_gerenciar`),
  ADD KEY `gerenciar-fk-admin` (`cod_admin`),
  ADD KEY `gerenciar-fk-vendas` (`cod_venda`);

--
-- Índices para tabela `jogos`
--
ALTER TABLE `jogos`
  ADD PRIMARY KEY (`id_jogos`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `vendas_fk-cliente` (`id_cliente`),
  ADD KEY `vendas_fk-jogo` (`cod_jog`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `comprar`
--
ALTER TABLE `comprar`
  MODIFY `id_comprar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `constituir`
--
ALTER TABLE `constituir`
  MODIFY `id_constituir` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `gerenciar`
--
ALTER TABLE `gerenciar`
  MODIFY `id_gerenciar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `jogos`
--
ALTER TABLE `jogos`
  MODIFY `id_jogos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `comprar`
--
ALTER TABLE `comprar`
  ADD CONSTRAINT `comprar-fk-cliente` FOREIGN KEY (`ocd_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `comprar-fk-jogos` FOREIGN KEY (`cod_jogos`) REFERENCES `jogos` (`id_jogos`);

--
-- Limitadores para a tabela `constituir`
--
ALTER TABLE `constituir`
  ADD CONSTRAINT `constituir-fk-jogos` FOREIGN KEY (`cod-jogos`) REFERENCES `jogos` (`id_jogos`),
  ADD CONSTRAINT `constituir-fk-vendas` FOREIGN KEY (`ocd-venda`) REFERENCES `vendas` (`id_venda`);

--
-- Limitadores para a tabela `gerenciar`
--
ALTER TABLE `gerenciar`
  ADD CONSTRAINT `gerenciar-fk-admin` FOREIGN KEY (`cod_admin`) REFERENCES `admin` (`id_admin`),
  ADD CONSTRAINT `gerenciar-fk-vendas` FOREIGN KEY (`cod_venda`) REFERENCES `vendas` (`id_venda`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_fk-cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `vendas_fk-jogo` FOREIGN KEY (`cod_jog`) REFERENCES `jogos` (`id_jogos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
