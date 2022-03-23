/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brochurepdf;

import java.util.ArrayList;

/**
 *
 * @author lastreet'zer
 */
public class BateauPlaisance extends Bateau {
    
    
    private int idType;
    private String libelleType;
    private float m2Voile;
    private int nbCoque;
    private float tarif;
    private int nbJResa;
    ArrayList<Reservation2> lesReservations = new ArrayList<Reservation2>();
    

    public BateauPlaisance(int unId, String unNom, double uneLong, double uneLarg, int unType, String unLibelle, float m2, int unNbCoque, float unTarif, int unNbJour){
        super(unId, unNom, uneLong, uneLarg);
        this.idType = unType;
        this.libelleType = unLibelle;
        this.m2Voile = m2;
        this.nbCoque = unNbCoque;
        this.tarif = unTarif;
        this.nbJResa = unNbJour;
    }
    
    public int getIdType(){
        return idType;
    }
    
    public void setIdType(int id){
        this.idType = id;
    }
    
    public String getLibelleType(){
        return libelleType;
    }
    
    public void setLibelleType(String libelle){
        this.libelleType = libelle;
    }
    
    public float getM2Voile(){
        return m2Voile;
    }
    
    public void setM2Voile(float m2){
        this.m2Voile = m2;
    }
    
    public int getNbCoque(){
        return nbCoque;
    }
    
    public void setNbCoque(int nb){
        this.nbCoque = nb;
    }
    
     public float getTarif(){
        return tarif;
    }
    
    public void setTarif(float tarif){
        this.tarif = tarif;
    }
    
    public int getNbJResa(){
        return nbJResa;
    }
    
    public void setNbJResa(int nbJ){
        this.nbJResa = nbJ;
    }
    
    public ArrayList<Reservation2> getLesResa(){
        return lesReservations;
    }
    
    public void setLesResa(ArrayList<Reservation2> lesResa){
        this.lesReservations = lesResa;
    }
    
    public void ajouterResa(Reservation2 uneResa){
        this.lesReservations.add(uneResa);
        this.nbJResa += uneResa.getDuree();
    }
    
    public String listeResa(){
        String liste = "";
        for (Reservation2 uneResa : this.lesReservations){
            liste = liste+"-"+uneResa.getNomResa()+"\n";
        }
        return liste;
    }
}
