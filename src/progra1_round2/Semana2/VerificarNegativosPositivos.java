
package progra1_round2.Semana2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class VerificarNegativosPositivos {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero !=0){
            
            if (numero > 0) {
                JOptionPane.showInputDialog(null,"El numero "+numero+" es positivo");
                
            }else{
                JOptionPane.showInputDialog(null,"El numero "+numero+" es negativo");
            }
            JOptionPane.showInputDialog("Ingrese otro numero: ");
           
        }
    }
}
