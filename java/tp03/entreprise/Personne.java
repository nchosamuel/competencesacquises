/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author lastreet'zer
 */
public class Personne {
    
    private String nom;
    private String prenom;
    
    public Personne(){
        nom = "";
        prenom = "";
    }
    
    public Personne(String unNom, String unPrenom){
        this.nom = unNom;
        this.prenom = unPrenom;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String unNom){
        this.nom = unNom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public void setPrenom(String unPrenom){
        this.prenom = unPrenom;
    }
    
    public void sePresenter(){
        System.out.println("Bonjour, je suis une Personne et je m’appelle " + prenom + " " + nom);
    }
}
