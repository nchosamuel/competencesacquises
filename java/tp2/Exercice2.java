/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;


public class Exercice2 {
    public static void main(String[] args) {

 

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisissez un mot (saisir 'fin' pour stopper le programme)");
        String mot_base = lectureClavier.next();
        String mot_premier = "zzzzzzzzzz";
        String mot_dernier = "aaaaaaaaaa";
        
        
        while (!mot_base.equals("fin")) {
            System.out.println("Saisissez un mot (saisir 'fin' pour stopper le programme)");
            
            int test_premier =  mot_base.compareTo(mot_premier);
            int test_dernier = mot_base.compareTo(mot_dernier);
            
            if (test_premier <= -1) {
                mot_premier = mot_base;
            }
            
            if (test_dernier >= 1) {
                mot_dernier = mot_base;
            }
            
            mot_base = lectureClavier.next();
        }
        System.out.println("premier : " + mot_premier + " dernier : " + mot_dernier);
        
    }
}
    

