/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.Vendedor.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hanya
 */
public class CargarA {

    public void Archivo(JPanel a) {
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter firltro = new FileNameExtensionFilter("Archivo csv", "csv");

        archivo.setFileFilter(firltro);//Para solo admitir archivos csv

        int seleccionar = archivo.showOpenDialog(a); //se hace referencia sobre que panel o ventana aparecerá

        if (seleccionar == JFileChooser.APPROVE_OPTION) { //Abril el archivo
            File csv = archivo.getSelectedFile();

            cargarArchivo(csv);//Para cargar el archivo
        }

    }

    public void cargarArchivo(File csv) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(csv);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {//lee el archivo
                String orden[] = linea.split(",");

                if (orden.length == 4) {
                    Vendedor u = new Vendedor();
                    u.setCodigo(orden[0]);
                    u.setNombre(orden[1]);
                    u.setGenero(orden[2]);
                    u.setContraseña(orden[3]);

                    orden[0] = Usuario[0][0];
                    orden[0] = Usuario[0][1];
                    orden[0] = Usuario[0][2];
                    orden[0] = Usuario[0][4];
                }
            }
            Vendedor V7 = new Vendedor();
            V7.llenarTabla();
        } catch (Exception ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        } finally {//Cerrar archivo
            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

}
