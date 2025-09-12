/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistema_de_inventario_tienda_ropa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.*;
import java.time.LocalDateTime; //Librerí para el tiempo
import java.time.format.DateTimeFormatter;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;

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
    static Integer[][] Codigo = new Integer[1][100];//Matriz para el código único
    static int contador4 = 0;
    static float[][] Precio = new float[1][100];//Matriz para el código único
    static int contador5 = 0;
    static float[][] Total = new float[1][100];//Matriz para el total de venta (precio*cantidad vendida)
    static int contador6 = 0;
    static String[][] Tiempo = new String[1][100];//Matriz para el tiempo
    static int contador7 = 0;
    static Integer[][] Cantidad = new Integer[1][100];//Matriz para el cantidad de productos vendidos
    static int contador8 = 0;
    static String[][] P_V = new String[1][100];//Matriz para el producto vendido
    static int contador9 = 0;

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
                            System.out.println("5.Bitácora");
                            System.out.println("6.Generar Reportes");
                            System.out.println("7.Ver Datos del Estudiante");
                            System.out.println("8.Salir");

                            //Menú
                            try {
                                String opcion = buffer.readLine();
                                Integer OPCION = Integer.parseInt(opcion);

                                switch (OPCION) {
                                    case 1 -> {//AGREGAR PRODUCTO
                                        Producto();
                                        Categoria();
                                        Precio();
                                        Stock();
                                        Codigo();
                                        //continue;
                                        break;

                                    }
                                    case 2 -> {//MOSTRAR PRODUCTO
                                        Opciones_Mostrar();
                                        break;

                                    }
                                    case 3 -> {//BORRAR PRODUCTO
                                        E_Codigo();
                                        break;

                                    }
                                    case 4 -> {//REGISTRAR VENTA
                                        Venta();
                                        break;

                                    }
                                    case 5 -> {//BITÁCORA
                                        Bitacora();
                                        break;

                                    }
                                    case 6 -> {//GENERAR REPORTES
                                        PDF();
                                        break;

                                    }
                                    case 7 -> {//VER DATOS DEL ESTUDIANTE
                                        Estudiante();
                                        break;

                                    }
                                    case 8 -> {//SALIR
                                        salir_n = true;

                                    }
                                    default -> {//Cualquier opción que no este en el menú
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
    //MÉTODOS PARA GUARDAR
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
            System.out.println(Nombre_Producto[0][contador1]);
            
            //Se revisa que el nombre no este repetido 

            for (int i = 0; i < (contador1 - 1); i++) {
                if (Nombre_Producto[0][i].toLowerCase().equals(Nombre_Producto[0][contador1 - 1].toLowerCase())) {
                    System.out.println("El nombre ya existe,ingresa otro nombre");
                    Nombre_Producto[0][contador1 - 1] = null;
                    contador1=contador1-1;
                    retirada = true;
                    break;
                }
                break;
            }

        }

    }

    //Método para asignar categoría al producto
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

//Método para asignar precio
    public static void Precio() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean retirada = true;
        while (retirada == true) {
            System.out.println("Ingresa el precio del producto");
            String pre = buffer.readLine();
            float PRE = Float.parseFloat(pre);
            if (PRE > -1) {
                //Se agrega a la matriz
                Precio[0][contador5] = PRE;
                contador5++;
                System.out.println(Precio[0][contador5 - 1]);
                System.out.println("Se agrego el precio");
                retirada = false;
            } else {
                System.out.println("No puede agregar números negativos, intentelo de nuevo");
                retirada = true;
            }
        }

    }

