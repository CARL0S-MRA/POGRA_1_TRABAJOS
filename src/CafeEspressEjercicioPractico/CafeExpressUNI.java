
package CafeEspressEjercicioPractico;
import java.util.Scanner;
public class CafeExpressUNI {
    Scanner lea=new Scanner(System.in);
    int contarClientes=0;
    int cafePequeno=0;
    int cafeMediano=0;
    int cafeGrande=0;
    double precioCafe=0;
    double totalCaja=0;
    double precioAgregado=0;
    int edad=0;
    
    public void procesoPedido(){
        System.out.println("---CAFE EXPRESS UNI---");
        
        System.out.println("Selecciones el tamanio del cafe que desea: "
                          +"\n 1- Pequenio (Lps. 45)"
                          +"\n 2- Mediano (Lps. 56)"
                          +"\n 3- Grande (Lps. 65)");
        System.out.println("---------------------------------------------");
                           int opcionTamanio=lea.nextInt();
                           
                           switch(opcionTamanio){
                               case 1:
                                   precioCafe=45;
                                   cafePequeno++;
                                   break;
                               case 2:
                                   precioCafe=56;
                                   cafeMediano++;
                                   break;
                               case 3:
                                   precioCafe=65;
                                   cafeGrande++; 
                                   break;
                               default:
                                   System.out.println("OPCION INVALIDA");
                                   return;
                           }
        System.out.println("Seleccione un agregado: "
                            +"\n 1. Leche (Lps.5)"
                            +"\n 2. Cremora (Lps. 8)"
                            +"\n 3. Sencillo (Lps. 0)");
        System.out.println("------------------------------");
                            int opcionAgregado=lea.nextInt();
                            
                           switch(opcionAgregado){
                               case 1:
                                   precioAgregado=5;
                                   break;
                               case 2:
                                   precioAgregado=8;
                                   break;
                               case 3: 
                                   precioAgregado=0;
                                   break;
                               default:
                                   System.out.println("OPCION INVALIDA");
                                   return;
                           }
        double total=precioCafe+ precioAgregado;
        System.out.println("Ingrese su edad: ");
        edad=lea.nextInt();
        
            if (edad >=60) {
                System.out.println("TIENE DESCUENTO DE LA TERCERA EDAD");
                total*=0.9;
            }
        
        System.out.println("El total de su compra es: Lps."+String.format("%.2f", total));
        
        totalCaja+=total;
        contarClientes++;
                         
    }
    
     public void mostar(){
        System.out.println("---- RESUMEN DEL DIA ----"
                          +"\n Numeros de Clientes atendidos: "+contarClientes
                          +"\n Cafes pequenos vendidos: "+cafePequeno
                          +"\n Cafes medianos vendidos: "+cafeMediano
                          +"\n Cafes grandes vendidos: "+cafeGrande
                          +"\n Total en caja: "+String.format("%.2f", totalCaja));
        }
}
