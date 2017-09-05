/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.listeners;

import controlador.ManipuladorVistaMenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author brauni800
 */
public class ListenerJBRegresar extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        new ManipuladorVistaMenuPrincipal().actionJBRegresar();
    }
}
