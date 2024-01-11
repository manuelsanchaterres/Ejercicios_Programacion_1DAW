
/* Escriure tots els múltiples de 7 menors que 100 */


public class Unitat3_Activitat5 {

    public static void main(String[] args) {

        int multiplo, resultado=0;

            
        for(multiplo = 1; resultado < 100; multiplo++){

            resultado = 7 * multiplo;

            if (resultado < 100) {

                System.out.println(resultado);
            }
            
        }

    }
}
