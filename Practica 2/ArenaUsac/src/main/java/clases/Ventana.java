/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

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

public final class Ventana extends JFrame {// Se hace una clase hija de JFrame

    JPanel miniventana; //Se instancia globalmente
    JPanel panel1;
    JPanel panel2;
    JButton b1;
    JButton b2;
    JButton b3;
    JLabel mensaje;
    private final JButton btnAbrir = new JButton("Abrir arena");

//
//
// Constructor de la Clase Clase1
    public Ventana(String title) throws HeadlessException {// Es para manejar las excepciones de que el sistema operativo no tenga interfaz gráfica o no sea compatible
        super(title);
        Dimension d = new Dimension(1920, 1080);//Se crea una variable para dimensionar en px
        this.setSize(d);//Esto es para dimensionar la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Para cerrar a la ventana
        //this.setResizable(false);//Para no permitir modificar el tamañan de la ventana
        this.setLocationRelativeTo(null); // Para posicionar la ventana en el centro

        Paneles();
        Etiquetas();
        Boton();
        IngresoTextos();
        
    /*ActionListener accion=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
    }
    }
    //b1.addActionListener(l);*/
        
        

    }

//Métodos que esten dentro de Ventana
    protected void Paneles() {
        miniventana = new JPanel();//El panel padre
        this.getContentPane().add(miniventana);//Aca ya se le agrega a la ventana
        miniventana.setBackground(new Color(51, 204, 255));//para modificar    

        panel1 = new JPanel();//Panel hijo1
        panel1.setBackground(Color.PINK);
        ImageIcon fondo = new ImageIcon("images/Fondasogif.gif");// llamamos a la imagen
        ImageIcon FondoEscala = new ImageIcon(fondo.getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT));
        JLabel f = new JLabel("<html>Holaaaa</html>", FondoEscala, SwingConstants.CENTER);//Ya se creo la etiqueta
        this.panel1.add(f);
        f.setBounds(0, 0,800, 900);// Modificar tamaño
        

        panel2 = new JPanel(); //Panel hijo2
        panel2.setBackground(Color.BLACK);

        miniventana.add(panel1);//Aquí se agrega al panel padre
        miniventana.add(panel2);

        miniventana.setLayout(new BoxLayout(miniventana, BoxLayout.X_AXIS));//Se instancia como se debe comportar el panel padre con los panels hijos
    }

    public void Etiquetas() {

        this.panel1.setLayout(null);
        this.panel2.setLayout(null);

        ImageIcon imagen1 = new ImageIcon("images/run-pikachu.gif");// llamamos a la imagen
        ImageIcon imagenEscala = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_REPLICATE));
        JLabel e = new JLabel("<html>Buenas Noches</html>", imagenEscala, SwingConstants.LEFT);//Ya se creo la etiqueta
        this.panel1.add(e);//Se agrega la etiqueta a la ventana
        e.setForeground(Color.BLACK);// Modificar color
        e.setBounds(100, 10, 400, 100);// Modificar tamaño
        e.setOpaque(false);//Fuerza a ala etiqueta a modificar su fondo
        e.setBackground(Color.WHITE);//Modifica el fondo de la etiqueta
        e.setHorizontalAlignment(2);//Para alinearlo dentro de su propio fondo

        Font fuente1 = new Font("Pokemon Hollow", Font.PLAIN, 50);// Esto nos permite dale formato a las etiquetas  Fuente/Estilo/Tamaño
        e.setFont(fuente1);

        JLabel e2 = new JLabel("<html>Arena Pokemón</html>", imagenEscala, SwingConstants.CENTER);
        this.panel2.add(e2);
        e2.setForeground(new Color(255, 0, 51));
        e2.setBounds(100, 10, 500, 300);
        e2.setHorizontalAlignment(SwingConstants.CENTER);//otra forma de alinear etiquetas
        Font fuente2 = new Font("Pokemon Solid", Font.TYPE1_FONT, 50);// Esto nos permite dale formato a las etiquetas
        e2.setFont(fuente2);

    }

    public void IngresoTextos() {
        JTextField Entrada=new JTextField();//Aquí creo la entrada
        Entrada.setText ("Hola!");//lo que ira en la entrada
        this.panel2.add(Entrada);//lo meto a mi panel
        Entrada.setBounds(100, 500, 300, 25);//Medidas de la canjita
        Entrada.setFont(new Font(Font.SERIF,Font.BOLD,20));
        Entrada.setBackground(new Color(255, 255, 255));//Color de fondo
        Entrada.setForeground(new Color(0, 204, 204));
        
                
        

    }

    protected void Boton() {
    
    b1 =new JButton("Agregar Personaje");//Se crea el bott
    panel2.setLayout(null);//para que tome el diseño del boton
    panel2.add(b1);
    b1.setBounds(290, 300, 260,40 );
    b1.setFont(new Font("Super Joyful",Font.CENTER_BASELINE,15));//Esto es para el estilo de letra
    b1.setBackground(new Color(255, 255, 255));//Color de fondo de boton
    b1.setForeground(new Color(51, 51, 51));//color de la letra
    b1.setIcon(new ImageIcon(new ImageIcon("images/charmander.gif").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    
    mensaje=new JLabel();
    mensaje.setBounds(100, 550, 300, 25);
    panel2.add(mensaje);
    
   
    
    
    
    
    b2 =new JButton("Modificar Personaje");//Se crea el bott
    panel2.setLayout(null);//para que tome el diseño del boton
    panel2.add(b2);
    b2.setBounds(290, 360, 200,20 );
    
    
    b3 =new JButton("Eliminar Personaje");//Se crea el bott
    panel2.setLayout(null);//para que tome el diseño del boton
    panel2.add(b3);
    b3.setBounds(290, 390, 200,20 );
    //
        
    }

}
