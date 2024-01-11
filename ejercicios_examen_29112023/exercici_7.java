/* Fes dues funcions per a calcular les capacitats dels camions. 
Els camions poden ser cisterna (cilíndrics) o tipus caixa (prisma rectangular). Per tant:
- Defineix la funció volumCilindre que rebrà com a paràmetres el radi i la longitud (sempre positius) 
del dipòsit en centímetres i retornarà el volum en centímetres cúbics. V=·r2·l
- Defineix la funció volumPrismaRectangular que rebrà com a paràmetres les mides de les arestes 
en centímetres (positius) i retornarà el volum en centímetres cúbics. V=costat1 · costat2 · costat3
 */

public class exercici_7 {

    public static void main(String[] args) {  

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
