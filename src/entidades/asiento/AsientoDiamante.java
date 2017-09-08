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
public class AsientoDiamante extends AsientoFactory {
    
    public AsientoDiamante(int idFuncion, String coordenada) {
        super(idFuncion, coordenada);
        super.rango = AsientoFactory.DIAMANTE;
    }

    @Override
    public double getPrecio() {
        return super.precio;
    }
    
}
