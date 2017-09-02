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
public class Boleto {
    
    private double precioDeBoleto;
    private Funcion funcionDelBoleto;
    private Asiento asientoDelBoleto;

    public Boleto(double precioDeBoleto, Funcion funcionDelBoleto, Asiento asientoDelBoleto) {
        this.precioDeBoleto = precioDeBoleto;
        this.funcionDelBoleto = funcionDelBoleto;
        this.asientoDelBoleto = asientoDelBoleto;
    }

    public double getPrecioDeBoleto() {
        return precioDeBoleto;
    }

    public void setPrecioDeBoleto(double precioDeBoleto) {
        this.precioDeBoleto = precioDeBoleto;
    }

    public Funcion getFuncionDelBoleto() {
        return funcionDelBoleto;
    }

    public void setFuncionDelBoleto(Funcion funcionDelBoleto) {
        this.funcionDelBoleto = funcionDelBoleto;
    }

    public Asiento getAsientoDelBoleto() {
        return asientoDelBoleto;
    }

    public void setAsientoDelBoleto(Asiento asientoDelBoleto) {
        this.asientoDelBoleto = asientoDelBoleto;
    }
    
   
}
