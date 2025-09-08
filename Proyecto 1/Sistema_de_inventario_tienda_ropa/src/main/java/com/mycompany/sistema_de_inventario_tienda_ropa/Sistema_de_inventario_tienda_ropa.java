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
        String[][] Acciones_Correctas = new String[1000][1000]; //Arreglo para guardar las acciones correctas
        String[][] Acciones_Incorrectas = new String[1000][1000];//Arreglo para guardar las acciones incorrectas

        //Entrada de texto
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        do {

            System.out.println("¡Bienvenido a la Tienda de Ropa Jujutsu Kaisen!");
            System.out.println("");
            System.out.println("Escribe tu nombre para acceder al inventario ");

            //Solicitando y guardando nombre de la persona
            try {
                String N = Nombre(Persona);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Upps! el sistema llego a su límite de ingresos" + " Error= " + e);
                salir = true;
            }

            //Entrada al menu de opciones
            for (int i = 0; i <= 100; i++) {
                if (Acciones_Correctas[0][i] == null && Acciones_Incorrectas[0][1] == null) {
                    System.out.println("¡Gracias! ¡Ya puedes utilizar el inventario! (Recuerda cada acción se registra en bitácora)");
                    System.out.println("");
                    System.out.println("1.Agregar Producto");
                    System.out.println("2.Buscar Producto");
                    System.out.println("3.Eliminar Producto");
                    System.out.println("4.Registrar Venta");
                    System.out.println("5.Generar Reportes");
                    System.out.println("6.Ver Datos del Estudiante");
                    System.out.println("7.Bitácora");
                    System.out.println("8.Salir");
                    String opcion = buffer.readLine();
                    Integer OPCION = Integer.parseInt(opcion);

                    //Menú
                    switch (OPCION) {
                        case 1 -> {
                            System.out.println("Ingresa el número a sumar  ");

                        }
                        case 8 -> {
                            break;

                        }

                        default -> {
                            break;
                        }
                    }

                }
            }
        } while (!salir);

    }

    ////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
////////////////////////////////////////////////////////////////////////////////   
    //Métodos
    //
    //Método que solicita y guarda el nombre de la persona que entra al sistema 
    public static String Nombre(String[] Persona) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        boolean salir = false;

        do {
        String nombre = buffer.readLine();
        for (int i = 0; i <= 100; i++) {
            if (Persona[i] == null || Persona[i].equals("")) {
                Persona[i] = nombre;
                if(Persona[i].equals("")){
                Persona[i]=null;
                System.out.println("Porfavor acceda un nombre válido");
                }
                break;
            }

        }
        }while (!salir);

        return null;
    
        }
 


      
////////////////////////////////////////////////////////////////////////////////    

