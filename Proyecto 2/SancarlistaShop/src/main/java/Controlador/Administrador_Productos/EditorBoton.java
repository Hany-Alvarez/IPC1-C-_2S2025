/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Productos;

import static Controlador.Administrador_Productos.Productos.UsuarioP;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        editarBoton.setFont(new Font("StialHati-Regular", Font.CENTER_BASELINE, 10));
        //editarBoton.setBackground(new Color(255, 255, 255));
        editarBoton.setForeground(new Color(0, 102, 204));
        editarBoton.setOpaque(true);

        editarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped(); //Permite no queda en modo edición 
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(
            JTable table, Object value, boolean isSelected, int row, int column) {

        label = (value == null) ? "click" : "Cerrar detalles";
        editarBoton.setText(label);
        click = true;
        return editarBoton;
    }

    @Override
    public Object getCellEditorValue() {
        try {
            if (click) {
                switch (UsuarioP[table.getSelectedRow()][2]) {
                    case "Tecnología", "tecnología" -> {
                        JOptionPane.showMessageDialog(editarBoton, "El aparato tiene " + UsuarioP[table.getSelectedRow()][3] + " meses de garantía");
                    }
                    case "Alimento", "alimento" -> {
                        JOptionPane.showMessageDialog(editarBoton, "El alimento vence el:  " + UsuarioP[table.getSelectedRow()][3] );
                    }
                    case "General", "general" -> {
                        JOptionPane.showMessageDialog(editarBoton, "El producto esta elaborado de: " + UsuarioP[table.getSelectedRow()][3] );
                    }
                }

            }
            click = false;
        } catch (Exception ex) {
            System.out.println("El error en la selección de un mensaje es : " + ex);
        }

        return label;
    }

    @Override
    public boolean stopCellEditing() {
        click = false;
        return super.stopCellEditing();
    }

}
