
/* Fes un programa que declari un array de longitud 10. I relleni totes les posicions amb un valor aleatori entre 1 i 100. 
Després, recorre tot l’array i suma tots els valors. Mostra el resultat per pantalla. */
import java.util.Arrays;
public class Unitat5_Activitat1 {

    public static void main(String[] args) {

        double[] arrayAleatoris = new double[10];
        double suma = 0;

        for(int i= 0; i < arrayAleatoris.length; i++){

            /*A la posición con íncide i del array se le asigna el valor aleatorio calculado. */

            arrayAleatoris[i] = (Math.random()*100) + 1;

            suma += arrayAleatoris[i];

            System.out.println("Valor index " + i + " es igual a " + arrayAleatoris[i] + ".");
            
        }

        System.out.println("Suma Valors: " + suma);

    }
}
