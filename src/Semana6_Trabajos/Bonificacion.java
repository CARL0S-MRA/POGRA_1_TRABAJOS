
package Semana6_Trabajos;

public class Bonificacion extends Empleado{
    double bonificacion;
    
    public Bonificacion(String nombre, String genero, double salario, int edad, int antiguedad){
        super(nombre, genero, salario, edad, antiguedad);
        
        bonificacion = CalcularBoni();
    }
    
    public double CalcularBoni(){
        if (salario >=45000) {
            return salario * 0.20;
        }else if(salario > 25000 && salario <= 45000 && antiguedad >=7){
            return salario * 0.15;
        }else if(salario >=18900 && antiguedad >=5){
            return salario * 0.10;
        }
        return salario;
    }
    
    public double calcularSalario(){
        return salario + bonificacion;
    }
    
    public void mostrar(){
        System.out.println("Nombre del empleado: " + nombre
                    +"\n Genero del empleado: " + genero
                    +"\n Edad del empleado: " + edad
                    +"\n Antiguedad del empleado: " + antiguedad + " anios"
                    +"\n Salario base del empleado: Lps. " + salario
                    +"\n Bonificacion: Lps. " + bonificacion
                    +"\n Salario final con bonificacion: Lps. " + calcularSalario());
    }
    
}
