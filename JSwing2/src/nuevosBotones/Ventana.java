/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevosBotones;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    public Ventana (){
    
        frame.setVisible(true);
        frame.setTitle("Botones nuevos"); 
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 500);
        frame.getContentPane().setBackground(Color.white);
        
        
        Panel();
        
    }
    
    public void Panel(){
        
        panel.setBackground(Color.orange);
        panel.setMaximumSize(new Dimension(800,400));
        panel.setMinimumSize(new Dimension (800,400));
        panel.setLayout(null);
        
        frame.add(panel);
         
    }

}
