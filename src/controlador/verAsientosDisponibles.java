/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import modelo.funcionDeCine;

/**
 *
 * @author Armando
 */
public class verAsientosDisponibles implements Observer{
        
    private funcionDeCine asientosDisponibles;
    
    @Override
    public void update(Observable o, Object arg) {
        
    }
    
}
