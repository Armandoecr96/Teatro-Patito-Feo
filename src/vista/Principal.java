/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.SQLException;
import manipuladores.ManipuladorJPMenuPrincipal;

/**
 *
 * @author arman
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        vistaMenuPrincipal view = new vistaMenuPrincipal();
        new ManipuladorJPMenuPrincipal(view);
        view.setVisible(true);
    }
}
