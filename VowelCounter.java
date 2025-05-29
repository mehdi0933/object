public class VowelCounter {
    public static void main(String[] args) {

        String sentenceLoremIpsum ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String  sentenceLoremIpsumAllLowerCase = sentenceLoremIpsum.toLowerCase();

        char letterA = 'a';
        char letterE = 'e';
        char letterI = 'i';
        char letterO = 'o';
        char letterU = 'u';
        char letterY = 'y';

        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        int counterY = 0;


        for (int index = 0; index < sentenceLoremIpsumAllLowerCase.length(); index++) {
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterA){
                counterA++;
            }
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterE){
                counterE++;
            }
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterI){
                counterI++;
            }
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterO){
                counterO++;
            }
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterU){
                counterU++;
            }
            if(sentenceLoremIpsumAllLowerCase.charAt(index) == letterY){
                counterY++;
            }

        }
        System.out.println("il y a " + counterA + " fois la lettre A");
        System.out.println("il y a " + counterE + " fois la lettre E");
        System.out.println("il y a " + counterI + " fois la lettre I");
        System.out.println("il y a " + counterO + " fois la lettre O");
        System.out.println("il y a " + counterU + " fois la lettre U");
        System.out.println("il y a " + counterY + " fois la lettre Y");
    }
}
