/*Sense utilitzar Math.sqrt(), calcula l'arrel quadrada d’un nombre mitjançant aproximacions. 
En cas que no sigui exacta mostra el reste.
Per exemple: per a calcular l’arrel quadrada de 23, provam: 12=1, 22=4, 32=9, 42=16, 52=25 (ens passem). 
El resultat és 4 amb un resta de 23-16=7.
*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_5 {

    public static void main(String[] args) {

        int nombre=0,index=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix un nombre per calcular arrel quadrada: ");
        nombre = input.nextInt();

        /* Mientras el cuadro de index sea */

        while (nombre < 0) {

            System.out.println("Introdueix un nombre mayor o igual a 0: ");
            System.out.print("Introdueix un nombre per calcular arrel quadrada: ");
            nombre = input.nextInt();

        }

        while ((index*index) <= nombre) {
            
            System.out.println(index*index);
            index++;

        }

        System.out.println(index);

        if (nombre==(index-1)*(index-1)){

            System.out.println("La solució és: " + (index-1));

        } else {

            System.out.println("La solució és: " + (index-1) + " amb resta: " + (nombre - (index-1)*(index-1)));

        }
    }
}

