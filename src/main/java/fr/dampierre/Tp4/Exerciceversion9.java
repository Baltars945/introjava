package fr.dampierre.Tp4;
import java.security.Principal;
import java.util.Random;
import java.util.Scanner;
public class Exerciceversion9 {
    public static void main(String[] args) {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("Donner le nombre de parties.");
        int nbpartie = Clavier.nextInt();
        int tentatives = 0;
        float moyenne = 0;
        for ( int i = 0; i < nbpartie ; i++) {
            int nombrealéatoire = 0 + (int) (Math.random() * 99);
            boolean win = false;
            int joueur = 0 + (int) (Math.random() * 99);
            while (win != true) {
                tentatives += 1;
                int min = 0;
                int max = 99;
                if (joueur ==  nombrealéatoire) {
                    win = true;
                } else if(nombrealéatoire < joueur) {
                    max = joueur;
                    joueur = min + (int) (Math.random() * (max-min));
                } else {
                    min =joueur;
                    joueur = min +(int) (Math.random() * (max-min));
                }
            }
        }
        moyenne = tentatives / nbpartie;
        System.out.println("En moyenne, sur " + nbpartie + " parties, il m'a fallu en moyenne : " + moyenne);
}
}