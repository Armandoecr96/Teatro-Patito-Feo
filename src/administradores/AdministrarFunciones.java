package administradores;

import entidades.Funcion;
import interaccionBaseDatos.DAO;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;

public class AdministrarFunciones {

    private Funcion funcion;

    public AdministrarFunciones(Funcion funcion) {
        this.funcion = funcion;
    }

    public boolean crearFuncion() throws SQLException {
        boolean funcionCreada = false;
        long milisecInicioFuncion = getMilisegundos(this.funcion.getHoraInicio(), this.funcion.getMinutoInicio()) + 21600000;
        long milisecDuracionFuncion = getMilisegundos(this.funcion.getHoraDuracion(), this.funcion.getMinutoDuracion());
        long milisecFinFuncion = milisecInicioFuncion + milisecDuracionFuncion;

        Object[][] busqueda = new DAO().buscar("InicioFuncion,FinalFuncion", DAO.FUNCION);
        
        if (!verificarHorariosCruzados(busqueda, milisecInicioFuncion, milisecFinFuncion)) {
            DAO insertar = new DAO();
            insertar.crearEstructuraParaInsertar(DAO.FUNCION, "NombreFuncion,InicioFuncion,Duracion,FinalFuncion,PrecioPorAsiento");
            insertar.insertarString(1, this.funcion.getNombre());
            insertar.insertarTime(2, new Time(milisecInicioFuncion));
            insertar.insertarTime(3, new Time(milisecDuracionFuncion));
            insertar.insertarTime(4, new Time(milisecFinFuncion));
            insertar.insertarDouble(5, this.funcion.getPrecioPorAsiento());

            int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta función?", "Registrar función", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                insertar.confirmar();
                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                funcionCreada = true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede guardar la función porque se cruzan los horarios", "Error al guardar", JOptionPane.WARNING_MESSAGE);
        }
        return funcionCreada;
    }

    private boolean verificarHorariosCruzados(Object[][] o, long msInicio, long msFin) throws SQLException {
        boolean result = false;
        for (int i = 0; i < o.length; i++) {
            Time inicio = (Time)o[i][0];
            Time fin = (Time)o[i][1];
            if((msInicio >= inicio.getTime() && msInicio <= fin.getTime()) 
                    || (msFin >= inicio.getTime() && msFin <= fin.getTime())) {
                result = true;
            }
        }
        return result;
    }

    private long getMilisegundos(int hor, int min) {
        return (hor * 3600000) + (min * 60000);
    }
}
