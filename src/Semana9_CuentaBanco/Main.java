
package Semana9_CuentaBanco;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        CuentaBanco cuenta=new CuentaBanco();
        
        System.out.println(" Ingrese nombre: ");
        String Cliente=lea.next();
        System.out.println(" Ingrese numero de cuenta");
        String numeroDecuenta=lea.next();
        
        while(true){
            System.out.println("=====MENU====="
            +"\n 1. Deposito"
            +"\n 2. Retiro"
            +"\n 3. Salir");
            int opcion=lea.nextInt();
            
        
            switch(opcion){
                case 1:
                    System.out.println(" Cuanto es el monto que desea depositar: ");
                    int deposito=lea.nextInt();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Cuanto es el monto que desea retirar: ");
                    int retirar=lea.nextInt();
                    cuenta.retirar(retirar);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("SALIENDO.....");
        }
    }
    }
}
