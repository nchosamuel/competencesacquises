/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author lastreet'zer
 */
public class Exercice3 {
    public static void main(String[] args) {

 

        Scanner lectureClavier = new Scanner(System.in);
        
        System.out.println("De quel mois s'agit t-il ? : ");
        String mois = lectureClavier.next();
        
        System.out.println("De quelle année ?");
        int annee = lectureClavier.nextInt();
        
        mois = mois.toLowerCase();
         
        if (mois.equals("fevrier") || mois.equals("février")) {
                if(annee % 4 ==0 && annee % 100 != 0){
                    System.out.println("En " + annee + " le mois de février a 29 jours.");
                }
                if(annee % 400 == 0){
                    System.out.println("En " + annee + " le mois de février a 29 jours.");
                }
                else {
                    System.out.println("En " + annee + " le mois de février a 28 jours.");
                }
        }
        
        if (mois.equals("janvier") || mois.equals("mars") || mois.equals("mai") || mois.equals("juillet") ||  mois.equals("octobre")) {
            System.out.println("En " + annee + " le mois de " + mois + " a 31 jours");
        }
        
        if (mois.equals("aout") || mois.equals("août")) {
            System.out.println("En " + annee + " le mois d'août a 31 jours");
        }
        
        if (mois.equals("decembre") || mois.equals("décembre")) {
            System.out.println("En " + annee + " le mois de décembre a 31 jours");
        }
        
        if (mois.equals("avril") || mois.equals("juin") || mois.equals("septembre") || mois.equals("novembre") ) {
            System.out.println("En " + annee + " le mois de " + mois + " a 30 jours");
        }
    }
    
}
