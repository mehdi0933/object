package javacore.chapter05.object.exercise;

public class LogAnalyzer {
    public static void main(String[] args) {
        String serverLogs = """
            [2025-05-29 12:01:34.123456] [APPLICATION] [JavaCoreApp] [INFO] : Démarrage de l'application.
            [2025-05-29 12:01:35.123456] [APPLICATION] [JavaCoreApp] [ERROR] : Code erreur : 502 - Impossible de charger le fichier utilisateur.
            [2025-05-29 12:01:36.123456] [SERVICE] [AuthService] [INFO] : Authentification réussie.
            [2025-05-29 12:01:37.123456] [APPLICATION] [JavaCoreApp] [ERROR] : Code erreur : 504 - Timeout pendant le téléchargement.
            [2025-05-29 12:01:38.123456] [APPLICATION] [AnotherApp] [ERROR] : Code erreur : 500 - Problème inconnu.
            [2025-05-29 12:01:39.123456] [APPLICATION] [JavaCoreApp] [INFO] : Fichier traité avec succès.
        """;

        String[] lignes = serverLogs.split("\n");
        int nbErreurs = 0;

        for (int i = 0; i < lignes.length; i++) {
            String ligne = lignes[i];
            if (ligne.contains("JavaCoreApp") && ligne.contains("ERROR")) {
                if (ligne.contains("Code erreur :")) {
                    String[] javaCoreAppLinge = ligne.split("Code erreur :");
                    String lingeCodeError = javaCoreAppLinge[1];
                    String[] code = lingeCodeError.split(" ");
                    String codeErreur = code[1];
                    System.out.println("Code d'erreur trouvé : " + codeErreur);
                    nbErreurs++;

                }
            }
        }
        System.out.println("il y a " + nbErreurs + " errurs");

    }
}

/**
 * sortie de console
 *
 * Code d'erreur trouvé : 502
 * Code d'erreur trouvé : 504
 * il y a 2 errurs
 */
