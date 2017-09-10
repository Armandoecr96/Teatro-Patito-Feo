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

    private vistaMenuPrincipal view;
    private ManipuladorJPMenuFunciones menuFunciones;
    private ManipuladorJPMenuCrearFuncion menuCrearFuncion;
    private ManipuladorJPMenuVenderBoleto menuVenderBoleto;
    private ManipuladorJPMenuCancelarFuncion menuCancelarFuncion;
    private ManipuladorJPMenuCancelarBoleto menuCancelarBoleto;
    private ManipuladorJPMenuReporteVentas menuReporteVentas;

    public ManipuladorJPMenuPrincipal(vistaMenuPrincipal view) throws SQLException {
        this.view = view;
        initComponents();
    }

    private void initComponents() throws SQLException {
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
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCrearFuncion().setVisible(true);
                this.menuCrearFuncion = new ManipuladorJPMenuCrearFuncion(this.view);
                break;
            case "MENU_FUNCIONES":
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPFunciones().setVisible(true);
                this.menuFunciones = new ManipuladorJPMenuFunciones(this.view);
                break;
            case "MENU_VENDER_BOLETO":
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPVentaBoletos().setVisible(true);
                this.menuVenderBoleto = new ManipuladorJPMenuVenderBoleto(this.view);
                break;
            case "MENU_CANCELAR_FUNCION":
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCancelarFuncion().setVisible(true);
                this.menuCancelarFuncion = new ManipuladorJPMenuCancelarFuncion(this.view);
                break;
            case "MENU_CANCELAR_BOLETO":
                this.view.getjPMenuPrincipal().setVisible(false);
                this.view.getjBRegresar().setVisible(true);
                this.view.getjPCancelarBoletos().setVisible(true);
                this.menuCancelarBoleto = new ManipuladorJPMenuCancelarBoleto(this.view);
                break;
            case "MENU_REPORTE_VENTAS":
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
                this.menuCrearFuncion = null;
                this.menuFunciones = null;
                this.menuVenderBoleto = null;
                this.menuCancelarFuncion = null;
                this.menuCancelarBoleto = null;
                this.menuReporteVentas = null;
                 {
                    try {
                        cargarTablaFunciones();
                    } catch (SQLException ex) {
                        Logger.getLogger(ManipuladorJPMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
        }
    }

    private void cargarTablaFunciones() throws SQLException {
        AdministrarTablas adminTab = new AdministrarTablas();
        DefaultTableModel modelo = adminTab.cargarTablaFunciones();
        this.view.getjTable1().setModel(modelo);
        this.view.getjTable2().setModel(modelo);
        this.view.getjTable3().setModel(modelo);
    }

    public vistaMenuPrincipal getView() {
        return view;
    }

    public void setView(vistaMenuPrincipal view) {
        this.view = view;
    }
}
