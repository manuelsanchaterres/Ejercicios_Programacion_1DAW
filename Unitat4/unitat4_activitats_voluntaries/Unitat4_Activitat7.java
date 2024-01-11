/* Sobrecarrega la funció de l’activitat 6 per a que només rebi un paràmetre, 
que serà la quantitat de nombres a mostrar. Els nombres aleatoris que mostrara seran reals 
i aniran entre el 0 i l’1. */

package unitat4_activitats_voluntaries;

import java.util.Scanner;

public class Unitat4_Activitat7 {

    public static void main(String[] args) {

        int valorMinim = 0, valorMaxim = 0, nombresMostrar = 0;

        Scanner input = new Scanner(System.in);
        // System.out.print("Introdueix valor Mínim: ");
        // valorMinim = input.nextInt();
        // System.out.print("Introdueix valor Máxim: ");
        // valorMaxim = input.nextInt();
        System.out.print("Introdueix nombres aleatoris a mostrar: ");
        nombresMostrar = input.nextInt();

        // calculNValorsAleatoris(valorMinim, valorMaxim, nombresMostrar);
        calculNValorsAleatoris(nombresMostrar);
    }

    
    static void calculNValorsAleatoris(int valorMinim, int valorMaxim, int nombresMostrar) { 

        double valorAleatori;
        int contador=0;

        do {

            valorAleatori = (Math.random() * (valorMaxim - valorMinim)) + valorMinim;
            contador++;
            System.out.println((int) valorAleatori);

        } while (valorAleatori > valorMinim && valorMaxim > valorAleatori && contador < nombresMostrar);
    }

    static void calculNValorsAleatoris(int nombresMostrar) { 

        double valorAleatori;
        int contador=0;

        do {

            valorAleatori = Math.random();
            contador++;
            System.out.println(valorAleatori);

        } while (contador < nombresMostrar);
    }


}
