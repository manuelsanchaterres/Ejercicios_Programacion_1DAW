/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Unitat1_Activitat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x, y, coeficiente;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el valor de x: ");
        x = input.nextFloat();
        System.out.print("Introduzca el valor de coeficiente a: ");
        coeficiente = input.nextFloat();
        y = coeficiente * (x*x);
        System.out.print("Introduzca el valor de coeficiente b: ");
        coeficiente = input.nextFloat();
        y += coeficiente * x;
        System.out.print("Introduzca el valor de coeficiente c: ");
        coeficiente = input.nextFloat();
        y += coeficiente;
        System.out.print("Y es igual a: " + y);
        /*System.out.print("Introduzca el valor de coeficiente b: ");
        coeficiente = input.nextFloat(); */
        
        
        
    }
    
}
