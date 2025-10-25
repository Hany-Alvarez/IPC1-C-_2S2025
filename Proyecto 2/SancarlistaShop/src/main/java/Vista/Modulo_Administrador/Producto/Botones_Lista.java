/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador.Producto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author hanya
 */
public class Botones_Lista extends JFrame {

    public static JLabel LAB;
    public static JButton BOT;

    public void Label(String cat) {
                System.out.println("Hola si se entro a la función de Label");

        //this.setLayout(null);
        //ImageIcon icono = new ImageIcon("images/actu.gif");
        //ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        //titulo = new JLabel("Actualizar Vendedor", USAC, SwingConstants.CENTER);
        LAB = new JLabel("Hola");
        //titulo.setForeground(new Color(25, 25, 133));//Color del título
        //titulo.setBounds(20, 25, 480, 100);//Posición

        //Fuente
        //Font fuente = new Font("Super Joyful", Font.PLAIN, 40);
        //titulo.setFont(fuente);
    }

    //PROPUESTA DE BOTON
    

    public void boton(String cat) {
        BOT = new JButton(cat);
        //BOT.setBounds(350, 180, 100, 30);
        BOT.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        BOT.setBackground(new Color(255, 255, 255));
        BOT.setForeground(new Color(0, 102, 204));
        
        
    }
    //DETALLES= Si se crear el boton pero solo muestran sus atributos
    
    
    public void LabelRenderer(){
    
    
    }
    
    
    
    
}
