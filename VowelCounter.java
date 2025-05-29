import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        int[] countLetter = {0, 0, 0, 0, 0, 0};
        char[] Letter = {'a', 'e', 'i', 'o', 'u', 'y'};

        String userChoice = "".toLowerCase();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Souhaitez-vous entrer votre propre texte ? (o/n) : ");
        String choix = scanner.nextLine();

        if (choix.equalsIgnoreCase("o")) {
            System.out.print("Veuillez entrer votre texte : ");
            userChoice = scanner.nextLine();
        }

        for (int i = 0; i < Letter.length; i++) {
            int index =userChoice.indexOf(Letter[i]);
            while (index != -1) {
                countLetter[i]++;
                index = userChoice.indexOf(Letter[i], index + 1);
            }
        }

        for (int i = 0; i < Letter.length; i++) {
            System.out.println("Il y a " + countLetter[i] + " fois la lettre " + Letter[i] + ".");
        }

        scanner.close();
    }
}
