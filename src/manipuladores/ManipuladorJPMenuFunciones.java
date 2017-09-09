/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import interaccionesBaseDatos.AdministrarTablas;
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

    private vistaMenuPrincipal view;
    private ManipuladorJPMenuAsientosDisponibles menuAsientosDisponibles;
    private AdministrarTablas adminTab;

    public ManipuladorJPMenuFunciones(vistaMenuPrincipal view) {
        this.view = view;
        initComponents();
    }

    private void initComponents() {
        this.view.getjBAsientos().addActionListener(this);
        this.view.getjBAsientos().setActionCommand("ASIENTOS_DISPONIBLES");

        this.adminTab = new AdministrarTablas(this.view.getjTable1(), this.view.getjBAsientos());
        this.view.getjTable1().addMouseListener(this.adminTab);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "ASIENTOS_DISPONIBLES":
                this.menuAsientosDisponibles = null;
                this.view.getjPAsientosDisponibles().setVisible(true);
                this.view.getjPFunciones().setVisible(false);
                this.view.getjBRegresar().setVisible(false);
                this.view.getjBComprarAsiento().setVisible(false);
                System.out.println(Integer.parseInt(this.adminTab.getValueObtained().toString()));
                try {
                    this.menuAsientosDisponibles = new ManipuladorJPMenuAsientosDisponibles(this.view, Integer.parseInt(this.adminTab.getValueObtained().toString()));
                } catch (SQLException ex) {
                    Logger.getLogger(ManipuladorJPMenuFunciones.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
        }
    }

}
