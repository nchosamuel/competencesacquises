/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author lastreet'zer
 */
public class Ecran {
   
    public static void afficher(Compte unCompte)
    {
        System.out.println("numero : " + unCompte.getNumCompte() + " nom : " + unCompte.getNom() + " solde : " + unCompte.getSolde() + " decouvert autorise : " + unCompte.getDecouvert());
    }
}
