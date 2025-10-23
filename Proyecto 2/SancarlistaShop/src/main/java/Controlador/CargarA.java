/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.Vendedor.Usuario;
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
            }

            // Reiniciar el lector para volver al inicio del archivo
            fr.close();
            br.close();

            fr = new FileReader(csv);
            br = new BufferedReader(fr);

            // Creamos la matriz con tantas filas como líneas y 4 columnas
            Usuario = new String[numLineas][4];
            N = numLineas;

            //Leer y guardar datos
            String linea;
            int i = 0;

            while ((linea = br.readLine()) != null) {
                String orden[] = linea.split(",");

                if (orden.length == 4) {
                    Usuario[i][0] = orden[0]; // código
                    Usuario[i][1] = orden[1]; // nombre
                    Usuario[i][2] = orden[2]; // género
                    Usuario[i][3] = orden[3]; // contraseña
                    i++;
                }
            }
            System.out.println("Archivo cargado correctamente con " + N + " registros.");

            llenarTablaF();
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

    public void llenarTablaF() {
        DefaultTableModel mD = new DefaultTableModel(
                new String[]{"Código", "nombre", "Género", "Cantidad de Ventas Confirmadas"},
                N
        );

        Módulo_Administración.tabla.setModel(mD);

        TableModel tm = Módulo_Administración.tabla.getModel();

        for (int i = 0; i < N; i++) {
            tm.setValueAt(Usuario[i][0], i, 0);
            tm.setValueAt(Usuario[i][1], i, 1);
            tm.setValueAt(Usuario[i][2], i, 2);
            tm.setValueAt(Usuario[i][3], i, 3);

        }

    }

}
