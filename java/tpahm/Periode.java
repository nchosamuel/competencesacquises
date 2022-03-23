/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpahm;

/**
 *
 * @author lastreet'zer
 */
public class Periode {
    private DateP dateDebut;
    private DateP dateFin;
    private ArrayList<Commande>lesCommandes;
    
    public Periode (DateP uneDateDebut , DateP uneDateFin) {
        this.dateDebut = uneDateDebut;
        this.dateFin = uneDateFin;
        
    }
    
    public void ajoutCommande (Commande uneCommande) {
        
    }
    
    public float totalCA () {
        float CA;
        return CA;
    }
    
    public int ventesAllumeFeu () {
        
    }
}
