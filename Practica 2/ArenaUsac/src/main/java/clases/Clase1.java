/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import java.awt.*;

public class Clase1 extends JFrame{// Se hace una clase hija de JFrame
    
private final JButton btnAbrir=new JButton("Abrir arena");

//
//
// Constructor de la Clase Clase1
    public Clase1(String title) throws HeadlessException {// Es para manejar las excepciones de que el sistema operativo no tenga interfaz gráfica o no sea compatible
        super(title);
        Dimension d=new Dimension (500,500);//Se crea una variable para dimensionar en px
        this.setSize(d);//Esto es para dimensionar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar a la ventana
        this.setResizable(false);//Para no permitir modificar el tamañan de la ventana
       
    
    }


    
}

