/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author arman
 */
public class Funcion {
    
    private String nombreFuncionDeCine;
    private String horarioFuncionDeCine;
    private Sala salaFuncion;

    public Funcion(String nombreFuncionDeCine, String horarioFuncionDeCine, Asiento asientosDispobibles) {
        this.nombreFuncionDeCine = nombreFuncionDeCine;
        this.horarioFuncionDeCine = horarioFuncionDeCine;
    }

    public String getNombreFuncionDeCine() {
        return nombreFuncionDeCine;
    }

    public void setNombreFuncionDeCine(String nombreFuncionDeCine) {
        this.nombreFuncionDeCine = nombreFuncionDeCine;
    }

    public String getHorarioFuncionDeCine() {
        return horarioFuncionDeCine;
    }

    public void setHorarioFuncionDeCine(String horarioFuncionDeCine) {
        this.horarioFuncionDeCine = horarioFuncionDeCine;
    }
}
