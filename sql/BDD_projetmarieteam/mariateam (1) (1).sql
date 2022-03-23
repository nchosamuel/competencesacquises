-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 05 juin 2021 à 00:07
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `mariateam`
--

-- --------------------------------------------------------

--
-- Structure de la table `bateau`
--

DROP TABLE IF EXISTS `bateau`;
CREATE TABLE IF NOT EXISTS `bateau` (
  `idBateau` int(11) NOT NULL AUTO_INCREMENT,
  `NomBateau` varchar(50) NOT NULL,
  `VitesseMaxEnNoeud` double NOT NULL,
  `LongueurEnMetre` double NOT NULL,
  `LargeurEnMetre` double NOT NULL,
  `NbPlacesMaxPassager` int(11) DEFAULT 100,
  `NbPlacesMaxVInf2` int(11) DEFAULT 50,
  `NbPlacesMaxVSup2` int(11) DEFAULT 25,
  `PathImage` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `nombrecoque` int(20) DEFAULT NULL,
  `voile_m_carre` int(20) DEFAULT NULL,
  PRIMARY KEY (`idBateau`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bateau`
--

INSERT INTO `bateau` (`idBateau`, `NomBateau`, `VitesseMaxEnNoeud`, `LongueurEnMetre`, `LargeurEnMetre`, `NbPlacesMaxPassager`, `NbPlacesMaxVInf2`, `NbPlacesMaxVSup2`, `PathImage`, `type`, `nombrecoque`, `voile_m_carre`) VALUES
(1, 'Titanic', 30, 150, 10, 150, 40, 20, 'bateau1.jpg', 'catamaran', 2, NULL),
(3, 'Adonia', 15, 162, 65, 14, 12, 15, 'bateau2.jpg', 'voilier', 3, 3),
(4, 'Vreh Lokt', 25, 162, 56, 100, 50, 25, 'bateau3.jpg', 'catamaran', 2, NULL),
(5, 'Atlantica', 32, 210, 50, 250, 35, 52, 'bateau1.jpg', 'voilier', 3, 5),
(6, 'Arbuste', 20, 200, 50, 100, 50, 25, 'bateau3.jpg', 'voilier', 2, 6);

-- --------------------------------------------------------

--
-- Structure de la table `bateauequipe`
--

DROP TABLE IF EXISTS `bateauequipe`;
CREATE TABLE IF NOT EXISTS `bateauequipe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idBateau` int(11) NOT NULL,
  `idEquipement` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ct_equipement` (`idEquipement`),
  KEY `ct_bateau` (`idBateau`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bateauequipe`
--

INSERT INTO `bateauequipe` (`id`, `idBateau`, `idEquipement`) VALUES
(1, 1, 3),
(2, 4, 1),
(3, 1, 4),
(5, 1, 2),
(7, 3, 2),
(8, 4, 2),
(10, 1, 6),
(11, 3, 5),
(12, 4, 3),
(13, 6, 3),
(14, 6, 2),
(16, 5, 3);

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `LettreCategorie` varchar(5) NOT NULL,
  `libelleCategorie` varchar(50) NOT NULL,
  PRIMARY KEY (`LettreCategorie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`LettreCategorie`, `libelleCategorie`) VALUES
('A', 'Passager'),
('B', 'Véh.inf.2m'),
('C', 'véh.sup.2m');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idClient` varchar(50) NOT NULL,
  `Role` varchar(254) NOT NULL,
  `NomClient` varchar(50) NOT NULL,
  `PrenomClient` varchar(50) NOT NULL,
  `CodePostal` varchar(5) NOT NULL,
  `Ville` varchar(50) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `NbAchatsFidelisant` int(11) NOT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idClient`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `idClient`, `Role`, `NomClient`, `PrenomClient`, `CodePostal`, `Ville`, `Adresse`, `Mail`, `NbAchatsFidelisant`, `mdp`) VALUES
(1, 'admin', 'admin', 'Administrateur', 'admin', '59000', 'Douai', 'marie team', 'admin@marieteam.fr', 2, 'admin'),
(3, 'captain', 'admin', 'NomCapitaine', 'PrenomCapitaine', '59000', 'Lille', '1 rue de paris', 'capitaine@mail.fr', 0, 'capitaine'),
(2, 'client', 'user', 'NomClient', 'PrenomClient', '59000', 'Ville', 'Adresse', 'Mail@test.fr', 0, 'mdp');

-- --------------------------------------------------------

--
-- Structure de la table `croisiere`
--

DROP TABLE IF EXISTS `croisiere`;
CREATE TABLE IF NOT EXISTS `croisiere` (
  `codeCroisiere` int(11) NOT NULL,
  `nomVoyage` varchar(50) NOT NULL,
  `NomBateau` varchar(50) NOT NULL,
  PRIMARY KEY (`codeCroisiere`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `equipementbateau`
--

DROP TABLE IF EXISTS `equipementbateau`;
CREATE TABLE IF NOT EXISTS `equipementbateau` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `equipementbateau`
--

INSERT INTO `equipementbateau` (`id`, `Libelle`) VALUES
(1, 'Gps marine'),
(2, 'Pare-battage'),
(3, 'Wi-Fi'),
(4, 'Radeaux De Survie'),
(5, 'Piscine'),
(6, 'Phares Xenon');

-- --------------------------------------------------------

--
-- Structure de la table `fret`
--

DROP TABLE IF EXISTS `fret`;
CREATE TABLE IF NOT EXISTS `fret` (
  `codeFret` int(11) NOT NULL,
  `nomFret` varchar(50) NOT NULL,
  `NomBateau` varchar(50) NOT NULL,
  PRIMARY KEY (`codeFret`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `liaison`
--

DROP TABLE IF EXISTS `liaison`;
CREATE TABLE IF NOT EXISTS `liaison` (
  `codeLiaison` int(11) NOT NULL AUTO_INCREMENT,
  `distanceEnMiles` float NOT NULL,
  `codePort` int(5) NOT NULL,
  `codePort_Ports` int(5) NOT NULL,
  `NomSecteur` varchar(50) NOT NULL,
  PRIMARY KEY (`codeLiaison`),
  KEY `Liaison_Ports_FK` (`codePort`),
  KEY `Liaison_Ports0_FK` (`codePort_Ports`),
  KEY `Liaison_secteur1_FK` (`NomSecteur`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `liaison`
--

INSERT INTO `liaison` (`codeLiaison`, `distanceEnMiles`, `codePort`, `codePort_Ports`, `NomSecteur`) VALUES
(30, 8.8, 5, 1, 'Nord'),
(31, 5.8, 5, 2, 'Nord'),
(32, 25, 5, 3, 'Nord'),
(33, 25, 5, 4, 'Nord');

-- --------------------------------------------------------

--
-- Structure de la table `paiements`
--

DROP TABLE IF EXISTS `paiements`;
CREATE TABLE IF NOT EXISTS `paiements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `payment_id` varchar(255) NOT NULL,
  `payment_status` text NOT NULL,
  `payment_amount` text NOT NULL,
  `payment_currency` text NOT NULL,
  `payment_date` date NOT NULL,
  `payer_email` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `periode`
--

DROP TABLE IF EXISTS `periode`;
CREATE TABLE IF NOT EXISTS `periode` (
  `idPeriode` int(11) NOT NULL AUTO_INCREMENT,
  `saison` varchar(255) DEFAULT NULL,
  `dateDebut` date NOT NULL,
  `dateFin` date NOT NULL,
  `prixAdulte` float NOT NULL,
  `prixJunior` float NOT NULL,
  `prixEnfants` float NOT NULL,
  `prixVinf4m` float NOT NULL,
  `prixVinf5m` float NOT NULL,
  `prixFourgon` float NOT NULL,
  `prixCamping` float NOT NULL,
  `prixCamion` float NOT NULL,
  `idLiaison` int(11) NOT NULL,
  PRIMARY KEY (`idPeriode`),
  KEY `idLiaison` (`idLiaison`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `periode`
--

INSERT INTO `periode` (`idPeriode`, `saison`, `dateDebut`, `dateFin`, `prixAdulte`, `prixJunior`, `prixEnfants`, `prixVinf4m`, `prixVinf5m`, `prixFourgon`, `prixCamping`, `prixCamion`, `idLiaison`) VALUES
(16, 'printemps', '2021-05-01', '2021-07-01', 15, 14, 10, 150, 120, 200, 300, 350, 30),
(17, 'ete', '2021-07-02', '2021-08-01', 15.99, 12, 10, 90, 140, 200, 250, 210, 31),
(18, 'hiver', '2021-09-01', '2021-10-31', 20, 15, 10, 35, 35, 58, 58, 85, 32),
(19, 'printemps', '2021-05-01', '2021-07-01', 15, 14, 10, 150, 120, 200, 300, 350, 31),
(20, 'printemps', '2021-05-01', '2021-07-01', 15, 14, 10, 150, 120, 200, 300, 350, 32),
(21, 'printemps', '2021-05-01', '2021-07-01', 15, 14, 10, 150, 120, 200, 300, 350, 33);

-- --------------------------------------------------------

--
-- Structure de la table `ports`
--

DROP TABLE IF EXISTS `ports`;
CREATE TABLE IF NOT EXISTS `ports` (
  `codePort` int(5) NOT NULL AUTO_INCREMENT,
  `nomPort` varchar(50) NOT NULL,
  `marina` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codePort`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ports`
--

INSERT INTO `ports` (`codePort`, `nomPort`, `marina`) VALUES
(1, 'Port de Shanghai', 'Oui'),
(2, 'Port de Hambourg', 'Non'),
(3, 'Port de Marseille', 'Non'),
(4, 'Port du Havre', 'Oui'),
(5, 'Port St Gildas', 'Oui'),
(6, 'Port de Trieste', 'Non'),
(7, 'Port de Gênes', 'Non');

-- --------------------------------------------------------

--
-- Structure de la table `rapport`
--

DROP TABLE IF EXISTS `rapport`;
CREATE TABLE IF NOT EXISTS `rapport` (
  `idRapport` int(11) NOT NULL AUTO_INCREMENT,
  `NomCapitaine` varchar(50) NOT NULL,
  `EtatMer` varchar(50) NOT NULL,
  `commentaire` varchar(255) NOT NULL,
  `duree_du_retard` double NOT NULL,
  PRIMARY KEY (`idRapport`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `rapport`
--

INSERT INTO `rapport` (`idRapport`, `NomCapitaine`, `EtatMer`, `commentaire`, `duree_du_retard`) VALUES
(1, 'Capitaine Haddock', 'faiblement agitee', 'Le choc est toujours extremement violent et ebranle l ensemble des appendices sous-marins , les structures de coques  et le greement dans sa totalite.', 15),
(4, 'Capitaine Crochet', 'agitee', 'Le choc est toujours extremement violent et ebranle l ensemble des appendices sous-marins , les structures de coques  et le greement dans sa totalite.', 5),
(5, 'Capitaine Roux', 'calme', 'Le choc est toujours extremement violent et ebranle l ensemble des appendices sous-marins , les structures de coques  et le greement dans sa totalite.', 25),
(6, 'Capitaine Duval', 'faiblement agitee', 'Le choc est toujours extremement violent et ebranle l ensemble des appendices sous-marins , les structures de coques  et le greement dans sa totalite.', 10),
(7, 'Capitaine Sutty', 'agitee', 'Le choc est toujours extremement violent et ebranle l ensemble des appendices sous-marins , les structures de coques  et le greement dans sa totalite.', 15);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `NumReservation` int(50) NOT NULL AUTO_INCREMENT,
  `MontantARegler` float NOT NULL,
  `date` date NOT NULL,
  `dateTraversee` date DEFAULT NULL,
  `Heure` varchar(50) NOT NULL,
  `numeroIdentifiant` int(11) NOT NULL,
  `idClient` varchar(50) NOT NULL,
  `PlacesA1` int(11) NOT NULL DEFAULT 0,
  `PlacesA2` int(11) NOT NULL DEFAULT 0,
  `PlacesA3` int(11) NOT NULL DEFAULT 0,
  `PlacesB1` int(11) NOT NULL DEFAULT 0,
  `PlacesB2` int(11) NOT NULL DEFAULT 0,
  `PlacesC1` int(11) NOT NULL DEFAULT 0,
  `PlacesC2` int(11) NOT NULL DEFAULT 0,
  `PlacesC3` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`NumReservation`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`NumReservation`, `MontantARegler`, `date`, `dateTraversee`, `Heure`, `numeroIdentifiant`, `idClient`, `PlacesA1`, `PlacesA2`, `PlacesA3`, `PlacesB1`, `PlacesB2`, `PlacesC1`, `PlacesC2`, `PlacesC3`) VALUES
(32, 24, '2021-05-31', '2021-06-02', '18:54', 2545245, 'client', 0, 1, 1, 0, 0, 0, 0, 0),
(33, 795, '2021-05-31', '2021-06-02', '19:45', 2545247, 'client', 5, 5, 5, 0, 5, 0, 0, 0),
(34, 0, '2021-05-31', '2021-06-02', '19:55', 2545244, 'client', 1, 1, 2, 0, 1, 0, 0, 0),
(35, 0, '2021-05-31', '2019-08-05', '19:55', 1685430, 'client', 5, 0, 0, 0, 0, 0, 0, 0),
(36, 165, '2021-05-31', '2021-06-02', '19:55', 2545247, 'client', 5, 5, 2, 0, 0, 0, 0, 0),
(38, 151.2, '2021-06-02', '2021-06-02', '11:15', 2545247, 'admin', 1, 1, 1, 1, 0, 0, 0, 0),
(41, 39, '2021-06-02', '2021-06-02', '13:36', 2545247, 'admin', 1, 1, 1, 0, 0, 0, 0, 0);

--
-- Déclencheurs `reservation`
--
DROP TRIGGER IF EXISTS `points_fidelite`;
DELIMITER $$
CREATE TRIGGER `points_fidelite` BEFORE INSERT ON `reservation` FOR EACH ROW BEGIN
IF(SELECT idClient FROM Client WHERE NbAchatsFidelisant >= 100 and idClient = NEW.idClient) IS NOT NULL THEN
	SET NEW.MontantARegler = NEW.MontantARegler*0.80;
    UPDATE Client SET NbAchatsFidelisant = NbAchatsFidelisant-100 WHERE idClient = NEW.idClient;

ELSEIF(SELECT numeroIdentifiant FROM traversee WHERE numeroIdentifiant = NEW.numeroIdentifiant AND DATEDIFF(NEW.dateTraversee,curdate()) >= 60) IS NOT NULL THEN 
       UPDATE Client SET NbAchatsFidelisant = NbAchatsFidelisant+25 WHERE idClient = NEW.idClient;
	END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `secteur`
--

DROP TABLE IF EXISTS `secteur`;
CREATE TABLE IF NOT EXISTS `secteur` (
  `idSecteur` int(5) NOT NULL AUTO_INCREMENT,
  `NomSecteur` varchar(50) NOT NULL,
  PRIMARY KEY (`idSecteur`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `secteur`
--

INSERT INTO `secteur` (`idSecteur`, `NomSecteur`) VALUES
(1, 'Nord'),
(2, 'Ouest'),
(3, 'Sud');

-- --------------------------------------------------------

--
-- Structure de la table `traversee`
--

DROP TABLE IF EXISTS `traversee`;
CREATE TABLE IF NOT EXISTS `traversee` (
  `numeroIdentifiant` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `heureDeDepart` varchar(5) NOT NULL,
  `NomBateau` varchar(50) NOT NULL,
  `codeLiaison` int(11) NOT NULL,
  `idPeriode` int(255) NOT NULL,
  `PassagerRestant` int(11) NOT NULL,
  `VehInf2mRestant` int(11) NOT NULL,
  `VehSup2mRestant` int(11) NOT NULL,
  PRIMARY KEY (`numeroIdentifiant`)
) ENGINE=InnoDB AUTO_INCREMENT=2545248 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `traversee`
--

INSERT INTO `traversee` (`numeroIdentifiant`, `date`, `heureDeDepart`, `NomBateau`, `codeLiaison`, `idPeriode`, `PassagerRestant`, `VehInf2mRestant`, `VehSup2mRestant`) VALUES
(1685429, '2021-07-26', '17:30', 'Vreh Lokt', 30, 16, 63, 47, 45),
(1685430, '2021-08-05', '09:50', 'Titanic', 31, 17, 142, 49, 50),
(2545244, '2021-06-02', '12:30', 'Atlantica', 32, 18, 46, 10, 29),
(2545245, '2021-06-02', '15:30', 'Bourge', 33, 19, 48, 10, 30),
(2545246, '2021-06-02', '12:40', 'Khalifa', 31, 20, 50, 10, 30),
(2545247, '2021-06-02', '07:20', 'Peter', 31, 21, 147, 150, 150);

-- --------------------------------------------------------

--
-- Structure de la table `type`
--

DROP TABLE IF EXISTS `type`;
CREATE TABLE IF NOT EXISTS `type` (
  `codeType` varchar(10) NOT NULL,
  `LibelleType` varchar(50) NOT NULL,
  `LettreCategorie` varchar(5) NOT NULL,
  PRIMARY KEY (`codeType`),
  KEY `Type_Categorie_FK` (`LettreCategorie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `type`
--

INSERT INTO `type` (`codeType`, `LibelleType`, `LettreCategorie`) VALUES
('A1', 'Adulte', 'A'),
('A2', 'Junior', 'A'),
('A3', 'Enfant', 'A'),
('B1', 'Voitureinf2m', 'B'),
('B2', 'Voituresup2m', 'B'),
('C1', 'Fourgon', 'C'),
('C2', 'Camping', 'C'),
('C3', 'Camion', 'C');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `bateauequipe`
--
ALTER TABLE `bateauequipe`
  ADD CONSTRAINT `ct_bateau` FOREIGN KEY (`idBateau`) REFERENCES `bateau` (`idBateau`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ct_equipement` FOREIGN KEY (`idEquipement`) REFERENCES `equipementbateau` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `type`
--
ALTER TABLE `type`
  ADD CONSTRAINT `Type_Categorie_FK` FOREIGN KEY (`LettreCategorie`) REFERENCES `categorie` (`LettreCategorie`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
