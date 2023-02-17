/**
* La clase representa una cuenta bancaria 
* que almacena una máximo de 10000 €
* 
* @author Fran <fran.lucena@gmail.com>
*/

public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) throws IllegalArgumentException {
        if (saldo + cantidad > 10000) {
            throw new IllegalStateException("No se puede depositar más de 10.000 €.");
        }
        saldo += cantidad;
    }

    public void retirar(int cantidad) throws IllegalArgumentException {
        if (saldo - cantidad < 0) {
            throw new IllegalStateException("No se puede retirar más de lo que hay en la cuenta.");
        }
        saldo -= cantidad;
    }
}
