/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphique;

import static com.sun.java.accessibility.util.AWTEventMonitor.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lastreet'zer
 */
public class MaFenetre extends JFrame{
    public MaFenetre(){// constructeur
        setSize(600,300) ;
        setTitle("ma première fenêtre") ;
        
        addMouseListener(new EcouteurSouris());
        
        JButton monBouton;
        monBouton = new JButton("bouton 1");
        Container c = getContentPane();
        c.add(monBouton);
        getContentPane().setLayout(new FlowLayout()) ;
        
        JButton monBouton2;
        monBouton2 = new JButton("bouton 2");
        Container c2 = getContentPane();
        c2.add(monBouton2);
        getContentPane().setLayout(new FlowLayout()) ;
        
        addActionListener(new EcouteurBouton());
    }
    
}
