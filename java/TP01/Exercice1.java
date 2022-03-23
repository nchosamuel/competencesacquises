/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import java.util.Scanner;

public class Exercice1 {

    
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Donnez un entier:");
        int a = lectureClavier.nextInt();
        System.out.println("Donnez l'opérateur:");
        char c = lectureClavier.next().charAt(0) ;
        System.out.println("Donnez un autre entier:");
        int b = lectureClavier.nextInt();
        double resultat ;
        
        switch (c) {
            case '+' :
                resultat = a+b;
                System.out.println(resultat);
                break;
            case '-' :
                resultat = a-b;
                System.out.println(resultat);
                break;
            case '*':
                resultat = a*b;
                System.out.println(resultat);
                break;
            case '/' :
                resultat = a/b;
                System.out.println(resultat);
                break;
                
        }
        
    }
    
}
