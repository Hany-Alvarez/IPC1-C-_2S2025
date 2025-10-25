/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Productos;

import java.awt.Color;
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
            setText("Ver detalles");
        } else {
            setText("click"); //El desarrollo se encuentra en EditorBoton
        }

        if (isSelected) {
            setBackground(new Color(0, 255, 0));//Es para el color cuando se selecciona
        } else {
            setBackground(new Color(153, 255, 153)); //Es el color cuando no está seleccionado
        }

        return this;
    }
}
