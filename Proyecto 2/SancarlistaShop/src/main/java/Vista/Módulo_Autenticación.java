/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

//Mis importaciones
import Controlador.Controlador;

/**
 *
 * @author hanya
 */
public final class Módulo_Autenticación extends JFrame {

//Declaración de Variables
    public static Módulo_Autenticación visibilidad;//Es un atributo global para todo el proyecto

    JPanel InicioSesión;
    JLabel titulo;
    JComboBox opciones;//Si nos da tiempo la lista desplegable
    JLabel text1;
    JLabel text2;
    JTextField text11;
    JTextField text22;

    //get
    public String getcodigo;
    public String getcontraseña;
    //set

    //OPCIONES
    String ac = "ac";

    //Constructor de la clase Módulo
    public Módulo_Autenticación(String title) throws HeadlessException {
        super(title);
        visibilidad = this;// Es la dirección para la ventana general

        Dimension d = new Dimension(960, 600);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //Todos los métodos (botones, paneles, labels...)
        Paneles();
        Etiquetas();
        Text();

    }

    private void Paneles() {
        InicioSesión = new JPanel();
        this.getContentPane().add(InicioSesión);//Agregar a la ventana general
        InicioSesión.setBackground(new Color(51, 153, 255));//Color
    }

    public void Etiquetas() {
        this.InicioSesión.setLayout(null);//Se le quitan las propiedades del panel

        ///SANCARLISTA SHOP 
    //Condiciones base e icono
        ImageIcon icono = new ImageIcon("images/Logo0.png");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        titulo = new JLabel("Sancarlista Shop", USAC, SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);//Color del título
        titulo.setBounds(78, 0, 800, 300);//Posición

        //Fuente
        Font fuente = new Font("Super Joyful", Font.PLAIN, 50);
        titulo.setFont(fuente);

        this.InicioSesión.add(titulo);

        ///CODIGO
        //Condiciones base
        text1 = new JLabel("Código");
        text1.setForeground(Color.WHITE);
        text1.setBounds(200, 150, 800, 300);

        //Fuente
        Font fuente1 = new Font("Super Joyful", Font.PLAIN, 40);
        text1.setFont(fuente1);

        this.InicioSesión.add(text1);

        ///CONTRASEÑA
        //Condiciones base
        text2 = new JLabel("Contraseña");
        text2.setForeground(Color.WHITE);
        text2.setBounds(200, 270, 800, 300);

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 40);
        text2.setFont(fuente2);

        this.InicioSesión.add(text2);
    }

    public void Text() {

        ///CODIGO
        text11 = new JTextField();
        text11.setText("Codigo");
        text11.setBounds(410, 280, 300, 40);
        text11.setFont(new Font("Super Joyful", Font.BOLD, 25));
        text11.setBackground(new Color(255, 255, 255, 255));
        text11.setForeground(new Color(153, 153, 153));//Color de la fuente

        this.InicioSesión.add(text11);

        ///CONTRASEÑA
        text22 = new JTextField();
        text22.setText("Contraseña");
        text22.setBounds(410, 400, 300, 40);
        text22.setFont(new Font("Super Joyful", Font.BOLD, 25));
        text22.setBackground(new Color(255, 255, 255, 255));
        text22.setForeground(new Color(153, 153, 153));//Color de la fuente

        this.InicioSesión.add(text22);

        //Validar por código
        text11.addActionListener(e -> {
            getcodigo = text11.getText();
            System.out.println(getcodigo);
            //ac="a";

            getcontraseña = text22.getText();
            System.out.println(getcontraseña);
            ac = "a";

            Controlador OP = new Controlador();
            OP.AbrirCerrrar(ac, getcodigo, getcontraseña);

        });
        //Validar por contraseña
                text22.addActionListener(e -> {
            getcodigo = text11.getText();
            System.out.println(getcodigo);
            //ac="a";

            getcontraseña = text22.getText();
            System.out.println(getcontraseña);
            ac = "a";

            Controlador OP = new Controlador();
            OP.AbrirCerrrar(ac, getcodigo, getcontraseña);

        });

    }

}
