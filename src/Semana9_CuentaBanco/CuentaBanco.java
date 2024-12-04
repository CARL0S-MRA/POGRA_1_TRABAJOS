
package Semana9_CuentaBanco;

public class CuentaBanco {
    public String Cliente;
    public int numeroDecuenta;
    private double saldo;
    public String telefono;
    public double limite;
    
    public CuentaBanco(){
        this.Cliente=" ";
        this.numeroDecuenta=0;
        this.saldo=0.0;
        this.telefono="";
        this.limite=999999;  
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void depositar(double monto){
           if (monto < 0) {
            System.out.println("Error: El monto a depositar no puede ser negativo.");
            return;
        }
        if (this.saldo + monto > this.limite) {
            System.out.println("Error: No se puede depositar, excede el limite de la cuenta.");
            return;
        }
        this.saldo += monto;
        System.out.println("Deposito exitoso. Nuevo saldo: " +this.saldo);
    }
    
    public void retirar(double monto){
        if (monto < 0) {
            System.out.println("Error: El monto a depositar no puede ser negativo.");
            return;
        }
        if (this.saldo - monto < 0) {
            System.out.println("Error: No se puede depositar, excede el limite de la cuenta.");
            return;
        }
        this.saldo -= monto;
        System.out.println("Deposito exitoso. Nuevo saldo: " +this.saldo);
        }
    }
