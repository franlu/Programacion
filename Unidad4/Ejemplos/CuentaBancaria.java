/**
* La clase representa una cuenta bancaria.
* 
* @author Fran <fran.lucena@gmail.com>
*/

public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        if (saldo + cantidad > 10000) {
            throw new IllegalStateException("No se puede depositar más de $10,000 pesos.");
        }
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        if (saldo - cantidad < 0) {
            throw new IllegalStateException("No se puede retirar más de lo que hay en la cuenta.");
        }
        saldo -= cantidad;
    }
}
