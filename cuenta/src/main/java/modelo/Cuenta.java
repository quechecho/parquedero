
package modelo;

public class Cuenta {
     private double saldo = 500000;
    
    public synchronized Double getSaldo() {
        return saldo;
    }
    
    public synchronized void retirar(Double cantidad) {
        saldo -= cantidad;
    }
    
    public synchronized boolean validarSaldo(Double cantidad) {
        return saldo >= cantidad;
    }
    
}
