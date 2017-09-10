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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author b1796
 */
public class AdministrarTablas extends MouseAdapter {

    private JTable tabla;
    private JButton boton;
    private Object valueObtained;

    public AdministrarTablas() {
    }

    public AdministrarTablas(JTable tabla, JButton boton) {
        this.tabla = tabla;
        this.boton = boton;
    }

    public DefaultTableModel cargarTablaFunciones() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID Funcion");
        modelo.addColumn("Funcion");
        modelo.addColumn("Horario de Inicio");
        modelo.addColumn("Horario de Fin");

        String[] datos = new String[4];

        Object[][] dao = new DAO().buscar("idFuncion,NombreFuncion,InicioFuncion,FinalFuncion", DAO.FUNCION);

        for (int i = 0; i < dao.length; i++) {
            datos[0] = dao[i][0].toString();
            datos[1] = dao[i][1].toString();
            datos[2] = dao[i][2].toString();
            datos[3] = dao[i][3].toString();
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
    }

    /**
     * @return the valueObtained
     */
    public Object getValueObtained() {
        return this.valueObtained;
    }
}
