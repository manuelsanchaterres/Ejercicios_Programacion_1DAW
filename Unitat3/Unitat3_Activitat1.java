
/*Dissenyar una aplicació que mostri, per cada nombre introduït, si es parell, positiu i el seu quadrat. 
El procés s'ha de repetir fins que l'usuari introdueixi el nombre 0*/

import java.util.Scanner;

public class Unitat3_Activitat1 {

    public static void main(String[] args) {

        float nombre ;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi un nombre: ");

        nombre = input.nextFloat();

        while (nombre != 0) {
            
            System.out.println((nombre % 2) == 0 ?  nombre + " es parell" : nombre + " es senar");

            System.out.println(nombre > 0 ? nombre + " es positiu" : nombre + " es negatiu");

            System.out.println("El quadrat de " + nombre + " es igual a " + Math.pow(nombre, 2));

            System.out.print("Introdueixi un nombre: ");

            nombre = input.nextFloat();

        }

        System.out.print("Nombre es igual a 0 ");
        System.exit(0);
        
    }
}
