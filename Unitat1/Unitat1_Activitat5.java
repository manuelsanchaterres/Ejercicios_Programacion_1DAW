/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Unitat1_Activitat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float distancia1, distancia2, distancia3, sumaDistancias = 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Introduzca distancia en milimetros: ");
        distancia1 = input.nextFloat()/10; // Conversión de milimetros a centimetros.
        sumaDistancias += distancia1;
        System.out.print("Introduzca distancia en centimetros: ");
        distancia2 = input.nextFloat();
        sumaDistancias += distancia2;
        System.out.print("Introduzca distancia en metros: ");
        distancia3 = input.nextFloat() * 100;
        sumaDistancias += distancia3;
        
        System.out.print("Distancia total en centimetros: " + sumaDistancias);
        
    }
    
}
