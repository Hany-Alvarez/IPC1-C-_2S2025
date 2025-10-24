/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.Vendedor.Usuario;
import static Controlador.Vendedor.contador5;
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
public class CargarA {

    public static int N;
    public static int A;
    public static int B;
    public static int h;
    public static String orden[];

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
                A = numLineas;
            }
            // Reiniciar el lector para volver al inicio del archivo
            fr.close();
            br.close();

            fr = new FileReader(csv);
            br = new BufferedReader(fr);

            // Se crea la matriz con tantas filas como líneas y 4 columnas
            //Usuario = new String[numLineas][5];
            //N = numLineas;
            N = 100;

            //Leer y guardar datos
            String linea;
            int i = 0;//la clave
            Vendedor V6 = new Vendedor();

            h = V6.PrimeroCrear(i);
            B = h;

            while ((linea = br.readLine()) != null) {
                orden = linea.split(",");

                if (orden.length >= 5) {
                    Usuario[h][0] = orden[0]; // código
                    Usuario[h][1] = orden[1]; // nombre
                    Usuario[h][2] = orden[2]; // género
                    Usuario[h][3] = orden[3];//Contraseña
                    Usuario[h][4] = orden[4]; // confirmadas
                    h++;
                }
            }
            System.out.println("Archivo cargado correctamente con " + N + " registros.");

            Vendedor a = new Vendedor();
            a.CrearTablaF();
            a.PrimeroCargar(numLineas);
            a.NoIgual();
            a.ReyenarTablaCargar(N);

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
