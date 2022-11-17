package fr.dampierre.Tp4;
import java.util.Random;
import java.util.Scanner;
public class Exerciceversion9 {
    public static void main(String[] args) {
        Random random = new Random();
        double moyenne = 0;
        int nbParties = 100000000;
        int nbtentatives = 0;
        for (int i = 1; i< nbParties; i++){
            int nombre = random.nextInt(100) + 1;
            int joueur = 0;
            int max = 100;
            int min = 1;
            int tentatives = 0;
            boolean win = false;
            while (win == false) {
                tentatives += 1;
                joueur =  (min + max) / 2;
                if (joueur == nombre) {
                    win = true;
                    nbtentatives += tentatives;
                } else if (joueur > nombre) {
                    max = joueur - 1;
                } else {
                    min = joueur + 1;
                }
        }}
        moyenne = nbtentatives / nbParties;
        System.out.println("En moyenne, sur 10000 parties, il m'a fallu " + moyenne + " tentatives.");
    }
}
    