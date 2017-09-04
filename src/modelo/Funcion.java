
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Funcion {

    private String nombreFuncion;
    private int horaInicioFuncion, minutoInicioFuncion, horaDuracionFuncion, minutoDuracionFuncion;

    public Funcion(String s, int horIni, int minIni, int horDur, int minDur) {
        this.nombreFuncion = s;
        this.horaInicioFuncion = horIni;
        this.minutoInicioFuncion = minIni;
        this.horaDuracionFuncion = horDur;
        this.minutoDuracionFuncion = minDur;
    }

    public void crearFuncion() {
        System.out.println("Funcion");
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConnection();

        String sql = "INSERT funcion(idFuncion,NombreFuncion,InicioFuncion,Duracion,FinalFuncion) VALUES (?,?,?,?,?)";
        long milisecInicioFuncion = getMilisegundos(this.horaInicioFuncion, this.minutoInicioFuncion) + 21600000;
        long milisecDuracionFuncion = getMilisegundos(this.horaDuracionFuncion, this.minutoDuracionFuncion);
        long milisecFinFuncion = milisecInicioFuncion + milisecDuracionFuncion;

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT InicioFuncion, FinalFuncion FROM teatro_patito_feo.funcion");

            if (!verificarHorariosCruzados(rs, milisecInicioFuncion, milisecFinFuncion)) {
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setString(2, this.nombreFuncion);
                pst.setTime(3, new Time(milisecInicioFuncion));
                pst.setTime(4, new Time(milisecDuracionFuncion));
                pst.setTime(5, new Time(milisecFinFuncion));

                int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta función?", "Registrar función", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (reply == JOptionPane.YES_OPTION) {
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    conexion.desconectar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede guardar la función porque se cruzan los horarios", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion.desconectar();
        System.out.println("Funcion");
    }

    private boolean verificarHorariosCruzados(ResultSet rs, long msInicio, long msFin) throws SQLException {
        boolean result = false;
        while (rs.next()) {
            if ((msInicio >= rs.getTime(1).getTime() && msInicio <= rs.getTime(2).getTime())
                    || (msFin >= rs.getTime(1).getTime() && msFin <= rs.getTime(2).getTime())) {
                result = true;
            }
        }
        return result;
    }

    private long getMilisegundos(int hor, int min) {
        return (hor * 3600000) + (min * 60000);
    }
}
