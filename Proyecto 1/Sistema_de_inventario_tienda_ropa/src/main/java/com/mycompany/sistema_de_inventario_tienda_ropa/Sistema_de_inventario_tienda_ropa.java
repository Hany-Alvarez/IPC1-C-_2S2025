/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistema_de_inventario_tienda_ropa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hanya
 */
public class Sistema_de_inventario_tienda_ropa {

    public static void main(String[] args) throws IOException {
        //Declarar variables
        String[] Persona = new String[101];//Arreglo para el registro de personas que usan el programa

        //Entrada de texto
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        do {

            System.out.println("¡Bienvenido a la Tienda de Ropa Jujutsu Kaisen!");
            System.out.println("");
            System.out.println("Escribe tu nombre para acceder al inventario ");
            String nombre=buffer.readLine();
            //Guardar el nombre en el arreglo "Persona"
            
            
        

        } while (!salir);

    }
    
}