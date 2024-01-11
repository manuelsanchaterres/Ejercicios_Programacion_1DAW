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

 /*Fes una aplicació que calculi l’àrea del triangle. Abans de fer cap 
 càlcul ha de comprovar que l’usuari no fiqui valors negatius.*/

public class activitat_voluntaria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
        float base, altura;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi base del triangle: ");

        base = input.nextFloat();

        System.out.print("Introdueixi altura del triangle: ");

        altura = input.nextFloat();


        if (base < 0 || altura < 0) {

            System.out.print("La base o altura del triángulo no pueden ser negativas.");
            System.exit(0);

        } else {

            System.out.print("El area de tu triangulo es: " + (base*altura)/2);

        }


    }
        
    
}
