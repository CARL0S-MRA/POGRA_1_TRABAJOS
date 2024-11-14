
package Semana6_Constructor;

public class personas {
   private String nombre;
   private int edad=0;
    
    //constructor
    public personas(int edad, String nombre){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
