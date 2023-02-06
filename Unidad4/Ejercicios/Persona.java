package Tema4;

import java.time.*;

import Tema4.DNI;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    //CONSTRUCTORES
    public Persona(String n, DNI d) {
        dni = d;
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
    }
    
    public Persona(String n, DNI d, double s, LocalDate f) {
        dni = d;
        nombre = n;
        sueldo = s;
        fechaNacimiento = f;
    }
    
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate f) {
               
        dni = new DNI(numDNI, letraDNI);
        sueldo = s;
        fechaNacimiento = f;
        nombre = n;
    }
    
    public Persona(String n, int numDNI, char letraDNI) {
        dni = new DNI(numDNI, letraDNI);
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, Month.JANUARY, 31);
    }
    
    //GETTERS
    @Override
    public String toString() {
        String aux = "El/Ella es " +nombre+ " con DNI: " +dni.getDNI()+ " ,cobra: "
                +sueldo+ " y nacio en el: " +fechaNacimiento;
        return aux;
    }
}
