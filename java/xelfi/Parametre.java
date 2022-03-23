/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xelfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Parametre {
    
    private String nomUtilisateur;
    private String motDePasse;
    private String serveurBD;
    private String driverSGBD; 
    
   
    public static void getConnexion(Connection connexion){
        connexion = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/xelfi","root","");
            System.out.println("connexion OK");
        }
        
        catch(ClassNotFoundException ex)
        {
            System.out.println("classe introuvable " + ex.getMessage());
        }
        
        catch(SQLException ex)
        {
            System.out.println("connexion impossible " + ex.getMessage());
        }
        
        
    }
    
    public static void setLogin(String login){
        
    }
    
    public static void setPassword(String password){
        
    }
}

