/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitat1_activitat2;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Unitat1_Activitat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float numero1, numero2;
        boolean iguals;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca primer numero: ");
        numero1 = input.nextFloat();
        System.out.print("Introduzca segundo numero: ");
        numero2 = input.nextFloat();
        iguals = numero1 == numero2;
        System.out.println(iguals);
        
    }
    
}
