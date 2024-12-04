
package Semana9_TrabajoPuntos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Veterinario veterinaria=new Veterinario();
        
        double[] precioMedico=new double[3];
        double[] precioBanio=new double[3];
        
        System.out.println("Ingrese los precios para las Atenciones Medicas: ");
        System.out.println("Pequeno: ");
        precioMedico[0]=lea.nextDouble();
        System.out.println("Mediano: ");
        precioMedico[1]=lea.nextDouble();
        System.out.println("Grande: ");
        precioMedico[2]=lea.nextDouble();
        
        System.out.println(" ");
        System.out.println("Ingrese los precios para los Banios");
        System.out.println("Pequeno: ");
        precioBanio[0]=lea.nextDouble();
        System.out.println("Mediano: ");
        precioBanio[1]=lea.nextDouble();
        System.out.println("Grande: ");
        precioBanio[2]=lea.nextDouble();
        
        veterinaria.setPreciosServicios(precioMedico, precioBanio);
        
        while(true){
            System.out.println("|---VETERINARIA---|"
                                       +"\n 1. Registrar Servicio"
                                       +"\n 2. Resumen"
                                       +"\n 3. Salir");
            System.out.println("Ingresar una opcion: ");
            try{
            int opcion=lea.nextInt();
            
            switch(opcion){
                case 1:
                    
                    System.out.println("-------REGISTRO-------");
                    System.out.println("Ingrese el nombre del cliente: ");
                    String Cliente=lea.next();
                    System.out.println("Ingrese el telefono del cliente: ");
                    int telefono=lea.nextInt();
                    System.out.println("El cliente es frecuente? (true|false)");
                    boolean frecuente=lea.nextBoolean();
                    System.out.println("Es cliente de la tercera edad? (true|false)");
                    boolean terceraEdad=lea.nextBoolean();
                    
                    System.out.println("Seleccione el tipo de servicio que desea el cliente: ( medico | banio)");
                    String AtencionCliente=lea.next();
                    
                    System.out.println("Seleccione que tipo de mascota es (perro | gato): ");
                    String tipoAnimal=lea.next();
                    
                    System.out.println("Seleccione el tamanio de la mascota (pequeno | mediano | grande): ");
                    String tamano=lea.next();
                    
                    System.out.println("Ingrese la raza de la mascota: ");
                    String raza=lea.next();
                    
                    System.out.println(" ");
                    System.out.println("Ingrese el servicio: "
                                                +"\n 1. Atencion Medica"
                                                +"\n 2. Banio Estetico");
                                                int serviciosSeleccionados=lea.nextInt();
                    
                    veterinaria.registrar(lea, Cliente,telefono , frecuente, terceraEdad, serviciosSeleccionados, AtencionCliente, tipoAnimal, tamano, raza);
                    break;
                    
                case 2:
                    veterinaria.Resumen();
                    break;
                case 3:
                    System.out.println("GRACIAS POR USAR EL SISTEMA");
                    return;
                default:
                    System.out.println("OPCION INVALIDAD | INGRESE DEL RANGO 1-3 DE LAS OPCIONES");
                    
            }
                    }catch(Exception error){
                        System.out.println("OPCION INVALIDA | SOLO NUMEROS ENTEROS");
                    }
        }
    }
}
