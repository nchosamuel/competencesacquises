/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcercle;

import java.util.Scanner;

/**
 *
 * @author lastreet'zer
 */
public class Voiture {
    
    public String marque, modele, immat;
    public double prixInit, prixReel;
    
    public void afficher() {
        System.out.println("La voiture est une " + marque + " " + modele + " immatriculée " + immat + " d'un prix initial de " + prixInit + " et un prix réel de " + prixReel);
    }
    
    public void calculer(double taux) {
        prixReel = prixInit * (1-(taux/100));
    }
    
    public static void main(String[] args){
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture();
        
        Scanner lc = new Scanner(System.in);
        System.out.println("Donnez la marque de la voiture 1");
        v1.marque = lc.next();
        System.out.println("Donnez la modele de la voiture 1");
        v1.modele = lc.next();
        System.out.println("Donnez l'immatriculation de la voiture 1");
        v1.immat = lc.next();
        System.out.println("Entrez le prix initial de la voiture 1");
        v1.prixInit = lc.nextDouble();
        
        
       System.out.println("Donnez la marque de la voiture 2");
        v2.marque = lc.next();
        System.out.println("Donnez la modele de la voiture 2");
        v2.modele = lc.next();
        System.out.println("Donnez l'immatriculation de la voiture 2");
        v2.immat = lc.next();
        System.out.println("Entrez le prix initial de la voiture 2");
        v2.prixInit = lc.nextDouble();
        
        v1.afficher();
        v2.afficher();
        
        System.out.println("Entrez le pourcentage de remise pour la voiture 1");
        double remise1 = lc.nextDouble();
        System.out.println("Entrez le pourcentage de remise pour la voiture 2");
        double remise2 = lc.nextDouble();
        
        v1.calculer(remise1);
        v2.calculer(remise2);
        
        v1.afficher();
        v2.afficher();
    }
    
}
