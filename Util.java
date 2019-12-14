import java.util.*;

public class Util {
    public static String removeZerosEsquerda(String palavra) {
        if(palavra.equals("")) {
            return "";
        }
        while(palavra.length()!=0 && palavra.substring(0, 1).equals("0")) {
            palavra = palavra.substring(1, palavra.length());
        }
        return palavra;
    }
}
