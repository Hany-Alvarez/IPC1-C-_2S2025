/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Módulo_Vendedor;
/*
Interfaz para Crear vendedores de la subventana(Vendedor) BotonEspecífico(Crear) MÓDULO ADMINISTRADOR
*/
import Vista.Modulo_Administrador.Vendedor.*;
import static Controlador.Administrador_Vendedores.CargarA.A;
import Controlador.Controlador;
import Controlador.Administrador_Vendedores.Vendedor;
import Controlador.Vendedor_Producto.Productos_Vendedor;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hanya
 */
public class Crear_Cliente extends JFrame {

    private JLabel titulo;
    private JLabel codigo;
    private JLabel nombre;
    private JLabel genero;
    private JLabel contraseña;

    private JTextField ecodigo;
    private JTextField enombre;
    private JComboBox egenero;
    private JTextField econtraseña;

    private JButton crear;

    //Variables para funcionalidad
    private String getcodigo;
    private String getnombre;
    private String getgenero;
    private String getcontraseña;

    static String Usuario[][] = new String[100][4];
    static int contador = 0;

    public Crear_Cliente(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(500, 600);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Crear_Cliente.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Todos los métodos 
        Crear();
        Codigo();
        Nombre();
        Genero();
        Contraseña();
        Boton();

    }

    public void Crear() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/crear.png");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        titulo = new JLabel("Crear Cliente", USAC, SwingConstants.CENTER);
        titulo.setForeground(new Color(25, 25, 133));//Color del título
        titulo.setBounds(20, 25, 480, 100);//Posición

        //Fuente
        Font fuente = new Font("Super Joyful", Font.PLAIN, 40);
        titulo.setFont(fuente);
        add(titulo);
//--------------------------------------------------------------------------------------------
        this.setLayout(null);
        crear = new JButton("Crear");
        crear.setBounds(110, 500, 280, 30);
        crear.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        crear.setBackground(new Color(255, 255, 255));
        crear.setForeground(new Color(51, 51, 51));
        add(crear);//Agregando al panel 

    }

    public void Codigo() {
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
        ecodigo.setBounds(250, 180, 200, 30);
        ecodigo.setFont(new Font("Super Joyful", Font.BOLD, 25));
        ecodigo.setBackground(new Color(255, 255, 255, 255));
        ecodigo.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(ecodigo);

    }

    public void Nombre() {
        this.setLayout(null);
        nombre = new JLabel("Nombre");
        nombre.setForeground(new Color(25, 25, 133));//Color del título
        nombre.setBounds(50, 210, 100, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        nombre.setFont(fuente2);
        add(nombre);
        //----------------------------------------------------------------------------------------
        enombre = new JTextField();
        enombre.setText("");
        enombre.setBounds(250, 248, 200, 30);
        enombre.setFont(new Font("Super Joyful", Font.BOLD, 25));
        enombre.setBackground(new Color(255, 255, 255, 255));
        enombre.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(enombre);
    }

    public void Genero() {
        this.setLayout(null);
        genero = new JLabel("Genero");
        genero.setForeground(new Color(25, 25, 133));//Color del título
        genero.setBounds(50, 280, 100, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        genero.setFont(fuente2);
        add(genero);

        //----------------------------------------------------------------------------------------
        String Genero[] = {
            "Masculino",
            "Femenino"
        };

        egenero = new JComboBox(Genero);
        egenero.setBounds(250, 310, 200, 30);
        egenero.setFont(new Font("Super Joyful", Font.BOLD, 25));
        egenero.setBackground(new Color(255, 255, 255, 255));
        egenero.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(egenero);
    }

    public void Contraseña() {
        this.setLayout(null);
        contraseña = new JLabel("Contraseña");
        contraseña.setForeground(new Color(25, 25, 133));//Color del título
        contraseña.setBounds(50, 350, 150, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        contraseña.setFont(fuente2);
        add(contraseña);
        //----------------------------------------------------------------------------------------
        econtraseña = new JTextField();
        econtraseña.setText("");
        econtraseña.setBounds(250, 388, 200, 30);
        econtraseña.setFont(new Font("Super Joyful", Font.BOLD, 25));
        econtraseña.setBackground(new Color(255, 255, 255, 255));
        econtraseña.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(econtraseña);
    }

    public void Boton() {
        ///Escritura de cada acción 
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Productos_Vendedor V8 =new Productos_Vendedor();
                V8.CCCPV(A); //corregir los contadores por si hay corrimiento antes de registrar los datos
//codigo-----------------------------------------------------------------------
                Productos_Vendedor V = new  Productos_Vendedor();
                getcodigo = ecodigo.getText();
                V.setCodigo(getcodigo);
                ecodigo.setText("");

//nombre-----------------------------------------------------------------------
                getnombre = enombre.getText();
                 Productos_Vendedor V2 = new  Productos_Vendedor();
                V2.setNombre(getnombre);
                enombre.setText("");

//genero-----------------------------------------------------------------------
                getgenero = (String) egenero.getSelectedItem();
                 Productos_Vendedor V3 = new  Productos_Vendedor();
                //V3.setGenero(getgenero);

//contraseña-----------------------------------------------------------------------
                getcontraseña = econtraseña.getText();
                 Productos_Vendedor V4 = new  Productos_Vendedor();
                //V4.setContraseña(getcontraseña);
                econtraseña.setText("");

//confirmados-----------------------------------------------------------------------
                 Productos_Vendedor V5 = new  Productos_Vendedor();
                V5.setConfirmados("0");
                V5.validacionF();
//Mostrar en la tabla--------------------------------------------------------------
                 Productos_Vendedor V6 =new  Productos_Vendedor();
                V6.CrearTablaProducto_Vendedor();
                System.out.println(A);
                //funcion
                V6.ReyenarTablaCrear(100);
            }
        };
        ///Acciones
          crear.addActionListener(accion);//Se le agrega la acción
    
///Métodos
    }



}
