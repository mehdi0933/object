public class AlphabetVowelSearcher {
    public static void main(String[] args) {

        String alphabet = "aaabcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";
        int c =0;
        // Ecrivez le code ci-dessous

        for (int i = 0; i < alphabet.length(); i++ ){
            int test = 0;
            for (int j = 0; j < vowels.length(); j++ ){
                if(vowels.charAt(j) == alphabet.charAt(i))
                    System.out.println(c++ +" "+ vowels.charAt(j) +" "+ alphabet.charAt(i) );
                    //System.out.println(alphabet.charAt(i) + " " + i);
            }
        }

        int letterIndexA = alphabet.indexOf('a');
        int letterIndexE = alphabet.indexOf('e');
        int letterIndexI = alphabet.indexOf('i');
        int letterIndexO = alphabet.indexOf('o');
        int letterIndexU = alphabet.indexOf('u');
        int letterIndexY = alphabet.indexOf('y');

      //  System.out.println("Les index des les lettres :"+letterIndexA+"A "+letterIndexE+"E "+letterIndexI+"I "+" "+letterIndexO+"O "+letterIndexU+"U "+letterIndexY+"Y");
    }
}
/**
 * resultat de la console
 *
 * Les index des les lettres :0A 4E 8I  14O 20U 24Y
 */