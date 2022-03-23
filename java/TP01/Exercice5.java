package TP01;

public class Exercice5 {
    public static int maxTroisEntiers(int a,int b, int c){
        int resultat=0;
        if(a>b && a>c){
            resultat=a;
        }
        else if (b>a && b>c){
            resultat = b;
        }
        else {
            resultat=c;
        }
        System.out.println(resultat);
        return resultat;
        
    }
    public static void main(String[] args) {
       maxTroisEntiers(1,9,16);
       
    }
    
    
}
