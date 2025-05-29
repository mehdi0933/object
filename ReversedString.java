public class ReversedString {
    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";
        int textLength = text.length();
        // Ecrivez le code ci-dessous

        for (int i = 0; i < text.length(); i++  ){
            System.out.print(text.charAt(textLength -i -1));
        }

    }
}
/**
 *
 * resultat de la console
 * Bravo, vous avez réussi l'exercice !
 */