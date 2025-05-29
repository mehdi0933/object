public class VowelCounter {
    public static void main(String[] args) {

        String sentenceLoremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String sentenceLoremIpsumAllLowerCase = sentenceLoremIpsum.toLowerCase();

        int[] countLetter = {0, 0, 0, 0, 0, 0};
        char[] Letter = {'a', 'e', 'i', 'o', 'u', 'y'};

        for (int index = 0; index < sentenceLoremIpsumAllLowerCase.length(); index++) {
            for (int analysisLetter = 0; analysisLetter < Letter.length; analysisLetter++) {
                if (sentenceLoremIpsumAllLowerCase.charAt(index) == Letter[analysisLetter]) {
                    countLetter[analysisLetter]++;
                }
            }
        }

// Affichage des résultats
        for (int i = 0; i < Letter.length; i++) {
            System.out.println("Il y a "+ countLetter[i] + " fois la lettre " +  Letter[i]+".");
        }
    }
}
/**
 * resultat de la console
 *
 * Il y a 29 fois la lettre A.
 * Il y a 38 fois la lettre E.
 * Il y a 42 fois la lettre I.
 * Il y a 29 fois la lettre O.
 * Il y a 29 fois la lettre U.
 * Il y a 0 fois la lettre Y.
 */