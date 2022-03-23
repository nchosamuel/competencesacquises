/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) { 
        int i, n, som;
        Scanner lectureClavier = new Scanner(System.in);
        som =0;
        i=0;
        while(i<4){
            System.out.println("Donnez un entier: ") ;
            n = lectureClavier.nextInt() ;
            som+=n ;
            i++;
        }
        System.out.println("Somme: " + som);
        //int i, n, som;
        //Scanner lectureClavier = new Scanner(System.in);
        //som =0;
        //i=0;
        //do {
            //System.out.println("Donnez un entier: ") ;
            //n = lectureClavier.nextInt() ;
            //som+=n ;
            //i++;
        //} while(i<4);
        //System.out.println("Somme: " + som);
    }
}
    
    

