/*Demanar dia, mes i any d’una data. Comprovar si la data és correcta i vàlida. S’ha de tenir en compte que l’any 0 no existeix, 
i que existeixen mesos amb 28, 30 i 31 dies. No es consideren els anys bixestos. */

import java.util.Scanner;

public class Unitat2_Activitat8_Refactorizado {
    
    public static void main(String[] args) {
        
        int dia, mes, any;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca dia: ");
        dia = input.nextInt();

        System.out.print("Introduzca mes: ");
        mes = input.nextInt();

        System.out.print("Introduzca any: ");
        any = input.nextInt();

        /*El any tiene que ser mayor a 0, dia menor a 31 y mes entre 1 y 12 ambos incluídos  */

       if (any > 0 && (dia >= 1 && dia <= 31) && (mes >= 1 || mes <= 12)) {

            if ((dia > 28) && (mes == 2)) {


                System.out.println("Febrero no puede tener más de 28 días");

            } else if (dia == 30) {
                
            } else {

                System.out.println("LINEA_32 " + "Dia: " + dia + " Mes: " + mes + " Any: " + any);

            }

       } else {

            System.out.print("Any debe ser mayor a 0, dia menor o igual a 31 y mes entre 1 y 12 ambos incluídos");

       }

    }
}
