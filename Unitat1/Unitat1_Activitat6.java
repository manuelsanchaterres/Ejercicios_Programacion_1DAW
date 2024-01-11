/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitat1_activitat6;
import java.util.Scanner;
/**
 *
 * @author manue
 */
public class Unitat1_Activitat6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte numeroEntradas;
        float importeCompra=0,importeCompraDescuento=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantitat entrades infantils: ");
        numeroEntradas = input.nextByte();
        importeCompra += numeroEntradas * 12;
        System.out.print("Quantitat entrades adultes: ");
        numeroEntradas = input.nextByte();
        importeCompra += numeroEntradas * 18;
        
        importeCompraDescuento = (float) (importeCompra > 60 ? importeCompra*(0.9) : importeCompra);
    
        System.out.println("Import total de les entrades: " + importeCompra);
        System.out.println("Import final: " + importeCompraDescuento);
        
    }
    
}
