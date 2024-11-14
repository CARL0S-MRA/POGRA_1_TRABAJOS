
package Semana5;
import java.util.Random;
public class NumerosAleatorios {
    public static int menor(int numeros[]){
        int numeroMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor=numeros[i];
            }
        }
        return numeroMenor;
    }
    public static void main(String[] args) {
        Random random=new Random();
        int []numeros=new int[10];
        
        for (int cont = 0; cont < numeros.length; cont++) {
            numeros[cont]=random.nextInt(51);
        }
        for (int numero : numeros) {
            System.out.println(numero);            
        }
        
        int numeromenor =menor(numeros);
        System.out.println("El numero menor de la lista es: "+numeromenor);
    }
}
