/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controller;
import modelo.Conexion;

/**
 *
 * @author arman
 */
public class Principal {
    
    public static void main(String[] args) {
        vistaMenuPrincipal view = new vistaMenuPrincipal();
        Controller controller = new Controller(view);
//Conexion a la abse de datos
        Conexion.getConnection(); 
        view.conectController(controller);
    }
}
