/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador;

/*
Interfaz para MÓDULO ADMINISTRADOR
 */
import Vista.Modulo_Administrador.Producto.Eliminar_Producto;
import Vista.Modulo_Administrador.Producto.Crear_Producto;
import Vista.Modulo_Administrador.Producto.Actualizar_Producto;
import Vista.Modulo_Administrador.Vendedor.Eliminar_Vendedor;
import Vista.Modulo_Administrador.Vendedor.Crear_Vendedor;
import Vista.Modulo_Administrador.Vendedor.Actualizar_Vendedor;
import Controlador.Administrador_Vendedores.CargarA;
import Controlador.Administrador_Productos.Cargar_Producto;
import Controlador.Controlador;
import Controlador.Administrador_Vendedores.Vendedor;

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
public final class Módulo_Administración extends JFrame {

    //Declaración de Variables
    public static Módulo_Administración p;
    //Datos para la sección de vendedores-----------------------------------
    public static JTable tabla; //Esto es para el manejo de los vendedores
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
    JButton estu;
    JButton grafica;
    JPanel espacioGráfico;

    //Datos para la sección de productos-----------------------------------
    public static JTable tabla2; //Esto es para le manejo de los productos

    JButton CrearP;
    JButton ActualizarP;
    JButton EliminarP;
    JButton CargarP;

    JButton R_MásVendidos;
    JButton R_MenosVendidos;
    JButton R_Inventario;
    JButton R_VentasVendedor;
    JButton R_ClientesActivos;
    JButton R_Financiero;
    JButton R_PorCaducar;

    public Módulo_Administración(String title) throws HeadlessException {
        super(title);
        p = this;

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
        grafica();
        Ir_Casa();
        Ir_Estudiante();
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

                CargarA cargar = new CargarA();
                try {
                    cargar.Archivo(Vendores);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Módulo_Administración.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        Object[][] filas = {};
        //Columnas
        String[] columnas = {"Código", "Nombre", "Genero", "Confirmados"};

        //Crear Tabla
        tabla = new JTable(filas, columnas);

        //Modificar tamaño de tabla
        tabla.setRowHeight(50);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(200);

        //Agregar tabla a un Scroll 
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(0, 0, 510, 400);

        espacioTabla.setLayout(null);
        espacioTabla.add(scroll);
//--------------------------------------------------------------------------------------

    }

    public void Productos() {
        //Productos
        this.setLayout(null);//Permite dimensionarl el panel
        Productos = new JPanel();
        Productos.setBackground(new Color(255, 204, 0));//Color
        Productos.setBounds(50, 100, 849, 440);
        add(Productos);//Agregar a la ventana general
        Productos.setVisible(false);

//CREAR PRODUCTO----------------------------------------------------------
        Productos.setLayout(null);
        CrearP = new JButton("Crear");
        CrearP.setBounds(670, 50, 150, 30);
        CrearP.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        CrearP.setBackground(new Color(255, 255, 255));
        CrearP.setForeground(new Color(51, 51, 51));
        Productos.add(CrearP);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Crear_Producto Ver2 = new Crear_Producto("Creación de producto");
                Ver2.setVisible(true);
            }
        };
        ///Acciones
          CrearP.addActionListener(abrir);//Se le agrega la acción

//ACTUALIZAR PRODUCTO
        Productos.setLayout(null);
        ActualizarP = new JButton();
        ActualizarP = new JButton("Actualizar");
        ActualizarP.setBounds(670, 100, 150, 30);
        ActualizarP.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        ActualizarP.setBackground(new Color(255, 255, 255));
        ActualizarP.setForeground(new Color(51, 51, 51));
        Productos.add(ActualizarP);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar_Producto Ver = new Actualizar_Producto("Actualizar");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          ActualizarP.addActionListener(abrir2);//Se le agrega la acción

//ELIMINAR PRODUCTO----------------------------------------------------
        EliminarP = new JButton();
        EliminarP.setLayout(null);
        EliminarP = new JButton();
        EliminarP = new JButton("Eliminar");
        EliminarP.setBounds(670, 150, 150, 30);
        EliminarP.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        EliminarP.setBackground(new Color(255, 255, 255));
        EliminarP.setForeground(new Color(51, 51, 51));
        Productos.add(EliminarP);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar_Producto Ver = new Eliminar_Producto("Eliminar");
                Ver.setVisible(true);
            }
        };
        ///Acciones
          EliminarP.addActionListener(abrir4);//Se le agrega la acción

