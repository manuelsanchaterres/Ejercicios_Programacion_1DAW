/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Unitat2_Activititat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1, numero2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca Primer Numero: ");
        
        numero1 = input.nextInt();
        
        System.out.print("Introduzca Segundo Numero: ");
        
        numero2 = input.nextInt();
        
        if (numero1 > numero2) {
        
            System.out.println("numero 1: " + numero1 + " mayor que " + "numero 2: " + numero2);
            
        }
        
         if (numero1 < numero2) {
        
            System.out.println("numero 1: " + numero1 + " menor que " + "numero 2: " + numero2);

            
        }

    }
        
    
}
