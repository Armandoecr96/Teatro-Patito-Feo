/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradores;

import entidades.asiento.*;
import interaccionBaseDatos.DAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author b1796
 */
public class AdministrarAsientos extends MouseAdapter {

    private final int idFuncion;
    private int idAsiento;
    private JLabel jl;
    private ArrayList<AsientoFactory> listaAsientos;
    private AsientoFactory asientoEncontrado;
    private String coordenada;

    /**
     * Constructor para los eventos del Mouse.
     *
     * @param idFuncion Indica el número de la función que fue clickeada.
     * @param jl El asiento que fue clickeado.
     * @param coordenada Indica la coordenada del asiento.
     */
    public AdministrarAsientos(int idFuncion, JLabel jl, String coordenada) {
        this.idFuncion = idFuncion;
        this.jl = jl;
        this.coordenada = coordenada;
    }

    /**
     * Constructor para uso de metodos publicos.
     *
     * @param idFuncion Indica el número de la función que fue clickeada.
     * @throws SQLException
     */
    public AdministrarAsientos(int idFuncion) throws SQLException {
        this.idFuncion = idFuncion;
        buscarAsientosBD("idFuncion", this.idFuncion);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        super.mouseExited(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/images/asiento_verde_lata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_lata.jpg")));
                break;
            case "/images/asiento_verde_bronce.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_bronce.jpg")));
                break;
            case "/images/asiento_verde_plata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_plata.jpg")));
                break;
            case "/images/asiento_verde_oro.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_oro.jpg")));
                break;
            case "/images/asiento_verde_diamante.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_diamante.jpg")));
                break;
            case "/images/asiento_rojo_lata.jpg":
            case "/images/asiento_rojo_bronce.jpg":
            case "/images/asiento_rojo_plata.jpg":
            case "/images/asiento_rojo_oro.jpg":
            case "/images/asiento_rojo_diamante.jpg":
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        super.mouseEntered(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/images/asiento_azul_lata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_lata.jpg")));
                break;
            case "/images/asiento_azul_bronce.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_bronce.jpg")));
                break;
            case "/images/asiento_azul_plata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_plata.jpg")));
                break;
            case "/images/asiento_azul_oro.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_oro.jpg")));
                break;
            case "/images/asiento_azul_diamante.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_diamante.jpg")));
                break;
            case "/images/asiento_rojo_lata.jpg":
            case "/images/asiento_rojo_bronce.jpg":
            case "/images/asiento_rojo_plata.jpg":
            case "/images/asiento_rojo_oro.jpg":
            case "/images/asiento_rojo_diamante.jpg":
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        super.mouseClicked(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        try {
            switch (direccion[1]) {
                case "/images/asiento_verde_lata.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_lata_clicked.jpg")));
                    insertarAsientoBD();
                    break;
                case "/images/asiento_verde_bronce.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_bronce_clicked.jpg")));
                    insertarAsientoBD();
                    break;
                case "/images/asiento_verde_plata.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_plata_clicked.jpg")));
                    insertarAsientoBD();
                    break;
                case "/images/asiento_verde_oro.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_oro_clicked.jpg")));
                    insertarAsientoBD();
                    break;
                case "/images/asiento_verde_diamante.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_diamante_clicked.jpg")));
                    insertarAsientoBD();
                    break;
                case "/images/asiento_verde_lata_clicked.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_lata.jpg")));
                    procedimientoParaBorrarAsientoBD();
                    break;
                case "/images/asiento_verde_bronce_clicked.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_bronce.jpg")));
                    procedimientoParaBorrarAsientoBD();
                    break;
                case "/images/asiento_verde_plata_clicked.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_plata.jpg")));
                    procedimientoParaBorrarAsientoBD();
                    break;
                case "/images/asiento_verde_oro_clicked.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_oro.jpg")));
                    procedimientoParaBorrarAsientoBD();
                    break;
                case "/images/asiento_verde_diamante_clicked.jpg":
                    this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_diamante.jpg")));
                    procedimientoParaBorrarAsientoBD();
                    break;
                case "/images/asiento_rojo_lata.jpg":
                case "/images/asiento_rojo_bronce.jpg":
                case "/images/asiento_rojo_plata.jpg":
                case "/images/asiento_rojo_oro.jpg":
                case "/images/asiento_rojo_diamante.jpg":
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrarAsientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para colocar imagenes en los JLabel.
     *
     * @param coordenada Indica la coordenada del asiento.
     * @return Objeto de tipo ImageIcon.
     */
    public ImageIcon colocarImagen(String coordenada) {
        this.coordenada = coordenada;
        ImageIcon icon;
        if (asientoEncontradoEnLaLista()) {
            icon = asignarImagenRojaPorRango(this.asientoEncontrado.getRango());
        } else {
            icon = asignarImagenAzulPorRango(generarAsiento(this.coordenada).getRango());
        }
        return icon;
    }

    /**
     * Metodo para borrar asientos de la Base de Datos "teatro_patito_feo" en la
     * tabla "asiento".
     *
     * @param where Columna que se filtrará.
     * @param what Valor de la columna.
     * @throws SQLException
     */
    public void borrarAsientoBD(String where, Object what) throws SQLException {
        DAO eliminar = new DAO();
        eliminar.crearEstructuraParaEliminar(DAO.ASIENTO, where, what);
        eliminar.confirmar();
    }

    /**
     * Metodo para actualizar asientos de la Base de Datos "teatro_patito_feo"
     * en la tabla "asiento".
     *
     * @param where Columna que se filtrará.
     * @param what Valor de la columna.
     * @throws SQLException
     */
    public void actualizarAsientoBD(String where, Object what) throws SQLException {
        DAO actualizar = new DAO();
        actualizar.crearEstructuraParaActualizar(DAO.ASIENTO, where, what.toString());
        actualizar.confirmar();
    }

    //******************************************************************************************************
    //******************************************************************************************************
    //******************************************************************************************************
    //Recursos para los metodos principales
    private void insertarAsientoBD() throws SQLException {
        AsientoFactory asiento = generarAsiento(this.coordenada);
        DAO insertar = new DAO();
        insertar.crearEstructuraParaInsertar(DAO.ASIENTO, "idFuncion,Coordenada,Comprado");
        insertar.insertarInt(1, asiento.getIdFuncion());
        insertar.insertarString(2, asiento.getCoordenada());
        insertar.insertarBoolean(3, asiento.isComprado());
        insertar.confirmar();
    }

    private void procedimientoParaBorrarAsientoBD() throws SQLException {
        buscarAsientosBD("idFuncion", this.idFuncion);
        if (asientoEncontradoEnLaLista()) {
            borrarAsientoBD("idAsiento", this.asientoEncontrado.getIdAsiento());
        }
    }

    private void buscarAsientosBD(String where, Object what) throws SQLException {
        this.listaAsientos = new ArrayList<>();
        Object[][] objetos = new DAO().buscarConFiltro("idAsiento,Coordenada", DAO.ASIENTO, where, what.toString());
        for (int i = 0; i < objetos.length; i++) {
            this.idAsiento = (Integer)objetos[i][0];
            crearListaAsientos(objetos[i][1].toString());
        }
    }

    private boolean asientoEncontradoEnLaLista() {
        boolean encontrado = false;
        for (int i = 0; i < this.listaAsientos.size(); i++) {
            if (this.listaAsientos.get(i).getCoordenada().equals(this.coordenada)) {
                encontrado = true;
                this.asientoEncontrado = this.listaAsientos.get(i);
                break;
            }
        }
        return encontrado;
    }

    private ImageIcon asignarImagenRojaPorRango(String s) {
        ImageIcon icon = null;
        switch (s) {
            case AsientoFactory.LATA:
                icon = new ImageIcon(getClass().getResource("/images/asiento_rojo_lata.jpg"));
                break;
            case AsientoFactory.BRONCE:
                icon = new ImageIcon(getClass().getResource("/images/asiento_rojo_bronce.jpg"));
                break;
            case AsientoFactory.PLATA:
                icon = new ImageIcon(getClass().getResource("/images/asiento_rojo_plata.jpg"));
                break;
            case AsientoFactory.ORO:
                icon = new ImageIcon(getClass().getResource("/images/asiento_rojo_oro.jpg"));
                break;
            case AsientoFactory.DIAMANTE:
                icon = new ImageIcon(getClass().getResource("/images/asiento_rojo_diamante.jpg"));
                break;
        }
        return icon;
    }

    private ImageIcon asignarImagenAzulPorRango(String s) {
        ImageIcon icon = null;
        switch (s) {
            case AsientoFactory.LATA:
                icon = new ImageIcon(getClass().getResource("/images/asiento_azul_lata.jpg"));
                break;
            case AsientoFactory.BRONCE:
                icon = new ImageIcon(getClass().getResource("/images/asiento_azul_bronce.jpg"));
                break;
            case AsientoFactory.PLATA:
                icon = new ImageIcon(getClass().getResource("/images/asiento_azul_plata.jpg"));
                break;
            case AsientoFactory.ORO:
                icon = new ImageIcon(getClass().getResource("/images/asiento_azul_oro.jpg"));
                break;
            case AsientoFactory.DIAMANTE:
                icon = new ImageIcon(getClass().getResource("/images/asiento_azul_diamante.jpg"));
                break;
        }
        return icon;
    }

    private void crearListaAsientos(String s) {
        AsientoFactory asiento = generarAsiento(s);
        asiento.setIdAsiento(this.idAsiento);
        this.listaAsientos.add(asiento);
    }

    private AsientoFactory generarAsiento(String s) {
        AsientoFactory asiento;
        switch (s) {
            case "C7":
            case "C8":
            case "C9":
            case "C10":
            case "C11":
            case "C12":
            case "C13":
            case "C14":
            case "B7":
            case "B8":
            case "B9":
            case "B10":
            case "B11":
            case "B12":
            case "B13":
            case "B14":
            case "A7":
            case "A8":
            case "A9":
            case "A10":
            case "A11":
            case "A12":
            case "A13":
            case "A14":
                asiento = new AsientoBronce(this.idFuncion, s);
                break;
            case "H1":
            case "H2":
            case "H3":
            case "H4":
            case "H5":
            case "H6":
            case "H15":
            case "H16":
            case "H17":
            case "H18":
            case "H19":
            case "H20":
            case "G1":
            case "G2":
            case "G3":
            case "G4":
            case "G5":
            case "G6":
            case "G15":
            case "G16":
            case "G17":
            case "G18":
            case "G19":
            case "G20":
                asiento = new AsientoPlata(this.idFuncion, s);
                break;
            case "H7":
            case "H8":
            case "H9":
            case "H10":
            case "H11":
            case "H12":
            case "H13":
            case "H14":
            case "G7":
            case "G8":
            case "G9":
            case "G10":
            case "G11":
            case "G12":
            case "G13":
            case "G14":
                asiento = new AsientoOro(this.idFuncion, s);
                break;
            case "F7":
            case "F8":
            case "F9":
            case "F10":
            case "F11":
            case "F12":
            case "F13":
            case "F14":
            case "E7":
            case "E8":
            case "E9":
            case "E10":
            case "E11":
            case "E12":
            case "E13":
            case "E14":
            case "D7":
            case "D8":
            case "D9":
            case "D10":
            case "D11":
            case "D12":
            case "D13":
            case "D14":
                asiento = new AsientoDiamante(this.idFuncion, s);
                break;
            default:
                asiento = new AsientoLata(this.idFuncion, s);
                break;
        }
        return asiento;
    }
}
