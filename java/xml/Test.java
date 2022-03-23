/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lastreet'zer
 */
public class Test {
    public static void main(String[] args) throws IOException{
Commune maCommune = new Commune("1","Lille");
maCommune.ajouterUnSecteur(1, "Wazemmes", true);
maCommune.ajouterUnSecteur(2, "Lille Centre", false);
maCommune.ajouterUnSecteur(3, "Lille Moulins", true);
// utilisation de la classe fichier
Fichier f = new Fichier();
// création du fichier communes.xml
f.ouvrir("fic.xml","Ecriture");
// écriture des données xml
// entête
f.ecrire("<?xml version="1.0" encoding="UTF-8"?>");
f.ecrire("<!DOCTYPE lescommunes SYSTEM \"./communes.dtd\">");
f.ecrire("<lescommunes>");
f.ecrire("<comune>");
f.ecrire(maCommune.getNomCom());
f.ecrire("</nomcommune>");



// Parcours de l’ArrayList – Ecriture des secteurs
ArrayList<Secteur> lesSecteurs = maCommune.getSecteurs();

// Fin du fichier
f.ecrire("</lescommunes>");
// fermeture du fichier
f.fermer();
    
}
}