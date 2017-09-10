/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionBaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author b1796
 */
public class DAO {

    public static final String ALL = "*";
    public static final String ASIENTO = "asiento";
    public static final String FUNCION = "funcion";

    private Conexion conexion;
    private Connection connection;

    private PreparedStatement prepareStatement;
    private Statement statement;
    private ResultSet resultStatement;

    public DAO() {
        this.conexion = new Conexion();
        this.connection = this.conexion.getConnection();
    }

    private void desconectar() {
        this.conexion = null;
        this.connection = null;
        this.prepareStatement = null;
        System.out.println("Conexion terminada..");
    }

    private int contarColumnas(ResultSet rs) throws SQLException {
        int i = 1;
        try {
            while (rs.getObject(i) != null) {
                i++;
            }
        } catch (SQLException ex) {
            i -= 1;
        }
        System.out.println(i);
        return i;
    }

    private String interrogaciones(int a) {
        String interrogacion = "";
        for (int b = 1; b <= a; b++) {
            if (b < a) {
                interrogacion += "?,";
            } else if (b == a) {
                interrogacion += "?";
            }
        }
        return interrogacion;
    }

    private int numeroPalabras(String s) {
        String[] parse = s.split(",");
        return parse.length;
    }

    /**
     * Metodo para buscar todos los elementos en una tabla en la Base de Datos.
     *
     * @param select Nombre de las columnas que extraerá de la tabla. Si se
     * extraerá mas de una columna, separar los nombres por comas ','. Si se
     * extraerán todas las columnas se puede hacer uso del atributo ALL.
     * @param from Nombre de la tabla. Puede tomar los valores de ASIENTO o
     * FUNCION.
     * @return Object[][] - Arreglo de objetos en el se representan las filas y
     * columnas de la tabla
     * @throws SQLException
     */
    public Object[][] buscar(String select, String from) throws SQLException {
        ArrayList<Object[]> lista = new ArrayList();
        Object[] arreglo;
        Object[][] resultado;
        boolean asientosEncontrados = false;
        String sql = "SELECT " + select + " FROM " + from;
        this.statement = this.connection.createStatement();
        this.resultStatement = this.statement.executeQuery(sql);
        while (this.resultStatement.next()) {
            arreglo = new Object[contarColumnas(this.resultStatement)];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = this.resultStatement.getObject(i + 1);
            }
            lista.add(arreglo);
            asientosEncontrados = true;
        }
        desconectar();
        if (asientosEncontrados) {
            resultado = new Object[lista.size()][lista.get(0).length];
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista.get(i).length; j++) {
                    resultado[i][j] = lista.get(i)[j];
                }
            }
        } else {
            resultado = new Object[0][0];
        }
        return resultado;
    }

    /**
     * Metodo para buscar elementos en una tabla en la Base de Datos filtrando
     * el contenido por algún parámetro especificado.
     *
     * @param select Nombre de las columnas que extraerá de la tabla. Si se
     * extraerá mas de una columna, separar los nombres por comas ','. Si se
     * extraerán todas las columnas se puede hacer uso del atributo ALL.
     * @param from Nombre de la tabla. Puede tomar los valores de ASIENTO o
     * FUNCION.
     * @param where Parámetro por el cual se filtrarán los valores de la tabla.
     * @param what Valor del parámetro.
     * @return Object[][] - Arreglo de objetos en el se representan las filas y
     * columnas de la tabla
     * @throws SQLException
     */
    public Object[][] buscarConFiltro(String select, String from, String where, String what) throws SQLException {
        ArrayList<Object[]> lista = new ArrayList();
        Object[] arreglo;
        Object[][] resultado;
        boolean asientosEncontrados = false;
        this.statement = this.connection.createStatement();
        String sql = "SELECT " + select + " FROM " + from + " WHERE " + where + " = " + what;
        this.resultStatement = this.statement.executeQuery(sql);
        while (this.resultStatement.next()) {
            arreglo = new Object[contarColumnas(this.resultStatement)];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = this.resultStatement.getObject(i + 1);
            }
            lista.add(arreglo);
            asientosEncontrados = true;
        }
        desconectar();
        if (asientosEncontrados) {
            resultado = new Object[lista.size()][lista.get(0).length];
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista.get(i).length; j++) {
                    resultado[i][j] = lista.get(i)[j];
                }
            }
        } else {
            resultado = new Object[0][0];
        }
        return resultado;
    }

    /**
     * Se crea la estructura inicial para actualizar un elemento en la Base de
     * Datos.
     *
     * @param from Nombre de la tabla. Puede tomar los valores de ASIENTO o
     * FUNCION.
     * @param where Parámetro por el cual se filtrarán los valores de la tabla.
     * @param what Valor del parámetro.
     * @throws SQLException
     */
    public void crearEstructuraParaActualizar(String from, String where, Object what) throws SQLException {
        String sql = "UPDATE " + from + " SET " + where + " = " + what.toString();
        this.prepareStatement = this.connection.prepareStatement(sql);
    }

    /**
     * Se crea la estructura inicial para eliminar un elemento de la Base de
     * Datos.
     *
     * @param from Nombre de la tabla. Puede tomar los valores de ASIENTO o
     * FUNCION.
     * @param where Parámetro por el cual se filtrarán los valores de la tabla.
     * @param what Valor del parámetro.
     * @throws SQLException
     */
    public void crearEstructuraParaEliminar(String from, String where, Object what) throws SQLException {
        String sql = "DELETE FROM " + from + " WHERE " + where + " = " + what.toString();
        this.prepareStatement = this.connection.prepareStatement(sql);
    }

    /**
     * Se crea la estructura inicial para insertar un elemento en la Base de
     * Datos.
     *
     * @param from Nombre de la tabla. Puede tomar los valores de ASIENTO o
     * FUNCION.
     * @param select Nombre de las columnas que se usaran de la tabla para
     * indicar los elementos que serán insertados. Si se insertará a mas de una
     * columna, separar los nombres por comas ','.
     * @throws SQLException
     */
    public void crearEstructuraParaInsertar(String from, String select) throws SQLException {
        String sql = "INSERT " + from + "(" + select + ")" + " VALUES(" + interrogaciones(numeroPalabras(select)) + ")";
        this.prepareStatement = this.connection.prepareStatement(sql);
    }

    /**
     * Método que se utiliza para colocar un valor de tipo int a la estructura
     * para insertar en la tabla de la Base de Datos.
     *
     * @param i número de columna. El número de la columna 1 es 1, el 2 es 2,
     * etc...
     * @param j número que se insertará.
     * @throws SQLException
     */
    public void insertarInt(int i, int j) throws SQLException {
        this.prepareStatement.setInt(i, j);
    }

    /**
     * Método que se utiliza para colocar un valor de tipo String a la
     * estructura para insertar en la tabla de la Base de Datos.
     *
     * @param i número de columna. El número de la columna 1 es 1, el 2 es 2,
     * etc...
     * @param s String que se insertará.
     * @throws SQLException
     */
    public void insertarString(int i, String s) throws SQLException {
        this.prepareStatement.setString(i, s);
    }

    /**
     * Método que se utiliza para colocar un valor de tipo Time a la estructura
     * para insertar en la tabla de la Base de Datos.
     *
     * @param i número de columna. El número de la columna 1 es 1, el 2 es 2,
     * etc...
     * @param time Objeto de tipo Time que se insertará.
     * @throws SQLException
     */
    public void insertarTime(int i, Time time) throws SQLException {
        this.prepareStatement.setTime(i, time);
    }

    /**
     * Método que se utiliza para colocar un valor de tipo double a la
     * estructura para insertar en la tabla de la Base de Datos.
     *
     * @param i número de columna. El número de la columna 1 es 1, el 2 es 2,
     * etc...
     * @param d Objeto de tipo double que se insertará.
     * @throws SQLException
     */
    public void insertarDouble(int i, double d) throws SQLException {
        this.prepareStatement.setDouble(i, d);
    }

    /**
     * Método que se utiliza para colocar un valor de tipo boolean a la
     * estructura para insertar en la tabla de la Base de Datos.
     *
     * @param i número de columna. El número de la columna 1 es 1, el 2 es 2,
     * etc...
     * @param b Objeto de tipo boolean que se insertará.
     * @throws SQLException
     */
    public void insertarBoolean(int i, boolean b) throws SQLException {
        this.prepareStatement.setBoolean(i, b);
    }

    /**
     * Método para confirmar la instrucción que se realizará en la Base de
     * Datos. Puede ser INSERT, DELETE o UPDATE.
     *
     * @throws SQLException
     */
    public void confirmar() throws SQLException {
        this.prepareStatement.executeUpdate();
        desconectar();
    }
}
