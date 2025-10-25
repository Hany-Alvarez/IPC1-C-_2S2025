/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Productos;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author hanya
 */
public class GestionBoton extends DefaultTableCellRenderer {

    public GestionBoton() {
        setOpaque(true);

    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column
    ) {
        if (value != null) {
            setText(value.toString());
        } else {
            setText("click");
        }

        if (isSelected) {
            setBackground(table.getSelectionBackground());
        } else {
            setBackground(UIManager.getColor("Button.background"));
        }

        return this;
    }
}
