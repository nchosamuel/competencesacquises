/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplistesexercice2;

/**
 *
 * @author lastreet'zer
 */
public class Livre {
    
    //attributs
    String titre;
    String auteur;
    String isbn;
    
    //constructeur
    public Livre (String unTitre, String unAuteur, String unIsbn)
    {
        this.titre = unTitre;
        this.auteur = unAuteur;
        this.isbn = unIsbn;
    }
    
    //description du livre
     public String toString() {
         
         return titre + " - " + auteur + " (ISBN : " + isbn + ")" ;
     }
}
