/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author manue
 */
public class Unita1_Activitat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float base, altura, area; /* chequear que base y altura no sean negativos 
                                  y que tengan la misma unidad en versión 2 del programa con IF statement*/
        //boolean valorNegativo;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca longitud de la base del Triangulo: ");
        base = input.nextFloat();
        //valorNegativo = base < 0 ? System.exit(0) : System.out.print("Introduzca longitud de la altura del Triangulo: ");
        System.out.print("Introduzca longitud de la altura del Triangulo: ");
        /*valorNegativo = altura < 0 ? 
               ((System.out.print("Altura no puede ser negativa");
               System.exit(0)): 
               (altura = input.nextFloat();        
               area = (base * altura)/2;
               System.out.println("El area de su triangulo es: " + area)); */
        
        altura = input.nextFloat();
        area = (base * altura)/2;
        System.out.println("El area de su triangulo es: " + area);
                
        
    }
    
}
