/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Controlar todas las funciones de la subventana(Producto) de administrador
*/
package Controlador.Administrador_Productos;

import static Controlador.Administrador_Productos.Cargar_Producto.BB;
import static Controlador.Administrador_Productos.Cargar_Producto.hh;

import Vista.Modulo_Administrador.Módulo_Administración;
import Vista.Modulo_Administrador.Producto.Botones_Lista;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author hanya
 */
public class Productos {

    private String codigo;
    private String nombre;
    private String categoria;
    private String atributo;
    private int stock;
    private String acciones;
    private String buscarCodigo;
    private String actun;
    private String actuc;
    private String buscarCodigoE;
    private String confirmados;//solo servira para la validación de nullos

    public static String UsuarioP[][] = new String[101][10]; //Para almacenar los productos
    public static TableModel tms;
    static int contadorP = 0;
    static int contador2P = 0;
    static int contador3P = 0;
    static int contador4P = 0;
    public static int contador5P = 0;
    public int contador6P = 0;
    public int contador7P = 0;
    public int mayorP;
    public int mayor2P;

    public Productos() {

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
                UsuarioP[contadorP][0] = codigo;
                contadorP++;
                System.out.println(codigo);

                for (int i = 0; i < (contadorP - 1); i++) {
                    if (Objects.equals(UsuarioP[i][0], UsuarioP[contadorP - 1][0])) {
                        UsuarioP[contadorP - 1][0] = null;
                        contadorP = contadorP - 1;
                        System.out.println("El código ya existe");
                        break;
                    } else {
                        System.out.println("Codigo guardado en matriz: " + UsuarioP[contadorP - 1][0] + "Comprobación: " + i);
                        //break;
                    }
                }
            }
        }
        System.out.println("ContadorP: " + contadorP);
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
                UsuarioP[contador2P][1] = nombre;
                contador2P++;
                System.out.println(UsuarioP[contador2P - 1][1]);
            }
        }
        System.out.println("Contador2P: " + contador2P);
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     * @return
     */
    public String setCategoria(String categoria) {
        this.categoria = categoria;
        //Validaciones
        switch (categoria) {
            case "Tecnología", "tecnología" -> {
                UsuarioP[contador3P][2] = "Tecnología";
                contador3P++;
                System.out.println(UsuarioP[contador3P - 1][2]);

            }
            case "Alimento", "alimento" -> {
                //Se agrega a la matriz
                UsuarioP[contador3P][2] = "Alimento";
                contador3P++;
                System.out.println(UsuarioP[contador3P - 1][2]);
            }
            case "General", "general" -> {
                //Se agrega a la matriz
                UsuarioP[contador3P][2] = "General";
                contador3P++;
                System.out.println(UsuarioP[contador3P - 1][2]);
            }
        }
        System.out.println("Contador3P: " + contador3P);
        return categoria;
    }

    /**
     * @return the atributo
     */
    public String getAtributo() {
        return atributo;
    }

    /**
     * @param atributo the atributo to set
     */
    public void setAtributo(String atributo) {//Mensaje que se va ha mostrar
        this.atributo = atributo;
        switch (atributo) {
            case "" -> {
                System.out.println("La contraseña no puede estar vacia");
                break;

            }
            default -> {
                //Se agrega a la matriz
                UsuarioP[contador4P][3] = atributo;
                contador4P++;
                System.out.println(UsuarioP[contador4P - 1][3]);
            }
        }
        System.out.println("Contador4P: " + contador4P);
    }

    /**
     * @return the confirmados
     */
    public String getConfirmados() {
        return confirmados;
    }

    /**
     * @param confirmados the confirmados to set
     */
    public void setConfirmados(String confirmados) {
        this.confirmados = confirmados;
        String con = String.valueOf(confirmados);
        System.out.println("La categoría es: " + con);

        switch (con) {
            case "Tecnología", "tecnología" -> {
                UsuarioP[contador5P][4] = "Ver detalle T";
                contador5P++;
                System.out.println(UsuarioP[contador5P - 1][2]);

            }
            case "Alimento", "alimento" -> {
                //Se agrega a la matriz
                UsuarioP[contador5P][4] = "Ver detalle A ";
                contador5P++;
                System.out.println(UsuarioP[contador5P - 1][2]);
            }
            case "General", "general" -> {
                //Se agrega a la matriz
                UsuarioP[contador5P][4] = "Ver detalle G";
                contador5P++;
                System.out.println(UsuarioP[contador5P - 1][2]);
            }
        }

        System.out.println(UsuarioP[contador5P - 1][4]);
        System.out.println("Contador5P: " + contador5P);
    }

