package regexBasicsHexadecimalNumber;

import java.util.regex.Pattern;

public class Regexbasicshexadecimalnumber {
    
    public static void main(String[] args) {
        
        // isHexNumber("0xB90AFC9879");
        // isHexNumber("2");
        isHexNumber("");
        // isHexNumber("0x");
    }

    public static boolean isHexNumber(String s) {
        // your code goes here

        if (s.equals("")) return false;
        
        return Pattern.matches("(^(0x|[0-9A-Fa-f])[0-9A-Fa-f]+)||[0-9A-Fa-f]", s);
    }
}
