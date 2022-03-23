/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

public class Exercice7 {
 public static void main(String[] args) {
        //genere
        
        for(int valeur : genere(50)){
        System.out.print(valeur + " ");     
        }
        System.out.println("");
        
        
        //Somme
        int[] tab_som1 = {19,2,30};
        int[] tab_som2 = {14,44,5};
        int s = somme(tab_som1, tab_som2);
        System.out.println("La somme des deux tableau est : " + s);
        //Trouve
        int[] tab_nombre = {19,2,30,5,9,89,74,32,54,96,1,12};
        int nombre = 19;
        
        System.out.println("Le nombre : " + nombre + " est t'il dans le tableau : " + trouve(tab_nombre,nombre));
        
    }
        //genere
    public static int[] genere(int argument){
    int[] nombre_impair= new int[argument/2];
    
    int n = 0;
    for(int i = 0; i < argument;i++){
        if(i%2 == 1){
        nombre_impair[n]=i;
        n++;
        }
    }
    return nombre_impair;
    }
        //Somme
    public static int somme(int[] tab_som1, int[] tab_som2){
        int resultat_final = 0;
        
        int tab1_resultat = 0;
        int tab2_resultat = 0;
        
        for(int i = 0;i< tab_som1.length;i++){
            tab1_resultat += tab_som1[i];
        }
        for(int o = 0;o< tab_som2.length;o++){
            tab1_resultat += tab_som2[o];
        }
        
        resultat_final = tab1_resultat + tab2_resultat;
        
    return resultat_final;
    }
    //trouve
    public static boolean trouve(int[] tab_nombre, int nombre){
        boolean resultat_trouve=false;
        for(int i =0;i<tab_nombre.length;i++){
            if(tab_nombre[i]==nombre){
            resultat_trouve= true ;
            }
        }
    return resultat_trouve;
    }
}
