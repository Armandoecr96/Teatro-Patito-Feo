/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaccionesBaseDatos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author b1796
 */
public class AdministrarButacas extends MouseAdapter {

    private JLabel jl;

    public AdministrarButacas(JLabel jl) {
        this.jl = jl;
    }

    @Override
    public void mouseExited(MouseEvent me) {
        super.mouseExited(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/images/asiento_verde_lata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_lata.jpg")));
                break;
            case "/images/asiento_verde_bronce.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_bronce.jpg")));
                break;
            case "/images/asiento_verde_plata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_plata.jpg")));
                break;
            case "/images/asiento_verde_oro.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_oro.jpg")));
                break;
            case "/images/asiento_verde_diamante.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_diamante.jpg")));
                break;
            case "/images/asiento_rojo_lata.jpg":
            case "/images/asiento_rojo_bronce.jpg":
            case "/images/asiento_rojo_plata.jpg":
            case "/images/asiento_rojo_oro.jpg":
            case "/images/asiento_rojo_diamante.jpg":
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        super.mouseEntered(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        switch (direccion[1]) {
            case "/images/asiento_azul_lata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_lata.jpg")));
                break;
            case "/images/asiento_azul_bronce.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_bronce.jpg")));
                break;
            case "/images/asiento_azul_plata.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_plata.jpg")));
                break;
            case "/images/asiento_azul_oro.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_oro.jpg")));
                break;
            case "/images/asiento_azul_diamante.jpg":
                this.jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_diamante.jpg")));
                break;
            case "/images/asiento_rojo_lata.jpg":
            case "/images/asiento_rojo_bronce.jpg":
            case "/images/asiento_rojo_plata.jpg":
            case "/images/asiento_rojo_oro.jpg":
            case "/images/asiento_rojo_diamante.jpg":
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        super.mouseClicked(me);
        String direccion[] = this.jl.getIcon().toString().split("classes");
        switch (direccion[1]) {

        }
    }

}
