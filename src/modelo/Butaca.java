/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author b1796
 */
public class Butaca {

    public Butaca() {
    }
    
    public void MouseEntered(MouseEvent evt, JLabel jl) {
        String direccion[] = jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/Images/asiento_azul_lata.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_verde_lata.jpg")));
                break;
            case "/Images/asiento_azul_bronce.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_verde_bronce.jpg")));
                break;
            case "/Images/asiento_azul_plata.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_verde_plata.jpg")));
                break;
            case "/Images/asiento_azul_oro.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_verde_oro.jpg")));
                break;
            case "/Images/asiento_azul_diamante.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_verde_diamante.jpg")));
                break;
        }
    }

    public void MouseExited(MouseEvent evt, JLabel jl) {
        String direccion[] = jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/Images/asiento_verde_lata.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_azul_lata.jpg")));
                break;
            case "/Images/asiento_verde_bronce.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_azul_bronce.jpg")));
                break;
            case "/Images/asiento_verde_plata.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_azul_plata.jpg")));
                break;
            case "/Images/asiento_verde_oro.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_azul_oro.jpg")));
                break;
            case "/Images/asiento_verde_diamante.jpg":
                jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento_azul_diamante.jpg")));
                break;
        }
    }

    public void MouseClicked(MouseEvent evt, JLabel jl) {
        
    }
}
