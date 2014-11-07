-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 07-Nov-2014 às 01:41
-- Versão do servidor: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `woodsoft`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clifortr`
--

CREATE TABLE IF NOT EXISTS `clifortr` (
`idclifor` int(11) NOT NULL,
  `pessoa` varchar(8) DEFAULT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `razao` varchar(45) DEFAULT NULL,
  `fantasia` varchar(45) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `inscEst` varchar(9) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `numero` varchar(11) NOT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `situacao` varchar(10) DEFAULT NULL,
  `contato` varchar(45) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `pais` varchar(25) NOT NULL,
  `cod_mun` varchar(7) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Extraindo dados da tabela `clifortr`
--

INSERT INTO `clifortr` (`idclifor`, `pessoa`, `tipo`, `razao`, `fantasia`, `cnpj`, `cpf`, `inscEst`, `endereco`, `numero`, `bairro`, `telefone`, `email`, `situacao`, `contato`, `cep`, `cidade`, `uf`, `id_usuario`, `pais`, `cod_mun`) VALUES
(2, 'Jurídica', 'Fornecedor', 'Empresa Teste', 'Empresa TESTE', '  .   .   /    -  ', '234.234.234-11', '', 'Rua Principal', '', 'Centro', '', '', '', '', '12.123-123', 'Itararé', '', 2, '', ''),
(4, '', '', 'Fornecedor Teste', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 1, '', ''),
(7, 'Física', 'Cliente', 'Lucas Henrique', '', '', '500.500.500-12', '', 'rua são pedro', '', 'centro', '15-1234-1234', '', 'Ativo', '', '18460-000', '', 'SP', 2, '', ''),
(8, 'Jurídica', 'Transportadora', 'Transportadora Rapidão', '', '', '', '', 'Rua São João 123', '', 'Centro', '(11)3453-3456', 'lucas@', 'Ativo', 'lucas', '12734-000', 'SÃ£o Paulo', 'SP', 2, '', ''),
(9, 'Jurídica', 'Fornecedor', 'Nestlé', '', '1231245123', '', '', '', '', '', '', '', 'Ativo', '', '', 'São Paulo', 'SP', 2, 'Brasil', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cpcadped`
--

