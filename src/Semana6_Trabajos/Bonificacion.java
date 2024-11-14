
package Semana6_Trabajos;

public class Bonificacion extends Empleado{
    double bonificacion;
    
    public Bonificacion(String nombre, String genero, double salario, int edad, int antiguedad){
        super(nombre, genero, salario, edad, antiguedad);
        this.nombre=nombre; 
        this.nombre=genero;
        this.salario=salario;
        this.edad=edad;
        this.antiguedad=antiguedad;
        bonificacion = CalcularBoni();
    }
    public double CalcularBoni(){
        if (salario > 45000) {
            return  salario * 0.20;
        }else if(salario > 25000 && salario <= 45000 && antiguedad > 7){
            return salario * 0.15;
        }else if(salario > 18900 && antiguedad > 5){
            return salario * 0.10;
        }
        return 0;
    }
    return salario + bonificacion;
    
}
