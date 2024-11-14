
package progra1_round2.Semana2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int numero;
        int cubo;
        int resultado=0;
        
      numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese UN numero: "));
      while(numero >= 0){
          cubo=(int)Math.pow(numero, 3);
          JOptionPane.showMessageDialog(null, "El numero: "+numero+" Al cubo es: "+cubo);
      }
    }
}
