public class SubstitutionCipher {
    public static void main(String[] args) {

        /**
         * Alphabet Standard (Latin)
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        /**
         * Alphabet de Substitution
         */
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";
        int iterations = 19;
        /**
         * Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        String textEncrypt = cipher(textToEncrypt, latinAlphabet, substitutionAlphabet, iterations);
        System.out.println("Texte chiffré   : " + textEncrypt);

        String decrypted = decipher(textEncrypt, latinAlphabet, substitutionAlphabet, iterations);
        System.out.println("Texte déchiffré : " + decrypted );

    }

    public static String cipher(String textToEncrypt, String latinAlphabet, String substitutionAlphabet, int iterations) {
        for (int J = 0; J < iterations; J++) {
            String currentEncryptedText = "";

            for (int i = 0; i < textToEncrypt.length(); i++) {
                if (latinAlphabet.indexOf(textToEncrypt.charAt(i)) != -1) {
                    currentEncryptedText = currentEncryptedText + substitutionAlphabet.charAt(latinAlphabet.indexOf(textToEncrypt.charAt(i)));
                } else {
                    currentEncryptedText = currentEncryptedText + textToEncrypt.charAt(i);
                }
            }

            textToEncrypt = currentEncryptedText;

        }

        return textToEncrypt;
    }

    public static String decipher(String textEncrypt, String latinAlphabet, String substitutionAlphabet, int iterations) {
        for (int J = 0; J < iterations; J++) {
            String currenDecryptedText = "";

            for (int i = 0; i < textEncrypt.length(); i++) {
                if (substitutionAlphabet.indexOf(textEncrypt.charAt(i)) != -1) {
                    currenDecryptedText = currenDecryptedText + latinAlphabet.charAt(substitutionAlphabet.indexOf(textEncrypt.charAt(i)));
                } else {
                    currenDecryptedText = currenDecryptedText + textEncrypt.charAt(i);
                }
            }

            textEncrypt = currenDecryptedText;

        }

        return textEncrypt;
    }
}


/**
 *     for (int J = 0; J < iterations; J++) {
 *         String currentEncryptedText = "";
 *
 *         for (int i = 0; i < textToEncrypt.length(); i++) {
 *             if (latinAlphabet.indexOf(textToEncrypt.charAt(i)) != -1) {
 *                 currentEncryptedText = currentEncryptedText + substitutionAlphabet.charAt(
 *                     latinAlphabet.indexOf(textToEncrypt.charAt(i))
 *                 );
 *             } else {
 *                 currentEncryptedText = currentEncryptedText + textToEncrypt.charAt(i);
 *             }
 *         }
 *         textToEncrypt = currentEncryptedText;
 *     }
 *     return textToEncrypt;
 */