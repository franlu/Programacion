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
        
        final int ANCHO = 10;
        final int ALTO = 10;
        
        int[][] tablero = new int[ANCHO][ALTO];
        
        for(int x=0;x<ANCHO;x++)
            for(int y=0;y<ALTO;y++)
                tablero[x][y]=0;
        
    } // main
} // clase
