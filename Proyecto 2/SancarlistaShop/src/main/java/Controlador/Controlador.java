/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Modulo_Administrador.Módulo_Administración;
import Vista.Módulo_Autenticación;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author hanya
 */
public class Controlador {

    public void AbrirCerrrar(String Opcion, String letra,String letra2) {

        switch (Opcion) {
            case "a" -> {
                System.out.println("El valor del código es:" + letra+"y contraseña:"+letra2);
                

                Controlador llave = new Controlador();
                boolean respuesta2 = llave.Iniciar(letra,letra2); //Función que verifica si la llave es correcta
                System.out.println("El valor de respueta2:" + respuesta2);
                System.out.println("Se ejecuto el método");
                Módulo_Administración M2 = new Módulo_Administración("Módulo_Administración");
                M2.setVisible(respuesta2);
                Módulo_Autenticación.visibilidad.setVisible(!respuesta2);
                

            }

            case "b" -> {
                System.out.println("El swicth funciona");
            }
            default -> {
                System.out.println("Opción no valida→selecciona una opción del menú");
            }

        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    
    
    public boolean Iniciar(String codigo,String contraseña) {

        if (codigo.equals("123") && contraseña.equals("456")) {
            System.out.println("Código y Contraseña Correctos, se encontro en el sistema");
            return true;
        }
          System.out.println("Código ó Contraseña Incorrectos, no se encontro en el sistema");
        return false;
    }

}
