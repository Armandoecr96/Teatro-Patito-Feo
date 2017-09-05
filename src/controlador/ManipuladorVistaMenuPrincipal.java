/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JButton;
import modelo.listeners.ListenerJBCrearFuncion;
import modelo.listeners.ListenerJBRegresar;
import vista.vistaMenuPrincipal;

/**
 *
 * @author brauni800
 */
public class ManipuladorVistaMenuPrincipal {
    private vistaMenuPrincipal view;
    private JButton jb;

    public ManipuladorVistaMenuPrincipal() {
        this.view = new vistaMenuPrincipal();
        initComponents();
    }

    private void initComponents() {
        this.view.setVisible(true);
        jBCrearFuncionMouseClicked();
    }
    private void jBCrearFuncionMouseClicked() {
        this.jb = this.view.getjBCrearFuncion();
        ListenerJBCrearFuncion temp = new ListenerJBCrearFuncion(this.view.getjPMenuPrincipal(),
                this.view.getjPCrearFuncion(), this.view.getjBRegresar());
        this.jb.addMouseListener(temp);
        this.view.setjPMenuPrincipal(temp.getJpMenuPrincipal());
        this.view.setjPCrearFuncion(temp.getJpCrearFuncion());
        this.view.setjBRegresar(temp.getJbRegresar());
        this.view.setjBCrearFuncion(this.jb);
        this.view.resetComponents();
    }

    public void jBRegresarMouseClicked() {
        this.view.getjBRegresar().addMouseListener(new ListenerJBRegresar());
        this.view.resetComponents();
    }

    public void actionJBCrearFuncion() {
        this.view.getjPMenuPrincipal().setVisible(true);
        this.view.getjPCrearFuncion().setVisible(false);
        this.view.getjBRegresar().setVisible(true);
    }

    public void actionJBRegresar() {
        this.view.getjPCancelarBoletos().setVisible(false);
        this.view.getjPCancelarFuncion().setVisible(false);
        this.view.getjPCrearFuncion().setVisible(false);
        this.view.getjPFunciones().setVisible(false);
        this.view.getjPReporteDeVentas().setVisible(false);
        this.view.getjPVentaBoletos().setVisible(false);
        this.view.getjBRegresar().setVisible(false);
        this.view.getjBAsientosDisponibles().setVisible(false);
        this.view.getjPMenuPrincipal().setVisible(true);
        this.view.resetComponents();
    }
    public void resetMenuCrearFuncion() {
        this.view.getJTxtNombreFuncion().setText("");
        this.view.getjComHoraInicioFuncion().setSelectedIndex(0);
        this.view.getjComMinutoInicioFuncion().setSelectedIndex(0);
        this.view.getjComHoraDuracion().setSelectedIndex(0);
        this.view.getjComMinutoDuracion().setSelectedIndex(0);
        this.view.resetComponents();
    }
    
}
