/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Módulo_Vendedor;

/*
Interfaz Base para las ventanas de MODULO VENDEDOR
*/
import Vista.Modulo_Administrador.Vendedor.Crear_Vendedor;
import Vista.Modulo_Administrador.Vendedor.Eliminar_Vendedor;
import Controlador.Administrador_Vendedores.CargarA;
import Controlador.Controlador;
import Controlador.Administrador_Vendedores.Vendedor;
import Controlador.Vendedor_Producto.CargarA_Vendedor_Producto;
import Vista.Modulo_Administrador.Producto.Crear_Producto;
import Vista.Modulo_Administrador.Vendedor.Actualizar_Vendedor;

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
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author hanya
 */

public final class Módulo_Vendedor extends JFrame {

    //Declaración de Variables
    public static Módulo_Vendedor q;
    public static JTable tabla3;
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
    JButton grafica;
    JPanel espacioGráfico;

    public Módulo_Vendedor(String title) throws HeadlessException {
        super(title);
        q = this;

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
        Vendores.setBackground(new Color(0, 204, 204));//Color
        Vendores.setBounds(50, 100, 849, 440);
        add(Vendores);//Agregar a la ventana general

        //Boton Actualizar
        Vendores.setLayout(null);
        Actualizar = new JButton();
        Actualizar = new JButton("Actualizar");
        Actualizar.setBounds(650, 100, 150, 30);
        Actualizar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Actualizar.setBackground(new Color(255, 255, 255));
        Actualizar.setForeground(new Color(51, 51, 51));
        Vendores.add(Actualizar);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar_Producto_Vendedor_Producto Ver = new Actualizar_Producto_Vendedor_Producto("Actualizar Producto");
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
        Cargar.setBounds(650, 150, 150, 30);
        Cargar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        Cargar.setBackground(new Color(255, 255, 255));
        Cargar.setForeground(new Color(51, 51, 51));
        Vendores.add(Cargar);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CargarA_Vendedor_Producto cargar = new CargarA_Vendedor_Producto();
                try {
                    cargar.Archivo(Vendores);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Módulo_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        ///Acciones
          Cargar.addActionListener(abrir3);//Se le agrega la acción

//--------------------------------------------------------------------------------------
        //Tabla de datos
        //Panel donde ira
        Vendores.setLayout(null);
        JPanel espacioTabla = new JPanel();
        espacioTabla.setBackground(new Color(51, 153, 255));//Color
        espacioTabla.setBounds(25, 20, 600, 400);
        Vendores.add(espacioTabla);

        //Filas
        Object[][] filas = {};
        //Columnas
        String[] columnas = {"Código3", "Nombre", "Categoría", "Stock", "Acciones"};

        //Crear Tabla
        tabla3 = new JTable(filas, columnas);

        //Modificar tamaño de tabla
        tabla3.setRowHeight(50);
        tabla3.getColumnModel().getColumn(4).setPreferredWidth(200);

        //Agregar tabla a un Scroll 
        JScrollPane scroll = new JScrollPane(tabla3);
        scroll.setBounds(0, 0, 600, 400);

        espacioTabla.setLayout(null);
        espacioTabla.add(scroll);
//--------------------------------------------------------------------------------------

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
        vendedores = new JButton("Productos");
        //Configuraciones de diseño
        vendedores.setBounds(50, 60, 283, 40);
        vendedores.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        vendedores.setBackground(new Color(51, 51, 51));
        vendedores.setForeground(new Color(255, 204, 51));
        add(vendedores);

        //////Boton para mostrar panel de productos
        productos = new JButton("Clientes");
        productos.setBounds(334, 60, 282, 40);
        productos.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        productos.setBackground(new Color(255, 204, 51));
        productos.setForeground(new Color(51, 51, 51));
        add(productos);

        //////Boton para mostrar panel de reportes
        reportes = new JButton("Pedidos");
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
                volver.Casa(q);
            }
        };
        ///Acciones
          casa.addActionListener(ircasa);//Se le agrega la acción

    }

}
