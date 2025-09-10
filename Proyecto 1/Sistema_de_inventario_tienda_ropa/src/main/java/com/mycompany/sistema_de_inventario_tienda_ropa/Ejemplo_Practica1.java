//Problemas a reparar en el código
/*

1. Que aparezca upps! solo cuando exista el error 
    Teoría 1: en el método se está colocando mal un break dado que al final el for si llena todos los espacios
              dado que el error es para indicar que el sistema se ha quedado sin la capacidad de más participaciones.

2. Que al momento de que el nombre del producto este repetido, no aparezca la opción de categoría hasta tener el nombre correcto
    Teoría 1: Colocar un condicional de entrada para que se pueda ejecutar 
                1) Probar modificando el método
                2) Condicionar con un if desde el menu se switch

3. Que el programa no puede cerrar el primer menú
    Teoría 1: el cambio booleano no se esta leyendo por algun break.
Respuesta: El mal control de do-while del método nombre no lo dejaba. 

*/
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejemplo_Practica1 {

    static String Matriz_Estudiantes[][] = new String[1][100];
    static int contador = 0;

    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SISTEMA DE MANEJO DE ESTUDIANTES");
        Menu();
    }

    public static void Menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese una opcion del 1 al 3");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Ver Estudiantes");
            System.out.println("3. Salir");
            byte opcion = sc.nextByte();
            switch (opcion) {
                case 1:
                    Agregar_Estudiante();
                    break;
                case 2:
                    Mostrar_Estudiantes();
                    break;
                case 3:
                    System.out.println("Salida con Exito");
                    System.exit(0);
                default:
                    System.out.println("Debes ingresar un numero entre 1 - 3");
                    break;
            }
        }
    }
    public static void Agregar_Estudiante() {
        System.out.println("Funcion Agregar Estudiante");
        int Carnet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el carnet del Estudiante");
        Carnet = sc.nextInt();
        sc.nextLine();
        //AGREGAMOS A LA MATRIZ      
        Matriz_Estudiantes[0][contador] = Integer.toString(Carnet); // CARNET
        contador++;
        System.out.println("Se agrego el Estudiante");
    }
    public static void Mostrar_Estudiantes() {
        System.out.println("Funcion mostrar Estudiante");
        System.out.println("CARNET");
        for (int i = 0; i < Matriz_Estudiantes[0].length; i++) {
            if (Matriz_Estudiantes[0][i] == null) {
                break;
            } else {
                System.out.println(Matriz_Estudiantes[0][i]);

            }
        }

    }
}
