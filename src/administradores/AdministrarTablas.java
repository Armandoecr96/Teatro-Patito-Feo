/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradores;

import interaccionBaseDatos.DAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author b1796
 */
public class AdministrarTablas extends MouseAdapter {

    private JTable tabla;
    private JButton boton;
    private Object valueObtained;
    private JTextField jTextField;

    public AdministrarTablas() {
    }

    public AdministrarTablas(JTable tabla, JButton boton) {
        this.tabla = tabla;
        this.boton = boton;
        this.valueObtained = null;
        this.jTextField = null;
    }

    public DefaultTableModel cargarTablaFunciones() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID Funcion");
        modelo.addColumn("Funcion");
        modelo.addColumn("Horario de Inicio");
        modelo.addColumn("Horario de Fin");

        String[] datos = new String[4];

        Object[][] buscar = new DAO().buscar("idFuncion,NombreFuncion,InicioFuncion,FinalFuncion", DAO.FUNCION);

        for (int i = 0; i < buscar.length; i++) {
            datos[0] = buscar[i][0].toString();
            datos[1] = buscar[i][1].toString();
            datos[2] = buscar[i][2].toString();
            datos[3] = buscar[i][3].toString();
            modelo.addRow(datos);
        }
        return modelo;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        super.mousePressed(me);
        int row = this.tabla.getSelectedRow();
        this.valueObtained = this.tabla.getModel().getValueAt(row, 0);
        this.boton.setEnabled(true);
        mostrarNombreJTextField(row);
    }

    /**
     * @return the valueObtained
     */
    public Object getValueObtained() {
        return this.valueObtained;
    }

    private void mostrarNombreJTextField(int row) {
        if (this.jTextField != null) {
            this.jTextField.setText(this.tabla.getModel().getValueAt(row, 1).toString());
        }
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }
}
