
package progra1_round2.Semana2;
import java.util.Scanner;

public class FOR {
    public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String  contra="przm1234";
        String clave;
        int intento=0;
        int limite=4;
        do{
            System.out.println("Favor ingresar su clave: ");
            clave=lea.nextLine();
            intento++;
            if (!contra.equals(clave)) {
                System.out.println("Clave incorrecta,has utilizado "+intento+" intentos de: "+limite);
                
            }
            
        }while(!contra.equals(clave) && intento<limite);
        if(!contra.equals(clave) && intento<limite){
            System.out.println(ANSI_GREEN+"A entrado exitosamente");

        }else{
            System.out.println(ANSI_RED+"USTED A LLEGADO AL LIMITE DE INTENTOS");
        }
        
    }
}
