/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Administrador_Productos;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
    
    public EditorBoton(JTable table){
        super(new JCheckBox());
        this.table =table;
    
    
    }
   
    
}
