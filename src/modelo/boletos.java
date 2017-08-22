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
public class boletos {
    
    private double precioDeBoleto;
    private funcionDeCine funcionDelBoleto;
    private Asiento asientoDelBoleto;

    public boletos(double precioDeBoleto, funcionDeCine funcionDelBoleto, Asiento asientoDelBoleto) {
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

    public funcionDeCine getFuncionDelBoleto() {
        return funcionDelBoleto;
    }

    public void setFuncionDelBoleto(funcionDeCine funcionDelBoleto) {
        this.funcionDelBoleto = funcionDelBoleto;
    }

    public Asiento getAsientoDelBoleto() {
        return asientoDelBoleto;
    }

    public void setAsientoDelBoleto(Asiento asientoDelBoleto) {
        this.asientoDelBoleto = asientoDelBoleto;
    }
    
   
}
