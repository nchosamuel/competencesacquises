/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import java.util.Scanner;
 
public class Exercice3 {
    public static void main(String[] args) {
       Scanner saisie = new Scanner(System.in);
       
       int a; 
       int res=0;
       int plusGrand=0; 
       int plusPetit=0;
       double moy=0;
       
       int i=1;
       do {
           System.out.println("Saisissez un nombre entier");
           a=saisie.nextInt();
           if (plusPetit == 0) {
                   plusPetit = a;
               }
           if (a!=0){
               res=res+a;
               moy=(double) res/i;
               if (a>plusGrand) {
                   plusGrand=a;
               }
               else if (a < plusPetit){
                   plusPetit=a;
               } 
           }
           i++;
       }while(a!=0);
       
       System.out.println("La plus grand valeur est:" + plusGrand);
       System.out.println("La plus petite valeur est:" + plusPetit);
       System.out.println("La moyenne est:" + moy);
        
    }
    
}
