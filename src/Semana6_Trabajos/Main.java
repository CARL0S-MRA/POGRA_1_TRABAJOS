
package Semana6_Trabajos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
            Bonificacion empleado = new Bonificacion("", "", 0, 0, 0);
         
            System.out.print("Nombre del empleado: ");
            empleado.setNombre(lea.next());

            System.out.print("Ingrese el salario del empleado: ");
            empleado.setSalario(lea.nextDouble());

            System.out.print("Ingrese el genero del empleado: ");
            empleado.setGenero(lea.next());

            System.out.print("Ingrese la edad del empleado: ");
            empleado.setEdad(lea.nextInt());

            System.out.print("Ingrese la antiguedad del empleado: ");
            empleado.setAntiguedad(lea.nextInt());
            
            
            empleado.mostrar();
    }
}
