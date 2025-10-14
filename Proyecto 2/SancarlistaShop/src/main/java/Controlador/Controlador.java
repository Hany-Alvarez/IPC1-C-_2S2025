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

    public void AbrirCerrrar(String Opcion, String letra) {

        switch (Opcion) {
            case "a" -> {
                System.out.println("El valor de a es:"+letra);
                boolean respuesta = true;

               
                    Controlador llave = new Controlador();
                    boolean respuesta2 = llave.Iniciar(letra, respuesta); //Función que verifica si la llave es correcta
                    System.out.println("Se ejecuto el método");
                    Módulo_Administración M2 = new Módulo_Administración("Módulo_Administración");
                    M2.setVisible(respuesta2);
                   
                
 
                

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
    public boolean Iniciar(String codigo, boolean r) {
        if (codigo == "123") {
            r = true;
        }
        return true;
    }

}
