package fr.dampierre.Tp4;
import java.util.Scanner;
public class Exerciceversion9 {
    public static void main(String[] args) {
        try (Scanner Clavier = new Scanner(System.in)) {
            System.out.println("Donner le nombre de parties.");
            int nbpartie = Clavier.nextInt();
            int tentatives = 0;
            float moyenne = 0;
            for ( int i = 0; i < nbpartie ; i++) {
                int nombrealéatoire = 0 + (int) (Math.random() * 99);
                int joueur = 0 + (int) (Math.random() * 99);
                tentatives = tentatives + jeu(nombrealéatoire,joueur);    
            }
            moyenne = tentatives / nbpartie;
            System.out.println("En moyenne, sur " + nbpartie + " parties, il m'a fallu en moyenne : " + moyenne);
        }
}
    public static int jeu(int nombrealéatoire,int joueur){
        boolean win = false;    
        int min = 0;
        int max = 99;
        int tentatives = 0;
        while (win != true) {
            tentatives += 1;
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
    return tentatives;
    }
}