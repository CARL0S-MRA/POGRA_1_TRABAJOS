
package progra1_round2.Semana2;
import java.util.Scanner;
public class Exponentes {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int numero;
        int exponente;
        double resultado;
        
        System.out.println("Ingrese un numero: ");
        numero=lea.nextInt();
        
        System.out.println("Ingrese un valor para el exponenete: ");
        exponente=lea.nextInt();
        
        resultado= Math.pow(numero,exponente);
        
        System.out.println("El resultado de "+numero+" elevado a "+exponente+" es: "+resultado);
        
    }
}
