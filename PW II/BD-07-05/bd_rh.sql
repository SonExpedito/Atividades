-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07/05/2023 às 22:43
-- Versão do servidor: 10.4.27-MariaDB
-- Versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_rh`
--
create Database `bd_rh`;
use `bd_rh`;
-- --------------------------------------------------------

--
-- Estrutura para tabela `cargos`
--

CREATE TABLE `cargos` (
  `CodCargo` char(2) NOT NULL,
  `Descricao` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cargos`
--

INSERT INTO `cargos` (`CodCargo`, `Descricao`) VALUES
('01', 'CEO'),
('02', 'CTO'),
('03', 'Dev Leader'),
('04', 'Secretária'),
('05', 'Cientista de Dados'),
('06', 'Designer e Ilustrador'),
('07', 'Administrador das Comnicações'),
('08', 'Analista de Dados'),
('09', 'Pesquisar Principal'),
('10', 'Agente Comunicativo');

-- --------------------------------------------------------

--
-- Estrutura para tabela `departamento`
--

CREATE TABLE `departamento` (
  `CodDepartamento` char(2) NOT NULL,
  `Descricao` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `departamento`
--

INSERT INTO `departamento` (`CodDepartamento`, `Descricao`) VALUES
('01', 'Setor de Responsabilidade Social'),
('02', 'Setor do RH'),
('03', 'Setor de Administração'),
('04', 'Setor de Marketing'),
('05', 'Setor de Desenvolvimento'),
('06', 'Setor Financeiro'),
('07', 'Setor de Data Science'),
('08', 'Setor Relab'),
('09', 'Research Area'),
('10', 'Future Lab');

-- --------------------------------------------------------

--
-- Estrutura para tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `Matricula` char(5) NOT NULL,
  `Nome_Dependente` varchar(50) NOT NULL,
  `Dp_Nascimento` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dependentes`
--

INSERT INTO `dependentes` (`Matricula`, `Nome_Dependente`, `Dp_Nascimento`) VALUES
('23501', 'Gustavo Julio Antonio da Rosa', '2006-05-08'),
('23502', 'Gael Enrico Melo', '2003-03-27'),
('23503', 'Samuel Theo da Cunha', '2004-09-17'),
('23504', 'Kaique Eduardo Vieira', '2000-11-08'),
('23505', 'Rita Lúcia Lara Gomes', '2000-01-20'),
('23506', 'Benjamin Theo Antonio Corte Real', '2002-03-20'),
('23507', 'Juliana Marlene Teixeira', '2014-08-29'),
('23509', 'Daniela Hadassa Araújo', '2014-03-18'),
('23510', 'Tereza Julia Fernanda Vieira', '2021-09-16'),
('23511', 'Marcos Kevin Brito', '2015-08-14');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Matricula` char(5) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Data_Nasc` date NOT NULL,
  `Nacionalidade` varchar(30) NOT NULL,
  `Sexo` char(5) NOT NULL,
  `Estado_Civil` varchar(20) NOT NULL,
  `RG` varchar(15) NOT NULL,
  `Cic` varchar(15) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Data_Admissao` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`Matricula`, `Nome`, `Data_Nasc`, `Nacionalidade`, `Sexo`, `Estado_Civil`, `RG`, `Cic`, `Endereco`, `Telefone`, `Data_Admissao`) VALUES
('23501', 'Cristiano Ronaldo', '1993-07-05', 'Português', 'Mascu', 'Casado', '31.263.246-0', '214.285.511-31', 'Corso Gaetano Scirea, 50', '(62) 98697-0503', '2017-05-06'),
('23502', 'Lionel André Messi', '1995-09-20', 'Argentino', 'Mascu', 'Casado', '38.214.302-4', '453.138.200-52', ' C. d\'Arístides Maillol, 12', '(68) 98697-1381', '2018-06-20'),
('23503', 'Tom Holland', '2002-06-08', 'Inglês', 'Mascu', 'Solteiro', '32.172.105-6', '591.682.731-85', 'Tottenham Hot Street, 55', '(79) 98939-3622', '2022-09-03'),
('23504', 'Andrew Garfield', '1999-10-26', 'Estadunidence', 'Mascu', 'Solteiro', '19.646.039-6', '289.542.572-83', 'New York City STREETS, 25', '(15) 98312-7783', '2018-02-15'),
('23505', 'Vin Diesel', '1987-08-20', 'Estadunidense', 'Mascu', 'Casado', '38.436.787-2', '414.438.652-06', 'Rua Rosa dos Ventos,625', '(51) 99885-6546', '0000-00-00'),
('23506', 'Alex Morgan', '1996-08-22', 'Estadunidense', 'Femin', 'Casada', '27.521.751-6', '109.897.161-20', 'Rua Acre,592', '(95) 98733-9354', '2021-06-22'),
('23507', 'Kylian Mbappé', '1999-08-26', 'Francês', 'Mascu', 'Solteiro', '50.431.222-4', '117.971.404-00', 'Rua Padre André da Rocha Abreu, 852', '(19) 99399-1422', '2018-06-15'),
('23508', 'Matheus \"Matuê\"', '1993-10-11', 'Brasileiro', 'Mascu', 'Casado', '37.428.142-7', '797.638.850-94', 'Rua Anailândia,854', '(86) 99405-2664', '2012-06-22'),
('23509', 'Rafael Lange', '2003-02-16', 'Brasileiro', 'Mascu', 'Solteiro', '34.626.969-6', '087.439.565-80', 'Rua Eutilha Andrade Medeiros, 100', '(83) 99987-6120', '2023-06-15'),
('23510', 'Will Smith', '1975-06-22', 'Estadunidense', 'Mascu', 'Separado', '25.894.364-6', '608.651.761-40', 'Rua Francisco Moreira,279', '(88) 98726-0364', '2001-08-16'),
('23511', 'Dwayne Johnson \"The Rock\"', '1976-06-22', 'Estadunidense', 'Mascu', 'Casado', '49.675.966-8', '549.968.485-53', 'Rua 1-F,159', '(82) 98929-8465', '1999-06-22'),
('23512', 'Michael Jackson', '1962-08-22', 'Estadunidense', 'Mascu', 'Casado', '25.188.184-2', '711.635.184-17', 'Travessa Manoel Esteves, 699', '(71) 98509-4995', '1997-06-22'),
('23513', 'Carl Johnson', '2001-06-22', 'Brasileiro', 'Mascu', 'Solteiro', '31.735.952-6', '446.605.611-00', 'Grove Street, 525', '(83) 98609-3077', '2022-06-08'),
('23514', 'Manjiro Sano', '1995-06-08', 'Japonês', 'Mascu', 'Solteiro', '35.843.199-2', '274.708.933-93', 'Tokyo Manji, 595', '(85) 99271-0147', '2020-05-02'),
('23515', 'Peter Parker', '1962-08-22', 'Estadunidense', 'Mascu', 'Casado', '13.117.184-7', '194.064.619-78', 'Marvel Universe, 616', '(27) 98375-8835', '1980-05-22');