//  INICIO DATOS QUE SE VERAN EN PRODUCTOS_VENDEDOR
    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;

        if (stock < 0) {
            System.out.println("El stock no puede ser negativo");

        } else {
            //Se agrega a la matriz
            String T = String.valueOf(stock);
            UsuarioP[contador6P][5] = T;
            contador6P++;
            System.out.println(UsuarioP[contador6P - 1][5]);
        }

        System.out.println("Contador6P: " + contador6P);

    }

    /**
     * @return the acciones
     */
    public String getAcciones() {
        return acciones;
    }

    /**
     * @param acciones the acciones to set
     */
    public void setAcciones(String acciones) {
        this.acciones = acciones;
        UsuarioP[contador7P][6] = acciones;
        contador7P++;
        System.out.println(UsuarioP[contador7P - 1][6]);

        System.out.println("Contador7P: " + contador7P);
    }
    //  FIN DATOS QUE SE VERAN EN PRODUCTOS_VENDEDOR

    ///Extra para validar todos los campos y si uno no cumple se reinicie la creación
    public void validacionF() {//no esta colocado el contador 6
        if (contadorP == contador2P && contadorP == contador3P && contadorP == contador4P && contadorP == contador5P) {
            System.out.println("Todas las validaciones admitidas");
        } else {
            System.out.println("Un campo está mal, rellena la información de nuevo");
            contadorP = contador5P - 1;
            UsuarioP[contadorP][0] = null;

            contador2P = contador5P - 1;
            UsuarioP[contador2P][1] = null;

            contador3P = contador5P - 1;
            UsuarioP[contador3P][2] = null;

            contador4P = contador5P - 1;
            UsuarioP[contador4P][3] = null;

            contador6P = contador5P - 1;
            UsuarioP[contador6P][5] = null;

            contador5P = contador5P - 1;
            UsuarioP[contador5P][4] = null;

        }
    }

    public void CrearTablaF() { //Crear tabla con formato
        //Validar que la tabla no exista

        if (tms == null) {
            System.out.println("La tabla no existe, creando tabla");
            DefaultTableModel MD = new DefaultTableModel(new String[]{"Código", "Nombre", "Categoría", "Acciones"}, 101);

            Módulo_Administración.tabla2.setModel(MD);
            Módulo_Administración.tabla2.getColumnModel().getColumn(3).setCellRenderer(new GestionBoton());
            Módulo_Administración.tabla2.getColumnModel().getColumn(3).setCellEditor(new EditorBoton(Módulo_Administración.tabla2));
            tms = Módulo_Administración.tabla2.getModel();
        } else {
            System.out.println("La tabla ya existe, se continua para rellenar");
        }
    }

    public void ReyenarTablaCargar(int b) { //Solo para reyenar

        for (int i = 0; i <= b; i++) {
            tms.setValueAt(UsuarioP[i][0], i, 0);
            tms.setValueAt(UsuarioP[i][1], i, 1);
            tms.setValueAt(UsuarioP[i][2], i, 2);
            //tms.setValueAt(UsuarioP[i][4], i, 3);

            Botones_Lista boton = new Botones_Lista();
            boton.boton(UsuarioP[i][4]); //Lógica es = Le pido a la matriz que me de el tipo categoría que es, la guardo y le paso eso al boton
            JButton WWW = Botones_Lista.BOT; //Lógica es = El boton le dara sus atributos a WWW
            //JButton WWW = null; //Lógica es = El boton le dara sus atributos a WWW 
            tms.setValueAt(WWW, i, 3);//Lógica es = Aquí se crea el boton jajaja esperanza es lo último que muere

        }

    }

    public void ReyenarTablaCrear(int b) { //Solo para reyenar
        System.out.println("Se está ejecutando el reyeno por crear");
        try {
            for (int i = 0; i <= b; i++) {
                tms.setValueAt(UsuarioP[i][0], i, 0);
                tms.setValueAt(UsuarioP[i][1], i, 1);
                tms.setValueAt(UsuarioP[i][2], i, 2);
                //tms.setValueAt(UsuarioP[i][4], i, 3);

                Botones_Lista boton = new Botones_Lista();
                boton.boton(UsuarioP[i][4]); //Lógica es = Le pido a la matriz que me de el tipo categoría que es, la guardo y le paso eso al boton
                JButton WWW = Botones_Lista.BOT; //Lógica es = El boton le dara sus atributos a WWW 
                tms.setValueAt(WWW, i, 3);//Lógica es = Aquí se crea el boton jajaja esperanza es lo último que muere

            }
        } catch (Exception ex) {
            System.out.println("El error de reyenar es:" + ex);
        }
    }

    public void PrimeroCargar(int a) {//Arreglar los contadores si primero se carga y luego se crea
        if (contadorP == 0) {
            contadorP = a;
            contador2P = a;
            contador3P = a;
            contador4P = a;
            contador5P = a;
            contador6P=a;
        }
    }

    public int PrimeroCrear(int c) {
        if (contadorP != 0) {
            System.out.println("El sistema ya tiene elementos creados");
            //c=contador;
            return contadorP;
        }
        System.out.println("El sistema no tiene datos creados");
        return 0;

    }

    public void CCCP(int a) {//crear-cargar-crear
        System.out.println("contador: " + contadorP); //Hay que renombrar h
        System.out.println("suma: " + (hh));
        if (a == 0 || contadorP >= hh) {
            System.out.println("No hay datos cargados previos, seguir con creando sin corrimiento");
        } else {
            System.out.println("Si hasy datos cargados previos, arreglando corrimiento");
            System.out.println("El valor de lineas es :" + a);
            System.out.println("El valor del contador: " + contadorP);
            contador2P = contadorP + a;
            contador3P = contadorP + a;
            contador4P = contadorP + a;
            contador5P = contadorP + a;
            contador6P = contadorP + a;
            contadorP = contadorP + a;
        }

    }
