
package Semana9_TrabajoPuntos;
import java.util.Scanner;
public class Servicio {
    Scanner lea=new Scanner(System.in);
    
    private String nombre;
    private double precioMediano;
    private double precioGrande;
    private double precioPequeno;
    
   
    public Servicio(String nombre, double precioMediano, double precioGrande, double precioPequeno){
        this.nombre=nombre;
        this.precioMediano=precioMediano;
        this.precioGrande=precioGrande;
        this.precioPequeno=precioPequeno;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(String tamano){
        while(true){
        if(tamano.equals("pequeno")){
            return precioPequeno;
        }else if(tamano.equals("mediano")){
            return precioMediano;
        }else if(tamano.equals("grande")){
            return precioGrande;
        }else{
            System.out.println("Tamanio Invalido | Ingrese Nuevamente ");
            tamano=lea.nextLine().trim().toLowerCase();
            }
        }
    }
}
