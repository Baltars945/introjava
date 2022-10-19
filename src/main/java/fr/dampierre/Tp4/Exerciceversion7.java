package fr.dampierre.Tp4;
import java.util.Scanner;
public class Exerciceversion7 {
    public static void main(String[] args) {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("Donner le nombre de parties.");
        int nbpartie = Clavier.nextInt();
        for ( int i = 0; i < nbpartie ; i++) {
            boolean win = false;
            int nombre = 0 + (int) (Math.random() * 99);
            System.out.println("Je pense à un nombre et j'essaie de deviner sans tricher.");
            int tentatives = 0;
            while (win != true) {
                tentatives += 1;
                int joueur = 0 + (int) (Math.random() * 99);
                System.out.println("Je tente " + joueur);

                if (joueur < nombre) {
                    System.out.println("Trop petit !");
                } else if (joueur > nombre) {
                    System.out.println("Trop grand ! ");
                } else {
                System.out.println("gagné!");
                System.out.println("Il m'a fallu " + tentatives + " tentatives");
                win = true;
                }
            }
        }
    Clavier.close();
    }
}