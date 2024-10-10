/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame(); // opjeto tipo JFrame
    JPanel panel = new JPanel(); // opjeto tipo JPanel
    JTextArea areaTexto = new JTextArea(); //creamos la caja de texto
    

    public Ventana() { // constructor vacio para la ventana JFrame
        frame.setVisible(true); // hace que la ventana sea visible 

        frame.setTitle(""); // sirve para poner un tiulo

        frame.setSize(800, 400); // elegir el tamaño de la pantalla
        frame.setResizable(false); //para permitir (o no) cambiar el tamaño de la pantalla 

        frame.setLocation(500, 500);

        frame.getContentPane().setBackground(Color.green);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Panel();
        AreaTexto();
        Boton();

    }

    public void Panel() {
        panel.setBackground(Color.pink); //poner color al panel
        panel.setMaximumSize(new Dimension(800, 400));// maximo de tamaño del panel
        panel.setMinimumSize(new Dimension(200, 100)); // tamaño minimo del panel

        panel.setLayout(null);

        frame.add(panel);
    }

    public void AreaTexto() {
        areaTexto.setBounds(50, 150, 300, 140);
        areaTexto.setBackground(Color.WHITE);
        areaTexto.setForeground(Color.black);
        areaTexto.setFont(new Font("Ink Free", Font.BOLD, 20));
        
        panel.add(areaTexto);

    }

    public void Boton() {
        JButton boton = new JButton();
        
        boton.setBounds(500, 120, 100, 100);
        boton.setText("Pulsame");
        boton.setBackground(Color.orange);
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(areaTexto.getText());
                
            }
            
        };
        boton.addActionListener(pulsar); 
        
        panel.add(boton);
        
    }

}
