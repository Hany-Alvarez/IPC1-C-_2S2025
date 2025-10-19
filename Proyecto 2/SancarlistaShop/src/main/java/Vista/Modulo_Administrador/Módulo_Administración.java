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
public final class Módulo_Administración extends JFrame {

    //Declaración de Variables
    JPanel Menu;
    JPanel Vendores;
    JPanel Productos;
    JPanel Reportes;

    JButton vendedores;
    JButton productos;
    JButton reportes;

    JButton Crear;
    JButton Actualizar;
    JButton Cargar;
    JButton Eliminar;

    public Módulo_Administración(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(960, 600);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Todos los métodos
        Barra();
        Vendedores();
        Productos();
    }

    public void Barra() {
        
  
 ///Boton para mostrar panel de vendedores
        vendedores = new JButton("Vendedores");
        //Configuraciones de diseño
        vendedores.setBounds(50, 60, 283, 40);
        vendedores.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        vendedores.setBackground(new Color(51, 51, 51));
        vendedores.setForeground(new Color(255, 204, 51));
        add(vendedores);
        
        
        
        
 //////Boton para mostrar panel de productos
        productos = new JButton("Productos");
        productos.setBounds(334, 60, 282, 40);
        productos.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        productos.setBackground(new Color(255, 204, 51));
        productos.setForeground(new Color(51, 51, 51));
        add(productos);
        
        

///Boton para mostrar panel de reportes
        reportes = new JButton("Reportes");
        reportes.setBounds(616, 60, 283, 40);
        reportes.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        reportes.setBackground(new Color(255, 204, 51));
        reportes.setForeground(new Color(51, 51, 51));
        add(reportes);
    }

    public void Vendedores() {
        //Panel
        this.setLayout(null);//Permite dimensionarl el panel

        Vendores = new JPanel();
        Vendores.setBackground(new Color(51, 153, 255));//Color
        Vendores.setBounds(50, 100, 849, 440);
        add(Vendores);//Agregar a la ventana general

        //Boton Crear
        Vendores.setLayout(null);
        Crear = new JButton("Crear");
        Crear.setBounds(570, 30, 120, 30);
        Crear.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Crear.setBackground(new Color(255, 255, 255));
        Crear.setForeground(new Color(51, 51, 51));
        Vendores.add(Crear);//Agregando al panel de vendedores

        //Boton Actualizar
        Vendores.setLayout(null);
        Actualizar = new JButton();
        Actualizar = new JButton("Actualizar");
        Actualizar.setBounds(570, 70, 120, 30);
        Actualizar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Actualizar.setBackground(new Color(255, 255, 255));
        Actualizar.setForeground(new Color(51, 51, 51));
        Vendores.add(Actualizar);//Agregando al panel de vendedores

        //Boton Cargar
        Vendores.setLayout(null);
        Cargar = new JButton();
        Cargar = new JButton("Cargar");
        Cargar.setBounds(710, 30, 120, 30);
        Cargar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Cargar.setBackground(new Color(255, 255, 255));
        Cargar.setForeground(new Color(51, 51, 51));
        Vendores.add(Cargar);//Agregando al panel de vendedores

        //Boton Eliminar
        Eliminar = new JButton();
        Eliminar.setLayout(null);
        Eliminar = new JButton();
        Eliminar = new JButton("Eliminar");
        Eliminar.setBounds(710, 70, 120, 30);
        Eliminar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Eliminar.setBackground(new Color(255, 255, 255));
        Eliminar.setForeground(new Color(51, 51, 51));
        Vendores.add(Eliminar);//Agregando al panel de vendedores

    }

    public void Productos() {
        //Vendedores
        this.setLayout(null);//Permite dimensionarl el panel
        Productos = new JPanel();
        Productos.setBackground(new Color(255, 255, 0));//Color
        Productos.setBounds(50, 100, 700, 500);
        //add(Vendores);//Agregar a la ventana general

    }

}
