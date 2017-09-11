/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import administradores.AdministrarTablas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import vista.vistaMenuPrincipal;

/**
 *
 * @author brauni800
 */
public class ManipuladorJPMenuPrincipal implements ActionListener {

    private final vistaMenuPrincipal viewDefault;
    private vistaMenuPrincipal view;
    private ManipuladorJPMenuFunciones menuFunciones;
    private ManipuladorJPMenuCrearFuncion menuCrearFuncion;
    private ManipuladorJPMenuVenderBoleto menuVenderBoleto;
    private ManipuladorJPMenuCancelarFuncion menuCancelarFuncion;
    private ManipuladorJPMenuCancelarBoleto menuCancelarBoleto;
    private ManipuladorJPMenuReporteVentas menuReporteVentas;
    private ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles;

    public ManipuladorJPMenuPrincipal(vistaMenuPrincipal view) throws SQLException {
        this.viewDefault = view;
        initComponents(view);
    }

    private void initComponents(vistaMenuPrincipal view) throws SQLException {
        this.view = view;
        this.menuFunciones = null;
        this.menuCrearFuncion = null;
        this.menuVenderBoleto = null;
        this.menuCancelarFuncion = null;
        this.menuCancelarBoleto = null;
        this.menuReporteVentas = null;
        this.menuAsientosDisponibles = new ManipuladorJPMenuAsientosDisponibles(this.view, ManipuladorJPMenuAsientosDisponibles.MENU_FUNCIONES);
        
        this.view.getjBMenuCrearFuncion().addActionListener(this);
        this.view.getjBMenuCrearFuncion().setActionCommand("MENU_CREAR_FUNCION");

        this.view.getjBMenuFunciones().addActionListener(this);
        this.view.getjBMenuFunciones().setActionCommand("MENU_FUNCIONES");

        this.view.getjBMenuVenderBoleto().addActionListener(this);
        this.view.getjBMenuVenderBoleto().setActionCommand("MENU_VENDER_BOLETO");

        this.view.getjBMenuCancelarFuncion().addActionListener(this);
        this.view.getjBMenuCancelarFuncion().setActionCommand("MENU_CANCELAR_FUNCION");

        this.view.getjBMenuCancelarBoleto().addActionListener(this);
        this.view.getjBMenuCancelarBoleto().setActionCommand("MENU_CANCELAR_BOLETO");

        this.view.getjBMenuReporteDeVentas().addActionListener(this);
        this.view.getjBMenuReporteDeVentas().setActionCommand("MENU_REPORTE_VENTAS");

        this.view.getjBRegresar().addActionListener(this);
        this.view.getjBRegresar().setActionCommand("BOTON_REGRESAR");

        cargarTablaFunciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "MENU_CREAR_FUNCION":
                this.menuCrearFuncion = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCrearFuncion().setVisible(true);
                this.menuCrearFuncion = new ManipuladorJPMenuCrearFuncion(this.view);
                break;
            case "MENU_FUNCIONES":
                this.menuFunciones = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPFunciones().setVisible(true);
                this.menuFunciones = new ManipuladorJPMenuFunciones(this.view, this.menuAsientosDisponibles);
                break;
            case "MENU_VENDER_BOLETO":
                this.menuVenderBoleto = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPVentaBoletos().setVisible(true);
                this.menuVenderBoleto = new ManipuladorJPMenuVenderBoleto(this.view, this.menuAsientosDisponibles);
                break;
            case "MENU_CANCELAR_FUNCION":
                this.menuCancelarFuncion = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCancelarFuncion().setVisible(true);
                this.menuCancelarFuncion = new ManipuladorJPMenuCancelarFuncion(this.view);
                break;
            case "MENU_CANCELAR_BOLETO":
                this.menuCancelarBoleto = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCancelarBoletos().setVisible(true);
                this.menuCancelarBoleto = new ManipuladorJPMenuCancelarBoleto(this.view);
                break;
            case "MENU_REPORTE_VENTAS":
                this.menuReporteVentas = null;
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPReporteDeVentas().setVisible(true);
                this.menuReporteVentas = new ManipuladorJPMenuReporteVentas(this.view);
                break;
            case "BOTON_REGRESAR":
                this.view.getjPMenuPrincipal().setVisible(true);
                this.view.getjBRegresar().setVisible(false);
                this.view.getjPCrearFuncion().setVisible(false);
                this.view.getjPFunciones().setVisible(false);
                this.view.getjPVentaBoletos().setVisible(false);
                this.view.getjPCancelarFuncion().setVisible(false);
                this.view.getjPCancelarBoletos().setVisible(false);
                this.view.getjPReporteDeVentas().setVisible(false);
                this.view.getjPAsientosDisponibles().setVisible(false);
                try {
                    cargarTablaFunciones();
                    initComponents(this.viewDefault);
                } catch (SQLException ex) {
                    Logger.getLogger(ManipuladorJPMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

    private void cargarTablaFunciones() throws SQLException {
        AdministrarTablas adminTab = new AdministrarTablas();
        DefaultTableModel modelo = adminTab.cargarTablaFunciones();
        this.view.getjTable_Funciones().setModel(modelo);
        this.view.getjTable_CancelarFuncion().setModel(modelo);
        this.view.getjTable_VentaBoletos().setModel(modelo);
    }

    public vistaMenuPrincipal getView() {
        return view;
    }

    public void setView(vistaMenuPrincipal view) {
        this.view = view;
    }
}
