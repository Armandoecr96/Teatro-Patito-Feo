/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionesBaseDatos;

import entidades.asiento.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    private int idFuncion;
    private JLabel jl;
    private Conexion conexion;
    private Connection connection;
    private ArrayList<AsientoFactory> listaAsientos;
    private String coordenada;

    public AdministrarAsientos(JLabel jl, String coordenada) {
        this.jl = jl;
        this.coordenada = coordenada;
    }

    public AdministrarAsientos(JLabel jl, String coordenada, int idFuncion) {
        this.jl = jl;
        this.coordenada = coordenada;
        this.idFuncion = idFuncion;
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
        switch (direccion[1]) {

        }
    }

    public ImageIcon colocarImagen() {
        ImageIcon icon = null;
        buscarAsientosBD();
        for (int i = 0; i < this.listaAsientos.size(); i++) {
            System.out.println(this.listaAsientos.get(i).getCoordenada());
            System.out.println(this.coordenada);
            System.out.println(this.idFuncion);
            if (this.listaAsientos.get(i).getCoordenada().equals(this.coordenada)) {
                icon = asignarImagenRojaPorRango(this.listaAsientos.get(i).getRango());
            }
        }
        if (icon == null) {
            this.listaAsientos = new ArrayList<AsientoFactory>();
            crearListaAsientos(this.coordenada);
            icon = asignarImagenAzulPorRango(this.listaAsientos.get(0).getRango());
        }
        return icon;
    }

    private void buscarAsientosBD() {
        this.conexion = new Conexion();
        this.connection = conexion.getConnection();
        this.listaAsientos = new ArrayList<AsientoFactory>();
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM asiento WHERE idFuncion = " + this.idFuncion);
            while (rs.next()) {
                crearListaAsientos(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrarAsientos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.conexion.desconectar();
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
                this.listaAsientos.add(new AsientoBronce(this.idFuncion, s));
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
                this.listaAsientos.add(new AsientoPlata(this.idFuncion, s));
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
                this.listaAsientos.add(new AsientoOro(this.idFuncion, s));
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
                this.listaAsientos.add(new AsientoDiamante(this.idFuncion, s));
                break;
            default:
                this.listaAsientos.add(new AsientoLata(this.idFuncion, s));
                break;
        }
    }
}
