
package Semana8.Prueba3;

public class VALORACTUAL {
    double montoAnualidad=0.0;
    double tasaInteres=0.0;
    int numPay=0;
    boolean anticipado;
    public VALORACTUAL(double montoAnualidad, double tasa, int numPay, boolean anticip){
        this.montoAnualidad=montoAnualidad;
        tasaInteres=tasa /100;
        this.numPay=numPay;
        anticipado=anticip;
        
    }
    private double potencia(double base, int expo){
        double resultado = 1.0;
        if (expo < 0) {
            for (int i = 0; i < (- expo); i++){ 
                resultado /= base;
            }
        } else {
            for (int i = 0; i < expo; i++) {
                resultado *= base;
            }
        }
        return resultado;
    }

    
    public double calcularValorPresente() {
        double factor = (1 - potencia(1 + tasaInteres, -numPay)) / tasaInteres;
        double valorPresente = montoAnualidad * factor;

        
        if (anticipado) {
            valorPresente *= (1 + tasaInteres);        
        }
        return valorPresente;
    }
}

