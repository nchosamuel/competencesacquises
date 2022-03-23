package TP01;

import static java.lang.Math.*;


public class Exercice4 {
    public static void main(String[] args) {
       int resultat = 1;
        for(int i=0; i<=10;i++){
            System.out.println(pow(2,i));
            System.out.println("2 puissance " + i + " = " + resultat);
            resultat=resultat*2;
    }
       
    
    }
    
}
