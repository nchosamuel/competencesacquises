/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tparchivagededonne;

import java.io.IOException;



public class GestionFichier {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Fichier unFichier = new Fichier();
        try {
            unFichier.ouvrir("fic.txt","Ecriture");
            for(int i=1 ; i<=10; i++) {
                unFichier.ecrire(i);
            }
            unFichier.fermer();
            
            unFichier.ouvrir("fic.txt", "Lecture");
            String ligne=unFichier.lire();
            while (ligne !=null) {
                System.out.println(ligne);
                ligne=unFichier.lire();
            }
            unFichier.fermer();
            
            
        } catch (IOException ex) {
            System.out.println("Erreur" + ex.getMessage());
        }
        
    }
}
