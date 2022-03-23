
package TP01;




public class Exercice6 {
    public static double operation(int a, char c, int b){

        double resultat = 0 ;
        
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
        
        return resultat;
    }
    
    public static void main(String[] args) {
         operation(1,'+',2);
     }
    
}
