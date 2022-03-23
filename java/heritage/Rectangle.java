/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.Scanner;

/**
 *
 * @author lastreet'zer
 */
public class Rectangle extends Forme {
    
    private int hauteur;
    private int largeur;
    
    
Rectangle(int hauteur, int largeur) {
     Scanner lc = new Scanner(System.in);
     System.out.println("saisir la hauteur");
     this.hauteur = lc.nextInt();
     System.out.println("saisir la largeur");
     this.largeur = lc.nextInt();
     
 }
 
 public Rectangle(int xx, int yy, int cc) {
    super(xx, yy, cc);
 }
    
    
}
