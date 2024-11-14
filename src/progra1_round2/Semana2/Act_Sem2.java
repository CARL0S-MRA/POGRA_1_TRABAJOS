
package progra1_round2.Semana2;
import java.util.Scanner;
public class Act_Sem2 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int opcion =0;
        
        do{
            System.out.println("---MENU---"
            +"\n 1- Conversor"
            +"\n 2- Calificacion"
            +"\n 3- Perimetro y Area"
            +"\n 4- Equipo"
            +"\n 5- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=lea.nextInt();
            
            switch(opcion){
                case 1:
                     //Farenheit Conversor
      
                        double farenheit;
                        double celsius;

                        System.out.println("Ingrese la temperatura en farenheit para su conversion a Celsius: ");
                        farenheit=lea.nextDouble();

                        celsius = (farenheit-32)*5/9;

                        System.out.println("La temperatura de farenheit "+farenheit+" se convertido a "+celsius+" grados Celsius");
                        break;
                        
                case 2:
                     //Calificacion
                    double Nota1;
                    double Nota2;
                    double Nota3;
                    double NotaExamen;
                    double notaTrabajo;
                    double promedioNota;
                    double promedioExamen;
                    double promedioTrabajo;
                    double calificacion;
                    
                    System.out.println("Nota del primer parcial: ");
                    Nota1=lea.nextDouble();
                    
                    System.out.println("Nota del segundo parcial: ");
                    Nota2=lea.nextDouble();
                    
                    System.out.println("Nota del tercer parcial: ");
                    Nota3=lea.nextDouble();
                    
                    System.out.println("Nota de examen: ");
                    NotaExamen=lea.nextDouble();
                    
                    System.out.println("Nota del trabajo final: ");
                    notaTrabajo=lea.nextDouble();
                    
                    promedioNota = Nota1 + Nota2 + Nota3 / 3 * 0.55;
                    promedioExamen = NotaExamen * 0.30;
                    promedioTrabajo = notaTrabajo * 0.15;
                    
                    calificacion = promedioNota + promedioExamen + promedioTrabajo;
                    System.out.println("Calificacion del estudiante es: "+calificacion);
                    
                    break;
                    
                case 3:
                    // CalcularPerimetroArea
        
                    
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
                    
                    break;
                    
                case 4:
                    //Puntaje
                    
                    int totalPuntaje;
                    int partidoGanado;
                    int partidoPerdido;
                    int partidoEmpatado;

                    System.out.println("Ingrese numero de partidos ganados: ");
                    partidoGanado=lea.nextInt();
                    System.out.println("Ingrese numero de partidos perdidos: ");
                    partidoPerdido=lea.nextInt();
                    System.out.println("Ingrese numero de partdios empatados: ");
                    partidoEmpatado=lea.nextInt();

                    totalPuntaje= (partidoGanado*3) + (partidoPerdido*1) + (partidoEmpatado*0);

                    System.out.println("El puntaje del equipo: "+totalPuntaje);
                    
                    break;
                    
            }
        }while(opcion !=5);
        
    }
}
