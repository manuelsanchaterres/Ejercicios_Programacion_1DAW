package catKata;

import java.util.ArrayList;

public class catKata {
    
    public static void main(String[] args) {
        
        // String[] yard = {"------------", "------------", "-L----------", "------------", "------------", "------------"};
        // String[] yard = {"------------", "---M--------", "------------", "------------", "-------R----", "------------"};
        // String[] yard = {"-----------L", "--R---------", "------------", "------------", "------------", "--M---------"};
        String[] yard = {"-----------L", "--R---------", "------M-----", "------------", "------------", "--M---------"};

        int minDistance = 10;

        // System.out.println(peacefulYard(yard, minDistance) == true ? "Cats are Safely Distanced on Yard": "Cats are NOT Safely Distanced on Yard");
        System.out.println(peacefulYard(yard, minDistance));
    }

    public static String peacefulYard(String[] yard, int minDistance) {

        int numberCats = findCatsCoordinates(yard).size();
        String safelyDistanced = "";
        
        switch (numberCats) {
            case 0,1:
                safelyDistanced = "0 o 1 Gato Encontrados";
            break;
            case 2:
                safelyDistanced = "2 Gatos Encontrados";
            break;            
            case 3:
                safelyDistanced = "3 Gatos Encontrados";
            break;                  
            default:

                safelyDistanced = "Sólo Se pueden Encontrar 3 Gatos";

            break;
        }
        return safelyDistanced;
    }

    public static ArrayList<Integer[]> findCatsCoordinates(String[] yard) {
        
        ArrayList<Integer[]> catsLocation = new ArrayList<>();

        for (int i = 0; i < yard.length; i++) {

            String[] newCharArray = yard[i].split("");

            for (int j = 0; j < newCharArray.length; j++) {
                
                if (newCharArray[j].matches(".*[LMR].*")){

                    Integer[] location = {i,j};
                    catsLocation.add(location);
                }
            }

        }


        return catsLocation;
    }
}
