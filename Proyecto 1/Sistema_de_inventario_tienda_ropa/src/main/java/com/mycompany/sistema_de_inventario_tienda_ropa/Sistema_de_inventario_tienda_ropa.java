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
    
    public static void main(String[] args) {
     InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("¡Bienvenido elige una opción!");
        String N="Natalia";
        int A=2;
        mensaje_de_venta(N,A);
        boolean salir = false;
        
 
    }
    
    static void mensaje_de_venta(String nombre,int veces){
        System.out.println("Hola "+nombre+" esta es tu intento "+veces);
 
    }
}
