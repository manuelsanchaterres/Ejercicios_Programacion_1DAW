/* Demanar a l’usuari un número entre l’1 i el 7. Mostrar el dia de la setmana corresponent. P.E: 1 -> dilluns, 6 -> dissabte */

import java.util.Scanner;
public class pruebas {
    
    public static void main(String[] args) {

		int nombre1 = 0, nombre2= 0; // declaración e inicialización de las variables
        Scanner input = new Scanner(System.in);
		System.out.print("Introduzca número 1: "); //MOSTRAMOS POR PANTALLA Y CAPTURAMOS INPUT PARA NOMBRE1
		nombre1 = input.nextInt();
		System.out.print("Introduzca número 2: "); //MOSTRAMOS POR PANTALLA Y CAPTURAMOS INPUT PARA NOMBRE2
		nombre2 = input.nextInt();
		// COMO EL ENUNCIADO NO LO ESPECIFICA, SUPONEMOS QUE NO ES NECESARIA VALIDACIÓN DE INPUT YA QUE EL USUARIO
		// INTRODUCE VALORES CORRECTOS PARA CADA VARIABLE.


		int menor = nombre1 < nombre2 ? nombre1 : nombre2;

		// ESTRUCTURA DE CONTROL FOR ANIDADO PARA RECORRER VALORES DESDE MENOR A 1

		for (int i= menor; i >=1; i--) { // RECORREMOS CADA VALOR DE MENOR A 1

			if (nombre1 % i == 0 && nombre2 % i == 0) {

				System.out.println("mcd de " + nombre1 + " y " + nombre2 + " es igual a: " + i);

				break; // INTRODUCIMOS UN BREAK PARA QUE A LA PRIMERA COINCIDENCIA LA EJECUCIÓN DEL PROGRAMA SALGA DEL BUCLE FOR
			}

		}
    }   
}
