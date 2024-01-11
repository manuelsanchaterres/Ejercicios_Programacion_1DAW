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

 /* Utilitza l’operador ternari per a calcular el valor 
 absolut d’un nombre que demani a l’usuari per teclat. */

public class activitat_voluntaria_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
        float nombre;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi nombre positiu o negatiu: ");

        nombre = input.nextFloat();


        System.out.println(nombre < 0 ? "Valor absolut: " + -nombre:"Valor absolut: " + nombre);

    }
        
    
}
