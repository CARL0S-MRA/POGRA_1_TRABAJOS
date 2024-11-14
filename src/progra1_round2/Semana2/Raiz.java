
package progra1_round2.Semana2;
import java.util.Scanner;
public class Raiz {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int numero;
        double raiz;
        
        System.out.println("Ingrese un numero");
        numero=lea.nextInt();
        
        raiz =Math.sqrt(numero);
        System.out.println("La raiz cuadrada de "+numero+" es de "+String.format("%.2f",raiz));
        
    }
}
