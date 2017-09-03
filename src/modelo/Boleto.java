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

    public Boleto(double precioDeBoleto, Funcion funcionDelBoleto) {
        this.precioDeBoleto = precioDeBoleto;
        this.funcionDelBoleto = funcionDelBoleto;
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
}
