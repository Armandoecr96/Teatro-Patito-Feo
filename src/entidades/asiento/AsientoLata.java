/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.asiento;

/**
 *
 * @author b1796
 */
public class AsientoLata extends AsientoFactory {
    
    public AsientoLata(int idFuncion) {
        super(idFuncion);
        super.rango = AsientoFactory.LATA;
    }

    @Override
    public double getPrecio() {
        return (super.precio)*(0.6);
    }
    
}
