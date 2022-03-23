/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.*;

public class Fichier {
    
    private BufferedWriter fW;
    private BufferedReader fR;
    private char mode;
    
    public void ouvrir (String nomDuFichier, String s) throws IOException {
        mode = (s.toUpperCase()).charAt(0);
        File f = new File (nomDuFichier);
        if (mode == 'R' || mode == 'L'){
            fR = new BufferedReader(new FileReader(f));}
        else if (mode == 'W' || mode == 'E'){
            fW = new BufferedWriter( new FileWriter(f));  }
    }
    
    public void ecrire (int tmp) throws IOException {
        String chaine="";
        chaine = String.valueOf(tmp);
        if (chaine != null){
            fW.write(chaine, 0, chaine.length());
            fW.newLine();
        }
    }
    
    public String lire() throws IOException {
        String chaine = fR.readLine() ;
        return chaine;
        
    }
    
    public void fermer () throws IOException {
        if (mode == 'R' || mode == 'L'){
            fR.close();
        }
        else { 
            fW.close();
        }
    }


    
}