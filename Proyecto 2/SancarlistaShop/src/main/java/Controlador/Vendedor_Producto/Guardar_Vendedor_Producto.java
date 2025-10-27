/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Vendedor_Producto;

/*
Controlador para leer los archivos de la subventana(Producto) Boton(Cargar) MÓDULO VENDEDOR
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hanya
 */
public class Guardar_Vendedor_Producto {

    public void guardarHistorialCSV(JPanel a, String[][] Historial) {
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo CSV", "csv");
        archivo.setFileFilter(filtro);

        int seleccionar = archivo.showSaveDialog(a);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File csv = archivo.getSelectedFile();

            
            if (!csv.getName().toLowerCase().endsWith(".csv")) {
                csv = new File(csv.getAbsolutePath() + ".csv");
            }

            try (PrintWriter pw = new PrintWriter(new FileWriter(csv))) {
                for (int i = 0; i < Historial.length; i++) {
                    
                    if (Historial[i] != null && Historial[i][0] != null) {
                        pw.println(String.join(",", Historial[i]));
                    }
                }
                System.out.println("Archivo guardado correctamente en: " + csv.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error al guardar el archivo: " + e.getMessage());
            }
        }
    }



}
