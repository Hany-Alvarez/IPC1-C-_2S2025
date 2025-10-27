/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Vendedor_Producto;
/*
Controlador para darle estilo y funciones antes del click al boton de la columna 3 (0-3) en la subventana(Producto) en Adminitración
*/
import Controlador.Administrador_Productos.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author hanya
 */
public class GestionBoton_Historial extends DefaultTableCellRenderer {

    public GestionBoton_Historial() {
        setOpaque(true);

    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column
    ) {
        if (value != null) {
            setText("Ver historial ingresos");
        } else {
            setText("click"); //El desarrollo se encuentra en EditorBoton
        }

        if (isSelected) {
            setBackground(new Color(102, 102, 255));//Es para el color cuando se selecciona
        } else {
            setBackground(new Color(153, 153, 255)); //Es el color cuando no está seleccionado
        }

        return this;
    }
}
