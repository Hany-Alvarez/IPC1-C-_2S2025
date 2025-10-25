/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Productos;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author hanya
 */
public class EditorBoton extends DefaultCellEditor {

    private JButton editarBoton;
    private String label;
    private boolean click;
    private JTable table;

    public EditorBoton(JTable table) {
        super(new JCheckBox()); // solo se usa para cumplir con DefaultCellEditor
        this.table = table;
        editarBoton = new JButton();
        editarBoton.setOpaque(true);

        editarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column) {

        label = (value == null) ? "click" : value.toString();
        editarBoton.setText(label);
        click= true;
        return editarBoton;
    }

    public Object getCellEditorValue(String mensaje) {
        if (click) {
            // Acción al hacer clic
            JOptionPane.showMessageDialog(editarBoton,
                    mensaje);
        }
        click = false;
        return label;
    }

    @Override
    public boolean stopCellEditing() {
        click = false;
        return super.stopCellEditing();
    }

}


