/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FP
 */
public class Ventana {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton botonAleatorio = new JButton();
    JButton botonMano = new JButton();
    JButton botonJugar = new JButton();
    JButton reiniciar = new JButton();
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JTextField num3 = new JTextField();
    JTextField num4 = new JTextField();
    JTextField num5 = new JTextField();
    JLabel cartonR = new JLabel();
    JLabel jugadoresR = new JLabel();
    JLabel ganadoresR = new JLabel();
    JLabel boteR = new JLabel(); 
    JLabel premioR = new JLabel();
    Juego juego = new Juego();
    JLabel info = new JLabel();


    /* 
    JLabel jugadores = new JLabel();
    JLabel ganadores = new JLabel();
    JLabel premio = new JLabel();*/
    public Ventana() {
        frame.setVisible(true);
        frame.setTitle("¡La rifa!");
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocation(400, 100);
        
        Panel();
        botonJugar();
        botonAleatorio();
        botonMano();
        botonReiniciar();
        carton();
        jugadores();
        ganadores();
        bote();
        premio();
        numeroCarton1();
        numeroCarton2();
        numeroCarton3();
        numeroCarton4();
        numeroCarton5();
        informacion();
        cartonResultado();
        jugadoresResultado();
        ganadoresResultado();
        boteResultado();
        premioResultado();
        
    }
    
    public void Panel() {
        panel.setSize(1000, 600);
        panel.setMaximumSize(new Dimension(1000, 600));
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        
        frame.add(panel);
    }
    
    public void informacion() {
        
        
        info.setOpaque(true);
        info.setBounds(50, 20, 600, 40);
        info.setText("Bienvenido al juego de la rifa, elige el tipo de carton que quieres jugar");
        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setFont(new Font("Arial", Font.ITALIC, 13));
        info.setBackground(Color.YELLOW);
        
        panel.add(info);
        
    }
    