/*
    public void NoIgual() {
        for (int z = 0; z < contadorP; z++) {//problema por si se pasa de tamaño
            for (int y = BB; y <= 100; y++) {//RENOMBRAR B

                if (UsuarioP[z][0].equalsIgnoreCase(UsuarioP[y][0])) {//datos antes-datos después
                    UsuarioP[y][0] = null;
                    UsuarioP[y][1] = null;
                    UsuarioP[y][2] = null;
                    UsuarioP[y][3] = null;
                    UsuarioP[y][4] = null;
                    UsuarioP[y][5] = null;
                    UsuarioP[y][6] = null;
                } else {

                }
            }
        }
    }
*/
    public int Dato1() {
        mayorP = 0;
        System.out.println("El contador es:" + contadorP);
        for (int i = 0; i < contadorP; i++) {
            int valor = Integer.parseInt(UsuarioP[i][4]);

            if (valor > mayorP) {
                System.out.println("El número " + valor + " es mayor que " + mayorP);
                mayorP = valor;
            }
        }

        return mayorP;
    }

    public int Dato2() {
        mayor2P = 0;
        System.out.println("El contador es:" + contadorP);
        for (int i = 0; i < contadorP; i++) {
            int valor = Integer.parseInt(UsuarioP[i][4]);

            if (valor > mayor2P && valor != mayorP) {
                System.out.println("El número " + valor + " es mayor que " + mayor2P);
                mayor2P = valor;
            }
        }

        return mayor2P;
    }

    public int Dato3() {
        int mayor3 = 0;
        System.out.println("El contador es:" + contadorP);
        for (int i = 0; i < contadorP; i++) {
            int valor = Integer.parseInt(UsuarioP[i][4]);

            if (valor > mayor3 && valor != mayorP && valor != mayor2P) {
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
                    if (UsuarioP[i][0].equalsIgnoreCase(buscarCodigo)) {
                        a = UsuarioP[i][1];
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
                    if (UsuarioP[i][0].equalsIgnoreCase(buscarCodigo)) {
                        b = UsuarioP[i][3];
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
    
    public String ActualizarCo(){
    
        return null;
    
    }
     public int ActualizarS() {

         

        String a = null;
        System.out.println("El codigo es: " + buscarCodigo);
        try {
            if (buscarCodigo != null) {
                for (int i = 0; i <= 100; i++) {
                    if (UsuarioP[i][0].equalsIgnoreCase(buscarCodigo)) {
                        a = UsuarioP[i][1];
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
        return 0;
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

        try {
            System.out.println("El codigo es: " + codigo);
            System.out.println("El Nombre a actualizar es: " + actun);
            for (int i = 0; i <= 100; i++) {
                if (UsuarioP[i][0].equalsIgnoreCase(codigo)) {

                    UsuarioP[i][1] = actun;
                    break;
                }

            }
        } catch (Exception ex) {
            System.out.println("El error de Actualizar por nombre es:" + ex);
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
        try {
            System.out.println("El codigo es: " + codigo);
            System.out.println("La contraseña a actualizar es: " + actuc);
            for (int i = 0; i <= 100; i++) {
                if (UsuarioP[i][0].equalsIgnoreCase(codigo)) {

                    UsuarioP[i][3] = actuc;
                    break;
                }

            }
        } catch (Exception ex) {
            System.out.println("El error de Actualizar codigo es: " + ex);
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
                if (UsuarioP[i][0].equalsIgnoreCase(buscarCodigoE)) {
                    UsuarioP[i][0] = "-";//Código
                    UsuarioP[i][1] = "-";// Nombre
                    UsuarioP[i][2] = "-"; //Genero
                    UsuarioP[i][3] = "-"; //Contraseña
                    UsuarioP[i][4] = "0"; //Confirmación
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
