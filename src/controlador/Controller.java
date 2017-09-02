/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.vistaMenuPrincipal;

/**
 *
 * @author arman
 */
public class Controller implements ActionListener, MouseListener {

    private vistaMenuPrincipal view;
    private Conexion conect;
    private Connection cn;

    /**
     * Constructor
     *
     * @param view
     */
    public Controller(vistaMenuPrincipal view) {
        this.view = view;
        cargarTabla();
    }

    private void cargarTabla() {

        this.view.modelo.addColumn("Funcion");
        this.view.modelo.addColumn("Horario");

        this.view.jTable1.setModel(this.view.modelo);
        this.view.jTable2.setModel(this.view.modelo);
        this.view.jTable3.setModel(this.view.modelo);
        String[] datos = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM teatro_patito_feo.funcion");
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                this.view.modelo.addRow(datos);
            }
            this.view.jTable1.setModel(this.view.modelo);
            this.view.jTable2.setModel(this.view.modelo);
            this.view.jTable3.setModel(this.view.modelo);
        } catch (SQLException ex) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Objeto para ejecutar los procedimientos almacenados
        //   en la base de datos
        String nombreFuncion = this.view.JTxtNombreFuncion.getText(),
                horarioFuncion = this.view.JTxtHorarioFuncion.getText();
        String sql = "INSERT funcion(idFuncion,NombreFuncion,InicioFuncion, Duracion, FinalFuncion) VALUES (?,?,?,?,?)";

        //COMANDO EJECTUADO
        String comando = ae.getActionCommand();

        //Deberá coincidir con alguno de los parámetros
        //  indicados en setActionCommand invocado en la
        //  clase View
        switch (comando) {
            case "INSERT": {
                try {
                    PreparedStatement pst = cn.prepareStatement(sql);
                    
                    pst.setInt(1, 0);
                    pst.setString(2, nombreFuncion);
                    pst.setString(3, horarioFuncion);
                    pst.setString(4, "8");
                    pst.setString(5, "8");
                    pst.executeUpdate();
                } catch (SQLException ex) {

                }
            }
            break;
        }
        //limpiar el formulario
        limpia();

        //refrescar la tabla
        cargarTabla();
    }

    @Override
    public void mouseClicked(MouseEvent ae) {
//Objeto para ejecutar los procedimientos almacenados en la base de datos
        CallableStatement cs;
        //Objeto para recoger los datos devueltos por el procedimiento almacenado
        ResultSet rs;

        //Recoger qué fila se ha pulsadao en la tabla
        int filaPulsada = this.view.jTable1.getSelectedRow();
        //Si se ha pulsado una fila
        if (filaPulsada >= 0) {
            //Se recoge el id de la fila marcada
            int identificador = (int) this.view.modelo.getValueAt(
                    filaPulsada, 0);
            try {
                //Preparar la llamada
                cs = Conexion.getConnection().prepareCall(
                        "{CALL getCliente(?)}");
                //Indicar qué información se pasa al procedimiento
                cs.setInt(1, identificador);
                //Ejecutar el procedimiento
                rs = cs.executeQuery();
                //Cargar los datos devueltos en los cuadros de texto
                if (rs.next()) {
                    this.view.JTxtNombreFuncion.setText(rs.getString(1));
                    this.view.JTxtHorarioFuncion.setText(rs.getString(2));
                }
                //System.out.println(this.view.dtm.getValueAt(filaPulsada, 0));
            } catch (SQLException e) {
                System.err.println("Error al CARGAR UN CLIENTE");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void limpia() {
        this.view.JTxtNombreFuncion.setText("");
        this.view.JTxtHorarioFuncion.setText("");
    }
}
