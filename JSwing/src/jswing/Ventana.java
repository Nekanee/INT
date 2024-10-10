/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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

    JFrame frame = new JFrame(); // opjeto tipo JFrame
    JPanel panel = new JPanel(); // opjeto tipo JPanel
    JTextField cajaTexto = new JTextField(); //creamos la caja de texto

    public Ventana() { // constructor vacio para la ventana JFrame
        frame.setVisible(true); // hace que la ventana sea visible 

        frame.setTitle("Java Swing"); // sirve para poner un tiulo

        frame.setSize(500, 500); // elegir el tamaño de la pantalla
        frame.setResizable(false); //para permitir (o no) cambiar el tamaño de la pantalla 
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para poner pantalla completa

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // no hace nada al darle a la x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cierra al darle a la x (por efecto )
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //minimiza al darle a la x 
        //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //eliminar al darle a la x

        frame.setLocation(500, 500); // sirve para cambiar la posicion de la pantalla 

        frame.getContentPane().setBackground(Color.green); // poner color a la ventana

        Panel();    //llama al metodo panel 
        Etiqueta(); // llamar a metodo etiqueta
        Boton();
        CajaTexto();
        EtiquetaImagen();
        FondoPantalla();

    }

    public void Panel() { // se pone un void por que no va devolver nada, metodo
        panel.setBackground(Color.pink); //poner color al panel
        //panel.setSize(200, 100); //cambiar tamaño del panel 
        panel.setMaximumSize(new Dimension(500, 500));// maximo de tamaño del panel
        panel.setMinimumSize(new Dimension(200, 100)); // tamaño minimo del panel

        // Para posicionar otros elementos en el panel.
        //panel.setLayout(new FlowLayout());          //alineamiento a la izquieda
        //panel.setLayout(new BorderLayout());        //Cinco zonas: norte, sur, este, oeste, centro
        //panel.setLayout(new GridBagLayout() );      //Una cuadricula flexible
        //panel.setLayout(new GridLayout());          //Una cuadricula predefinida
        //panel.setLayout(new BoxLayout(panel, 0));   //por coordenadas
        panel.setLayout(null);                       // descativa el layout po defecto

        frame.add(panel); // añadimos el panel a la ventana 
    }

    public void FondoPantalla() {

        JLabel fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        fondo.setBackground(Color.blue);
        ImageIcon imagen = new ImageIcon("Imagenes/goldenRetriever.jpg");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
        

        panel.add(fondo);
    }

    public void Etiqueta() { // metodo para construir una etiqueta 
        JLabel etiqueta = new JLabel(); // crear etiqueta  
        etiqueta.setText("Nombre: "); // ponerle un texto a la etiqueta 

        etiqueta.setBounds(50, 60, 100, 50); // para cambiar tamaño (2 segundos) y coordendas (2 primeros)
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //cetrar el texto del label 

        etiqueta.setOpaque(true); // para que sea opaco
        etiqueta.setForeground(Color.magenta);//poner el texto en otro color
        etiqueta.setBackground(Color.YELLOW); // color de fondo de la etiqueta 

        etiqueta.setFont(new Font("Ink Free", Font.BOLD, 20)); //cambiar fuente

        panel.add(etiqueta); // se añade a panel

    }

    public void CajaTexto() {

        cajaTexto.setBounds(160, 60, 280, 50); // ponemos coordenadas y tamaño
        cajaTexto.setForeground(Color.BLUE);
        cajaTexto.setBackground(Color.red);
        cajaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        cajaTexto.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(cajaTexto); // añadimos la caja de texto al panel
    }

    public void Boton() {
        JButton boton = new JButton();

        ImageIcon imagenBoton = new ImageIcon("Imagenes/goldenRetriever.jpg");

        boton.setBounds(50, 120, 390, 50);
        //boton.setText("Pulsame");
        boton.setForeground(Color.GRAY);
        boton.setBackground(Color.BLACK);
        boton.setFont(new Font("Georgia", Font.ITALIC, 30));
        boton.setIcon(imagenBoton);

        boton.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT)));

        JLabel respuesta = new JLabel();
        panel.add(respuesta);

        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                respuesta.setBounds(50, 180, 390, 50);
                respuesta.setText("HALA MADRID " + cajaTexto.getText() + " !!");
                respuesta.setFont(new Font("Arial", Font.BOLD, 20));

                panel.add(respuesta);
            }
            //throw new UnsupportedOperationException("Not supported yet."); excepcion por defcto
        };
        boton.addActionListener(pulsar);        // Se activa al hacer clic en el botón
        cajaTexto.addActionListener(pulsar);    // Se activa al darle al ente en el cuadro de texto

        panel.add(boton);
    }

    public void EtiquetaImagen() {

        // por defecto las imagenes tienen un tamaño determindo si lo queremos modificar tenemos que usar setBounds
        // JLabel etiquetaImagen = new JLabel (new ImageIcon("Imagenes/goldenRetriever.jpg")); // añadir una imagen en el constructor
        ImageIcon imagen = new ImageIcon("Imagenes/goldenRetriever.jpg");
        JLabel etiquetaImagen = new JLabel(imagen);

        etiquetaImagen.setBounds(50, 220, 100, 100);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT)));

        panel.add(etiquetaImagen);

    }

}
