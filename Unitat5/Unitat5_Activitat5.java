
/* Escriu la funció static int[] omplirParells(int longitud, int fi), que crea i retorna un array 
ordenat de la longitud especificada a longitud, que s’ha omplert amb nombres parells aleatoris 
compresos entre 2 i el nombre especificat a fi. */

import java.util.Arrays;
import java.util.Scanner;

public class Unitat5_Activitat5 {

    public static void main(String[] args) {

        int longitud = 0, fi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quants nombres parells aleatoris vols tornar? ");
        longitud = input.nextInt();
        System.out.print("Introdueix el valor limit de la llista: ");
        fi = input.nextInt();
        omplirParells(longitud, fi);
    
    }

    static int[] omplirParells(int longitud, int fi) {
        int[] ArrayPares = new int[longitud];
        int digitoEntrada;
        int vuelta = 0;
        while (vuelta < ArrayPares.length) {
            //generamos el numero con el rango 2 a n
            //lo conseguimos multiplicando el double con ( fin / 2, nos dará la mitad de fin, + 1 para asegurar que siempre es uno) * 2 para asegurar que minimo es 2
            digitoEntrada = (int) (Math.random() * fi / 2 + 1) * 2;
            //si es par lo metemos
            if (digitoEntrada % 2 == 0) {
                ArrayPares[vuelta] = digitoEntrada;
                vuelta++;
            }
        }
        //ordenamos y devolvemos
        Arrays.sort(ArrayPares);
        return ArrayPares;
    }    
    
}
