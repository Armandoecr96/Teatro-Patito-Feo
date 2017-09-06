/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.vistaMenuPrincipal;

/**
 *
 * @author brauni800
 */
public class ManipuladorJPMenuFunciones implements ActionListener {
    private vistaMenuPrincipal view;
    private ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles;

    public ManipuladorJPMenuFunciones(vistaMenuPrincipal view) {
        this.view = view;
        initComponents();
    }

    private void initComponents() {
        this.view.getjBAsientos().addActionListener(this);
        this.view.getjBAsientos().setActionCommand("ASIENTOS_DISPONIBLES");

        this.view.getjBRegresarFunciones().addActionListener(this);
        this.view.getjBRegresarFunciones().setActionCommand("REGRESAR_FUNCIONES");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "ASIENTOS_DISPONIBLES":
                this.view.getjPAsientosDisponibles().setVisible(true);
                this.view.getjPFunciones().setVisible(false);
                this.view.getjBRegresar().setVisible(false);
                this.menuAsientosDisponibles = new ManipuladorJPMenuAsientosDisponibles(this.view);
                break;
            case "REGRESAR_FUNCIONES":
                this.menuAsientosDisponibles = null;
                this.view.getjPAsientosDisponibles().setVisible(false);
                this.view.getjPFunciones().setVisible(true);
                this.view.getjBRegresar().setVisible(true);
                break;
        }
    }
    
}
