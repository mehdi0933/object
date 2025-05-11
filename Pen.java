package javacore.chapiter05.object.exercise;

public class Pen {

    String nom;
    String couleur;
    String frabicant;
    double prix;
    int quantite;
    int poids;

    public void displayInformation(){
        System.out.println("Nom: " + nom + "| Couleur: " + couleur +" | Prix: " + prix + "€" + " | Quantité:" + quantite + " | Fabricant:" + frabicant + " | Poids: " + poids);
    }
}
