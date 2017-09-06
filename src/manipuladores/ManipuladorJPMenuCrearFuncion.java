/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import entidades.Funcion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interaccionesBaseDatos.AdministrarFunciones;
import vista.vistaMenuPrincipal;

/**
 *
 * @author b1796
 */
public class ManipuladorJPMenuCrearFuncion implements ActionListener {

    private vistaMenuPrincipal view;
    private Funcion funcion;
    private AdministrarFunciones administrarFunciones;

    public ManipuladorJPMenuCrearFuncion(vistaMenuPrincipal view) {
        this.view = view;
        initComponents();
    }

    private void initComponents() {
        this.view.getjBCrearFuncion().addActionListener(this);
        this.view.getjBCrearFuncion().setActionCommand("CREAR_FUNCION");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        switch (comando) {
            case "CREAR_FUNCION":
                crearFuncion();
                this.administrarFunciones = new AdministrarFunciones(this.funcion);
                this.administrarFunciones.crearFuncion();
                break;
        }
    }
    
    private void crearFuncion() {
        this.funcion = new Funcion();
        this.funcion.setNombre(this.view.getJTxtNombreFuncion().getText());
        this.funcion.setHoraInicio(Integer.parseInt((String)this.view.getjComHoraInicioFuncion().getSelectedItem()));
        this.funcion.setMinutoInicio(Integer.parseInt((String)this.view.getjComMinutoInicioFuncion().getSelectedItem()));
        this.funcion.setHoraDuracion(Integer.parseInt((String)this.view.getjComHoraDuracion().getSelectedItem()));
        this.funcion.setMinutoDuracion(Integer.parseInt((String)this.view.getjComMinutoDuracion().getSelectedItem()));
    }
    
}
