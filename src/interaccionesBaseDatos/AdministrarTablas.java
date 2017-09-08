/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionesBaseDatos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author b1796
 */
public class AdministrarTablas extends MouseAdapter {

    private Conexion conexion;
    private Connection connection;
    private JTable tabla;
    private JButton boton;
    private Object valueObtained;

    public AdministrarTablas() {
    }

    public AdministrarTablas(JTable tabla, JButton boton) {
        this.tabla = tabla;
        this.boton = boton;
    }

    public DefaultTableModel cargarTablaFunciones() {
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
        desconectarBD();
        return modelo;
    }

    private void desconectarBD() {
        this.conexion = null;
        this.connection = null;
        System.out.println("Conexion terminada..");
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
