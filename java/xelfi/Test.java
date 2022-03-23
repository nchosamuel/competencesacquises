/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xelfi;

import java.sql.*;

/**
 *
 * @author lastreet'zer
 */
public class Test {
    
    public static void main(String[] args){
        
        Parametre connexion = new Parametre();
        Connection laConnexion = null;
        try
        {
            connexion.setLogin("root");
            connexion.setPassword("");
            connexion.getConnexion(laConnexion);
        }
        
        catch(SQLException ex)
        {
            System.out.println("pb Connexion " + ex.getMessage());
        }
    }
}
