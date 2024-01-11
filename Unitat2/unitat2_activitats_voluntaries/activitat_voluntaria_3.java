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

 /* Tenim un client que és una granja i vol saber cada día si té prou menjar al magatzem per alimentar als animals. 
 Ens demanen fer un programa que ens demani: els kilograms de pinso que hi ha al magatzem, el nombre d’animals que han de menjar, 
 i la quantitat (en kilos) de menjar que hem de donar a cada animal.

El programa ha de determinar si hi ha prou menjar per alimentar els animals. En cas que no n’hi hagi prou, 
el programa ens ha de determinar quants kilos podem donar a cada animal.

Nota: evitar que l’aplicació faci divisions per zero. */

public class activitat_voluntaria_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
        float quantitatPinso, racioAnimal;

        int nombreAnimals;

        Scanner input = new Scanner(System.in);

        System.out.print("Quans kilos de pinso tens en es magatzem? ");

        quantitatPinso = input.nextFloat();

        System.out.print("A quans animals has de donar pinso avui? ");

        nombreAnimals = input.nextInt();

        System.out.print("Quans kilos de pinso ha de menjar cada animal? ");

        racioAnimal = input.nextFloat();

        if (nombreAnimals == 0) {

            System.out.println("Nombre d'animals no pot ser igual a 0 ");
            
        } else {

            if ((nombreAnimals * racioAnimal) <= quantitatPinso) {

                System.out.println("Amb " + quantitatPinso + "kg de pinso per animal tens suficient, et sobren " + (quantitatPinso - (nombreAnimals * racioAnimal) + "kg de pinso pel dia següent."));

            } else {

                System.out.println("Només pots donar " + (quantitatPinso /nombreAnimals) + "kg per animal");

            }

        }
    }
        
    
}
