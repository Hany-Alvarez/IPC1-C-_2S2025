/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador;

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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hanya
 */
public class Eliminar_Vendedor extends JFrame {

    JLabel titulo;
    JLabel codigo;

    JTextField ecodigo;

    JButton eliminar;

    public Eliminar_Vendedor(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(500, 400);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Actualizar_Vendedor.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Métodos
        eliminar();
        codigo();

    }

    private void eliminar() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/eli.gif");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        titulo = new JLabel("Eliminar Vendedor", USAC, SwingConstants.CENTER);
        titulo.setForeground(new Color(25, 25, 133));//Color del título
        titulo.setBounds(20, 25, 480, 100);//Posición

        //Fuente
        Font fuente = new Font("Super Joyful", Font.PLAIN, 40);
        titulo.setFont(fuente);
        add(titulo);
//--------------------------------------------------------------------------------------------
        this.setLayout(null);
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(110, 300, 280, 30);
        eliminar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        eliminar.setBackground(new Color(255, 255, 255));
        eliminar.setForeground(new Color(51, 51, 51));
        add(eliminar);//Agregando al panel 

    }

    private void codigo() {
        this.setLayout(null);
        codigo = new JLabel("Codigo");
        codigo.setForeground(new Color(25, 25, 133));//Color del título
        codigo.setBounds(50, 138, 100, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        codigo.setFont(fuente2);
        add(codigo);
//-------------------------------------------------------------------------------------
        ecodigo = new JTextField();
        ecodigo.setText("");
        ecodigo.setBounds(200, 180, 250, 30);
        ecodigo.setFont(new Font("Super Joyful", Font.BOLD, 25));
        ecodigo.setBackground(new Color(255, 255, 255, 255));
        ecodigo.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(ecodigo);
    }

}
