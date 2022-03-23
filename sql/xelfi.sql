	-- phpMyAdmin SQL Dump
	-- version 3.3.9
	-- http://www.phpmyadmin.net
	--
	-- Serveur: localhost
	-- Généré le : Mar 13 Novembre  à 16:57
	-- Version du serveur: 5.5.8
	-- Version de PHP: 5.3.5

	SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


	/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
	/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
	/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
	/*!40101 SET NAMES utf8 */;

	--
	-- Base de données: ` xelfi`
	--
	-- --------------------------------------------------------

	--
	-- Structure de la table `categorie`
	--

	CREATE TABLE IF NOT EXISTS `categorie` (
	  `code` varchar(3) NOT NULL,
	  `designation` varchar(30) NOT NULL,
	  PRIMARY KEY (`code`)
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;
	-- --------------------------------------------------------

	--
	-- Structure de la table `articles`
	--

	CREATE TABLE IF NOT EXISTS `article` (
	  `code` varchar(6) NOT NULL,
	  `code_categorie` varchar(3) NOT NULL,
	  `designation` varchar(100) NOT NULL,
	  `quantite` int(11) NOT NULL,
	  `prix_unitaire` double NOT NULL,
	  `date` int(11) NOT NULL,
	  PRIMARY KEY (`code`),
	  FOREIGN KEY (`code_categorie`) REFERENCES `categorie`(`code`)
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;

	--
	-- Contenu de la table `articles`
	--


	-- --------------------------------------------------------

	--
	-- Structure de la table `client`
	--

	CREATE TABLE IF NOT EXISTS `client` (
	  `code` varchar(6) NOT NULL,
	  `nom` varchar(15) NOT NULL,
	  `prenom` varchar(15) NOT NULL,
	  `carte_fidelite` tinyint(1) NOT NULL,
	  `date` date NOT NULL,
	  PRIMARY KEY (`code`)
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;

	--
	-- Contenu de la table `client`
	--

	-- --------------------------------------------------------

	--
	-- Structure de la table `mode_reglement`
	--

	CREATE TABLE IF NOT EXISTS `mode_reglement` (
	  `code` int(11) NOT NULL,
	  `type` varchar(20) NOT NULL,
	  PRIMARY KEY (`code`)
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;

	--
	-- --------------------------------------------------------

	--
	-- Structure de la table `facture`
	--

	CREATE TABLE IF NOT EXISTS `facture` (
	  `code` varchar(15) NOT NULL,
	  `code_client` varchar(6) NOT NULL,
	  `total_ttc` double NOT NULL,
	  `code_mode_reglement` int(11) NOT NULL,
	  `date` date NOT NULL,
	  PRIMARY KEY (`code`),
	  FOREIGN KEY (`code_client`) REFERENCES `client`(`code`),
	  FOREIGN KEY (`code_mode_reglement`) REFERENCES `mode_reglement`(`code`)
	) ENGINE=MyISAM DEFAULT CHARSET=latin1;

	--
	-- Contenu de la table `facture`
	--


	-- --------------------------------------------------------

	--
	-- Structure de la table `lignes_factures`
	--

		CREATE TABLE IF NOT EXISTS `lignes_factures` (
		  `code_facture` varchar(15) NOT NULL,
		  `code_article` varchar(6) NOT NULL,
		  `quantite` int(11) NOT NULL,
		  `prix_unitaire` double NOT NULL,
		  `total` double NOT NULL,
		  PRIMARY KEY (`code_facture`,`code_article`)
		) ENGINE=InnoDB DEFAULT CHARSET=latin1;

	