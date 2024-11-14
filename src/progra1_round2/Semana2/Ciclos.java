
package progra1_round2.Semana2;
import java.util.Random;
import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Random random=new Random();
            int repetir=0;
            int numberUser =0;
            int randomNumber=random.nextInt(11);
            while(randomNumber != numberUser){
                System.out.println("Adiviname esta del 0-10: ");
                numberUser=lea.nextInt();
                if (randomNumber > numberUser) {
                    System.out.println("El numbero es mayor del rango puesto");
                }else{
                    if (randomNumber == numberUser) {
                        System.out.println("Felicidades Adivinastes");
                        System.out.println("Numero de la compu: "+randomNumber);
                    }else{
                        System.out.println("El numero es menor al rango puesto");
                    }
                }
            }
    }
}
    
    

