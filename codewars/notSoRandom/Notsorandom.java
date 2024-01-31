package notSoRandom;

import java.util.HashMap;
import java.util.Map;

class Notsorandom {

    public static void main(String[] args) {
        notSoRandom(1, 1);
    }

    static String notSoRandom(int b, int w){

        HashMap<String, Integer> magicHat = new HashMap<>();
        magicHat.put("Black", b);
        magicHat.put("White", w);
        String marble1, marble2;
        
        while (/*condition*/) {
            
            marble1 = pickedMurbleFromMagicHat(magicHat);
            // magicHat = removeMurbleFromMagicHat(magicHat, marble1);
            marble2 = pickedMurbleFromMagicHat(magicHat);
            // magicHat = removeMurbleFromMagicHat(magicHat, marble1);
        }
        

        return "jakjgakgka";
    }

    static String pickedMurbleFromMagicHat(HashMap<String, Integer> magicHat){

        // we compute random index value of Hashmap magicHat

        int randomMurbleIndex = (int) Math.floor(Math.random()*magicHat.size());
        Object[] murbleOptions = magicHat.keySet().toArray();
        String pickedMurble = murbleOptions[randomMurbleIndex].toString();

        return pickedMurble;
    }
}
