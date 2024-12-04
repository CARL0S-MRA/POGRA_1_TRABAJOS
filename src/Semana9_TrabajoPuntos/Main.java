
package Semana9_TrabajoPuntos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Veterinario veterinaria = new Veterinario();

        double[] precioMedico = new double[3];
        double[] precioBanio = new double[3];

        System.out.println("Ingrese los precios para las Atenciones Medicas: ");
        System.out.print("Pequeno: ");
        precioMedico[0] = lea.nextDouble();
        System.out.print("Mediano: ");
        precioMedico[1] = lea.nextDouble();
        System.out.print("Grande: ");
        precioMedico[2] = lea.nextDouble();
        
        System.out.println(" ");
        System.out.println("Ingrese los precios para los Banios:");
        System.out.print("Pequeno: ");
        precioBanio[0] = lea.nextDouble();
        System.out.print("Mediano: ");
        precioBanio[1] = lea.nextDouble();
        System.out.print("Grande: ");
        precioBanio[2] = lea.nextDouble();

        veterinaria.setPreciosServicios(precioMedico, precioBanio);

        while (true) {
            System.out.println("|---VETERINARIA---|"
                                        + "\n 1. Registrar Servicio"
                                        + "\n 2. Resumen"
                                        + "\n 3. Salir");
            System.out.print("Ingresar una opcion: ");

            try {
                int opcion = lea.nextInt();
                lea.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("-------REGISTRO-------");
                        System.out.print("Ingrese el nombre del cliente: ");
                        String Cliente = lea.nextLine().trim();

                        System.out.print("Ingrese el telefono del cliente: ");
                        int telefono = lea.nextInt();
                        lea.nextLine();

                        System.out.print("El cliente es frecuente? (true|false): ");
                        boolean frecuente = lea.nextBoolean();

                        System.out.print("Es cliente de la tercera edad? (true|false): ");
                        boolean terceraEdad = lea.nextBoolean();
                        lea.nextLine();

                        System.out.print("Seleccione el tipo de servicio que desea el cliente (medico | banio): ");
                        String AtencionCliente = lea.nextLine().trim().toLowerCase();

                        
                        if (!AtencionCliente.equals("medico") && !AtencionCliente.equals("banio")) {
                            System.out.println("SERVICIO INVALIDO");
                            break;
                        }

                        System.out.print("Seleccione que tipo de mascota es (perro | gato): ");
                        String tipoAnimal = lea.nextLine().trim().toLowerCase();

                        
                        if (!tipoAnimal.equals("perro") && !tipoAnimal.equals("gato")) {
                            System.out.println("DATO INVALIDO");
                            break;
                        }

                        System.out.print("Seleccione el tamanio de la mascota (pequeno | mediano | grande): ");
                        String tamano = lea.nextLine().trim();

                        
                        if (!tamano.equals("pequeno") && !tamano.equals("mediano") && !tamano.equals("grande")) {
                            System.out.println("DATO INVALIDO");
                            break;
                        }

                        System.out.print("Ingrese la raza de la mascota: ");
                        String raza = lea.nextLine().trim();
                        
                        System.out.println(" ");
                        System.out.println("Seleccione el servicio:"
                                                   + "\n 1. Atencion Medica"
                                                   + "\n 2. Banio Estetico");
                        int serviciosSeleccionados = lea.nextInt();

                        veterinaria.registrar(lea, Cliente, telefono, frecuente, terceraEdad,serviciosSeleccionados, AtencionCliente, tipoAnimal, tamano, raza);
                        
                        break;

                    case 2:
                        veterinaria.Resumen();
                        break;

                    case 3:
                        System.out.println("GRACIAS POR USAR EL SISTEMA");
                        return;

                    default:
                        System.out.println("OPCION INVALIDA | INGRESE UNA OPCION DEL RANGO 1-3");
                }
                
            } catch (Exception error) {
                
                System.out.println("ERROR | DATO INVALIDO");
                lea.nextLine();
            }
        }
    }
}
