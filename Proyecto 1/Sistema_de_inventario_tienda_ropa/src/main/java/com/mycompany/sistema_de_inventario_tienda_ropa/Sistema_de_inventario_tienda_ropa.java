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
////////////////////////////////////////////////////////////////////////////////
public class Sistema_de_inventario_tienda_ropa {

    public static void main(String[] args) throws IOException {
        //Declarar variables
        String[] Persona = new String[100];//Arreglo para el registro de personas que usan el programa

        //Entrada de texto
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        do {

            System.out.println("¡Bienvenido a la Tienda de Ropa Jujutsu Kaisen!");
            System.out.println("");
            System.out.println("Escribe tu nombre para acceder al inventario ");
            //Solicitando y guardando nombre de la persona
            String N = Nombre(Persona,salir);

        } while (!salir);

    }

    ////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
////////////////////////////////////////////////////////////////////////////////   
    //Métodos
    //
    //Método que solicita y guarda el nombre de la persona que entra al sistema 
    public static String Nombre(String[] Persona,boolean salir) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        try {
            String nombre = buffer.readLine();
            for (int i = 99; i <= 100; i++) {
                if (Persona[i] == null || Persona[i].equals("")) {
                    Persona[i] = nombre;
                break;
                }
            
            }
            
            
        } 
        
        catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Upps! el sistema llego a su límite de ingresos");
           salir = true;

        }
        return null;
    }

////////////////////////////////////////////////////////////////////////////////    
}
