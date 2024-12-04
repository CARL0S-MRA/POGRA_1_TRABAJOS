
package Semana9_TrabajoPuntos;
import java.util.Scanner;
public class Veterinario {
    private Servicio[] servicios;
    private String[] pedidos;
    private int contPedidos;
    private double totalGanancias;
    
    public Veterinario(){
        this.servicios=new Servicio[2];
        this.pedidos=new String [100];
        this.contPedidos=0;
        this.totalGanancias=0.0;
    }
    
    public void setPreciosServicios(double[] precioMedico, double[] precioBanio){
        servicios[0]=new Servicio("Atencion Medica", precioMedico[0], precioMedico[1], precioMedico[2]);
        servicios[1]=new Servicio("Banio",precioBanio[0],precioBanio[1],precioBanio[2]);
        
    }
    
    public void registrar(Scanner lea, String Cliente, int telefono, boolean frecuente, boolean terceraEdad,
            int serviciosSeleccionados, String AtencionCliente, String tipoAnimal,String tamano, String raza){
        
        if (serviciosSeleccionados < 1 || serviciosSeleccionados > 2) {
            System.out.println("|--SERVICIO INVALIDO--|");
            return;
        }
        
        Servicio servicio = servicios[serviciosSeleccionados-1];
        double precio=servicio.getPrecio(tamano);
        double descuento=0.0;
        
        if (frecuente) {
            descuento=0.15;
        }else if(terceraEdad){
            descuento=0.25;
        }
        
        double totalPagar= precio-(precio*descuento);
        totalGanancias += totalPagar;
        System.out.println("Total de Ganancias: "+totalGanancias);
        
        if (contPedidos >= pedidos.length) {
            System.out.println("Se ha llegado al limite de servicios para el dia");
        }
        
        pedidos[contPedidos++]="Cliente: "+Cliente
                                              +"\n Servicio: "+servicio.getNombre()
                                              +"\n Tipo de atencion: "+AtencionCliente
                                              +"\n Tipo de animal: "+tipoAnimal
                                              +"\n Tamanio: "+tamano
                                              +"\n Raza: "+raza
                                              +"\n Total: L."+totalPagar;
        System.out.println("REGISTRADO EXITOSAMENTE!!!");
        
    }
    public void Resumen(){
        System.out.println("-----RESUMEN DEL DIA-----");
        for (int i = 0; i < contPedidos; i++) {
            System.out.println(pedidos[i]);
        }
        
        System.out.println("Numeros de Servicios realizados: "+contPedidos);
    }
}
