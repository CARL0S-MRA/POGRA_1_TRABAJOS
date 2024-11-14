
package Semana6;
import java.util.Scanner;
public class MAINPERSONAS {
    public static void main(String[] args) {
        Personas[] personas = new Personas[6];
        Scanner lea=new Scanner(System.in);
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese nombre de la personas#"+(i+1)+" : ");
            String nombre=lea.next();
            System.out.println("Ingrese la edad de la persona#"+ (i+1)+" : ");
            int edad=lea.nextInt();
            personas[i]=new Personas(nombre, edad);
            
            for (int j = 0; j < personas.length - 1; j++) {
                for (int k = 0; k < personas.length - 1 -j; k++) {
                    if (personas[k].edad > personas[k+1].edad) {
                        Personas temp=personas[k];
                        personas[k] = personas[k+1];
                        personas[k+1]=temp;
                        
                    }
                }
                
            }
            for (Personas persona : personas) {
                persona.mostrar();
            }
        }
    }
}
