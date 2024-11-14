
package Semana4;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglos {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int nentrada;
        nentrada=Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar la catidad entrada "));
        char[] letras=new char[nentrada];
        System.out.println("Favor ingresar los datos a guardar");
        for (int i = 0; i < nentrada; i++) {
            System.out.println((1+i)+"Favor ingresar caracter");
            letras[i]=entrada.next().charAt(0);
        }
        System.out.println("Los caracteres ingresados son: ");
        for (int i = 0; i < nentrada; i++) {
            System.out.println(letras[i]);
        }
    } 
}
           