package hl.t2.aleatorio;

/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Aleatorio {

    public static void main(String[] args) {
                
        int num, nMenor, nMayor;       
               
        nMenor = -100;
        nMayor = 100;
        
        num = (int) (Math.random() * ( nMayor + 1 - nMenor)) + nMenor;
        
        System.out.println(
                "Número entre " + nMenor + " y " + nMayor + " : " + num
        );
    }
}
