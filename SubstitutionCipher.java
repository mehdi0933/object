public class SubstitutionCipher {
    public static void main(String[] args) {
        /**
         * Alphabet Standard (Latin)
         */
        String latinAlphabet = "abcdefghijklmnopqrstuvwxyz";

        /**
         *  Alphabet de Substitution
         */
        String substitutionAlphabet = "ntrhwbgeyjzlsoaqdmcuvfpxik";

        /**
         *  Texte à chiffrer
         */
        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";
        boolean isEspece = true;
        boolean isendOfMessage = true;
        // Ecrivez le code ci-dessous

        for (int i = 0; i < textToEncrypt.length(); i++){

            for (int j = 0; j < latinAlphabet.length(); j++){
                char espace = ' ';
                char changeLetter = ' ';
                char exclamationMark ='!';

                if(textToEncrypt.charAt(i)  == latinAlphabet.charAt(j) ) {
                    changeLetter = textToEncrypt.charAt(i);
                    changeLetter = substitutionAlphabet.charAt(j) ;
                    System.out.print(changeLetter);
                    isEspece = true;
                }else if (textToEncrypt.charAt(i) == espace && isEspece ){
                    System.out.print(textToEncrypt.charAt(i));
                    isEspece = false;
                }else if (textToEncrypt.charAt(i) == exclamationMark && isendOfMessage){
                    System.out.print(exclamationMark);
                    isendOfMessage = false;
                }

            }
        }
    }
}
/*
    resustat de la console
    rw swccngw cwrmwu ow hayu qnc nmmyfwm woumw hw snvfnycwc snyoc !
 */