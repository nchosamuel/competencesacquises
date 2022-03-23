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
public class Animal {
    
    private String nom;
    
    public Animal (String unNom)
    {
        this.nom = unNom;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public void crier()
    {
        System.out.println("je crie !");
    }
}