//Método para asignar stock del producto
    public static void Stock() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean retirada = true;
        while (retirada == true) {
            System.out.println("Ingresa el stock del producto (en números enteros)");
            String sto = buffer.readLine();
            Integer STO = Integer.parseInt(sto);
            if (STO > -1) {
                //Se agrega a la matriz
                Stock[0][contador3] = STO;
                contador3++;
                System.out.println(Stock[0][contador3 - 1]);
                System.out.println("Se agrego el stock");
                retirada = false;
            } else {
                System.out.println("No puede agregar números menos a 0, intentelo de nuevo");
                retirada = true;
            }
        }

    }

    //Método para añadir código único
    public static void Codigo() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        boolean retirada = true;
        while (retirada == true) {
            System.out.println("Ingresa el código único del producto: ");
            String cod = buffer.readLine();
            Integer COD = Integer.parseInt(cod);
            if (COD > -1) {
                retirada = false;
                //Nombre_Producto[0][0]="Posición de muestra";
                //Se agrega a la matriz
                Codigo[0][contador4] = COD;
                contador4++;
                System.out.println(Codigo[0][contador4]);
                //Se revisa que el nombre no este repetido 

                for (int i = 0; i < (contador4 - 1); i++) {
                    if (Objects.equals(Codigo[0][i], Codigo[0][contador4 - 1])) {
                        System.out.println("El código ya existe");
                        Codigo[0][contador4 - 1] = null;
                        contador4=contador4-1;
                        retirada = true;
                        break;
                    }
                    break;
                }

            } else {
                System.out.println("No puede agregar números negativos, porfavor intentelo de nuevo");
                retirada = true;
            }
        }

    }

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

    public static void Opciones_Mostrar() throws IOException {
        //Entrada de texto
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        //Solicitando y guardando nombre de la persona
        try {//Para evitar que el sistema colapse cuando se haya llegado al límite de personas registradas

            boolean salir_n = false;
            do {
                //Entrada al menu de opciones
                System.out.println("");
                System.out.println("Selecciona el filtro para ver el/los productos:");
                System.out.println("1.Nombre del producto ");
                System.out.println("2.Categoría ");
                System.out.println("3.Precio");
                System.out.println("4.Cantidad en stock ");
                System.out.println("5.Código único del producto ");
                System.out.println("6.Salir ");
                System.out.println("");

                //Menú
                try {
                    String opcion = buffer.readLine();
                    Integer OPCION = Integer.parseInt(opcion);

                    switch (OPCION) {
                        case 1 -> {//Por Nombre del producto
                            M_Nombre();
                            break;

                        }
                        case 2 -> {// Por categoría
                            M_Categoria();
                            break;
                        }
                        case 3 -> {// Por precio
                            M_Precio();
                            break;

                        }
                        case 4 -> {// Por cantidad en stock
                            M_Stock();
                            break;

                        }
                        case 5 -> {// Por Código único del producto
                            M_Codigo();
                            break;

                        }
                        case 6 -> {//Salir
                            salir_n = true;

                        }
                        default -> {
                            System.out.println("Opció no valida→selecciona una opción del menú");// Este es por si le persona no escoge ninguna opción
                        }

                    }

                } catch (NumberFormatException c) {//Este por si la persona ingresa un salto o espacio,letras (LETRAS)
                    System.out.println("No puedes ingresar saltos de línea o letras ¡Recuerda! solo puedes ingresar las opciones del menú" + " Error= " + c);
                }

            } while (!salir_n);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Upps! el sistema llego a su límite de ingresos" + " Error= " + e);
            //salir = true;

        }

    }

    ///////////////////////////////////////////////////////////////////////////////
