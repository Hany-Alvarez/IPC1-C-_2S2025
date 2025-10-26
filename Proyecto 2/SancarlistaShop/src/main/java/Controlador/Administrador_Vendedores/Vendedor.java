/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Vendedores;
/*
Controlador Base para toda la Subventana(Vendedor) en Administración
*/
import static Controlador.Administrador_Vendedores.CargarA.B;
import static Controlador.Administrador_Vendedores.CargarA.h;
import static Controlador.Administrador_Vendedores.CargarA.orden;
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
    private String buscarCodigo;
    private String actun;
    private String actuc;
    private String buscarCodigoE;
    private int confirmados;

    public static String Usuario[][] = new String[101][5];
    public static TableModel tm;
    static int contador = 0;
    static int contador2 = 0;
    static int contador3 = 0;
    static int contador4 = 0;
    public static int contador5 = 0;
    public int mayor;
    public int mayor2;

    public Vendedor() {

    }
    //Inicialización de Usuario para que no de null

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
        if (contador != 0) {
            System.out.println("El sistema ya tiene elementos creados");
            //c=contador;
            return contador;
        }
        System.out.println("El sistema no tiene datos creados");
        return 0;

    }

    public void CCC(int a) {//crear-cargar-crear
        System.out.println("contador: " + contador);
        System.out.println("suma: " + (h));
        if (a == 0 || contador >= h) {
            System.out.println("No hay datos cargados previos, seguir con creando sin corrimiento");
        } else {
            System.out.println("Si hasy datos cargados previos, arreglando corrimiento");
            System.out.println("El valor de lineas es :" + a);
            System.out.println("El valor del contador: " + contador);
            contador2 = contador + a;
            contador3 = contador + a;
            contador4 = contador + a;
            contador5 = contador + a;
            contador = contador + a;
        }

    }

    public void NoIgual() {
        for (int z = 0; z < contador; z++) {//problema por si se pasa de tamaño
            for (int y = B; y <= 100; y++) {

                if (Usuario[z][0].equalsIgnoreCase(Usuario[y][0])) {//datos antes-datos después
                    Usuario[y][0] = null;
                    Usuario[y][1] = null;
                    Usuario[y][2] = null;
                    Usuario[y][3] = null;
                    Usuario[y][4] = null;
                } else {

                }
            }
        }
    }

    public int Dato1() {
        mayor = 0;
        System.out.println("El contador es:" + contador);
        for (int i = 0; i < contador; i++) {
            int valor = Integer.parseInt(Usuario[i][4]);

            if (valor > mayor) {
                System.out.println("El número " + valor + " es mayor que " + mayor);
                mayor = valor;
            }
        }

        return mayor;
    }

    public int Dato2() {
        mayor2 = 0;
        System.out.println("El contador es:" + contador);
        for (int i = 0; i < contador; i++) {
            int valor = Integer.parseInt(Usuario[i][4]);

            if (valor > mayor2 && valor != mayor) {
                System.out.println("El número " + valor + " es mayor que " + mayor2);
                mayor2 = valor;
            }
        }

        return mayor2;
    }

    public int Dato3() {
        int mayor3 = 0;
        System.out.println("El contador es:" + contador);
        for (int i = 0; i < contador; i++) {
            int valor = Integer.parseInt(Usuario[i][4]);

            if (valor > mayor3 && valor != mayor && valor != mayor2) {
                System.out.println("El número " + valor + " es mayor que " + mayor3);
                mayor3 = valor;
            }
        }

        return mayor3;
    }

    /**
     * @return the buscarCodigo
     */
    public String getBuscarCodigo() {
        return buscarCodigo;
    }

    /**
     * @param buscarCodigo the buscarCodigo to set
     */
    public void setBuscarCodigo(String buscarCodigo) {
        this.buscarCodigo = buscarCodigo;
    }

    public String ActualizarN() {

        String a = null;
        System.out.println("El codigo es: " + buscarCodigo);
        try {
            if (buscarCodigo != null) {
                for (int i = 0; i <= 100; i++) {
                    if (Usuario[i][0].equalsIgnoreCase(buscarCodigo)) {
                        a = Usuario[i][1];
                        break;
                    } else {
                        System.out.println("El codigo no existe1");
                    }

                }
            } else {
                System.out.println("El codigo no puede ser null1");

            }

        } catch (Exception ex) {
            System.out.println("El error es: " + ex);
        }
        return a;
    }

    public String ActualizarC() {//3
        String b = null;
        System.out.println("El codigo es: " + buscarCodigo);
        try {
            if (buscarCodigo != null) {
                for (int i = 0; i <= 100; i++) {
                    if (Usuario[i][0].equalsIgnoreCase(buscarCodigo)) {
                        b = Usuario[i][3];
                        break;
                    } else {
                        System.out.println("El codigo no existe2");

                    }

                }
            } else {
                System.out.println("El codigo no puede ser null2");

            }
        } catch (Exception ex) {
            System.out.println("El error es: " + ex);
        }

        return b;

    }

    /**
     * @return the actun
     */
    public String getActun() {
        return actun;
    }

    /**
     * @param actun the actun to set
     * @param codigo
     */
    public void setActun(String actun, String codigo) {
        this.actun = actun;

        System.out.println("El codigo es: " + codigo);
        System.out.println("El Nombre a actualizar es: " + actun);
        for (int i = 0; i <= 100; i++) {
            if (Usuario[i][0].equalsIgnoreCase(codigo)) {

                Usuario[i][1] = actun;
                break;
            }

        }
    }

    /**
     * @return the actuc
     */
    public String getActuc() {
        return actuc;
    }

    /**
     * @param actuc the actuc to set
     * @param codigo
     */
    public void setActuc(String actuc, String codigo) {
        this.actuc = actuc;
        System.out.println("El codigo es: " + codigo);
        System.out.println("La contraseña a actualizar es: " + actuc);
        for (int i = 0; i <= 100; i++) {
            if (Usuario[i][0].equalsIgnoreCase(codigo)) {

                Usuario[i][3] = actuc;
                break;
            }

        }
    }

    /**
     * @return the buscarCodigoE
     */
    public String getBuscarCodigoE() {
        return buscarCodigoE;
    }

    /**
     * @param buscarCodigoE the buscarCodigoE to set
     */
    public void setBuscarCodigoE(String buscarCodigoE) {

        this.buscarCodigoE = buscarCodigoE;
        try {
            System.out.println("El codigo es: " + buscarCodigoE);
            for (int i = 0; i <= 100; i++) {
                if (Usuario[i][0].equalsIgnoreCase(buscarCodigoE)) {
                    Usuario[i][0] = "-";//código
                    Usuario[i][1] = "-";// Nombre
                    Usuario[i][2] = "-"; //Genero
                    Usuario[i][3] = "-"; //Contraseña
                    Usuario[i][4] = "0"; //Confirmación
                    break;
                } else {
                    System.out.println("El codigo no existe");
                }

            }
        } catch (Exception ex) {
            System.out.println("El error es: " + ex);
        }

    }
}
