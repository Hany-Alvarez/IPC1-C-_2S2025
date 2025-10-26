/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador.Vendedor;
/*
Interfaz para cargar vendedores subventana(Vendedores) BotonEspecífico(Cargar) MÓDULO ADMINISTRADOR
*/
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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hanya
 */
public class Cargar extends JFrame {

    JLabel mensaje;
    

    public Cargar(String title) throws HeadlessException {
        super(title);

        Dimension d = new Dimension(350, 150);//Objeto que tiene la dimensión de la ventana
        this.setSize(d);
        this.setDefaultCloseOperation(Actualizar_Vendedor.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);

        //Métodos
        mensaje();
    }

    private void mensaje() {
        this.setLayout(null);
        ImageIcon icono = new ImageIcon("images/listo.gif");
        ImageIcon USAC = new ImageIcon(icono.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        mensaje = new JLabel("¡Datos Cargados!", USAC, SwingConstants.CENTER);
        mensaje.setForeground(new Color(25, 25, 133));//Color del título
        mensaje.setBounds(0, 0, 300, 100);//Posición

        //Fuente
        Font fuente = new Font("Super Joyful", Font.PLAIN, 20);
        mensaje.setFont(fuente);
        add(mensaje);
    }

}
