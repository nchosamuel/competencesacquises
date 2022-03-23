/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lastreet'zer
 */
public class Bdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marieteam","root","");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select * from bateau");
            while(res.next()){
                System.out.println("Nom : " + res.getString(2) );
            }
                    
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Probleme de connexion à la bdd erreur : "+ ex);
        }   
    }
    
}
