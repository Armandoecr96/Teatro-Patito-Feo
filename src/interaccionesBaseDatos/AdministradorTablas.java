/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionesBaseDatos;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author b1796
 */
public class AdministradorTablas extends MouseAdapter {

    private Conexion conexion;
    private Connection connection;
    private JTable tabla;
    private Object valueObtained;

    public AdministradorTablas() {
    }

    public AdministradorTablas(JTable tabla) {
        this.tabla = tabla;
    }

    public DefaultTableModel cargarTablaFunciones() {
        System.out.println("AdministradorTablas");
        this.conexion = new Conexion();
        this.connection = this.conexion.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID Funcion");
        modelo.addColumn("Funcion");
        modelo.addColumn("Horario de Inicio");
        modelo.addColumn("Horario de Fin");

        String[] datos = new String[4];
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM teatro_patito_feo.funcion");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(5);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        this.conexion.desconectar();
        System.out.println("AdministradorTablas");
        return modelo;
    }

    @Override
    public void mousePressed(MouseEvent me) {
        super.mousePressed(me);
        JTable table = (JTable) me.getSource();
        Point point = me.getPoint();
        int row = table.rowAtPoint(point);
        if (me.getClickCount() == 2) {
            System.out.println("" + tabla.getValueAt(tabla.getSelectedRow(), 1));
            this.setValueObtained(tabla.getValueAt(tabla.getSelectedRow(), 1));
        }
    }

    /**
     * @return the valueObtained
     */
    public Object getValueObtained() {
        return valueObtained;
    }

    /**
     * @param valueObtained the valueObtained to set
     */
    public void setValueObtained(Object valueObtained) {
        this.valueObtained = valueObtained;
    }
}
