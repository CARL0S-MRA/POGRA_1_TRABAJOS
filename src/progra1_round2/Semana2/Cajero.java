 package progra1_round2.Semana2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cajero {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        final int SaldoInicial = 2000;
        int opcion;
        float deposito;
        float saldoActual;
        float retiros;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecione una opcion:"
                +"\n 1. Deposito"
                +"\n 2. Retiro"
                +"\n 3. Salir"));
        
        switch(opcion){
            
            case 1:
                deposito=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad que desea depositar: "));
                if (deposito >= 1) {
                    saldoActual = deposito + SaldoInicial;
                    JOptionPane.showMessageDialog(null,"Su saldo es de L."+saldoActual);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PERMITEN VALORES MENORES QUE CERO");
                }
                break;
                
            case 2:
                retiros=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar"));
                if(retiros > SaldoInicial){
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                }
                if (retiros>=1) {
                    saldoActual= SaldoInicial - retiros;
                    JOptionPane.showMessageDialog(null, "Su saldo ahora es de L."+saldoActual);
                }else{
                    JOptionPane.showMessageDialog(null, "No se permiten valores negativos");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "ADIOS :)");
                break;
            default:JOptionPane.showMessageDialog(null, "Opcion Invalida");                
        }
        
        
        
    }
    
}
