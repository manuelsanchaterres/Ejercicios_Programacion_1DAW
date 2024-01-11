/* Fes una funció que calculi una sèrie de nombres aleatoris sencers. Els paràmetres de la funció seran: el valor mínim, el valor màxim, 
i la quantitat de nombres a mostrar. */

package unitat4_activitats_voluntaries;

import java.util.Scanner;

public class Unitat4_Activitat6 {

    public static void main(String[] args) {

        int valorMinim = 0, valorMaxim = 0, nombresMostrar = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix valor Mínim: ");
        valorMinim = input.nextInt();
        System.out.print("Introdueix valor Máxim: ");
        valorMaxim = input.nextInt();
        System.out.print("Introdueix nombres aleatoris a mostrar: ");
        nombresMostrar = input.nextInt();

        calculNValorsAleatoris(valorMinim, valorMaxim, nombresMostrar);
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static void calculNValorsAleatoris(int valorMinim, int valorMaxim, int nombresMostrar) { 

        double valorAleatori;
        int contador=0;

        do {

            valorAleatori = (Math.random() * (valorMaxim - valorMinim)) + valorMinim;
            contador++;
            System.out.println((int) valorAleatori);

        } while (contador < nombresMostrar);
    }

}