//MÉTODOS PARA MOSTRAR
    //Método para mostrar por nombre
    public static void M_Nombre() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el nombre del producto");
        String nm = buffer.readLine();
        boolean respuesta = false;
        for (int i = 0; i < Nombre_Producto[0].length; i++) {
            if (Nombre_Producto[0][i] != null && nm.toLowerCase().equals(Nombre_Producto[0][i].toLowerCase())) {
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("No existe el producto");
        }

    }
    //Método para mostrar por categoría

    public static void M_Categoria() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa la categoría del producto");
        String nm = buffer.readLine();
        boolean respuesta = false;
        for (int i = 0; i < Categoria_Producto[0].length; i++) {
            if (Categoria_Producto[0][i] != null && nm.toLowerCase().equals(Categoria_Producto[0][i].toLowerCase())) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("Categoría no encontrada,no existe el producto");
        }
    }

    //Método para mostrar por precio
    public static void M_Precio() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el precio");
        String nc = buffer.readLine();
        float NC = Float.parseFloat(nc);
        boolean respuesta = false;
        for (int i = 0; i < Precio[0].length - 1; i++) {
            if (Objects.equals(Precio[0][i], NC)) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("Precio no encontrado,no existe el producto");
        }
    }

    //Método para mostrar por precio
    public static void M_Stock() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el stock");
        String nc = buffer.readLine();
        Integer NC = Integer.parseInt(nc);
        boolean respuesta = false;
        for (int i = 0; i < Stock[0].length - 1; i++) {
            if (Objects.equals(Stock[0][i], NC)) {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("Stock no encontrado,no existe el producto");
        }
    }

    //Método para mostrar por código
    public static void M_Codigo() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el código del producto");
        String nc = buffer.readLine();
        Integer NC = Integer.parseInt(nc);
        boolean respuesta = false;
        for (int i = 0; i < Codigo[0].length - 1; i++) {
            if (Objects.equals(Codigo[0][i], NC)) {
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("Código no encontrado,no existe el producto");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
        //Método para eliminar por medio de Código
    public static void E_Codigo() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        System.out.println("Ingresa el código del producto");
        String nc = buffer.readLine();
        Integer NC = Integer.parseInt(nc);
        boolean respuesta = false;
        for (int i = 0; i < Codigo[0].length - 1; i++) {
            if (Objects.equals(Codigo[0][i], NC)) {
                Nombre_Producto[0][i] = null;
                Categoria_Producto[0][i] =null ;
                Precio[0][i] = 0;   //por ser de tipo primitivo no admite null
                Stock[0][i] = null;
                Codigo[0][i] = null;
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("");
                respuesta = true;
            }
        }
        if (respuesta == false) {
            System.out.println("Código no encontrado,no existe el producto");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
        //Método para registrar venta
    public static void Venta() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Escribe el código del producto de venta");
        String nc = buffer.readLine();
        Integer NC = Integer.parseInt(nc);

        boolean respuesta = false;
        for (int i = 0; i < Codigo[0].length - 1; i++) {
            if (Objects.equals(Codigo[0][i], NC)) {
                System.out.println("1.Nombre del producto: " + Nombre_Producto[0][i]);
                System.out.println("2.Categoría: " + Categoria_Producto[0][i]);
                System.out.println("3.Precio :Q" + Precio[0][i]);
                System.out.println("4.Cantidad en stock: " + Stock[0][i]);
                System.out.println("5.Código único del producto: " + Codigo[0][i]);
                System.out.println("");
                System.out.println("¿Cuánto quiere vender?(escriba la cantidad entera)");
                String ca = buffer.readLine();
                Integer CA = Integer.parseInt(ca);

                //validación de existencia y stock suficiente
                if (CA <= Stock[0][i]) {
                    System.out.println("Si hay stock suficiente");
                    System.out.println("");
                    //Resta
                    int Resta = Stock[0][i] - CA;
                    Stock[0][i] = Resta;
                    //Registro de CA
                    Cantidad[0][contador8] = CA;
                    contador8++;
                    //Registro de P_V
                    P_V[0][contador9] = Nombre_Producto[0][i];
                    contador9++;
                    //Registro
                    System.out.println("Registrando venta con los siguientes datos");
                    System.out.println("Nombre del producto "+P_V[0][contador9-1]);
                    System.out.println("Código del producto: " + Codigo[0][i]);
                    System.out.println("Cantidad vendida: " + Cantidad[0][contador8-1]);
                    //Tiempo de transacción
                    Tiempo[0][contador7] = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    System.out.println("Fecha y hora de transacción: " + Tiempo[0][contador7]);
                    contador7++;
                    //Se agrega el total
                    Total[0][contador6] = Float.parseFloat(ca) * Precio[0][i];//Esto para que no se elimine el float del precio a la hora de multiplicar y apareza en consola
                    System.out.println("Total de venta: " + Total[0][contador6]);
                    contador6++;
                    //para que no se repita
                } else {
                    System.out.println("Stock insuficiente");
                }
                respuesta = true;
            }
            //break de prueba
        }
        if (respuesta == false) {
            System.out.println("Código no encontrado,no existe el producto");
        }

    }

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
        //Método para ver Bitacora
    public static void Bitacora() throws IOException {

    }

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
        //Método generar PDF
    public static void PDF() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        boolean salir = false;

        //Solicitando la opción
        try {//Para evitar que el sistema colapse cuando se haya llegado al límite de personas registradas

            boolean salir_n = false;
            do {
                //Entrada al menu de opciones
                System.out.println("");
                System.out.println("¿Qué quieres generar?");
                System.out.println("1.Reporte de Stock");
                System.out.println("2.Reporte de Ventas");
                System.out.println("3.Salir");
                System.out.println("");

                //Menú
                try {
                    String opcion = buffer.readLine();
                    Integer OPCION = Integer.parseInt(opcion);

                    switch (OPCION) {
                        case 1 -> {//Reporte de Stock
                            R_Stock();
                            break;

                        }
                        case 2 -> {//Reporte de Ventas
                            R_Venta();
                            break;
                        }
                        case 3 -> {// Salir
                            salir_n = true;

                        }

                        default -> {
                            System.out.println("Opció no valida→selecciona una opción del menú");// Este es por si le persona no escoge ninguna opción
                        }

                    }

                } catch (NumberFormatException c) {//Este por si la persona ingresa un salto o espacio,letras (LETRAS)
                    System.out.println("No puedes ingresar saltos de línea o letras ¡Recuerda! solo puedes ingresar las opciones del menú" + " Error= " + c);
                }

            } while (!salir_n);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Upps! el sistema llego a su límite de ingresos" + " Error= " + e);
            //salir = true;

        }

    }

    ///////////////////////////////////////////////////////////////////////////
    //Método para Generar Reporte de Stock
    public static void R_Venta() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        if (contador6 == 0) {
            System.out.println("No hay productos para exportar al PDF.");
            return;
        }
        System.out.print("Ruta/nombre del PDF (por defecto 'DD_MM_YYYY_HH_mm_ss_Venta.pdf'): ");
        String path = buffer.readLine();

        if (path.isEmpty()) {
            String Fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss"));

            path = Fecha + "_Venta.pdf";
        }

        try (PdfWriter writer = new PdfWriter(path); PdfDocument pdf = new PdfDocument(writer); Document doc = new Document(pdf)) {

            doc.add(new Paragraph("Reporte de Venta")
                    .setBold()
                    .setFontSize(14));
            doc.add(new Paragraph("Reporte Generado: "
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));

            Table table = new Table(new float[]{3, 6, 3, 3});
            table.useAllAvailableWidth();
            table.addHeaderCell(new Cell().add(new Paragraph("Productos Vendidos")));
            table.addHeaderCell(new Cell().add(new Paragraph("Cantidad")));
            table.addHeaderCell(new Cell().add(new Paragraph("Fecha")));
            table.addHeaderCell(new Cell().add(new Paragraph("Total de cada venta")));

            double total = 0.0;
            for (int i = 0; i < contador6; i++) {
                //Nombre_Producto p = Stock[0][i];
                table.addCell(new Cell().add(new Paragraph(String.valueOf(P_V[0][i]))));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Cantidad[0][i]))));
                table.addCell(new Cell().add(new Paragraph(Tiempo[0][i])));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Total[0][i]))));
                total += Total[0][i];
            }

            // Fila resumen
            table.addCell(new Cell(1, 3).add(new Paragraph("Total productos: " + contador6)));
            table.addCell(new Cell().add(new Paragraph(String.format("%.2f", total))));

            doc.add(table);
            System.out.println("PDF de productos vendidos: " + path);
        } catch (Exception e) {
            System.err.println("Error exportando PDF: " + e.getMessage());
        }
    }

    //Método para Generar Reporte de Venta
    public static void R_Stock() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        if (contador1 == 0) {
            System.out.println("No hay productos para exportar al PDF.");
            return;
        }
        System.out.print("Ruta/nombre del PDF (por defecto 'DD_MM_YYYY_HH_mm_ss_Stock.pdf'): ");
        String path = buffer.readLine();

        if (path.isEmpty()) {
            String Fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss"));

            path = Fecha + "_Stock.pdf";
        }

        try (PdfWriter writer = new PdfWriter(path); PdfDocument pdf = new PdfDocument(writer); Document doc = new Document(pdf)) {

            doc.add(new Paragraph("Reporte de Stock")
                    .setBold()
                    .setFontSize(14));
            doc.add(new Paragraph("Reporte Generado: "
                    + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));

            Table table = new Table(new float[]{3, 6, 3, 3, 3});
            table.useAllAvailableWidth();
            table.addHeaderCell(new Cell().add(new Paragraph("Nombre")));
            table.addHeaderCell(new Cell().add(new Paragraph("Código")));
            table.addHeaderCell(new Cell().add(new Paragraph("Categoría")));
            table.addHeaderCell(new Cell().add(new Paragraph("Precio")));
            table.addHeaderCell(new Cell().add(new Paragraph("Cantidad disponible")));

            //double total = 0.0;
            for (int i = 0; i < contador1; i++) {
                //Nombre_Producto p = Stock[0][i];
                if(Nombre_Producto[0][i]!=null){
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Nombre_Producto[0][i]))));}
                if(Codigo[0][i]!=null){
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Codigo[0][i]))));}
                if(Categoria_Producto[0][i]!=null){
                table.addCell(new Cell().add(new Paragraph(Categoria_Producto[0][i])));}
                if(Precio[0][i]!=0){
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Precio[0][i]))));}
                if(Stock[0][i]!=null){
                table.addCell(new Cell().add(new Paragraph(String.valueOf(Stock[0][i]))));}
                //total += Codigo[0][i];
            }

            // Fila resumen
            table.addCell(new Cell(1, 5).add(new Paragraph("Total productos registrados: " + contador1)));
            //table.addCell(new Cell().add(new Paragraph(String.format("%.2f", total))));

            doc.add(table);
            System.out.println("PDF de productos en stock: " + path);
        } catch (Exception e) {
            System.err.println("Error exportando PDF: " + e.getMessage());
        }
    }
    
    
    public static void S_Producto() throws IOException {
        for (int i = 0; i < contador1; i++){
        if (Nombre_Producto[0][i]!=null){
        }
       
    }
    }
    
    

    ////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
        //Método para ver dato del estudiante
    public static void Estudiante() throws IOException {
        System.out.println("Facultad de Ingeniería");
        System.out.println("Laboratorio de Introducción a la Programación y Computación 1");
        System.out.println("");

        System.out.println("Nombre: Hany Clara Jannette Alvarez Bulux");
        System.out.println("CUI: 3263543281401 ");
        System.out.println("Carnet: 202401231");
        System.out.println("Correo: 3263543281401@ingenieria.usac.edu.gt ");

    }

}

