
package Semana6_Trabajos;

public class Bonificacion extends Empleado{
    double bonificacion;
    
    public Bonificacion(String nombre, String genero, double salario, int edad, int antiguedad){
        super(nombre, genero, salario, edad, antiguedad);
        
        bonificacion = CalcularBoni();
    }
    
    public double CalcularBoni(){
        if (salario > 45000) {
            return salario * 0.20;
        }else if(salario > 25000 && salario <= 45000 && antiguedad > 7){
            return salario * 0.15;
        }else if(salario > 18900 && antiguedad > 5){
            return salario * 0.10;
        }
        return salario;
    }
    
    public double calcularSalario(){
        return salario + bonificacion;
    }
    
    public void mostrar(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Genero del empleado: " + genero);
        System.out.println("Edad del empleado: " + edad);
        System.out.println("Antiguedad del empleado: " + antiguedad + " anios");
        System.out.println("Salario base del empleado: Lps. " + salario);
        System.out.println("Bonificacion: Lps. " + bonificacion);
        System.out.println("Salario final con bonificacion: Lps. " + calcularSalario());
    }
    
}
