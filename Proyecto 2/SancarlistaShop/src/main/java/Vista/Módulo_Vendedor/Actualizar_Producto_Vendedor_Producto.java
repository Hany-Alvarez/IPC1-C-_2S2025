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
import static Controlador.Administrador_Productos.Productos.UsuarioP;
import Controlador.Administrador_Vendedores.Vendedor;
import static Controlador.Controlador.G1;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    private String getecodigo;
    private String getstock;

    public Actualizar_Producto_Vendedor_Producto(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(500, 400);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Actualizar_Producto_Vendedor_Producto.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Métodos
        actualizar();
        codigo();
        stock();
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
        actu.setBounds(110, 300, 280, 30);
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

    private void stock() {
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
        estock.setBounds(200, 248, 200, 30);
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
                Productos_Vendedor actu= new Productos_Vendedor();
                getecodigo = ecodigo.getText();
                getstock = estock.getText();
                String Tiempo = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
             
                try {
                    for (int i = 0; i < 100; i++) {
                        
                        if(UsuarioP[i][0].equalsIgnoreCase(getecodigo)){
                            UsuarioP[i][5]=getstock;//se guarda el nuevo dato
                            actu.ReyenarTablaCrear(100);//Para mostrar en la tabla
                            actu.setAcciones(Tiempo);//Para registrar en que horario fue registrada
                            actu.setProductoCodigo(getecodigo);
                            actu.setProductoStock(UsuarioP[i][5]);
                            actu.setVendedor(G1);
                            break;
                        }
                        
                        

                    }
                } catch (Exception ex) {

                }

            }
        };
        ///Acciones
          actu.addActionListener(abrir);//Se le agrega la acción

    }
}