//CARGAR PRODUCTO--------------------------------------------------------
        Productos.setLayout(null);
        CargarP = new JButton();
        CargarP = new JButton("Cargar");
        CargarP.setBounds(670, 200, 150, 30);
        CargarP.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        CargarP.setBackground(new Color(255, 255, 255));
        CargarP.setForeground(new Color(51, 51, 51));
        Productos.add(CargarP);//Agregando al panel de vendedores

        ///Escritura de cada acción 
        ActionListener abrir3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cargar_Producto cargar = new Cargar_Producto();
                try {
                    cargar.Archivo(Productos);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Módulo_Administración.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        ///Acciones
          CargarP.addActionListener(abrir3);//Se le agrega la acción

//TABLA PRODUCTOS----------------------------------------------------------
//Tabla de datos
        //Panel donde ira
        Productos.setLayout(null);
        JPanel espacioTabla = new JPanel();
        espacioTabla.setBackground(new Color(51, 153, 255));//Color
        espacioTabla.setBounds(25, 20, 610, 400);
        Productos.add(espacioTabla);

        //Filas
        Object[][] filas = {};
        //Columnas
        String[] columnas = {"Código", "Nombre", "Categoría", "Acciones"};

        //Crear Tabla
        tabla2 = new JTable(filas, columnas);

        //Modificar tamaño de tabla
        tabla2.setRowHeight(50);
        tabla2.getColumnModel().getColumn(0).setPreferredWidth(200);

        //Agregar tabla a un Scroll 
        JScrollPane scroll = new JScrollPane(tabla2);
        scroll.setBounds(0, 0, 610, 400);

        espacioTabla.setLayout(null);
        espacioTabla.add(scroll);
    }

    private void Reportes() {
        //Reportes
        this.setLayout(null);//Permite dimensionarl el panel
        Reportes = new JPanel();
        Reportes.setBackground(new Color(153, 153, 153));//Color
        Reportes.setBounds(50, 100, 849, 440);
        add(Reportes);//Agregar a la ventana general
        Reportes.setVisible(false);

//REPORTES MÁS VENDIDOS--------------------------------------------
        R_MásVendidos = new JButton("Productos más vendidos");
        //Configuraciones de diseño
        R_MásVendidos.setBounds(50, 60, 283, 40);
        R_MásVendidos.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_MásVendidos.setBackground(new Color(51, 51, 51));
        R_MásVendidos.setForeground(new Color(255, 255, 255));
        Reportes.add(R_MásVendidos);

//REPORTES MENOS VENDIDOS--------------------------------------------
        R_MenosVendidos = new JButton("Productos menos vendidos");
        //Configuraciones de diseño
        R_MenosVendidos.setBounds(50, 60, 283, 40);
        R_MenosVendidos.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_MenosVendidos.setBackground(new Color(51, 51, 51));
        R_MenosVendidos.setForeground(new Color(255, 255, 255));
        Reportes.add(R_MenosVendidos);

//REPORTES INVENTARIO--------------------------------------------
        R_Inventario = new JButton("Inventario");
        //Configuraciones de diseño
        R_Inventario.setBounds(50, 60, 283, 40);
        R_Inventario.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_Inventario.setBackground(new Color(51, 51, 51));
        R_Inventario.setForeground(new Color(255, 255, 255));
        Reportes.add(R_Inventario);

//REPORTES VENTAS VENDEDOR--------------------------------------------
        R_VentasVendedor = new JButton("Inventario");
        //Configuraciones de diseño
        R_VentasVendedor.setBounds(50, 60, 283, 40);
        R_VentasVendedor.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_VentasVendedor.setBackground(new Color(51, 51, 51));
        R_VentasVendedor.setForeground(new Color(255, 255, 255));
        Reportes.add(R_VentasVendedor);

//REPORTES CLIENTS ACTIVOS--------------------------------------------
        R_ClientesActivos = new JButton("Clientes Activos");
        //Configuraciones de diseño
        R_ClientesActivos.setBounds(50, 60, 283, 40);
        R_ClientesActivos.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_ClientesActivos.setBackground(new Color(51, 51, 51));
        R_ClientesActivos.setForeground(new Color(255, 255, 255));
        Reportes.add(R_ClientesActivos);

//REPORTES FINANCIERO--------------------------------------------
        R_Financiero = new JButton("Financiero");
        //Configuraciones de diseño
        R_Financiero.setBounds(50, 60, 283, 40);
        R_Financiero.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_Financiero.setBackground(new Color(51, 51, 51));
        R_Financiero.setForeground(new Color(255, 255, 255));
        Reportes.add(R_Financiero);

//REPORTES PRODUTOS POR CADUCAR--------------------------------------------
        R_PorCaducar = new JButton("Productos por caducar");
        //Configuraciones de diseño
        R_PorCaducar.setBounds(50, 60, 283, 40);
        R_PorCaducar.setFont(new Font("SetiaHati-Regular", Font.CENTER_BASELINE, 15));
        R_PorCaducar.setBackground(new Color(51, 51, 51));
        R_PorCaducar.setForeground(new Color(255, 255, 255));
        Reportes.add(R_PorCaducar);
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
                volver.Casa(p);
            }
        };
        ///Acciones
          casa.addActionListener(ircasa);//Se le agrega la acción

    }

    public void Ir_Estudiante() {
        this.setLayout(null);
        estu = new JButton("");
        estu.setBounds(100, 0, 50, 50);
        estu.setFont(new Font("Super Joyful", Font.CENTER_BASELINE, 15));//Esto es para el estilo de letra
        estu.setBackground(new Color(255, 255, 255));//Color de fondo de boton
        estu.setForeground(new Color(51, 51, 51));//color de la letra
        estu.setIcon(new ImageIcon(new ImageIcon("images/casa.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        add(estu);

        ///Escritura de cada acción 
        ActionListener irestu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Nombre:Hany Clara Jannette Alvarez Bulux\n"
                        + "Curso: Introducción a la Programación y Computación 1\n"
                        + "Estudiante de Ingiería en Sistemas");
            }
        };
        ///Acciones
          estu.addActionListener(irestu);//Se le agrega la acción

    }

    public void grafica() {
        Vendores.setLayout(null);
        grafica = new JButton();
        grafica.setLayout(null);
        grafica = new JButton();
        grafica = new JButton("G");
        grafica.setBounds(760, 400, 60, 30);
        grafica.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        grafica.setBackground(new Color(102, 204, 255));
        grafica.setForeground(new Color(51, 51, 51));
        Vendores.add(grafica);//Agregando al panel de vendedores

        //Gráfico
//Panel donde ira
        ///Escritura de cada acción 
        ActionListener actualizar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (espacioGráfico == null) {
                    try {
                        Vendores.setLayout(null);
                        espacioGráfico = new JPanel();
                        espacioGráfico.setBackground(new Color(51, 153, 255));//Color
                        espacioGráfico.setBounds(570, 130, 250, 290);
                        Vendedor G = new Vendedor();

                        int D1 = G.Dato1();
                        int D2 = G.Dato2();
                        int D3 = G.Dato3();
                        System.out.println("D1: " + D1);
                        System.out.println("D2: " + D2);
                        System.out.println("D3: " + D3);

                        DefaultCategoryDataset datos = new DefaultCategoryDataset();
                        datos.addValue(D1, (Comparable) "Ventas", (Comparable) "Vendedor 1");
                        datos.addValue(D2, (Comparable) "Ventas", (Comparable) "Vendedor 2");
                        datos.addValue(D3, (Comparable) "Ventas", (Comparable) "Vendedor 3");

                        JFreeChart grafico_vendedores = ChartFactory.createBarChart(
                                "Top 3 - Vendedores con más ventas confirmadas",
                                "Vendedor",
                                "Ventas",
                                datos
                        );

                        //Color de las barras
                        CategoryPlot c = (CategoryPlot) grafico_vendedores.getPlot();
                        BarRenderer color = (BarRenderer) c.getRenderer();

                        color.setSeriesPaint(0, new Color(0, 153, 255));

                        //Se agrega a un chart
                        ChartPanel chartPanel = new ChartPanel(grafico_vendedores);//se convierte a chart
                        chartPanel.setPreferredSize(new java.awt.Dimension(250, 290));//Se dimensiona el chart para el tamaño de la gráfica
                        espacioGráfico.add(chartPanel, BorderLayout.CENTER); //Se agrega al panel

                        Vendores.add(espacioGráfico);
                        Vendores.revalidate();
                        Vendores.repaint();
                    } catch (Exception ex) {
                        System.out.println("El error es: " + ex);
                    }

                } else {
                    try {
                        espacioGráfico.removeAll();

                        Vendores.setLayout(null);
                        Vendedor G = new Vendedor();

                        int D1 = G.Dato1();
                        int D2 = G.Dato2();
                        int D3 = G.Dato3();
                        System.out.println("D1: " + D1);
                        System.out.println("D2: " + D2);
                        System.out.println("D3: " + D3);

                        DefaultCategoryDataset datos = new DefaultCategoryDataset();
                        datos.addValue(D1, (Comparable) "Ventas", (Comparable) "Vendedor 1");
                        datos.addValue(D2, (Comparable) "Ventas", (Comparable) "Vendedor 2");
                        datos.addValue(D3, (Comparable) "Ventas", (Comparable) "Vendedor 3");

                        JFreeChart grafico_vendedores = ChartFactory.createBarChart(
                                "Top 3 - Vendedores con más ventas confirmadas",
                                "Vendedor",
                                "Ventas",
                                datos
                        );

                        //Color de las barras
                        CategoryPlot c = (CategoryPlot) grafico_vendedores.getPlot();
                        BarRenderer color = (BarRenderer) c.getRenderer();

                        color.setSeriesPaint(0, new Color(0, 153, 255));

                        //Se agrega a un chart
                        ChartPanel chartPanel = new ChartPanel(grafico_vendedores);//se convierte a chart
                        chartPanel.setPreferredSize(new java.awt.Dimension(250, 290));//Se dimensiona el chart para el tamaño de la gráfica
                        espacioGráfico.add(chartPanel, BorderLayout.CENTER); //Se agrega al panel

                        Vendores.add(espacioGráfico);
                        Vendores.revalidate();
                        Vendores.repaint();
                    } catch (Exception ex) {
                        System.out.println("El error es: " + ex);
                    }
                }
            }
        };
        ///Acciones
          grafica.addActionListener(actualizar);//Se le agrega la acción

    }

}
