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
    static String Persona[][]=new String[0][100];
    

public static void main(String[] args) throws IOException {
 System.out.println("¡Bienvenido a la Tienda de Ropa Jujutsu Kaisen!");
 System.out.println(""); 
}


public static void Menu(){
        //Declarar variables
        String[] Personas = new String[100];//Arreglo para el registro de personas que usan el programa
        String[][] Acciones_Correctas = new String[1000][1000]; //Arreglo para guardar las acciones correctas
        String[][] Acciones_Incorrectas = new String[1000][1000];//Arreglo para guardar las acciones incorrectas
        String[] Nombre_Producto = new String[100];//Arreglo para el registro de nombre de producto
        String[] Categoria_Producto = new String[100];//Arreglo para el registro de categpría
        Integer[] Stock = new Integer[100];//Arreglo para el registro y modificación de stock
        Integer[] Código = new Integer[100];//Arreglo para el código único

        //Entrada de texto
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        do {
            System.out.println("1.Ingresar a inventario ");
            System.out.println("2.Salir ");
            String entrada = buffer.readLine();
            Integer Entrada = Integer.parseInt(entrada);
  
            if (Entrada == 1) {

                //Solicitando y guardando nombre de la persona
                try {//Para evitar que el sistema colapse cuando se haya llegado al límite de personas registradas
                    System.out.println("Ingresa tu nombre para la bitacora");
                    
                    String N = Nombre(Persona);
                    
                    System.out.println(Persona[0]);
                    System.out.println(Persona[1]);
                    
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Upps! el sistema llego a su límite de ingresos" + " Error= " + e);
                    salir = true;

                }

                boolean salir_n = false;
                do {
                    //Entrada al menu de opciones
                    for (int i = 0; i <= 100; i++) {
                        if (Persona[i] != null &&Acciones_Correctas[0+i][i] == null && Acciones_Incorrectas[0+i][i] == null) {
                            Acciones_Correctas[0 + i][i] = "Ingreso al inventario";
                            System.out.println(Acciones_Correctas[0+i][i]);
                            System.out.println("");
                            System.out.println("Hola! "+Persona[i] + " Aquí está el menú del inventario (Recuerda cada acción se registra en bitácora)");
                            System.out.println("");
                            System.out.println("1.Agregar Producto");
                            System.out.println("2.Buscar Producto");
                            System.out.println("3.Eliminar Producto");
                            System.out.println("4.Registrar Venta");
                            System.out.println("5.Generar Reportes");
                            System.out.println("6.Ver Datos del Estudiante");
                            System.out.println("7.Bitácora");
                            System.out.println("8.Salir");

                            //Menú
                            try{
                            String opcion = buffer.readLine();
                            Integer OPCION = Integer.parseInt(opcion);

                            switch (OPCION) {
                                case 1 -> {//AGREGAR PRODUCTO

                                    String N = Producto(Nombre_Producto);
                                    if(N!=null){
                                    String C = Categoría(Categoria_Producto);
                                    break;
                                    }   
                                    
                                }
                                case 2 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 3 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 4 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 5 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 6 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 7 -> {
                                    System.out.println("Ingresa el número a sumar  ");

                                }
                                case 8 -> {
                                    salir_n = true;

                                }
                                default -> {
                                    System.out.println("Opció no valida→selecciona una opción del menú");
                                }

                            }
                            }
                            catch(NumberFormatException c){//Este por si la persona ingresa un salto o espacio,letras (LETRAS)
                                System.out.println("No puedes ingresar saltos de línea o letras ¡Recuerda! solo puedes ingresar las opciones del menú" + " Error= " + c);
                            }

                        } else {//Este es por si la persona ingresa un número fuera del rango del menú(NUMEROS)
                            //System.out.println("Ingreso " + i);
                            break;
                        }
                        break;//break de prueba

                    }
                    //break;//break de prueba 
                } while (!salir_n);
            } else {
                salir = true;
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

        boolean salir2 = false;

        do {
            String nombre = buffer.readLine();
            for (int i = 0; i <= 100; i++) {
                if (Persona[i] == null || Persona[i].equals("")) {
                    Persona[i] = nombre;
                    if (Persona[i].equals("")) {
                        Persona[i] = null;
                        System.out.println("Porfavor acceda un nombre válido");
                        salir2=true;
                    }
                    salir2=true;
                //break
                }
                
            break;//este break permite que el for no se repita hasta 100   
            }
            
        } while (!salir2);

        return null;//Revisar si el nombre sigue dando null

    }
    //
    //
    //
    //
    //Método para añadir nombre del producto
    public static String Producto(String[] nombre_producto) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        String NP=null;

        boolean salir3 = false;
        while (salir3 == false) {

            System.out.println("Agregar nombre de producto: ");
            NP = buffer.readLine();
            for (int i = 0; i <= 100; i++) {
                if (nombre_producto[i] == null || nombre_producto[i].equals("")) {
                    nombre_producto[i] = NP;

                    for (int j = 0; j < i; j++) {
                        if (nombre_producto[j].toLowerCase().equals(nombre_producto[i].toLowerCase())) {
                            System.out.println("El nombre ya existe,ingresa otro nombre");
                            nombre_producto[i] = null;
                            salir3 = false;
                            break;
                        }

                    }
                    break;
                }

            }
            salir3 = true;
        }
        return NP;
    }

    //
    //Método para asignar catería al producto
    public static String Categoría(String[] categoria) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir4 = false;
        while (salir4 == false) {

            System.out.println("Categoría(blusa,playera,pantalón...): ");
            String NP = buffer.readLine();
            for (int i = 0; i <= 100; i++) {
                if (categoria[i] == null || categoria[i].equals("")) {
                    categoria[i] = NP;
                    break;
                }

            }
            salir4 = true;
        }

        return null;

    }
}

////////////////////////////////////////////////////////////////////////////////    

