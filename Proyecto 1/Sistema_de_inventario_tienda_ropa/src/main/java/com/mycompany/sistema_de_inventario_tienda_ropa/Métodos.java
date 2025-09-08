/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_inventario_tienda_ropa;

/**
 *
 * @author hanya
 */
public class Métodos {

    public void Nombre(String[] Persona, String nombre) {
        Persona[0] = "Dato de primera comparación";//Esto porque el valor inicial es null y no deja ejecutar al código 

        for (int i = 1; i <= 101; i++) {
            if (Persona[i] == null || Persona[i].equals("")) {
                Persona[i] = nombre;
            }
            
        }
        
    }

}
