/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Unitat2_Activitat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
        
        float numero;
        
        Scanner input= new Scanner(System.in);
        System.out.print("Introduzca Numero: ");
        numero = input.nextFloat();
        
        if ((numero % 2) == 0) {
        
            System.out.println(numero + " es par");
            
        } else {
            
             System.out.println(numero + " es impar");
        }
    }
    
}
