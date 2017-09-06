
package interaccionesBaseDatos;

import entidades.Funcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdministrarFunciones {

    private Conexion conexion;
    private Connection connection;
    private Funcion funcion;

    public AdministrarFunciones(Funcion funcion) {
        this.funcion = funcion;
        System.out.println("Conexion Funcion");
        this.conexion = new Conexion();
        this.connection = conexion.getConnection();
    }

    public void crearFuncion() {
        String sql = "INSERT funcion(idFuncion,NombreFuncion,InicioFuncion,Duracion,FinalFuncion) VALUES (?,?,?,?,?)";
        long milisecInicioFuncion = getMilisegundos(this.funcion.getHoraInicio(), this.funcion.getMinutoInicio()) + 21600000;
        long milisecDuracionFuncion = getMilisegundos(this.funcion.getHoraDuracion(), this.funcion.getMinutoDuracion());
        long milisecFinFuncion = milisecInicioFuncion + milisecDuracionFuncion;
        
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT InicioFuncion, FinalFuncion FROM teatro_patito_feo.funcion");

            if (!verificarHorariosCruzados(rs, milisecInicioFuncion, milisecFinFuncion)) {
                PreparedStatement pst = this.connection.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setString(2, this.funcion.getNombre());
                pst.setTime(3, new Time(milisecInicioFuncion));
                pst.setTime(4, new Time(milisecDuracionFuncion));
                pst.setTime(5, new Time(milisecFinFuncion));

                int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta función?", "Registrar función", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (reply == JOptionPane.YES_OPTION) {
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    this.conexion.desconectar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede guardar la función porque se cruzan los horarios", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrarFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.conexion.desconectar();
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
