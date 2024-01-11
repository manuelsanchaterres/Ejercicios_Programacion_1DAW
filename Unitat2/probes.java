

import java.util.Scanner;

// Clase principal

public class probes { 

    public static void main(String[] args) {
		
		float numero1, numero2;
		Scanner input = new Scanner (System.in);
		System.out.print("Introdueixi Nombre 1: "); 
		numero1 = input.nextFloat();
		System.out.print("Introdueixi Nombre 2: "); 
		numero2 = input.nextFloat();

	
		System.out.println(numero1 > numero2 ? "Nombre 1: " + numero1 + " mayor que " +  " Nombre 2: " + numero2: (numero1 == numero2 ? "Nombre 1: " + numero1 + " igual que " +  " Nombre 2: " + numero2 :"Nombre 2:" + numero2 + " mayor que " +  " Nombre 1: " + numero1));
		
    }
	
}