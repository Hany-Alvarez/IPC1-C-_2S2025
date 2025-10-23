/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador;

import Controlador.Controlador;
import Controlador.Vendedor;
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
public class Crear_Vendedor extends JFrame {

    JLabel titulo;
    JLabel codigo;
    JLabel nombre;
    JLabel genero;
    JLabel contraseña;

    JTextField ecodigo;
    JTextField enombre;
    JComboBox egenero;
    JTextField econtraseña;

    JButton crear;

    //Variables para funcionalidad
    public String getcodigo;
    public String getnombre;
    public String getgenero;
    public String getcontraseña;

    static String Usuario[][] = new String[100][4];
    static int contador = 0;

    public Crear_Vendedor(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(500, 600);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Crear_Vendedor.DISPOSE_ON_CLOSE);
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

    private void Crear() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/crear.png");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        titulo = new JLabel("Crear Vendedor", USAC, SwingConstants.CENTER);
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

    private void Codigo() {
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

    private void Nombre() {
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

    private void Genero() {
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

    private void Contraseña() {
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

    private void Boton() {
        ///Escritura de cada acción 
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//codigo-----------------------------------------------------------------------
                Vendedor V = new Vendedor();
                getcodigo = ecodigo.getText();
                V.setCodigo(getcodigo);
                ecodigo.setText("");

//nombre-----------------------------------------------------------------------
                getnombre = enombre.getText();
                Vendedor V2 = new Vendedor();
                V2.setNombre(getnombre);
                enombre.setText("");

//genero-----------------------------------------------------------------------
                getgenero = (String) egenero.getSelectedItem();
                Vendedor V3 = new Vendedor();
                V3.setGenero(getgenero);

//contraseña-----------------------------------------------------------------------
                getcontraseña = econtraseña.getText();
                Vendedor V4 = new Vendedor();
                V4.setContraseña(getcontraseña);
                econtraseña.setText("");

//confirmados-----------------------------------------------------------------------
                Vendedor V5 = new Vendedor();
                V5.setConfirmados(0);
                V5.validacionF();
//Mostrar en la tabla--------------------------------------------------------------
                Vendedor V6 =new Vendedor();
                V6.CrearTablaF();
                V6.ReyenarTablaCrear(100);
            }
        };
        ///Acciones
          crear.addActionListener(accion);//Se le agrega la acción
    
///Métodos
    }



}
