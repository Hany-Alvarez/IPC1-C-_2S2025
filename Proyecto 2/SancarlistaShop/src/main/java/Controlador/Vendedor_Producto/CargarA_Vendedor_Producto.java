/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Vendedor_Producto;

import Controlador.Administrador_Productos.Productos;
import static Controlador.Administrador_Productos.Productos.UsuarioP;
import Controlador.Administrador_Vendedores.*;
import static Controlador.Administrador_Vendedores.Vendedor.Usuario;
import static Controlador.Administrador_Vendedores.Vendedor.contador5;
import Vista.Modulo_Administrador.Módulo_Administración;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hanya
 */
public class CargarA_Vendedor_Producto {

 public static int NN;
    public static int AA;
    public static int BB;
    public static int hh;
    public static String orden2[];

    public void Archivo(JPanel a) throws FileNotFoundException {
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter firltro = new FileNameExtensionFilter("Archivo csv", "csv");

        archivo.setFileFilter(firltro);//Para solo admitir archivos csv

        int seleccionar = archivo.showOpenDialog(a); //se hace referencia sobre que panel o ventana aparecerá

        if (seleccionar == JFileChooser.APPROVE_OPTION) { //Abril el archivo
            File csv = archivo.getSelectedFile();

            cargarArchivo(csv);//Para cargar el archivo
        }

    }

    public void cargarArchivo(File csv) throws FileNotFoundException {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(csv);
            br = new BufferedReader(fr);

            //Contar cuantas lineas tiene el archivo
            int numLineas = 0;

            while (br.readLine() != null) {
                numLineas++;
                AA = numLineas;
            }
            // Reiniciar el lector para volver al inicio del archivo
            fr.close();
            br.close();

            fr = new FileReader(csv);
            br = new BufferedReader(fr);

            // Se crea la matriz con tantas filas como líneas y 4 columnas
            //Usuario = new String[numLineas][5];
            //N = numLineas;
            NN = 100;

            //Leer y guardar datos
            String linea;
            int i = 0;//la clave
            Productos V6 = new Productos();

            hh = V6.PrimeroCrear(i);
            BB = hh;

            while ((linea = br.readLine()) != null) {
                orden2 = linea.split(",");

                if (orden2.length >= 5) {
                    UsuarioP[hh][0] = orden2[0]; // código
                    UsuarioP[hh][5] = orden2[1]; // stock
                    hh++;
                }
            }
            System.out.println("Archivo cargado correctamente con " + NN + " registros.");

            Productos a = new Productos();
            a.CrearTablaF();
            a.PrimeroCargar(numLineas);
           // a.NoIgual();
            a.ReyenarTablaCargar(NN);

        } catch (Exception ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        } finally {//Cerrar archivo
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

}
