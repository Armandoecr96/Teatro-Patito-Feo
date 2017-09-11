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
 * @author b1796
 */
public class ManipuladorJPMenuVenderBoleto implements ActionListener {

    private final vistaMenuPrincipal view;
    private AdministrarTablas adminTab;
    private final ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles;

    public ManipuladorJPMenuVenderBoleto(vistaMenuPrincipal view, ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles) {
        this.view = view;
        this.adminTab = null;
        this.menuAsientosDisponibles = menuAsientosDisponibles;
        initComponents();
    }

    private void initComponents() {
        this.view.getjBAsientos_VentaBoletos().addActionListener(this);
        this.view.getjBAsientos_VentaBoletos().setActionCommand("ASIENTOS_DISPONIBLES");

        this.adminTab = new AdministrarTablas(this.view.getjTable_VentaBoletos(), this.view.getjBAsientos_VentaBoletos());
        this.adminTab.setjTextField(this.view.getjTxtNombreFuncion_VentaBoletos());
        this.view.getjTable_VentaBoletos().addMouseListener(this.adminTab);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        switch (comando) {
            case "ASIENTOS_DISPONIBLES":
                int idFuncion = Integer.parseInt(this.adminTab.getValueObtained().toString());
                System.out.println(idFuncion);
                try {
                    this.menuAsientosDisponibles.setIdFuncion(idFuncion);
                    this.menuAsientosDisponibles.execute(true);
                    this.view.getjPAsientosDisponibles().setVisible(true);
                    this.view.getjPAsientosDisponibles().setEnabled(true);
                    this.view.getjPVentaBoletos().setVisible(false);
                    this.view.getjBRegresar().setVisible(false);
                    this.view.getjBComprarAsiento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ManipuladorJPMenuFunciones.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }
}
