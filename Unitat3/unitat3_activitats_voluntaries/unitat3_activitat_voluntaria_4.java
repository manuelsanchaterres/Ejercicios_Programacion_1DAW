/* Per a dos nombres a i b, és possible buscar el mínima comú múltiple (el nombre més petit múltiple de ambdós) 
amb un algorisme ineficient, però senzill: des del menor entre a i b, anar cercant de manera decreixent 
el primer nombre que divideix als dos simultàniament amb resta zero. Fes un programa que busqui el MCD de dos nombres.*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_4 {

    public static void main(String[] args) {

        int nombre1=0, nombre2=0, multiplo = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueixi nombre 1: ");
        nombre1 = input.nextInt();
        System.out.print("Introdueixi nombre 2: ");
        nombre2 = input.nextInt();
        int mayor = nombre1 > nombre2 ? nombre1: nombre2;
        
        for (int i=1; i <= mayor; i++) {

            multiplo = nombre1 * i;

            for (int j = 1; j <= mayor; j++) {

                if ((nombre2 * j) == multiplo) {

                    System.out.println("m.c.m(" + nombre1 + "," + nombre2 + ") = " + multiplo);
                    break;
                }
            }
        }

    }
}

