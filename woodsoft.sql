-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Tempo de geração: 30/09/2014 às 01:07
-- Versão do servidor: 5.5.39
-- Versão do PHP: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de dados: `woodsoft`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `CLIFORTR`
--

CREATE TABLE IF NOT EXISTS `CLIFORTR` (
`idclifor` int(11) NOT NULL,
  `pessoa` varchar(8) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL,
  `razao` varchar(45) DEFAULT NULL,
  `fantasia` varchar(45) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `inscEst` varchar(9) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `situacao` varchar(10) DEFAULT NULL,
  `contato` varchar(45) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Fazendo dump de dados para tabela `CLIFORTR`
--

INSERT INTO `CLIFORTR` (`idclifor`, `pessoa`, `tipo`, `razao`, `fantasia`, `cnpj`, `cpf`, `inscEst`, `endereco`, `bairro`, `telefone`, `email`, `situacao`, `contato`, `cep`, `cidade`, `uf`, `id_usuario`) VALUES
(1, NULL, NULL, 'teste', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1),
(2, '', '', 'Empresa Teste', 'Empresa TESTE', '12.123.123/0009-12', '234.234.234-11', '', 'Rua Principal', 'Centro', '', '', '', '', '12.123-123', 'Itararé', '', 1),
(4, '', '', 'Fornecedor Teste', '', '', '', '', '', '', '', '', '', '', '', '', '', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `CPCADPED`
--

CREATE TABLE IF NOT EXISTS `CPCADPED` (
  `id_pedido` int(11) NOT NULL,
  `cod_fornecedor` int(11) NOT NULL,
  `data_cad` datetime DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `data_alt` datetime DEFAULT NULL,
  `data_ent` datetime DEFAULT NULL,
  `valor_frete` double DEFAULT NULL,
  `valor_ipi_total` double DEFAULT NULL,
  `valor_icms_total` double DEFAULT NULL,
  `valor_total` double DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `CPCADPED`
--

INSERT INTO `CPCADPED` (`id_pedido`, `cod_fornecedor`, `data_cad`, `situacao`, `data_alt`, `data_ent`, `valor_frete`, `valor_ipi_total`, `valor_icms_total`, `valor_total`, `id_usuario`) VALUES
(1, 1, NULL, '', NULL, NULL, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `CPCADREC`
--

CREATE TABLE IF NOT EXISTS `CPCADREC` (
  `id_fornecedor` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `nota_fiscal` varchar(45) DEFAULT NULL,
  `serie` varchar(5) DEFAULT NULL,
  `vlr_merc` double DEFAULT NULL,
  `vlr_frete` double DEFAULT NULL,
  `vlr_iss` double DEFAULT NULL,
  `vlr_ipi` double DEFAULT NULL,
  `vlr_icms` double DEFAULT NULL,
  `vlr_total` double DEFAULT NULL,
  `data_rec` date DEFAULT NULL,
  `data_cad` date DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `CPITEPED`
--

CREATE TABLE IF NOT EXISTS `CPITEPED` (
  `id_pedido` int(11) NOT NULL,
  `num_item` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL,
  `descricao_item` varchar(45) DEFAULT NULL,
  `qntde` double DEFAULT NULL,
  `unidade` varchar(3) DEFAULT NULL,
  `fator_conv` int(11) DEFAULT NULL,
  `valor_unit` double DEFAULT NULL,
  `valor_ipi` double DEFAULT NULL,
  `valor_icms` double DEFAULT NULL,
  `valor_total_item` double DEFAULT NULL,
  `per_ipi` int(11) DEFAULT NULL,
  `per_icms` int(11) DEFAULT NULL,
  `perc_iss` int(11) DEFAULT NULL,
  `frete` double DEFAULT NULL,
  `desconto` double DEFAULT NULL,
  `total_item` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `CPITEREC`
--

CREATE TABLE IF NOT EXISTS `CPITEREC` (
  `item` int(11) NOT NULL,
  `qtde` int(11) DEFAULT NULL,
  `vlr_unit` double DEFAULT NULL,
  `perc_icms` int(11) DEFAULT NULL,
  `perc_ipi` int(11) DEFAULT NULL,
  `perc_iss` int(11) DEFAULT NULL,
  `vlr_total` double DEFAULT NULL,
  `idproduto` int(11) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESCADPRO`
--

CREATE TABLE IF NOT EXISTS `ESCADPRO` (
`idproduto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `comprimento` double NOT NULL,
  `largura` double NOT NULL,
  `espessura` double NOT NULL,
  `peso` double DEFAULT NULL,
  `unidMed` varchar(3) NOT NULL,
  `conversao` double DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `obs` text,
  `ncm` varchar(45) DEFAULT NULL,
  `idtipoProduto` int(11) NOT NULL,
  `idsubgrupopro` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Fazendo dump de dados para tabela `ESCADPRO`
--

INSERT INTO `ESCADPRO` (`idproduto`, `nome`, `comprimento`, `largura`, `espessura`, `peso`, `unidMed`, `conversao`, `descricao`, `obs`, `ncm`, `idtipoProduto`, `idsubgrupopro`, `id_usuario`) VALUES
(4, 'Produto de teste', 1, 1, 1, 1, 'kg', 12, 'Produto para teste', 'cad pelo sistema', '1234', 1, 1, 1),
(5, 'teste', 21, 12, 12, 40, 'pç', 32.3, 'teste 2', '', '11111', 1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESGRUPRO`
--

CREATE TABLE IF NOT EXISTS `ESGRUPRO` (
`idgrupoProduto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `abrev` varchar(5) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Fazendo dump de dados para tabela `ESGRUPRO`
--

INSERT INTO `ESGRUPRO` (`idgrupoProduto`, `nome`, `tipo`, `abrev`) VALUES
(1, 'testegrupo', 'testetipo', 'TG');

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESSUBGRU`
--

CREATE TABLE IF NOT EXISTS `ESSUBGRU` (
  `idsubgrupopro` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `idgrupoProduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Fazendo dump de dados para tabela `ESSUBGRU`
--

INSERT INTO `ESSUBGRU` (`idsubgrupopro`, `nome`, `idgrupoProduto`) VALUES
(1, 'teste sub grupo', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESTAB`
--

CREATE TABLE IF NOT EXISTS `ESTAB` (
  `id_estab` int(11) NOT NULL,
  `razao_social` varchar(45) DEFAULT NULL,
  `cnpj` varchar(45) DEFAULT NULL,
  `ins_est` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `data_cad` date DEFAULT NULL,
  `data_alt` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ESTIPPRO`
--

CREATE TABLE IF NOT EXISTS `ESTIPPRO` (
`idtipoProduto` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `abrev` varchar(3) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Fazendo dump de dados para tabela `ESTIPPRO`
--

INSERT INTO `ESTIPPRO` (`idtipoProduto`, `tipo`, `abrev`) VALUES
(1, 'tipo teste', 'tp');

-- --------------------------------------------------------

--
-- Estrutura para tabela `PROCADOP`
--

CREATE TABLE IF NOT EXISTS `PROCADOP` (
  `id_op` int(11) NOT NULL,
  `ano_op` int(11) NOT NULL,
  `pedido_venda` int(11) DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `hora_inicio` datetime DEFAULT NULL,
  `hora_termino` datetime DEFAULT NULL,
  `cod_cliente` int(11) DEFAULT NULL,
  `obs` text,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `PROITEOP`
--

CREATE TABLE IF NOT EXISTS `PROITEOP` (
  `ano_op` int(11) NOT NULL,
  `item` int(10) unsigned NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `qntde` int(11) DEFAULT NULL,
  `id_op` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `USUARIO`
--

CREATE TABLE IF NOT EXISTS `USUARIO` (
`id_usuario` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `setor` varchar(45) DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Fazendo dump de dados para tabela `USUARIO`
--

INSERT INTO `USUARIO` (`id_usuario`, `nome`, `setor`, `login`, `senha`) VALUES
(1, 'teste', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `VECADPED`
--

CREATE TABLE IF NOT EXISTS `VECADPED` (
  `id_pedido` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `transportador` varchar(45) DEFAULT NULL,
  `vlr_mercadoria` double DEFAULT NULL,
  `vlr_iss` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `data_entrega` date DEFAULT NULL,
  `nota_fiscal` varchar(45) DEFAULT NULL,
  `serie` varchar(5) DEFAULT NULL,
  `data_emissao` date DEFAULT NULL,
  `data_saida` date DEFAULT NULL,
  `hora_saida` time DEFAULT NULL,
  `base_icms` double DEFAULT NULL,
  `vlr_icms` double DEFAULT NULL,
  `base_icms_subs` double DEFAULT NULL,
  `vlr_icms_subs` double DEFAULT NULL,
  `vlr_frete` double DEFAULT NULL,
  `vlr_seguro` double DEFAULT NULL,
  `desconto` double DEFAULT NULL,
  `desp_acessorias` double DEFAULT NULL,
  `vlr_ipi` double DEFAULT NULL,
  `id_transportador` int(11) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_estab` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `VEITEPED`
--

CREATE TABLE IF NOT EXISTS `VEITEPED` (
  `item` int(11) NOT NULL,
  `qtde` int(11) DEFAULT NULL,
  `vlr_unit` double DEFAULT NULL,
  `perc_icms` double DEFAULT NULL,
  `perc_ipi` double DEFAULT NULL,
  `perc_iss` double DEFAULT NULL,
  `vlr_total` double DEFAULT NULL,
  `id_pedido` int(11) NOT NULL,
  `ESCADPRO_idproduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `CLIFORTR`
--
ALTER TABLE `CLIFORTR`
 ADD PRIMARY KEY (`idclifor`), ADD KEY `fk_CLIFORTR_USUARIO1_idx` (`id_usuario`);

--
-- Índices de tabela `CPCADPED`
--
ALTER TABLE `CPCADPED`
 ADD PRIMARY KEY (`id_pedido`), ADD KEY `fk_CPCADPED_CLIFORTR_idx` (`cod_fornecedor`), ADD KEY `fk_CPCADPED_USUARIO1_idx` (`id_usuario`);

--
-- Índices de tabela `CPCADREC`
--
ALTER TABLE `CPCADREC`
 ADD PRIMARY KEY (`id_fornecedor`,`id_pedido`), ADD KEY `fk_CPCADREC_CLIFORTR1_idx` (`id_fornecedor`), ADD KEY `fk_CPCADREC_USUARIO1_idx` (`id_usuario`);

--
-- Índices de tabela `CPITEPED`
--
ALTER TABLE `CPITEPED`
 ADD PRIMARY KEY (`num_item`,`id_pedido`), ADD KEY `fk_CPITEPED_CPCADPED1_idx` (`id_pedido`);

--
-- Índices de tabela `CPITEREC`
--
ALTER TABLE `CPITEREC`
 ADD PRIMARY KEY (`item`), ADD KEY `fk_CPITEREC_ESCADPRO1_idx` (`idproduto`), ADD KEY `fk_CPITEREC_CPCADREC1_idx` (`id_fornecedor`,`id_pedido`);

--
-- Índices de tabela `ESCADPRO`
--
ALTER TABLE `ESCADPRO`
 ADD PRIMARY KEY (`idproduto`), ADD KEY `fk_ESCADPRO_ESTIPPRO1_idx` (`idtipoProduto`), ADD KEY `fk_ESCADPRO_ESSUBGRU1_idx` (`idsubgrupopro`), ADD KEY `fk_ESCADPRO_USUARIO1_idx` (`id_usuario`);

--
-- Índices de tabela `ESGRUPRO`
--
ALTER TABLE `ESGRUPRO`
 ADD PRIMARY KEY (`idgrupoProduto`);

--
-- Índices de tabela `ESSUBGRU`
--
ALTER TABLE `ESSUBGRU`
 ADD PRIMARY KEY (`idsubgrupopro`), ADD KEY `fk_ESSUBGRU_ESGRUPRO1_idx` (`idgrupoProduto`);

--
-- Índices de tabela `ESTAB`
--
ALTER TABLE `ESTAB`
 ADD PRIMARY KEY (`id_estab`);

--
-- Índices de tabela `ESTIPPRO`
--
ALTER TABLE `ESTIPPRO`
 ADD PRIMARY KEY (`idtipoProduto`);

--
-- Índices de tabela `PROCADOP`
--
ALTER TABLE `PROCADOP`
 ADD PRIMARY KEY (`id_op`,`ano_op`), ADD KEY `fk_PROCADOP_USUARIO1_idx` (`id_usuario`);

--
-- Índices de tabela `PROITEOP`
--
ALTER TABLE `PROITEOP`
 ADD PRIMARY KEY (`ano_op`,`item`,`id_op`), ADD KEY `fk_PROITEOP_PROCADOP1_idx` (`id_op`), ADD KEY `fk_PROITEOP_ESCADPRO1_idx` (`idproduto`);

--
-- Índices de tabela `USUARIO`
--
ALTER TABLE `USUARIO`
 ADD PRIMARY KEY (`id_usuario`);

--
-- Índices de tabela `VECADPED`
--
ALTER TABLE `VECADPED`
 ADD PRIMARY KEY (`id_pedido`), ADD KEY `fk_VECADPED_USUARIO1_idx` (`id_usuario`), ADD KEY `fk_VECADPED_CLIFORTR1_idx` (`id_cliente`), ADD KEY `fk_VECADPED_ESTAB1_idx` (`id_estab`);

--
-- Índices de tabela `VEITEPED`
--
ALTER TABLE `VEITEPED`
 ADD PRIMARY KEY (`item`), ADD KEY `fk_VEITEPED_VECADPED1_idx` (`id_pedido`), ADD KEY `fk_VEITEPED_ESCADPRO1_idx` (`ESCADPRO_idproduto`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `CLIFORTR`
--
ALTER TABLE `CLIFORTR`
MODIFY `idclifor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de tabela `ESCADPRO`
--
ALTER TABLE `ESCADPRO`
MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de tabela `ESGRUPRO`
--
ALTER TABLE `ESGRUPRO`
MODIFY `idgrupoProduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `ESTIPPRO`
--
ALTER TABLE `ESTIPPRO`
MODIFY `idtipoProduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `USUARIO`
--
ALTER TABLE `USUARIO`
MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `CLIFORTR`
--
ALTER TABLE `CLIFORTR`
ADD CONSTRAINT `fk_CLIFORTR_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `CPCADPED`
--
ALTER TABLE `CPCADPED`
ADD CONSTRAINT `fk_CPCADPED_CLIFORTR` FOREIGN KEY (`cod_fornecedor`) REFERENCES `CLIFORTR` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPCADPED_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `CPCADREC`
--
ALTER TABLE `CPCADREC`
ADD CONSTRAINT `fk_CPCADREC_CLIFORTR1` FOREIGN KEY (`id_fornecedor`) REFERENCES `CLIFORTR` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPCADREC_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `CPITEPED`
--
ALTER TABLE `CPITEPED`
ADD CONSTRAINT `fk_CPITEPED_CPCADPED1` FOREIGN KEY (`id_pedido`) REFERENCES `CPCADPED` (`id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `CPITEREC`
--
ALTER TABLE `CPITEREC`
ADD CONSTRAINT `fk_CPITEREC_CPCADREC1` FOREIGN KEY (`id_fornecedor`, `id_pedido`) REFERENCES `CPCADREC` (`id_fornecedor`, `id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPITEREC_ESCADPRO1` FOREIGN KEY (`idproduto`) REFERENCES `ESCADPRO` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `ESCADPRO`
--
ALTER TABLE `ESCADPRO`
ADD CONSTRAINT `fk_ESCADPRO_ESSUBGRU1` FOREIGN KEY (`idsubgrupopro`) REFERENCES `ESSUBGRU` (`idsubgrupopro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_ESCADPRO_ESTIPPRO1` FOREIGN KEY (`idtipoProduto`) REFERENCES `ESTIPPRO` (`idtipoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_ESCADPRO_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `ESSUBGRU`
--
ALTER TABLE `ESSUBGRU`
ADD CONSTRAINT `fk_ESSUBGRU_ESGRUPRO1` FOREIGN KEY (`idgrupoProduto`) REFERENCES `ESGRUPRO` (`idgrupoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `PROCADOP`
--
ALTER TABLE `PROCADOP`
ADD CONSTRAINT `fk_PROCADOP_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `PROITEOP`
--
ALTER TABLE `PROITEOP`
ADD CONSTRAINT `fk_PROITEOP_ESCADPRO1` FOREIGN KEY (`idproduto`) REFERENCES `ESCADPRO` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_PROITEOP_PROCADOP1` FOREIGN KEY (`id_op`) REFERENCES `PROCADOP` (`id_op`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `VECADPED`
--
ALTER TABLE `VECADPED`
ADD CONSTRAINT `fk_VECADPED_CLIFORTR1` FOREIGN KEY (`id_cliente`) REFERENCES `CLIFORTR` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VECADPED_ESTAB1` FOREIGN KEY (`id_estab`) REFERENCES `ESTAB` (`id_estab`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VECADPED_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para tabelas `VEITEPED`
--
ALTER TABLE `VEITEPED`
ADD CONSTRAINT `fk_VEITEPED_ESCADPRO1` FOREIGN KEY (`ESCADPRO_idproduto`) REFERENCES `ESCADPRO` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VEITEPED_VECADPED1` FOREIGN KEY (`id_pedido`) REFERENCES `VECADPED` (`id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
