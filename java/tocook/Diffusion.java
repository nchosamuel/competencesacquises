/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocook;


import java.util.Date;

/**
 *
 * @author lastreet'zer
 */
public class Diffusion {
    
    
    private int id;
    private Date leJour;
    private String horraire;
    private boolean direct;
    private Programme leProgramme;
    
    public Diffusion(int unId, Date unJour, String unHorraire, boolean enDirect){
        this.id = unId;
        this.leJour = unJour;
        this.horraire = unHorraire;
        this.direct = enDirect;
    }
    
    public Date getLeJour(){
        return leJour;
    }
    
    public boolean getDirect() {
        return direct;
    }
    
    public String toXML(){
        
        return "<?xml version="+"1.0" + "encoding=" +"UTF-8" + "?>\n" + "<Diffusion>\n" + Diffusion.getLeJour();
    }
}
