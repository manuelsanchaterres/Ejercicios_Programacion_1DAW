package scramblies;

import java.util.HashMap;
import java.util.Map;


public class Scramblies {
    public static void main(String[] args) {
        scramble("katas", "steak");
    }
    public static boolean scramble(String str1, String str2) {

        System.out.println(str1 + ", " + str2);
        char[] str2CharArray = str2.toCharArray();
        boolean stringMatch = false;

        HashMap<Integer,Character> mapStr1 = new HashMap<>();

        for (int i = 0; i < str1.toCharArray().length; i++) {
           
            mapStr1.put(i, str1.toCharArray()[i]);
        }

        for (char str2Char : str2CharArray) {
            stringMatch = false;
            for (Map.Entry<Integer, Character> entry : mapStr1.entrySet()) {
                
                if (entry.getValue().equals(str2Char)){

                    mapStr1.remove(entry.getKey());
                    stringMatch = true;
                    break;
                }
            }

            if (!stringMatch){

                return stringMatch;
            }

        }

        return stringMatch;
    }
}
