/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import java.awt.event.*;
/**
 *
 * @author lastreet'zer
 */
public class EcouteurSouris extends MouseAdapter{

    /**
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clic");
        int x,y;
        x=e.getX();
        y=e.getY();
        System.out.println("x:"+x + "\ny:"+y);
    }
}
