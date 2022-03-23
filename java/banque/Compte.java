/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author lastreet'zer
 */
public class Compte {
   private int numero;
   private float solde;
   private float decouvert;
   private String nom;
    
    Compte(int numero, String nom, float solde, float decouvert){
       this.numero = numero;
       this.nom = nom;
       this.solde = solde;
       this.decouvert = decouvert;
    }
    
    public int getNum(){
        return numero;
    }
    
    public void setNum(int nnumero){
        this.numero = nnumero;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nnom){
        this.nom = nnom;
    }
    
    public float getSolde(){
        return solde;
    }
    
    public void setSolde(float nsolde){
        this.solde = nsolde;
    }
    
    public float getDecouvert(){
        return decouvert;
    }
    
    public void setDecouvert(float ndecouvert){
        this.solde = ndecouvert;
    }
    public static void main(String[] args){
        //Compte c = new Compte();
        //Compte unCompte = new Compte (123, "toto", 1000, 100);
        //unCompte.setNum(456);
        //System.out.println("num Compte :" + unCompte.getNum());
        //unCompte.setNom("azerty");
        //System.out.println("nom Compte :" + unCompte.getNom());
        //unCompte.setSolde(2000);
        //System.out.println("solde Compte :" + unCompte.getSolde());
        //unCompte.setDecouvert(200);
        //System.out.println("decouvert autorisé :" + unCompte.getDecouvert());
        Compte c = new Compte();
Compte c1 = new Compte(12345,"toto",1000,-500);
Ecran.afficher(c);
Ecran.afficher(c1);
        }
    
    
    

    
   public class Ecran {
       public void afficher()
{
System.out.println("num Compte :" + numero);
System.out.println("nom Compte :" + nom);
System.out.println("solde Compte :" + solde);
System.out.println("decouvert autorisé :" + decouvert);
}
   }
}
    



