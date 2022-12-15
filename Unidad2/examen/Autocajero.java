
import java.util.Scanner;
import bpc.daw.objetos.TarjetaCredito;
/**
 *
 * @author fran lucena <fran.lucena@gmail.com>
 */
public class Autocajero {

    public static void main(String[] args) {
        
        final int INTENTOS = 3;
        
        TarjetaCredito tCredito = new TarjetaCredito(11111, 100);
        Scanner leerTeclado = new Scanner(System.in);
        String clave;
        int aux;
        int intentos = 2;
        
        while (intentos > 0 && intentos <= INTENTOS) {
        
            System.out.println("Introduce la contraseña:");
            clave = leerTeclado.next();
            System.out.println("Has marcado la contraseña: " + clave);
            
            try {

                aux = tCredito.getSaldo(Integer.parseInt(clave));
                System.out.println(
                        "Contraseña aceptada con saldo inicial: "
                        + aux);

            } catch (Exception ex) {

                System.out.println("ERROR: " + ex.getMessage());
                System.out.println("Te quedan " + intentos + " intentos.");
                
            } finally {
            
                intentos--;
            }
        }
        
        if (intentos > 0){
            
            char opcion = ' ';
            
            while (opcion!= 'T'){
                
                System.out.println("Indique la operación a realizar:");
                System.out.println("(I) Ingresar.");
                System.out.println("(R) Retirar.");
                System.out.println("(S) Saldo actual.");
                System.out.println("(T) Terminar.");
                
                opcion = leerTeclado.next().charAt(0);
                
                if (opcion == 'I') {
                
                    int cantidad = leerTeclado.nextInt();
                    if (cantidad > 0){
                        
                        tCredito.ingresarDinero(cantidad);
                    }    
                    else{
                        
                        System.out.println("No se pueder realizar la operación.");
                        System.out.println("La cantidad a ingresar es menor a 1 €.");
                    }
                    
                } else if (opcion == 'R') {
                
                    int cantidad = 0; 
                    int saldoActual = 0;
                    
                    System.out.println("Introduzca la cantidad a retirar:");
                    cantidad = leerTeclado.nextInt();
                    
                    // La contraseña se ha filtrado anteriormente.
                    // Se da por hecho que es correcta y no salta la excepcion
                    try {
                    
                        saldoActual = tCredito.getSaldo(11111);
                    
                    } catch (Exception ex) {
                        
                        System.out.println("ERROR: " + ex.getMessage());
                    }
                    
                    if (cantidad <= saldoActual){
                        
                        // La contraseña se ha filtrado anteriormente.
                        // Se da por hecho que es correcta y no salta la excepcion
                        try {
                            
                            tCredito.sacarDinero(leerTeclado.nextInt(), cantidad);
                        
                        } catch (Exception ex) {
                            
                            System.out.println("ERROR: " + ex.getMessage());
                        
                        }
                    }    
                    else{
                        
                        System.out.println("No se pueder realizar la operación.");
                        System.out.println("La cantidad a ingresar es menor a 1 €.");
                    }
                
                } else if (opcion == 'S') {
                    
                    System.out.println("En estos momentos el saldo de la tarjeta es: ");
                    
                    // La contraseña se ha filtrado anteriormente.
                    // Se da por hecho que es correcta y no salta la excepcion
                    try {
                    
                        System.out.println("Saldo actual: " + tCredito.getSaldo(11111));
                        
                    } catch (Exception ex) {
                    
                        System.out.println("ERROR: " + ex.getMessage());
                    }
                
                } else if (opcion == 'T') {
                    
                    System.out.println("Ha pulsado terminar de operar en Cajero.");
                    System.out.println("Gracias por usar el cajero. Recoja su tarjeta.");
               
                } else {
                
                    System.out.println("\nERROR: Opción incorrecta.");
                    System.out.println("Pulse una tecla válida: I, R, S o T\n");
                }
                
                
            }
        }
        else{
            System.out.println("CAJERO CERRADO");
            System.out.println("Ha agotado los 3 intentos para acceder.");
            System.out.println("Tarjeta Bloqueada.");
        }
    }
    
}
