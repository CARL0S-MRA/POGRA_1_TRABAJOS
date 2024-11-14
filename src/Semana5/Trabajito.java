//Carlos Mauricio Rodriguez Altamirano 22411261
//Aaron Estaban Archaga Rostran 22451016
package Semana5;
import java.util.Scanner;
public class Trabajito {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("++MENU++"
            +"\n 1- Aplicacion Ventas "
            +"\n 2- Dias Laboral"
            +"\n 3- Numeros Primos"
            +"\n 4- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=lea.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("--Aplicacion Ventas--");
                    int numVentas=0;
                    double ventas=0;
                    double totalVentas=0;
                    System.out.println("Ingrese el numero de ventas echas en el dia: ");
                    numVentas=lea.nextInt();
                    for (int cont = 1; cont <=numVentas; cont++) {
                        System.out.println("Venta#"+cont+": ");
                        ventas=lea.nextDouble();
                        totalVentas += ventas;
                    }
                    System.out.println("Total de ventas: "+totalVentas);
                break;
        
                case 2:
                   
                    System.out.println("--Dias Laboral");
                    String dias;
                    String otroDia;
                    do{
                    
                    System.out.println("Favor Ingrese un dia: ");
                    dias=lea.next().toLowerCase();
                    switch(dias){
                        case "lunes":
                        case "martes":
                        case "miercoles":
                        case "jueves":
                        case "viernes":
                            System.out.println(dias+"<- Es un dia Laboral");
                            break;
                        case "sabado":
                        case "domingo":
                            System.out.println(dias+"<- No es un dia laboral");
                            break;
                        default:
                            System.out.println("Dia Invalido");
                    }
                        System.out.println("Desea ingresar otro dia? (si|no)");
                        otroDia=lea.next().toLowerCase();
                    }while(otroDia.equals("si"));
                    
                break; 
                
                case 3:
                    System.out.println("--Numeros Primos del 1 al 100--");
                    for (int num = 2; num<=100; num++) {
                         int divisor=0;
                         for (int primos = 1; primos <=num; primos++) {
                             if (num % primos ==0) {
                                 divisor++;
                             }
                        }
                         if(divisor==2){
                           System.out.println(num+" ");
                        }   
                                
                    }
                    
                break;    
        }
        }while(opcion !=4);
        
    }
}
