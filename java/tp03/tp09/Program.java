/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

/**
 *
 * @author lastreet'zer
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Chat garfield = new Chat("Garfield");
        Chien milou = new Chien("Milou");
        garfield.crier();
        milou.crier();
        Animal azrael = new Chat("Azrael");
        azrael.crier();
    }
    
}
