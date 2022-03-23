/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author JV
 */
public class Commune {
    private String numCom;
    private String nomCom;
    private  ArrayList<Secteur> lesSecteurs;
    
 public Commune(String numero ,String nom ){
     this.numCom=numero;
     this.nomCom=nom;
     this.lesSecteurs=new ArrayList<Secteur>();
 }
 
 
 // Création du secteur, et ajout dans la collection lesSecteurs
 public void ajouterUnSecteur(int unNumeroSecteur , String unNomSecteur ,boolean unEspaceVert ) {
     Secteur s = new Secteur(unNumeroSecteur,unNomSecteur,unEspaceVert,this);
     lesSecteurs.add(s);
 }

    ArrayList<Secteur> getSecteurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getNomCom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
 

}
