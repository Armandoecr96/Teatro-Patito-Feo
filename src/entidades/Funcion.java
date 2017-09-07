/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author brauni800
 */
public class Funcion {
    private String nombre;
    private int horaInicio;
    private int minutoInicio;
    private int horaDuracion;
    private int minutoDuracion;
    private double precioPorAsiento;

    public Funcion() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the minutoInicio
     */
    public int getMinutoInicio() {
        return minutoInicio;
    }

    /**
     * @param minutoInicio the minutoInicio to set
     */
    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    /**
     * @return the horaDuracion
     */
    public int getHoraDuracion() {
        return horaDuracion;
    }

    /**
     * @param horaDuracion the horaDuracion to set
     */
    public void setHoraDuracion(int horaDuracion) {
        this.horaDuracion = horaDuracion;
    }

    /**
     * @return the minutoDuracion
     */
    public int getMinutoDuracion() {
        return minutoDuracion;
    }

    /**
     * @param minutoDuracion the minutoDuracion to set
     */
    public void setMinutoDuracion(int minutoDuracion) {
        this.minutoDuracion = minutoDuracion;
    }

    /**
     * @return the precioPorAsiento
     */
    public double getPrecioPorAsiento() {
        return precioPorAsiento;
    }

    /**
     * @param precioPorAsiento the precioPorAsiento to set
     */
    public void setPrecioPorAsiento(double precioPorAsiento) {
        this.precioPorAsiento = precioPorAsiento;
    }
}