-- --------------------------------------------------------

--
-- Estrutura para tabela `lotacao`
--

CREATE TABLE `lotacao` (
  `Matricula` char(5) NOT NULL,
  `CodDepartamento` char(2) NOT NULL,
  `Dt_Inicio` datetime NOT NULL,
  `Dt_Fim` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `lotacao`
--

INSERT INTO `lotacao` (`Matricula`, `CodDepartamento`, `Dt_Inicio`, `Dt_Fim`) VALUES
('23501', '01', '2017-04-19 11:12:57', '2022-08-19 06:12:20'),
('23502', '01', '2015-05-20 06:09:38', '2023-05-07 16:12:40'),
('23503', '02', '2013-02-13 06:12:57', '2023-05-07 16:12:40'),
('23504', '03', '2016-07-15 06:35:08', '2019-06-21 05:34:08'),
('23505', '03', '2023-10-12 11:12:57', '2023-09-06 17:28:57'),
('23506', '04', '2005-02-18 11:12:57', '2023-05-07 02:12:57'),
('23507', '05', '2006-04-19 19:08:57', '2023-05-07 16:12:40'),
('23508', '06', '2022-03-14 11:12:57', '2023-05-07 16:12:40'),
('23509', '07', '2018-11-28 11:12:57', '2022-05-26 11:12:57'),
('23510', '08', '2014-03-19 11:12:57', '2023-05-07 16:12:40'),
('23511', '09', '2015-03-25 01:12:57', '2027-06-10 11:12:57'),
('23512', '10', '2023-05-16 11:12:57', '2028-07-20 11:12:57'),
('23513', '02', '2018-07-25 19:12:57', '2026-12-17 11:12:57'),
('23514', '04', '2015-05-29 21:06:13', '2023-12-30 23:12:57'),
('23515', '05', '2015-02-09 22:10:30', '2023-10-12 21:12:57');

-- --------------------------------------------------------

--
-- Estrutura para tabela `ocupacao`
--

CREATE TABLE `ocupacao` (
  `Matricula` char(5) NOT NULL,
  `CodCargo` char(2) NOT NULL,
  `Dt_Inicio` datetime NOT NULL,
  `Dt_Fim` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ocupacao`
--

INSERT INTO `ocupacao` (`Matricula`, `CodCargo`, `Dt_Inicio`, `Dt_Fim`) VALUES
('23501', '01', '2018-05-09 17:17:20', '2026-05-28 11:17:20'),
('23502', '01', '2015-04-01 08:17:20', '2026-06-19 19:25:20'),
('23503', '02', '2017-08-25 11:11:32', '2011-06-02 19:32:10'),
('23504', '03', '2023-05-18 17:17:20', '2027-05-28 17:17:20'),
('23505', '03', '2023-11-17 23:08:41', '2025-02-18 06:38:06'),
('23506', '04', '2016-12-14 17:17:20', '2019-04-16 03:17:20'),
('23507', '04', '2009-05-31 17:17:20', '2011-05-31 11:38:20'),
('23508', '05', '2007-05-17 21:45:10', '2021-02-10 17:17:20'),
('23509', '06', '2001-05-31 21:17:20', '2014-07-17 10:17:20'),
('23510', '06', '2016-03-24 17:17:20', '2020-09-17 12:17:20'),
('23511', '07', '2014-01-15 11:17:20', '2023-08-25 17:17:20'),
('23512', '08', '2018-02-13 17:17:20', '2021-07-27 04:17:20'),
('23513', '09', '2005-01-24 10:39:20', '2020-07-10 23:17:20'),
('23514', '10', '2015-04-22 20:17:42', '2023-05-08 17:17:20'),
('23515', '08', '2014-05-19 07:17:20', '2031-08-22 20:17:20');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`CodCargo`);

--
-- Índices de tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`CodDepartamento`);

--
-- Índices de tabela `dependentes`
--
ALTER TABLE `dependentes`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices de tabela `lotacao`
--
ALTER TABLE `lotacao`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices de tabela `ocupacao`
--
ALTER TABLE `ocupacao`
  ADD PRIMARY KEY (`Matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
