/* Fes dues funcions per a calcular les capacitats dels camions. 
Els camions poden ser cisterna (cilíndrics) o tipus caixa (prisma rectangular). Per tant:
- Defineix la funció volumCilindre que rebrà com a paràmetres el radi i la longitud (sempre positius) 
del dipòsit en centímetres i retornarà el volum en centímetres cúbics. V=·r2·l
- Defineix la funció volumPrismaRectangular que rebrà com a paràmetres les mides de les arestes 
en centímetres (positius) i retornarà el volum en centímetres cúbics. V=costat1 · costat2 · costat3
 */

import java.util.Scanner;

public class exercici_8 {

    public static void main(String[] args) {  

        int opcioTipusMaterial;
        double volumTransportar;
        double volumCamioCentimetres, volumCamioMetres;
        Scanner input = new Scanner(System.in);
        System.out.print("Què has de transportar? 1. Líquids 2. Sòlids ");
        opcioTipusMaterial = input.nextInt();

        while (opcioTipusMaterial != 1 && opcioTipusMaterial != 2) {

            System.out.print("No és una opció vàlida.");
            System.out.print("Què has de transportar? 1. Líquids 2. Sòlids ");
            opcioTipusMaterial = input.nextInt();

        }

        switch (opcioTipusMaterial) {

            case 1:

                System.out.print("Quants centímetres de radi té la cisterna? ");
                double radi = input.nextDouble();
                System.out.print("Quants centímetres de longitud té la cisterna? ");
                double longitud = input.nextDouble();
                System.out.print("Quants metres cúbics hem de transportar? ");
                volumTransportar = input.nextDouble();
                volumCamioCentimetres = volumCilindre(radi, longitud);
                System.out.println("El camió té capacitat per " + volumCamioCentimetres + " centímetres cúbics.");
                volumCamioMetres = volumCamioCentimetres/Math.pow(10, 6);
                System.out.println("Hi caben " + Math.round(volumCamioMetres * 100.0) /100.0 + " metres cúbics.");
                System.out.println("Has de fer " + Math.round(((int)(volumTransportar/volumCamioMetres)) + 1) + " viatges.");
                break;
        
            case 2:
                
                System.out.print("Quants centímetres d'ample té la caixa? ");
                double costat1 = input.nextDouble();
                System.out.print("Quants centímetres de longitud té la caixa? ");
                double costat2 = input.nextDouble();
                System.out.print("Quants centímetres d'alçada té la caixa? ");
                double costat3 = input.nextDouble();
                System.out.print("Quants metres cúbics hem de transportar? ");
                volumTransportar = input.nextDouble();
                volumCamioCentimetres = volumPrismaRectangular(costat1, costat2, costat3);
                System.out.println("El camió té capacitat per " + volumCamioCentimetres + " centímetres cúbics.");
                volumCamioMetres = volumCamioCentimetres/Math.pow(10, 6);
                System.out.println("Hi caben " + Math.round(volumCamioMetres * 100.0) /100.0 + " metres cúbics.");
                System.out.println("Has de fer " + Math.round(((int)(volumTransportar/volumCamioMetres)) + 1) + " viatges.");
                
                break;

        }


    }

    static double volumCilindre (double radi, double longitud) {

        double volumCilindre = Math.PI*Math.pow(radi, 2)*longitud;
        return volumCilindre;
    }

    static double volumPrismaRectangular  (double costat1, double costat2, double costat3) {

        double volumPrismaRectangular = costat1*costat2*costat3;
        return volumPrismaRectangular;
    }
}
