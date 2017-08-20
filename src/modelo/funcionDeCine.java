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
public class funcionDeCine {
    
    private String nombreFuncionDeCine;
    private String horarioFuncionDeCine;
    private asientos asientosDispobibles;

    public funcionDeCine(String nombreFuncionDeCine, String horarioFuncionDeCine, asientos asientosDispobibles) {
        this.nombreFuncionDeCine = nombreFuncionDeCine;
        this.horarioFuncionDeCine = horarioFuncionDeCine;
        this.asientosDispobibles = asientosDispobibles;
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

    public asientos getAsientosDispobibles() {
        return asientosDispobibles;
    }

    public void setAsientosDispobibles(asientos asientosDispobibles) {
        this.asientosDispobibles = asientosDispobibles;
    }
 
    
}