    public void botonJugar() {
        
        JButton botonJugar = new JButton();
        botonJugar.setBounds(170, 170, 200, 40);
        botonJugar.setText("¡JUGAR!");
        botonJugar.setFont(new Font("Arial", Font.ITALIC, 13));
        botonJugar.setBackground(Color.PINK);
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código que quieres que se ejecute al pulsar el botón
                cartonR.setText(Arrays.toString(juego.carton));
                jugadoresR.setText(juego.numJugadores());
                ganadoresR.setText(Arrays.toString(juego.cartonGanador()));
                boteR.setText(juego.bote()+" €");
                
            }
        };
        
        botonJugar.addActionListener(pulsar);  // Añadir el ActionListener al botón
        panel.add(botonJugar);
    }
    
    public void botonAleatorio() {
        
        JButton botonAleatorio = new JButton();
        botonAleatorio.setBounds(750, 120, 200, 40);
        botonAleatorio.setText("Cartón Aleatorio");
        botonAleatorio.setFont(new Font("Arial", Font.ITALIC, 13));
        botonAleatorio.setBackground(Color.PINK);
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código que quieres que se ejecute al pulsar el botón
                
                num1.setText(juego.cartonAleatorio1());
                num2.setText(juego.cartonAleatorio2());
                num3.setText(juego.cartonAleatorio3());
                num4.setText(juego.cartonAleatorio4());
                num5.setText(juego.cartonAleatorio5());
                
            }
        };
        
        botonAleatorio.addActionListener(pulsar);
        
        panel.add(botonAleatorio);
    }
    
    public void botonMano() {
        
        JButton botonMano = new JButton();
        botonMano.setBounds(750, 70, 200, 40);
        botonMano.setText("Cartón a mano");
        botonMano.setFont(new Font("Arial", Font.ITALIC, 13));
        botonMano.setBackground(Color.PINK);
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código que quieres que se ejecute al pulsar el botón
                
                
            }
        };
        
        panel.add(botonMano);
    }
    
    
    public void botonReiniciar() {
        
        JButton botonReiniciar = new JButton();
        botonReiniciar.setBounds(600, 500, 200, 40);
        botonReiniciar.setText("Reiniciar juego");
        botonReiniciar.setFont(new Font("Arial", Font.ITALIC, 13));
        botonReiniciar.setBackground(Color.PINK);
        
        
        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código que quieres que se ejecute al pulsar el botón
                num1.setText(" ");
                num2.setText(" ");
                num3.setText(" ");
                num4.setText(" ");
                num5.setText(" ");
                cartonR.setText(" ");
                jugadoresR.setText(" ");
                ganadoresR.setText(" ");
                premioR.setText(" ");
                boteR.setText(" ");
            }
        };
        botonReiniciar.addActionListener(pulsar);
        
        
        panel.add(botonReiniciar);
    }
    
    public void carton() {
        
        JLabel carton = new JLabel();
        
        carton.setOpaque(true);
        carton.setBounds(100, 250, 200, 40);
        carton.setText("Tu cartón: ");
        carton.setHorizontalAlignment(SwingConstants.CENTER);
        carton.setFont(new Font("Arial", Font.ITALIC, 13));
        carton.setBackground(Color.YELLOW);
        
        panel.add(carton);
        
    }
    
    public void jugadores() {
        JLabel jugadores = new JLabel();
        
        jugadores.setOpaque(true);
        jugadores.setBounds(100, 300, 200, 40);
        jugadores.setText("Nº de jugadores: ");
        jugadores.setHorizontalAlignment(SwingConstants.CENTER);
        jugadores.setFont(new Font("Arial", Font.ITALIC, 13));
        jugadores.setBackground(Color.YELLOW);
        
        panel.add(jugadores);
    }
    
    public void ganadores() {
        JLabel ganadores = new JLabel();
        
        ganadores.setOpaque(true);
        ganadores.setBounds(100, 350, 200, 40);
        ganadores.setText("Nº ganadores: ");
        ganadores.setHorizontalAlignment(SwingConstants.CENTER);
        ganadores.setFont(new Font("Arial", Font.ITALIC, 13));
        ganadores.setBackground(Color.YELLOW);
        
        panel.add(ganadores);
    }
    
    public void bote(){
        JLabel bote = new JLabel();
        
        bote.setOpaque(true);
        bote.setBounds(100, 400, 200, 40);
        bote.setText("Bote: ");
        bote.setHorizontalAlignment(SwingConstants.CENTER);
        bote.setFont(new Font("Arial", Font.ITALIC, 13));
        bote.setBackground(Color.YELLOW);
        
        panel.add(bote);
    }
    
    public void premio() {
        JLabel premio = new JLabel();
        
        premio.setOpaque(true);
        premio.setBounds(100, 450, 200, 40);
        premio.setText("Tu premio: ");
        premio.setHorizontalAlignment(SwingConstants.CENTER);
        premio.setFont(new Font("Arial", Font.ITALIC, 13));
        premio.setBackground(Color.YELLOW);
        
        panel.add(premio);
    }
    
    public void cartonResultado() {
        
        cartonR.setOpaque(true);
        cartonR.setBounds(350, 250, 200, 40);
        cartonR.setFont(new Font("Arial", Font.ITALIC, 13));
        cartonR.setBackground(Color.orange);
        
        panel.add(cartonR);
    }
    
    public void jugadoresResultado() {
        
        jugadoresR.setOpaque(true);
        jugadoresR.setBounds(350, 300, 200, 40);
        jugadoresR.setFont(new Font("Arial", Font.ITALIC, 13));
        jugadoresR.setBackground(Color.orange);
        
        panel.add(jugadoresR);
    }
    
    public void ganadoresResultado() {
        
        ganadoresR.setOpaque(true);
        ganadoresR.setBounds(350, 350, 200, 40);
        ganadoresR.setFont(new Font("Arial", Font.ITALIC, 13));
        ganadoresR.setBackground(Color.orange);
        
        panel.add(ganadoresR);
    }
    
    public void boteResultado(){
        boteR.setOpaque(true);
        boteR.setBounds(350, 400, 200, 40);
        boteR.setFont(new Font("Arial", Font.ITALIC, 13));
        boteR.setBackground(Color.orange);
        
        panel.add(boteR);
    }
    
    public void premioResultado() {
        
        premioR.setOpaque(true);
        premioR.setBounds(350, 450, 200, 40);
        premioR.setFont(new Font("Arial", Font.ITALIC, 13));
        premioR.setBackground(Color.orange);
        
        panel.add(premioR);
    }
    
    public void numeroCarton1() {
        
        num1.setBounds(50, 100, 50, 50);
        num1.setFont(new Font("Arial", Font.BOLD, 20));
        
        panel.add(num1);
        
    }
    
    public void numeroCarton2() {
        
        num2.setBounds(150, 100, 50, 50);
        num2.setFont(new Font("Arial", Font.BOLD, 20));
        
        panel.add(num2);
        
    }
    
    public void numeroCarton3() {
        
        num3.setBounds(250, 100, 50, 50);
        num3.setFont(new Font("Arial", Font.BOLD, 20));
        
        panel.add(num3);
        
    }
    
    public void numeroCarton4() {
        
        num4.setBounds(350, 100, 50, 50);
        num4.setFont(new Font("Arial", Font.BOLD, 20));
        
        panel.add(num4);
        
    }
    
    public void numeroCarton5() {
        
        num5.setBounds(450, 100, 50, 50);
        num5.setFont(new Font("Arial", Font.BOLD, 20));
        
        panel.add(num5);
        
    }
}
