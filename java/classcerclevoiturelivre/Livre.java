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
public class Livre {
    
    public String titre, nom, prenom, categorie, numeroISBN, codeEnregistrement;
    
    public void afficherUnLivre() {
        System.out.println("Le nom du livre est " + titre + " de " + prenom + " " + nom + " dans la catégorie " + categorie );
    }
    
    public void calculerLeCode() {
        codeEnregistrement = nom.substring(0, 1)+ prenom.substring(0,1)+ categorie + numeroISBN.substring(numeroISBN.length()-2, numeroISBN.length()) ;
        System.out.println("Le code d'neregistrement est " + codeEnregistrement);
    }
    
    public static void main(String[] args) {
        Livre livrePoche = new Livre();
        
         Scanner lc = new Scanner(System.in);
        System.out.println("Donnez le prenom de l'auteur du livre");
        livrePoche.prenom = lc.next();
        System.out.println("Donnez le nom de l'auteur du livre");
        livrePoche.nom = lc.next();
        System.out.println("Donnez le titre du livre");
        livrePoche.titre = lc.next();
        System.out.println("Donnez la categorie du livre");
        livrePoche.categorie = lc.next();
        System.out.println("Donnez le numero ISBN du livre");
        livrePoche.numeroISBN = lc.next();
        
        livrePoche.afficherUnLivre();
        livrePoche.calculerLeCode();
        
    }
    
}
