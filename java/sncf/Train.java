/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sncf;

/**
 *
 * @author lastreet'zer
 */
public class Train {
    
    // attributs
int vitesse = 0 ;
boolean enMarche = false ;
// méthodes
public Train()
{
vitesse = 0;
enMarche = false;
}
public Train(int uneVitesse, boolean unEtat)
{
this.vitesse = uneVitesse;
this.enMarche = unEtat;
}
public String toString()
{
    return vitesse + " km/h " + enMarche;
}
public String toStringVit()
{
    return vitesse + " km/h " ;
}
public String toStringEtat()
{
    String etat; 
    if (enMarche == false)
    { 
        etat = "a l'arrêt";
    }
    else
    {
        etat = "en marche";
    }
    return etat;
}
void demarrer()
{
System.out.println("Démarrage");
}
void stopper()
{
System.out.println("Arrêt");
}
}

