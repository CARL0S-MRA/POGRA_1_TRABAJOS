
package Semana6;

public class Personas {
     int edad=0;
    String nombre;
    
    public Personas(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
        
    }
    public void mostrar(){
        System.out.println("NOMBRE: "+nombre+" | EDAD: "+edad);
    }
}
