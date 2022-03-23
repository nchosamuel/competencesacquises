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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Train unTrain;
unTrain = new Train() ;
unTrain.enMarche = true ;
unTrain.demarrer();
// Affichez la vitesse. A COMPLETER
System.out.println(unTrain.vitesse);
// Faites passer la vitesse à 30. A COMPLETER
unTrain.vitesse = 30;
// Affichez la vitesse. A COMPLETER
System.out.println(unTrain.vitesse);
// Faites passer la vitesse à 0. A COMPLETER
unTrain.vitesse = 0;
// Affichez la vitesse. A COMPLETER
System.out.println(unTrain.vitesse);
unTrain.stopper();
unTrain.enMarche = false;
    }
    
}
