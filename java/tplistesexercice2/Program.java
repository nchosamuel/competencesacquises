/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplistesexercice2;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {
    
    public static void afficherLivres(ArrayList<Livre> lesLivres)
    {
        for (Livre unLivre : lesLivres)
        {
            System.out.println(unLivre.toString ());
        }
    }
    
    public static void afficherMenu()
    {
        System.out.println("\n**** menu ****\n");
        System.out.println("1 - Afficher la liste des livres");
        System.out.println("2 - Ajouter un livre");
        System.out.println("3 - Modifier un livre");
        System.out.println("4 - Supprimer un livre");
        System.out.println("5 - Afficher la liste des auteurs");
        System.out.println("Q - Quitter \n");
    }
    
    public static void ajouterLivre(ArrayList<Livre> lesLivres)
    {
System.out.println("Donnez le titre du livre");
String titre = sc.nextLine();
System.out.println("Donnez l'auteur du livre");
String auteur = sc.nextLine();
System.out.println("Donnez le numero isbn du livre");
String isbn = sc.nextLine();
Livre livre = new Livre(titre, auteur, isbn);
lesLivres.add(livre);
    }
    
    public static void supprimerLivre(ArrayList<Livre> lesLivres)
    {
        for (int i = 0; i<lesLivres.size();i++)
        {
            System.out.println(i + " - " + lesLivres.get(i));
        }
        
        System.out.println("Choississez l'indice a supprimer");
        int indice = Integer.parseInt(sc.nextLine());
        if( indice > 0 || indice <= lesLivres.size())
        {
            lesLivres.remove(indice);
        }
        else 
        {
            System.out.println("Erreur la valeur n'est pas un indice indiqué");
        }
 
    }
    
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        // instanciation de plusieurs livres
Livre livre1 = new Livre("Le rouge et le noir", "Stendhal", "1234567890");
Livre livre2 = new Livre("Guerre et paix", "Tolstoï", "2587496851");
Livre livre3 = new Livre("Da Vinci Code", "Dan Brown", "9988776655");
Livre livre4 = new Livre("Les faux monnayeurs", "Gide", "6598745125");
// instanciation de la liste
ArrayList<Livre> livres = new ArrayList<Livre>();
// ajout des livres à la liste
livres.add(livre1);
livres.add(livre2);
livres.add(livre3);
livres.add(livre4);

char choix = ' ';
while (choix != 'Q')
{
afficherMenu();
choix = sc.nextLine().charAt(0); // récupère le 1er caractère saisi
switch (choix)
{
case '1':
afficherLivres(livres);
break;
case '2':
ajouterLivre(livres);
break;
case '3':
// à compléter plus tard
break;
case '4':
supprimerLivre(livres);
break;
case 'Q':
System.out.println("au revoir");
break;
default:
System.out.println("mauvais choix");
break;
}
}
    
}
}
