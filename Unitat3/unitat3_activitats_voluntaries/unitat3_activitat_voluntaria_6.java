/* Fes un programa que converteixi un nombre decimal en binari. S’ha de tenir en compte que desconeixem 
quantes xifres té el nombre introduït.
Per simplicitat, anirem mostrant el nombre binari amb un digit per línia.
*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_6 {

    public static void main(String[] args) {

        int nombreDecimal=0, nombreBinari=0, contador = 0;

        // byte bitSigno = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueixi nombre sencer en decimal: ");
        nombreDecimal = input.nextInt();

        while (nombreDecimal >= 1) {
            
            /* NombreBinari = nombreBinari + (resto Nombre Decimal por 10 elevado 
            al valor del contador en cada iteración) */

            nombreBinari += (nombreDecimal % 2) *Math.pow(10, contador);
            nombreDecimal /=2;
            contador++;
        }


        System.out.println(nombreBinari);



        

    }
}

