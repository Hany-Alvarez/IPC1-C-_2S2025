/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.CargarA.h;
import Vista.Modulo_Administrador.Módulo_Administración;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hanya
 */
public class Vendedor {

    private String codigo;
    private String nombre;
    private String genero;
    private String contraseña;
    private int confirmados;

    public static String Usuario[][] = new String[101][5];
    public static TableModel tm;
    static int contador = 0;
    static int contador2 = 0;
    static int contador3 = 0;
    static int contador4 = 0;
    public static int contador5 = 0;

    public Vendedor() {

    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;

        //Validaciones
        switch (codigo) {
            case "" -> {
                System.out.println("El código no puede ser vacio");
                break;

            }
            default -> {
                //Se agrega a la matriz
                Usuario[contador][0] = codigo;
                contador++;
                System.out.println(codigo);

                for (int i = 0; i < (contador - 1); i++) {
                    if (Objects.equals(Usuario[i][0], Usuario[contador - 1][0])) {
                        Usuario[contador - 1][0] = null;
                        contador = contador - 1;
                        System.out.println("El código ya existe");
                        break;
                    } else {
                        System.out.println("Codigo guardado en matriz: " + Usuario[contador - 1][0] + "Comprobación: " + i);
                        //break;
                    }
                }
            }
        }
        System.out.println("Contador: " + contador);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        //Validaciones
        switch (nombre) {
            case "" -> {
                System.out.println("El nombre no puede ser vacio");
                break;

            }
            default -> {
                //Se agrega a la matriz
                Usuario[contador2][1] = nombre;
                contador2++;
                System.out.println(Usuario[contador2 - 1][1]);
            }
        }
        System.out.println("Contador2: " + contador2);
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
        //Validaciones
        switch (genero) {
            case "Masculino", "M" -> {
                Usuario[contador3][2] = "M";
                contador3++;
                System.out.println(Usuario[contador3 - 1][2]);

            }
            case "Femenino", "F" -> {
                //Se agrega a la matriz
                Usuario[contador3][2] = "F";
                contador3++;
                System.out.println(Usuario[contador3 - 1][2]);
            }
        }
        System.out.println("Contador3: " + contador3);
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        switch (contraseña) {
            case "" -> {
                System.out.println("La contraseña no puede estar vacia");
                break;

            }
            default -> {
                //Se agrega a la matriz
                Usuario[contador4][3] = contraseña;
                contador4++;
                System.out.println(Usuario[contador4 - 1][3]);
            }
        }
        System.out.println("Contador4: " + contador4);
    }

    /**
     * @return the confirmados
     */
    public int getConfirmados() {
        return confirmados;
    }

    /**
     * @param confirmados the confirmados to set
     */
    public void setConfirmados(int confirmados) {
        this.confirmados = confirmados;
        String con = String.valueOf(confirmados);
        Usuario[contador5][4] = con;
        contador5++;
        System.out.println(Usuario[contador5 - 1][4]);
        System.out.println("Contador5: " + contador5);
    }

    ///Extra para validar todos los campos y si uno no cumple se reinicie la creación
    public void validacionF() {
        if (contador == contador2 && contador == contador3 && contador == contador4 && contador == contador5) {
            System.out.println("Todas las validaciones admitidas");
        } else {
            System.out.println("Un campo está mal, rellena la información de nuevo");
            contador = contador5 - 1;
            Usuario[contador][0] = null;

            contador2 = contador5 - 1;
            Usuario[contador2][1] = null;

            contador3 = contador5 - 1;
            Usuario[contador3][2] = null;

            contador4 = contador5 - 1;
            Usuario[contador4][3] = null;

            contador5 = contador5 - 1;
            Usuario[contador5][4] = null;
        }
    }

    public void CrearTablaF() { //Crear tabla con formato
        //Validar que la tabla no exista
        if (tm == null) {
            System.out.println("La tabla no existe, creando tabla");
            DefaultTableModel mD = new DefaultTableModel(new String[]{"Código", "Nombre", "Genero", "Cantidad de Ventas Confimadas"}, 101);

            Módulo_Administración.tabla.setModel(mD);

            tm = Módulo_Administración.tabla.getModel();
        } else {
            System.out.println("La tabla ya existe, se continua para rellenar");
        }
    }

    public void ReyenarTablaCargar(int b) { //Solo para reyenar

        for (int i = 0; i <= b; i++) {
            tm.setValueAt(Usuario[i][0], i, 0);
            tm.setValueAt(Usuario[i][1], i, 1);
            tm.setValueAt(Usuario[i][2], i, 2);
            tm.setValueAt(Usuario[i][4], i, 3);
        }

    }

    public void ReyenarTablaCrear(int b) { //Solo para reyenar
        for (int i = 0; i <= b; i++) {
            tm.setValueAt(Usuario[i][0], i, 0);
            tm.setValueAt(Usuario[i][1], i, 1);
            tm.setValueAt(Usuario[i][2], i, 2);
            tm.setValueAt(Usuario[i][4], i, 3);
        }

    }

    public void PrimeroCargar(int a) {//Arreglar los contadores si primero se carga y luego se crea
        if (contador == 0) {
            contador = a;
            contador2 = a;
            contador3 = a;
            contador4 = a;
            contador5 = a;
        }
    }

    public int PrimeroCrear(int c) {
        if (contador !=0) {
            System.out.println("El sistema ya tiene elementos creados");
            //c=contador;
            return contador;
        }
        System.out.println("El sistema no tiene datos creados");
        return 0;

    }
    
    public void CCC(int a) {//crear-cargar-crear
        System.out.println("contador: "+contador);
        System.out.println("suma: "+(h));
        if(a==0 || contador>=h){
        System.out.println("No hay datos cargados previos, seguir con creando sin corrimiento");
        }
        else{
            System.out.println("Si hay datos cargados previos, arreglando corrimiento");
            System.out.println("El valor de lineas es :"+a);
            System.out.println("El valor del contador: "+contador);
        contador2=contador+a;
        contador3=contador+a;
        contador4=contador+a;
        contador5=contador+a;
        contador=contador+a;
        }
    
    
    }

}
