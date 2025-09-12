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

    //Declarar Variables
    static String Persona[][] = new String[1][100]; //Matriz para el registro de personas que usan el programa
    static int contador = 0;
    static String[][] Acciones_Correctas = new String[1000][1000]; //Matriz para guardar las acciones correctas
    static String[][] Acciones_Incorrectas = new String[1000][1000];//Matriz para guardar las acciones incorrectas
    static String[][] Nombre_Producto = new String[1][100];//Matriz para el registro de nombre de producto
    static int contador1 = 0;
    static String[][] Categoria_Producto = new String[1][100];//Matriz para el registro de categpría
    static int contador2 = 0;
    static Integer[][] Stock = new Integer[1][100];//Matriz para el registro y modificación de stock
    static int contador3 = 0;
    static Integer[][] Código = new Integer[1][100];//Matriz para el código único

    public static void main(String[] args) throws IOException {
        System.out.println("¡Bienvenido a la Tienda de Ropa Jujutsu Kaisen!");
        System.out.println("");
        Menu();
    }

    public static void Menu() throws IOException {
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

                    Nombre();
                    int N = contador - 1;
                    System.out.println(N);
                    System.out.println(Persona[0][N]);
                    //System.out.println(Persona[0][1]);

                    boolean salir_n = false;
                    do {
                        //Entrada al menu de opciones

                        if (Persona[0][N] != null) {
                            //agregar algo
                            Acciones_Correctas[0][N] = "Ingreso al inventario";
                            System.out.println(Acciones_Correctas[0][N]);
                            System.out.println("");
                            System.out.println("Hola! " + Persona[0][N] + " Aquí está el menú del inventario (Recuerda cada acción se registra en bitácora)");
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
                            try {
                                String opcion = buffer.readLine();
                                Integer OPCION = Integer.parseInt(opcion);

                                switch (OPCION) {
                                    case 1 -> {//AGREGAR PRODUCTO
                                        Producto();
                                        Categoria();
                                        Stock();
                                        //continue;
                                        break;

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

                            } catch (NumberFormatException c) {//Este por si la persona ingresa un salto o espacio,letras (LETRAS)
                                System.out.println("No puedes ingresar saltos de línea o letras ¡Recuerda! solo puedes ingresar las opciones del menú" + " Error= " + c);
                            }
                        } else {//Este es por si la persona ingresa un número fuera del rango del menú(NUMEROS)
                            System.out.println("Ingreso " + N);
                            break;
                        }
                        //break;//break de prueba

                    } while (!salir_n);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Upps! el sistema llego a su límite de ingresos" + " Error= " + e);
                    //salir = true;

                }

            } else {
                salir = true;
            }
        } while (!salir);
    }

    ////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
////////////////////////////////////////////////////////////////////////////////

    /// @throws java.io.IOException
    /// @thr 
      //MÉTODOS
    //
    //Método que solicita y guarda el nombre de la persona que entra al sistema 
    public static void Nombre() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingresa tu nombre para poder acceder al menú");
        String nombre = buffer.readLine();

        //Se agrega a la matriz
        Persona[0][contador] = nombre;
        contador++;
        System.out.println(Persona[0][contador - 1]);

        System.out.println("Se agrego tu nombre a la bitacora");

    }

    //Método para añadir nombre del producto
    public static void Producto() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        boolean retirada = true;
        while (retirada == true) {
            System.out.println("Ingresa el nombre del producto: ");
            String nombreproducto = buffer.readLine();
            retirada = false;
            //Nombre_Producto[0][0]="Posición de muestra";
            //Se agrega a la matriz
            Nombre_Producto[0][contador1] = nombreproducto;
            contador1++;
            //Se revisa que el nombre no este repetido 

            for (int i = 0; i < (contador1 - 1); i++) {
                if (Nombre_Producto[0][i].toLowerCase().equals(Nombre_Producto[0][contador1 - 1].toLowerCase())) {
                    System.out.println("El nombre ya existe,ingresa otro nombre");
                    Nombre_Producto[0][contador1 - 1] = null;
                    retirada = true;
                    break;
                }
                break;
            }

        }

    }

    //Método para asignar catería al producto
    public static void Categoria() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa la categoría a la cual pertenece");
        String cat = buffer.readLine();

        //Se agrega a la matriz
        Categoria_Producto[0][contador2] = cat;
        contador2++;
        System.out.println(Categoria_Producto[0][contador2 - 1]);

        System.out.println("Se agrego la categoría");

    }
//Método para asignar stock del producto
    public static void Stock() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el stock del producto");
        String sto = buffer.readLine();
        Integer STO = Integer.parseInt(sto);

        //Se agrega a la matriz
        Stock[0][contador3] = STO;
        contador3++;
        System.out.println(Stock[0][contador3 - 1]);

        System.out.println("Se agrego el stock");

    }
    
   
}
////////////////////////////////////////////////////////////////////////////////    

