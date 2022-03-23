/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcercle;

import java.util.Scanner;



public class Cercle {
    //attributs caractéristique

public int x, y;
public int rayon;

//méthodes

public void afficher()
{
System.out.println("rayon: " + rayon);
System.out.println("Coordonnées " + x + " : " + y);
}


public double perimetre()
{
return 2 * Math.PI * rayon;
} 

public void deplacer(int nx, int ny)
{
x = nx;
y = ny;
}

public void agrandir(int nRayon)
{
nRayon = rayon;
}

public void reduire(int nRayon)
{
nRayon = rayon;
}

 public static void main(String[] args) {
Cercle c1 = new Cercle();
c1.afficher();
c1.agrandir(5);
Scanner lc = new Scanner(System.in);
System.out.println("saisir x");
c1.x = lc.nextInt();
System.out.println("saisir y");
c1.y = lc.nextInt();
c1.afficher();
double perimetre = c1.perimetre();
System.out.println("Le perimètre est de " + perimetre);
c1.deplacer(-1, 3);

 }

}

