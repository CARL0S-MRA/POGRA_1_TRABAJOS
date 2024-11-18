
package Semana6_Trabajos;


public class Empleado {
    String nombre;
    String genero;
    double salario=0;
    int edad=0;
    int antiguedad=0;
    
    public Empleado(String nombre, String genero, double salario, int edad, int antiguedad){
        this.nombre=nombre;
        this.genero=genero;
        this.salario=salario;
        this.edad=edad;
        this.antiguedad=antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    
    
    
}
