/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author brauni800
 */
public class ListenerJBCrearFuncion extends MouseAdapter {

    private JPanel jpMenuPrincipal;
    private JPanel jpCrearFuncion;
    private JButton jbRegresar;

    public ListenerJBCrearFuncion(JPanel jpMenuPrincipal, JPanel jpCrearFuncion, JButton jbRegresar) {
        this.jpMenuPrincipal = jpMenuPrincipal;
        this.jpCrearFuncion = jpCrearFuncion;
        this.jbRegresar = jbRegresar;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        this.jpMenuPrincipal.setVisible(true);
        this.jpCrearFuncion.setVisible(false);
        this.jbRegresar.setVisible(false);
    }

    public JPanel getJpMenuPrincipal() {
        return jpMenuPrincipal;
    }

    public void setJpMenuPrincipal(JPanel jpMenuPrincipal) {
        this.jpMenuPrincipal = jpMenuPrincipal;
    }

    public JPanel getJpCrearFuncion() {
        return jpCrearFuncion;
    }

    public void setJpCrearFuncion(JPanel jpCrearFuncion) {
        this.jpCrearFuncion = jpCrearFuncion;
    }

    public JButton getJbRegresar() {
        return jbRegresar;
    }

    public void setJbRegresar(JButton jbRegresar) {
        this.jbRegresar = jbRegresar;
    }
}
