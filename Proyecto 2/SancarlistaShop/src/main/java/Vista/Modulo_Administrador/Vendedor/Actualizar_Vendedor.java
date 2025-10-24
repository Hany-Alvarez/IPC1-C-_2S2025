/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador.Vendedor;

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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hanya
 */
public class Actualizar_Vendedor extends JFrame {
    
    private JLabel titulo;
    private JLabel codigo;
    private JLabel nombre;
    private JLabel contraseña;
    
    private JTextField ecodigo;
    private JTextField enombre;
   private JTextField econtraseña;
    
    private JButton actu;
    private JButton buscar;
    
    private String getecodigo;
    private String getnombre;
    private String getcontraseña;
    
    public Actualizar_Vendedor(String title) throws HeadlessException {
        super(title);
        
        Dimension d = new Dimension(500, 500);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Actualizar_Vendedor.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Métodos
        actualizar();
        codigo();
        nombre();
        contraseña();
        función();
    }
    
    private void actualizar() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/actu.gif");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        titulo = new JLabel("Actualizar Vendedor", USAC, SwingConstants.CENTER);
        titulo.setForeground(new Color(25, 25, 133));//Color del título
        titulo.setBounds(20, 25, 480, 100);//Posición

        //Fuente
        Font fuente = new Font("Super Joyful", Font.PLAIN, 40);
        titulo.setFont(fuente);
        add(titulo);
//--------------------------------------------------------------------------------------------
        this.setLayout(null);
        actu = new JButton("Actualizar");
        actu.setBounds(110, 400, 280, 30);
        actu.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        actu.setBackground(new Color(255, 255, 255));
        actu.setForeground(new Color(51, 51, 51));
        add(actu);//Agregando al panel 
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
        ecodigo.setBounds(200, 180, 150, 30);
        ecodigo.setFont(new Font("Super Joyful", Font.BOLD, 25));
        ecodigo.setBackground(new Color(255, 255, 255, 255));
        ecodigo.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(ecodigo);
//-------------------------------------------------------------------------------------
        this.setLayout(null);
        buscar = new JButton("Buscar");
        buscar.setBounds(350, 180, 100, 30);
        buscar.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 15));
        buscar.setBackground(new Color(255, 255, 255));
        buscar.setForeground(new Color(51, 51, 51));
        add(buscar);//Agregando al panel 

    }
    
    private void nombre() {
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
        enombre.setBounds(200, 248, 250, 30);
        enombre.setFont(new Font("Super Joyful", Font.BOLD, 25));
        enombre.setBackground(new Color(255, 255, 255, 255));
        enombre.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(enombre);
    }
    
    private void contraseña() {
        this.setLayout(null);
        contraseña = new JLabel("Contraseña");
        contraseña.setForeground(new Color(25, 25, 133));//Color del título
        contraseña.setBounds(50, 280, 150, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        contraseña.setFont(fuente2);
        add(contraseña);
        //----------------------------------------------------------------------------------------
        econtraseña = new JTextField();
        econtraseña.setText("");
        econtraseña.setBounds(200, 310, 250, 30);
        econtraseña.setFont(new Font("Super Joyful", Font.BOLD, 25));
        econtraseña.setBackground(new Color(255, 255, 255, 255));
        econtraseña.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(econtraseña);
    }
    
    public void función() {
        ///Escritura de cada acción 
        ActionListener abrir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vendedor actu = new Vendedor();
                
                getecodigo = ecodigo.getText();
                actu.setBuscarCodigo(getecodigo);
                // ecodigo.setText("");
                
                String Nombre = actu.ActualizarN();
                String Contra = actu.ActualizarC();
                
                if(Nombre!=null && Contra !=null){
                System.out.println("El nombre es: " + Nombre);
                System.out.println("La contraseña es: " + Contra);
                
                
                enombre.setText(Nombre);
                econtraseña.setText(Contra);}
                else{
                System.out.println("Codigo no encontrado");
                }
            }
        };
        ///Acciones
          buscar.addActionListener(abrir);//Se le agrega la acción

        ///Escritura de cada acción 
        ActionListener actualizar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vendedor actu = new Vendedor();
                
                getecodigo = ecodigo.getText();
                
                getnombre = enombre.getText();
                getcontraseña = econtraseña.getText();
                
                actu.setActun(getnombre, getecodigo);
                actu.setActuc(getcontraseña, getecodigo);
                
                actu.ReyenarTablaCrear(100);
                
            }
        };
        ///Acciones
          actu.addActionListener(actualizar);//Se le agrega la acción

    }
    
}
