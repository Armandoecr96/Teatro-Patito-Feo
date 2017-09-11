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
import vista.vistaMenuPrincipal;

/**
 *
 * @author brauni800
 */
public class ManipuladorJPMenuFunciones implements ActionListener {

    private final vistaMenuPrincipal view;
    private final ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles;
    private AdministrarTablas adminTab;

    public ManipuladorJPMenuFunciones(vistaMenuPrincipal view, ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles) {
        this.view = view;
        this.adminTab = null;
        this.menuAsientosDisponibles = menuAsientosDisponibles;
        initComponents();
    }

    private void initComponents() {
        this.view.getjBAsientos_Funciones().addActionListener(this);
        this.view.getjBAsientos_Funciones().setActionCommand("ASIENTOS_DISPONIBLES");

        this.adminTab = new AdministrarTablas(this.view.getjTable_Funciones(), this.view.getjBAsientos_Funciones());
        this.adminTab.setjTextField(this.view.getjTxtNombreFuncion_Funciones());
        this.view.getjTable_Funciones().addMouseListener(this.adminTab);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "ASIENTOS_DISPONIBLES":
                int idFuncion = Integer.parseInt(this.adminTab.getValueObtained().toString());
                System.out.println(idFuncion);
                try {
                    this.menuAsientosDisponibles.setIdFuncion(idFuncion);
                    this.menuAsientosDisponibles.execute(false);
                    this.view.getjPAsientosDisponibles().setVisible(true);
                    this.view.getjPAsientosDisponibles().setEnabled(true);
                    this.view.getjPFunciones().setVisible(false);
                    this.view.getjBRegresar().setVisible(false);
                    this.view.getjBComprarAsiento().setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(ManipuladorJPMenuFunciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }
}
