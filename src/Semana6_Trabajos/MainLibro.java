
package Semana6_Trabajos;
import java.util.Scanner;
public class MainLibro {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
       
        
        System.out.println("Ingresar datos del Libro");
        System.out.println("--------------------------");
        System.out.println("Titulo: ");
        String titulo=lea.next();
        System.out.println("Autor: ");
        String autor=lea.next();
        System.out.println("ISBN: ");
        int ISBN=lea.nextInt();
        System.out.println("Precio: ");
        double precio=lea.nextDouble();
        
        Libro libro=new Libro(titulo,autor,ISBN,precio);
        
        libro.mostar();
        
        System.out.println("Ingrese la edad del comprador: ");
        int edad=lea.nextInt();
        
        libro.descuento(edad);
    }
}
