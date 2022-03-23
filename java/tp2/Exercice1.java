package tp2;

import java.util.Scanner;

public class Exercice1 {

    
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saississez une phrase");
        String phrase = lectureClavier.nextLine().toUpperCase();
        System.out.println(phrase);
        int nb = 0;
        for (int i=0; i < phrase.length(); i++){
             if (phrase.charAt(i) == 'A')
                 nb++;
         }
         System.out.println("Il y a " + nb + " a dans votre phrase");
         System.out.println(phrase.replace('A', '*'));
         
        System.out.println("Quel chaine voulez vous trouver entre les 3eme et 12eme caratères de votre phrase ?");
        String trouver = lectureClavier.nextLine();  
        
        int test = trouver.compareTo(phrase.substring(3, 13)); 
        
        if(test == 0) {
            System.out.println("Il y a bien la séquence que vous cherchiez entre les caractères 3 et 12");
        }
        else {
            System.out.println("Il n'y a pas la séquence que vous cherchiez entre les caractères 3 et 12");
        }
    }
    
}
