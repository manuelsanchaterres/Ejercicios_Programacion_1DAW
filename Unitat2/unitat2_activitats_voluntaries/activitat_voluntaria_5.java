/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package unitat2_activitats_voluntaries;

import java.util.Scanner;

/**
 *
 * @author manue
 */

 /* Fes una aplicació que demani a l’usuari un número comprès entre 0 i 9999. L’aplicació ha de determinar 
 si el nombre és capicúa.

Notes:
No es pot utilitzar cap propietat de l’objecte String (no vist a classe).
Pot ser útil utilitzar operand mòdul (%).
 */

public class activitat_voluntaria_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here

        int numero, primerDigito, ultimoDigito; /* primerDigito es el primer valor a la izquierda
        del numero y ultimoDigito es el ultimo valor a la derecha del número */

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca número entre 0 y 9999: ");

        numero = input.nextInt();

        if (numero <= 9) {

            System.out.println(numero + " es capicua.");

        } else if (numero > 9 && numero <= 99) {

            ultimoDigito = numero % 10; /* El resultado de aplicar el módulo a u número
            nos da como resultado su posició unidad*/

            primerDigito = (int) numero/10; /* Se castea el resultado decimal a integer
            para a encontrar la parte entera del decimal resultante que es su
            posición decena */
            
            if (ultimoDigito == primerDigito) {

                System.out.println(numero + " es capicua.");


            } else {

                System.out.println(numero + " no es capicua.");
            }

        } else if (numero > 99 && numero <= 999) {

            ultimoDigito = numero % 10; /* El resultado de aplicar el módulo a u número
            nos da como resultado su posició unidad*/

            primerDigito = (int) numero/100; /* Se castea el resultado decimal a integer
            para a encontrar la parte entera del decimal resultante que es su
            posición decena */

            if (ultimoDigito == primerDigito) {

                System.out.println(numero + " es capicua.");


            } else {

                System.out.println(numero + " no es capicua.");
            }

        } else if (numero > 999 && numero <= 9999) {

            ultimoDigito = numero % 10; /* El resultado de aplicar el módulo a u número
            nos da como resultado su posició unidad*/

            primerDigito = (int) numero/1000; /* Se castea el resultado decimal a integer
            para a encontrar la parte entera del decimal resultante que es su
            posición decena */
            System.out.println(ultimoDigito);
            System.out.println(primerDigito);

            if (ultimoDigito == primerDigito) {

                System.out.println(numero + " es capicua.");


            } else {

                System.out.println(numero + " no es capicua.");
            }

        }
         else {

            System.out.println("Numero debe ser entre 0 y 9999");

        }



    }
        
    
}
