/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Butaca;
import modelo.Funcion;
import vista.vistaMenuPrincipal;

/**
 *
 * @author arman
 */
public class Controller {

    private Conexion funcionDAO;
    private Connection connection;

    /**
     * Constructor
     *
     */
    public Controller() {
        funcionDAO = new Conexion();
        connection = funcionDAO.getConnection();
    }

    public MouseAdapter crearFuncion(String s, int horIni, int minIni, int horDur, int minDur) {
        Funcion funcion = new Funcion(s, horIni, minIni, horDur, minDur);
        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                funcion.conectarBD(funcionDAO, connection);
                funcion.crearFuncion();
            }
        };
        return mouseAdapter;
    }

    public MouseAdapter butacaAdapter(JLabel jl) {
        Butaca butaca = new Butaca();
        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                butaca.MouseEntered(evt, jl);
            }

            public void mouseExited(MouseEvent evt) {
                butaca.MouseExited(evt, jl);
            }

            public void mouseClicked(MouseEvent evt) {
                butaca.MouseClicked(evt, jl);
            }
        };
        return mouseAdapter;
    }

    public DefaultTableModel cargarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Funcion");
        modelo.addColumn("Horario de Inicio");
        modelo.addColumn("Horario de Fin");

        String[] datos = new String[3];
        try {
            Statement st = connection.createStatement();
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
        return modelo;
    }
}
