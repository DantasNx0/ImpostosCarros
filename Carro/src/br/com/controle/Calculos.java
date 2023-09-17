package br.com.controle;

public class Calculos {
    private double valor;
    private double custoFinal;
    private double valorPNE;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
      
    public double custoFabrica() {
        this.custoFinal = this.valor + ((this.valor*0.28)+(this.valor * 0.45));
    return custoFinal;
    }
    
    public double CustoPne(){
        this.custoFinal = this.valor + ((this.valor*0.28)+(this.valor * 0.45));
        this.valorPNE = this.custoFinal - (this.custoFinal * 0.20);
    return valorPNE;            
    }
}
