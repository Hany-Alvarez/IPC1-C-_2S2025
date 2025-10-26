/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Interfaz que sale al presionar actualizar en la subventana(Producto) BotonEspecífico(Actualizar) MÓDULO VENDEDOR
*/
package Vista.Módulo_Vendedor;

import Vista.Modulo_Administrador.Producto.*;
import static Controlador.Administrador_Productos.Cargar_Producto.AA;
import Controlador.Administrador_Productos.Productos;
import Controlador.Administrador_Vendedores.Vendedor;
import Controlador.Vendedor_Producto.Productos_Vendedor;
import Vista.Módulo_Vendedor.Módulo_Vendedor;
import static Vista.Módulo_Vendedor.Módulo_Vendedor.q;
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
public class Actualizar_Producto_Vendedor_Producto extends JFrame {

    private JLabel titulo;
    private JLabel codigo;
    private JLabel stock;


    private JTextField ecodigo;
    private JTextField estock;


    private JButton actu;
    private JButton buscar;

    private String getecodigo;
    private int getstock;
    
    
    public Actualizar_Producto_Vendedor_Producto(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(500, 500);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Actualizar_Producto_Vendedor_Producto.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Métodos
        actualizar();
        codigo();
        nombre();
        función();
    }

    private void actualizar() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/actu.gif");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        titulo = new JLabel("Actualizar Stock", USAC, SwingConstants.CENTER);
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
        ecodigo.setBounds(200, 180, 200, 30);
        ecodigo.setFont(new Font("Super Joyful", Font.BOLD, 25));
        ecodigo.setBackground(new Color(255, 255, 255, 255));
        ecodigo.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(ecodigo);

    }

    private void nombre() {
        this.setLayout(null);
        stock = new JLabel("Stock");
        stock.setForeground(new Color(25, 25, 133));//Color del título
        stock.setBounds(50, 210, 150, 100);//Posición

        //Fuente
        Font fuente2 = new Font("Super Joyful", Font.PLAIN, 30);
        stock.setFont(fuente2);
        add(stock);
        //----------------------------------------------------------------------------------------
        estock = new JTextField();
        estock.setText("");
        estock.setBounds(250, 248, 200, 30);
        estock.setFont(new Font("Super Joyful", Font.BOLD, 25));
        estock.setBackground(new Color(255, 255, 255, 255));
        estock.setForeground(new Color(153, 153, 153));//Color de la fuente
        add(estock);
    }

    public void función() {
        ///Escritura de cada acción 
        ActionListener abrir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Productos actu = new Productos();

                getecodigo = ecodigo.getText();
                actu.setBuscarCodigo(getecodigo);
                // ecodigo.setText("");

                int Stock = actu.ActualizarS();
                String Codigo = actu.ActualizarCo();

                if (Stock != 0 && Codigo != null) {
                    System.out.println("El nombre es: " + Stock);
                    System.out.println("La contraseña es: " + Codigo);

                    ecodigo.setText(Codigo);
                    String tock = String.valueOf(Stock);
                    estock.setText(tock);
                } else {
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
                Productos actu = new Productos();

                getecodigo = ecodigo.getText();

                getnombre = enombre.getText();
                getcontraseña = econtraseña.getText();

                actu.setActun(getnombre, getecodigo);
                actu.setActuc(getcontraseña, getecodigo);

                actu.ReyenarTablaCrear(100);
//Empezar a Reyener la Tabla de Productos de Productos_Vendedores
                Productos_Vendedor PV1 = new Productos_Vendedor();
                PV1.ReyenarTablaProducto_Vendedor(100);

            }
        };
        ///Acciones
          actu.addActionListener(actualizar);//Se le agrega la acción

    }

}
