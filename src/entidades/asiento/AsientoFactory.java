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
public abstract class AsientoFactory {

    public static final String LATA = "LATA";
    public static final String BRONCE = "BRONCE";
    public static final String PLATA = "PLATA";
    public static final String ORO = "ORO";
    public static final String DIAMANTE = "DIAMANTE";

    protected int idFuncion;
    protected String coordenada;
    protected double precio;
    protected boolean comprado;
    protected String rango;

    public AsientoFactory(int idFuncion, String coordenada) {
        this.idFuncion = idFuncion;
        this.coordenada = coordenada;
    }

    public abstract double getPrecio();

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public String getRango() {
        return rango;
    }
}
