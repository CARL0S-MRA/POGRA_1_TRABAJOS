package progra1_round2.Semana2;
import java.util.Scanner;
public class CalcularPerimetroArea {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        double altura;
        double base;
        double perimetro;
        double area;
        
        System.out.println("Ingrese la altura: ");
        altura=lea.nextDouble();
        
        System.out.println("Ingrese la base: ");
        base=lea.nextDouble();
        
        perimetro = 2*(base+altura);
        area = base*altura;
        
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El area es: "+area);
        
    }
   
}
