
package Semana8.Prueba3;
import java.util.Scanner;

public class MAIN2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.println("-------CALCULO DEL VALOR PRESENTE DE UNA ANUALIDAD-----");
        System.out.println(" ");
        
        System.out.print("Ingrese el monto de cada anualidad: ");
        double montoAnualidad=lea.nextDouble();

        System.out.print("Ingrese la tasa de interes (EN PORCENTAJE): ");
        double tasa=lea.nextDouble();

        System.out.print("Ingrese el numero de pagos: ");
        int numPay=lea.nextInt();

        System.out.print("La anualidad es anticipada? (true | false): ");
        boolean anticip=lea.nextBoolean();
        
        VALORACTUAL valor=new VALORACTUAL(montoAnualidad, tasa, numPay, anticip);

        double valorPresente = valor.calcularValorPresente();
        System.out.println(" ");
        System.out.print("El valor presente de la anualidad es: "+String.format("%.2f", valorPresente));


    }
}
