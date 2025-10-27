/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Vendedor_Producto;

/*
Controlador para darle estilo y funciones después del click al boton de la columna 3 (0-3) en la subventana(Producto) en Adminitración
 */
import Controlador.Administrador_Productos.*;
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
public class EditorBoton_Historial extends DefaultCellEditor {

    private JButton editarBoton;
    private String label;
    private boolean click;
    private JTable table;

    public EditorBoton_Historial(JTable table) {
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

        label = (value == null) ? "click" : "Cerrar historial";
        editarBoton.setText(label);
        click = true;
        return editarBoton;
    }

    @Override
    public Object getCellEditorValue() {
        try {
            if (click) {

                JOptionPane.showMessageDialog(editarBoton, "Este stock se cargo el " + UsuarioP[table.getSelectedRow()][6] );
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
