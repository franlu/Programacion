/**
 *  Tablero de 10x10
 *  1 barco de 5
 *  1 barco de 4
 *  2 barcos de 3
 *  3 barcos de 2
 * 
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ej06Matriz {

    public static void main(String[] args) {
        
        tablero[0][0] = "*";

        int aux = 1;
        for(char a ='A'; a<'K';a++){
            tablero[0][aux]=Character.toString(a);
            aux++;
        }
        aux = 1;
        for(char a ='A'; a<'K';a++){
            tablero[aux][0]=Character.toString(a);
            aux++;
        }

        for(int x=1;x<ANCHO;x++)
            for(int y=1;y<ALTO;y++)
                tablero[x][y]= "~";

        for(int x=0;x<ANCHO;x++){
            for(int y=0;y<ALTO;y++)
                System.out.print(tablero[x][y] + " ");
            System.out.println();
        }
        
    } // main
} // clase
