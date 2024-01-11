/* Demanar a l’usuari un número entre l’1 i el 7. Mostrar el dia de la setmana corresponent. P.E: 1 -> dilluns, 6 -> dissabte */

import java.util.Scanner;
public class pruebas_soluciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hores:");
        int hores = sc.nextInt();
        System.out.println("Minuts:");
        int minuts = sc.nextInt();
        System.out.println("Segons:");
        int segons = sc.nextInt();
        System.out.println("Quants segons s'ha d'adelantar el rellotge:");
        int increment = sc.nextInt();
        
        for (int i = 1; i <= increment; i++) {
            segons++;
            if (segons==60) {
            segons = 0;
            minuts++;
                if(minuts==60) {
                minuts=0;
                hores++;
                    if (hores==24) {
                    hores=0;
                    }
                }
            }
        }
        
          System.out.println(hores + ":" + minuts + ":" + segons);
    }   
}
