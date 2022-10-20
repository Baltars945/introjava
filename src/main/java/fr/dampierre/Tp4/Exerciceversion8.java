package fr.dampierre.Tp4;
import java.util.Scanner;
public class Exerciceversion8 {
    
    public static void main(String[] args) {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("Donner le nombre de parties.");
        float moyenne = 0;
        int nbpartie = Clavier.nextInt();
        int nbtentative = 0;
        int jeu = 1;
        for ( int i = 0; i < nbpartie ; i++) {
            System.out.print(jeu + " - ");
            boolean win = false;
            int nombre = 0 + (int) (Math.random() * 99);
            int tentatives = 0;
            while (win != true) {
                tentatives += 1;
                int joueur = 0 + (int) (Math.random() * 99);
                if (joueur == nombre) {
                    System.out.print("["+joueur+"]");
                    nbtentative += tentatives;
                    win = true;
                } else {
                System.out.print(joueur + " ");
                }
            }
            jeu += 1;
            System.out.println(" ");
        }
    Clavier.close();
    moyenne = nbtentative / jeu;
    System.out.println("En moyenne, sur " + nbpartie + " parties il m'a fallu " + moyenne + " tentatives.");
}
}

