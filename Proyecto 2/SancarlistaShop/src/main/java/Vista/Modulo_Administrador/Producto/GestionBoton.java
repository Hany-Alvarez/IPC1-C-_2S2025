/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Modulo_Administrador.Producto;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JButton;


/**
 *
 * @author hanya
 */
public class GestionBoton extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column
    ) {
        if (value instanceof JButton) {
            JButton buton = (JButton) value;
            return buton; // devuelve directamente el JButton
        }

        // Si no es JButton, se usa el renderizado normal
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    }
}
