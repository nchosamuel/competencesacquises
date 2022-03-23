/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brochurepdf;

import java.sql.Date;


/**
 *
 * @author lastreet'zer
 */
public class Reservation2 {
   
    private int idResa;
    private String nomResa;
    private Date date;
    private int dureeJ;
    int idBat;
    
    public Reservation2(int unId, Date uneDate, int uneDuree, String NnomResa){
        this.idResa = unId;
        this.date = uneDate;
        this.dureeJ = uneDuree;
        this.nomResa = nomResa;
    }
    
    public int getIdResa(){
        return idResa;
    }
    
    public void setIdResa(int id){
        this.idResa = id;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public int getDuree(){
        return dureeJ;
    }
    
    public void setDuree(int duree){
        this.dureeJ = duree;
        
    }
    
    public String getNomResa(){
        return nomResa;
    }
    
    public void setNomResa(String nom){
        this.nomResa = nom;
    }
    
     public String versChaine(){
        
        return (" Nom de la reservation: " + this.getNomResa() +"\n duree: " + this.getDuree() +"\n date: " + this.getDate());
    }
    
    
    
}
