/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador;

import Controlador.Controlador;

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
    public static Módulo_Administración v;
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

    JButton casa;

    public Módulo_Administración(String title) throws HeadlessException {
        super(title);
        v = this;

        Dimension d = new Dimension(960, 600);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Todos los métodos
        Barra();
        BarraAccion();
        Vendedores();
        Productos();
        Reportes();
        Ir_Casa();
    }

    public void Vendedores() {
        //Panel
        this.setLayout(null);//Permite dimensionarl el panel

        Vendores = new JPanel();
        Vendores.setBackground(new Color(51, 153, 255));//Color
        Vendores.setBounds(50, 100, 849, 440);
        add(Vendores);//Agregar a la ventana general
//--------------------------------------------------------------------------------------
        //Boton Crear
        Vendores.setLayout(null);
        Crear = new JButton("Crear");
        Crear.setBounds(570, 30, 120, 30);
        Crear.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Crear.setBackground(new Color(255, 255, 255));
        Crear.setForeground(new Color(51, 51, 51));
        Vendores.add(Crear);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Crear_Vendedor Ver = new Crear_Vendedor("Creación");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          Crear.addActionListener(abrir);//Se le agrega la acción
        //--------------------------------------------------------------------------------------       

        //Boton Actualizar
        Vendores.setLayout(null);
        Actualizar = new JButton();
        Actualizar = new JButton("Actualizar");
        Actualizar.setBounds(570, 70, 120, 30);
        Actualizar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Actualizar.setBackground(new Color(255, 255, 255));
        Actualizar.setForeground(new Color(51, 51, 51));
        Vendores.add(Actualizar);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar_Vendedor Ver = new Actualizar_Vendedor("Actualizar");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          Actualizar.addActionListener(abrir2);//Se le agrega la acción
//--------------------------------------------------------------------------------------
        //Boton Cargar
        Vendores.setLayout(null);
        Cargar = new JButton();
        Cargar = new JButton("Cargar");
        Cargar.setBounds(710, 30, 120, 30);
        Cargar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Cargar.setBackground(new Color(255, 255, 255));
        Cargar.setForeground(new Color(51, 51, 51));
        Vendores.add(Cargar);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cargar Ver = new Cargar("Cargar");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          Cargar.addActionListener(abrir3);//Se le agrega la acción
//--------------------------------------------------------------------------------------
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

        ///Escritura de cada acción 
        ActionListener abrir4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar_Vendedor Ver = new Eliminar_Vendedor("Eliminar");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          Eliminar.addActionListener(abrir4);//Se le agrega la acción
//--------------------------------------------------------------------------------------
        //Tabla de datos
        //Panel donde ira
        Vendores.setLayout(null);
        JPanel espacioTabla = new JPanel();
        espacioTabla.setBackground(new Color(51, 153, 255));//Color
        espacioTabla.setBounds(25, 20, 510, 400);
        Vendores.add(espacioTabla);

        //Filas
        Object[][] filas = {
            {"VE-001", "Juan Perez", "M", 10},
            {"VE-002", "Juana Perez", "F", 20},
            {"VE-001", "Juan Perez", "M", 10},
            {"VE-002", "Juana Perez", "F", 20},};
        //Columnas
        String[] columnas = {"Código", "Nombre", "Genero", "Cantidad de ventas confirmadas"};

        //Crear Tabla
        JTable tabla = new JTable(filas, columnas);

        //Modificar tamaño de tabla
        tabla.setRowHeight(50);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(300);

        //Agregar tabla a un Scroll 
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(0, 0, 510, 400);

        espacioTabla.setLayout(null);
        espacioTabla.add(scroll);

    }

    public void Productos() {
        //Productos
        this.setLayout(null);//Permite dimensionarl el panel
        Productos = new JPanel();
        Productos.setBackground(new Color(255, 255, 0));//Color
        Productos.setBounds(50, 100, 849, 440);
        add(Productos);//Agregar a la ventana general
        Productos.setVisible(false);
    }

    private void Reportes() {
        //Reportes
        this.setLayout(null);//Permite dimensionarl el panel
        Reportes = new JPanel();
        Reportes.setBackground(new Color(255, 51, 0));//Color
        Reportes.setBounds(50, 100, 849, 440);
        add(Reportes);//Agregar a la ventana general
        Reportes.setVisible(false);

    }

    public void Barra() {

        ///////Boton para mostrar panel de vendedores
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

        //////Boton para mostrar panel de reportes
        reportes = new JButton("Reportes");
        reportes.setBounds(616, 60, 283, 40);
        reportes.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        reportes.setBackground(new Color(255, 204, 51));
        reportes.setForeground(new Color(51, 51, 51));
        add(reportes);

    }

    private void BarraAccion() {
        /// Vendedores     
        ActionListener mostrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Paneles
                Vendores.setVisible(true); //Se oculta el panel de Vendedores 
                Productos.setVisible(false);//Se oculta el panel de producto
                Reportes.setVisible(false);

                //Botones
                reportes.setBackground(new Color(255, 204, 51));
                reportes.setForeground(new Color(51, 51, 51));
                productos.setBackground(new Color(255, 204, 51));
                productos.setForeground(new Color(51, 51, 51));
                vendedores.setBackground(new Color(51, 51, 51));
                vendedores.setForeground(new Color(255, 204, 51));
            }
        };

        ///Acciones
          vendedores.addActionListener(mostrar);//Se le agrega la acción

        /// Productos
          ///Escritura de cada acción 
        ActionListener mostrar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Paneles
                Vendores.setVisible(false); //Se oculta el panel de Vendedores 
                Productos.setVisible(true);//Se muestra el panel de producto
                Reportes.setVisible(false);
                //Botones
                vendedores.setBackground(new Color(255, 204, 51));
                vendedores.setForeground(new Color(51, 51, 51));
                productos.setBackground(new Color(51, 51, 51));
                productos.setForeground(new Color(255, 204, 51));
                reportes.setBackground(new Color(255, 204, 51));
                reportes.setForeground(new Color(51, 51, 51));
            }
        };

        ///Acciones
          productos.addActionListener(mostrar2);//Se le agrega la acción

        ///Reportes
          ///Escritura de cada acción 
        ActionListener mostrar3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Paneles
                Vendores.setVisible(false); //Se oculta el panel de Vendedores 
                Productos.setVisible(false);//Se oculta el panel de producto
                Reportes.setVisible(true);

                //Botones
                vendedores.setBackground(new Color(255, 204, 51));
                vendedores.setForeground(new Color(51, 51, 51));
                productos.setBackground(new Color(255, 204, 51));
                productos.setForeground(new Color(51, 51, 51));
                reportes.setBackground(new Color(51, 51, 51));
                reportes.setForeground(new Color(255, 204, 51));
            }
        };
        ///Acciones
          reportes.addActionListener(mostrar3);//Se le agrega la acción

    }

    public void Ir_Casa() {
        this.setLayout(null);
        casa = new JButton("");
        casa.setBounds(10, 0, 50, 50);
        casa.setFont(new Font("Super Joyful", Font.CENTER_BASELINE, 15));//Esto es para el estilo de letra
        casa.setBackground(new Color(255, 255, 255));//Color de fondo de boton
        casa.setForeground(new Color(51, 51, 51));//color de la letra
        casa.setIcon(new ImageIcon(new ImageIcon("images/casa.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        add(casa);

        ///Escritura de cada acción 
        ActionListener ircasa = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controlador volver = new Controlador();
                volver.Casa(v);
            }
        };
        ///Acciones
          casa.addActionListener(ircasa);//Se le agrega la acción

    }

}
