public class LibraryBook {
   String  titre;
   String  auteur;
   int     anneePublication;
   int     numeroISBN;
   boolean disponible;

   public void livreInformation(){
       System.out.println("titre du livre: "+titre+" |auteur est " +auteur+ " | l'annee de publication est :"+anneePublication+" | numéro ISBN :  "+ numeroISBN+" | le livre est disponible: " + disponible);
   }
}



