/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionesBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author b1796
 */
public class AdministradorTablas {

    private Conexion conexion;
    private Connection connection;

    public AdministradorTablas() {
    }
    
    public DefaultTableModel cargarTablaFunciones() {
        System.out.println("AdministradorTablas");
        this.conexion = new Conexion();
        this.connection = this.conexion.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Funcion");
        modelo.addColumn("Horario de Inicio");
        modelo.addColumn("Horario de Fin");

        String[] datos = new String[3];
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM teatro_patito_feo.funcion");
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(5);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        this.conexion.desconectar();
        System.out.println("AdministradorTablas");
        return modelo;
    }
}
