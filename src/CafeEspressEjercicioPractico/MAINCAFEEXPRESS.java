
package CafeEspressEjercicioPractico;
import java.util.Scanner;
public class MAINCAFEEXPRESS {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        CafeExpressUNI cafe=new CafeExpressUNI();
        int opcion=0;
        
        do{
            System.out.println("----MENU CAFE----"
            +"\n 1. Procesar Pedido"
            +"\n 2. Mostrar Resumen");
            System.out.println("-------------------------");
            opcion=lea.nextInt();
            
            switch (opcion){
                case 1:
                    cafe.procesoPedido();
                   break;
                case 2:
                    cafe.mostar();
                    System.out.println("SALIENDO DEL SISTEMA");
                    
            }
        }while(opcion !=2);
    }
}