CREATE TABLE IF NOT EXISTS `cpcadped` (
`id_pedido` int(11) NOT NULL,
  `cod_fornecedor` int(11) NOT NULL,
  `data_cad` date DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `data_alt` date DEFAULT NULL,
  `data_ent` date DEFAULT NULL,
  `valor_frete` double DEFAULT NULL,
  `valor_ipi_total` double DEFAULT NULL,
  `valor_icms_total` double DEFAULT NULL,
  `valor_total` double DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `valor_iss_total` double NOT NULL,
  `valor_merc_total` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Extraindo dados da tabela `cpcadped`
--

INSERT INTO `cpcadped` (`id_pedido`, `cod_fornecedor`, `data_cad`, `situacao`, `data_alt`, `data_ent`, `valor_frete`, `valor_ipi_total`, `valor_icms_total`, `valor_total`, `id_usuario`, `valor_iss_total`, `valor_merc_total`) VALUES
(3, 2, '2014-10-22', '', NULL, NULL, 0, 0, 0, 0, 2, 0, 0),
(4, 2, NULL, '', NULL, NULL, 0, 0, 0, 0, 2, 0, 0),
(5, 2, NULL, '', '0014-10-24', NULL, 0, 0, 0, 0, 2, 0, 0),
(6, 2, '2014-10-25', '', NULL, NULL, 0, 0, 0, 0, 2, 0, 0),
(7, 2, '2014-10-15', '', '2014-10-23', NULL, 0, 0, 0, 0, 2, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cpcadrec`
--

CREATE TABLE IF NOT EXISTS `cpcadrec` (
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

--
-- Extraindo dados da tabela `cpcadrec`
--

INSERT INTO `cpcadrec` (`id_fornecedor`, `id_pedido`, `nota_fiscal`, `serie`, `vlr_merc`, `vlr_frete`, `vlr_iss`, `vlr_ipi`, `vlr_icms`, `vlr_total`, `data_rec`, `data_cad`, `id_usuario`) VALUES
(2, 4, '123', '23', 0, 0, 0, 0, 0, 0, NULL, '2014-10-31', 2),
(2, 5, '123', '123', 0, 0, 0, 0, 0, 0, NULL, '2014-10-31', 2),
(2, 7, '234', '12', 0, 0, 0, 0, 0, 0, NULL, '2014-10-30', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cpiteped`
--

CREATE TABLE IF NOT EXISTS `cpiteped` (
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

--
-- Extraindo dados da tabela `cpiteped`
--

INSERT INTO `cpiteped` (`id_pedido`, `num_item`, `idproduto`, `descricao_item`, `qntde`, `unidade`, `fator_conv`, `valor_unit`, `valor_ipi`, `valor_icms`, `valor_total_item`, `per_ipi`, `per_icms`, `perc_iss`, `frete`, `desconto`, `total_item`) VALUES
(4, 1, 6, 'Produto de teste 3', 10, '12', 0, 12, 0, 0, 120, 0, 0, 0, 0, 0, 0),
(5, 1, 4, 'Produto de teste', 15, NULL, 0, 0, 0, 0, 0, 0, 0, 0, 34, 0, 0),
(7, 1, 4, 'Produto de teste', 10, 'kg', 0, 89, 78, 789, 6, 0, 0, 0, 0, 0, 0),
(7, 2, 6, 'Produto de teste 3', 5, '12', 0, 56, 67, 67, 0, 0, 0, 0, 0, 0, 0),
(7, 3, 6, NULL, 6, NULL, 0, 1, 0, 0, 0, 0, 0, 0, 10, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cpiterec`
--

CREATE TABLE IF NOT EXISTS `cpiterec` (
  `item` int(11) NOT NULL,
  `qtde` double DEFAULT NULL,
  `vlr_unit` double DEFAULT NULL,
  `perc_icms` int(11) DEFAULT NULL,
  `perc_ipi` int(11) DEFAULT NULL,
  `perc_iss` int(11) DEFAULT NULL,
  `vlr_total` double DEFAULT NULL,
  `idproduto` int(11) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
`cod_rec_item` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=62 ;

--
-- Extraindo dados da tabela `cpiterec`
--

INSERT INTO `cpiterec` (`item`, `qtde`, `vlr_unit`, `perc_icms`, `perc_ipi`, `perc_iss`, `vlr_total`, `idproduto`, `id_fornecedor`, `id_pedido`, `cod_rec_item`) VALUES
(1, 10, 89, 0, 0, 0, 6, 4, 2, 7, 55),
(2, 5, 56, 0, 0, 0, 0, 6, 2, 7, 56),
(3, 6, 1, 0, 0, 0, 0, 6, 2, 7, 57),
(1, 10, 12, 0, 0, 0, 120, 6, 2, 4, 60),
(1, 15, 0, 0, 0, 0, 0, 4, 2, 5, 61);

-- --------------------------------------------------------

--
-- Estrutura da tabela `escadpro`
--

CREATE TABLE IF NOT EXISTS `escadpro` (
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
  `id_usuario` int(11) NOT NULL,
  `cfop` varchar(5) NOT NULL,
  `quantidade` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `escadpro`
--

INSERT INTO `escadpro` (`idproduto`, `nome`, `comprimento`, `largura`, `espessura`, `peso`, `unidMed`, `conversao`, `descricao`, `obs`, `ncm`, `idtipoProduto`, `idsubgrupopro`, `id_usuario`, `cfop`, `quantidade`) VALUES
(4, 'Produto de teste', 1, 1, 1, 1, 'kg', 12, 'Produto para teste', 'cad pelo sistema', '1234', 4, 0, 1, '', 60),
(5, 'teste', 21, 12, 12, 40, 'pç', 32.3, 'teste 2', '', '11111', 1, 1, 1, '', 0),
(6, 'Produto de teste 3', 234, 12, 123, 234, '12', 12.9, 'teste', '', '123124', 1, 1, 2, '', 44);

-- --------------------------------------------------------

--
-- Estrutura da tabela `esgrupro`
--

CREATE TABLE IF NOT EXISTS `esgrupro` (
`idgrupoProduto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `abrev` varchar(5) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `esgrupro`
--

INSERT INTO `esgrupro` (`idgrupoProduto`, `nome`, `tipo`, `abrev`) VALUES
(1, 'testegrupo', 'testetipo', 'TG'),
(2, 'Grupo cadastrado pelo sistema', 'Matéria Prima', 'GPS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `essubgru`
--

CREATE TABLE IF NOT EXISTS `essubgru` (
  `idsubgrupopro` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `idgrupoProduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `essubgru`
--

INSERT INTO `essubgru` (`idsubgrupopro`, `nome`, `idgrupoProduto`) VALUES
(0, 'estoque direto', 2),
(1, 'teste sub grupo', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estab`
--

CREATE TABLE IF NOT EXISTS `estab` (
  `id_estab` int(11) NOT NULL,
  `razao_social` varchar(45) DEFAULT NULL,
  `cnpj` varchar(45) DEFAULT NULL,
  `ins_est` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `numero` varchar(11) NOT NULL,
  `complemento` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `cod_Mun` int(11) NOT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `data_cad` date DEFAULT NULL,
  `data_alt` date DEFAULT NULL,
  `ins_Mun` varchar(15) NOT NULL,
  `CNAE` varchar(7) NOT NULL,
  `crt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `estab`
--

INSERT INTO `estab` (`id_estab`, `razao_social`, `cnpj`, `ins_est`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `cod_Mun`, `uf`, `cep`, `telefone`, `email`, `data_cad`, `data_alt`, `ins_Mun`, `CNAE`, `crt`) VALUES
(0, 'WoodSoft Corporate', '23.123.123/0001-01', '123.123.1234', 'Rua São Pedro 1123', '0', '', '', 'Itararé', 0, 'SP', '18460-000', '15-1234-1234', 'woodsoft@woodsoft.com.br', '2001-01-01', '2014-11-01', '', '', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estippro`
--

CREATE TABLE IF NOT EXISTS `estippro` (
`idtipoProduto` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `abrev` varchar(3) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `estippro`
--

INSERT INTO `estippro` (`idtipoProduto`, `tipo`, `abrev`) VALUES
(1, 'Matéria Prima', 'MP'),
(4, 'Produto Acabado', 'PA'),
(5, 'Resíduos', 'RE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `procadop`
--

CREATE TABLE IF NOT EXISTS `procadop` (
`id_op` int(11) NOT NULL,
  `ano_op` int(11) NOT NULL,
  `pedido_venda` int(11) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `situacao` varchar(45) DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_termino` time DEFAULT NULL,
  `cod_cliente` int(11) DEFAULT NULL,
  `obs` text,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `procadop`
--

INSERT INTO `procadop` (`id_op`, `ano_op`, `pedido_venda`, `data`, `tipo`, `situacao`, `hora_inicio`, `hora_termino`, `cod_cliente`, `obs`, `id_usuario`) VALUES
(2, 2014, 0, NULL, 'Estoque', 'Em Aberto', '10:10:10', '10:15:10', 0, '', 2),
(3, 2014, 0, NULL, 'Estoque', 'Em Aberto', NULL, NULL, 0, '', 2),
(5, 2014, 0, NULL, 'Estoque', 'Em Aberto', NULL, NULL, 0, '', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `proiteop`
--

CREATE TABLE IF NOT EXISTS `proiteop` (
  `ano_op` int(11) NOT NULL,
  `item` int(10) NOT NULL,
  `tipo` int(11) DEFAULT NULL,
  `qntde` int(11) DEFAULT NULL,
  `id_op` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL,
  `desc_pro` varchar(50) NOT NULL,
  `unidade` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `proiteop`
--

INSERT INTO `proiteop` (`ano_op`, `item`, `tipo`, `qntde`, `id_op`, `idproduto`, `desc_pro`, `unidade`) VALUES
(2014, 1, 0, 10, 2, 4, '', ''),
(2014, 1, 1, 0, 3, 6, 'Produto de teste 3', '12'),
(2014, 1, 1, 0, 5, 6, 'Produto de teste 3', '12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`id_usuario` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `setor` varchar(45) DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `compras` tinyint(1) NOT NULL DEFAULT '0',
  `estoque` tinyint(1) NOT NULL DEFAULT '0',
  `producao` tinyint(1) NOT NULL DEFAULT '0',
  `vendas` tinyint(1) NOT NULL DEFAULT '0',
  `administracao` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome`, `setor`, `login`, `senha`, `compras`, `estoque`, `producao`, `vendas`, `administracao`) VALUES
(1, 'teste', NULL, 'teste', 'teste', 1, 0, 0, 1, 0),
(2, 'lucas Henrique', 'TI', 'lucas', '123', 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vecadped`
--

CREATE TABLE IF NOT EXISTS `vecadped` (
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
  `id_estab` int(11) NOT NULL,
  `placa_vei` varchar(10) NOT NULL,
  `uf_vei` varchar(2) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `vecadped`
--

INSERT INTO `vecadped` (`id_pedido`, `data`, `transportador`, `vlr_mercadoria`, `vlr_iss`, `total`, `data_entrega`, `nota_fiscal`, `serie`, `data_emissao`, `data_saida`, `hora_saida`, `base_icms`, `vlr_icms`, `base_icms_subs`, `vlr_icms_subs`, `vlr_frete`, `vlr_seguro`, `desconto`, `desp_acessorias`, `vlr_ipi`, `id_transportador`, `id_usuario`, `id_cliente`, `id_estab`, `placa_vei`, `uf_vei`) VALUES
(1, '2014-11-01', '', 50, 15, 550, '2014-11-02', '123', '1', '2014-11-01', '2014-11-01', NULL, 18, 13, 1, 1, 12, 13, 4, 3, 14, 8, 2, 7, 0, '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiteped`
--

CREATE TABLE IF NOT EXISTS `veiteped` (
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
-- Extraindo dados da tabela `veiteped`
--

INSERT INTO `veiteped` (`item`, `qtde`, `vlr_unit`, `perc_icms`, `perc_ipi`, `perc_iss`, `vlr_total`, `id_pedido`, `ESCADPRO_idproduto`) VALUES
(1, 5, 10, 18, 10, 10, 550, 1, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clifortr`
--
ALTER TABLE `clifortr`
 ADD PRIMARY KEY (`idclifor`), ADD KEY `fk_CLIFORTR_USUARIO1_idx` (`id_usuario`);

--
-- Indexes for table `cpcadped`
--
ALTER TABLE `cpcadped`
 ADD PRIMARY KEY (`id_pedido`), ADD KEY `fk_CPCADPED_CLIFORTR_idx` (`cod_fornecedor`), ADD KEY `fk_CPCADPED_USUARIO1_idx` (`id_usuario`);

--
-- Indexes for table `cpcadrec`
--
ALTER TABLE `cpcadrec`
 ADD PRIMARY KEY (`id_fornecedor`,`id_pedido`), ADD KEY `fk_CPCADREC_CLIFORTR1_idx` (`id_fornecedor`), ADD KEY `fk_CPCADREC_USUARIO1_idx` (`id_usuario`);

--
-- Indexes for table `cpiteped`
--
ALTER TABLE `cpiteped`
 ADD PRIMARY KEY (`num_item`,`id_pedido`), ADD KEY `fk_CPITEPED_CPCADPED1_idx` (`id_pedido`);

--
-- Indexes for table `cpiterec`
--
ALTER TABLE `cpiterec`
 ADD PRIMARY KEY (`cod_rec_item`), ADD KEY `fk_CPITEREC_ESCADPRO1_idx` (`idproduto`), ADD KEY `fk_CPITEREC_CPCADREC1_idx` (`id_fornecedor`,`id_pedido`);

--
-- Indexes for table `escadpro`
--
ALTER TABLE `escadpro`
 ADD PRIMARY KEY (`idproduto`), ADD KEY `fk_ESCADPRO_ESTIPPRO1_idx` (`idtipoProduto`), ADD KEY `fk_ESCADPRO_ESSUBGRU1_idx` (`idsubgrupopro`), ADD KEY `fk_ESCADPRO_USUARIO1_idx` (`id_usuario`);

--
-- Indexes for table `esgrupro`
--
ALTER TABLE `esgrupro`
 ADD PRIMARY KEY (`idgrupoProduto`);

--
-- Indexes for table `essubgru`
--
ALTER TABLE `essubgru`
 ADD PRIMARY KEY (`idsubgrupopro`), ADD KEY `fk_ESSUBGRU_ESGRUPRO1_idx` (`idgrupoProduto`);

--
-- Indexes for table `estab`
--
ALTER TABLE `estab`
 ADD PRIMARY KEY (`id_estab`);

--
-- Indexes for table `estippro`
--
ALTER TABLE `estippro`
 ADD PRIMARY KEY (`idtipoProduto`);

--
-- Indexes for table `procadop`
--
ALTER TABLE `procadop`
 ADD PRIMARY KEY (`id_op`,`ano_op`), ADD KEY `fk_PROCADOP_USUARIO1_idx` (`id_usuario`);

--
-- Indexes for table `proiteop`
--
ALTER TABLE `proiteop`
 ADD PRIMARY KEY (`ano_op`,`item`,`id_op`), ADD KEY `fk_PROITEOP_PROCADOP1_idx` (`id_op`), ADD KEY `fk_PROITEOP_ESCADPRO1_idx` (`idproduto`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id_usuario`);

--
-- Indexes for table `vecadped`
--
ALTER TABLE `vecadped`
 ADD PRIMARY KEY (`id_pedido`), ADD KEY `fk_VECADPED_USUARIO1_idx` (`id_usuario`), ADD KEY `fk_VECADPED_CLIFORTR1_idx` (`id_cliente`), ADD KEY `fk_VECADPED_ESTAB1_idx` (`id_estab`);

--
-- Indexes for table `veiteped`
--
ALTER TABLE `veiteped`
 ADD PRIMARY KEY (`item`), ADD KEY `fk_VEITEPED_VECADPED1_idx` (`id_pedido`), ADD KEY `fk_VEITEPED_ESCADPRO1_idx` (`ESCADPRO_idproduto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clifortr`
--
ALTER TABLE `clifortr`
MODIFY `idclifor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `cpcadped`
--
ALTER TABLE `cpcadped`
MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `cpiterec`
--
ALTER TABLE `cpiterec`
MODIFY `cod_rec_item` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=62;
--
-- AUTO_INCREMENT for table `escadpro`
--
ALTER TABLE `escadpro`
MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `esgrupro`
--
ALTER TABLE `esgrupro`
MODIFY `idgrupoProduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `estippro`
--
ALTER TABLE `estippro`
MODIFY `idtipoProduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `procadop`
--
ALTER TABLE `procadop`
MODIFY `id_op` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `vecadped`
--
ALTER TABLE `vecadped`
MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `clifortr`
--
ALTER TABLE `clifortr`
ADD CONSTRAINT `fk_CLIFORTR_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `cpcadped`
--
ALTER TABLE `cpcadped`
ADD CONSTRAINT `fk_CPCADPED_CLIFORTR` FOREIGN KEY (`cod_fornecedor`) REFERENCES `clifortr` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPCADPED_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `cpcadrec`
--
ALTER TABLE `cpcadrec`
ADD CONSTRAINT `fk_CPCADREC_CLIFORTR1` FOREIGN KEY (`id_fornecedor`) REFERENCES `clifortr` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPCADREC_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `cpiteped`
--
ALTER TABLE `cpiteped`
ADD CONSTRAINT `fk_CPITEPED_CPCADPED1` FOREIGN KEY (`id_pedido`) REFERENCES `cpcadped` (`id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `cpiterec`
--
ALTER TABLE `cpiterec`
ADD CONSTRAINT `fk_CPITEREC_CPCADREC1` FOREIGN KEY (`id_fornecedor`, `id_pedido`) REFERENCES `cpcadrec` (`id_fornecedor`, `id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_CPITEREC_ESCADPRO1` FOREIGN KEY (`idproduto`) REFERENCES `escadpro` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `escadpro`
--
ALTER TABLE `escadpro`
ADD CONSTRAINT `fk_ESCADPRO_ESSUBGRU1` FOREIGN KEY (`idsubgrupopro`) REFERENCES `essubgru` (`idsubgrupopro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_ESCADPRO_ESTIPPRO1` FOREIGN KEY (`idtipoProduto`) REFERENCES `estippro` (`idtipoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_ESCADPRO_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `essubgru`
--
ALTER TABLE `essubgru`
ADD CONSTRAINT `fk_ESSUBGRU_ESGRUPRO1` FOREIGN KEY (`idgrupoProduto`) REFERENCES `esgrupro` (`idgrupoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `procadop`
--
ALTER TABLE `procadop`
ADD CONSTRAINT `fk_PROCADOP_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `proiteop`
--
ALTER TABLE `proiteop`
ADD CONSTRAINT `fk_PROITEOP_ESCADPRO1` FOREIGN KEY (`idproduto`) REFERENCES `escadpro` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_PROITEOP_PROCADOP1` FOREIGN KEY (`id_op`) REFERENCES `procadop` (`id_op`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `vecadped`
--
ALTER TABLE `vecadped`
ADD CONSTRAINT `fk_VECADPED_CLIFORTR1` FOREIGN KEY (`id_cliente`) REFERENCES `clifortr` (`idclifor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VECADPED_ESTAB1` FOREIGN KEY (`id_estab`) REFERENCES `estab` (`id_estab`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VECADPED_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `veiteped`
--
ALTER TABLE `veiteped`
ADD CONSTRAINT `fk_VEITEPED_ESCADPRO1` FOREIGN KEY (`ESCADPRO_idproduto`) REFERENCES `escadpro` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_VEITEPED_VECADPED1` FOREIGN KEY (`id_pedido`) REFERENCES `vecadped` (`id_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
