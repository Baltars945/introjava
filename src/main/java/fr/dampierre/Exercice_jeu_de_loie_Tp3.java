package fr.dampierre;
import java.util.Random;

public class Exercice_jeu_de_loie_Tp3 {
    public static void main(String[] args) {
    int win = 0;
    while (win != 1){ 
        
        int valeur = 0;
        for (int i=0; i < 5 ; i++) {
        Random generateur = new Random();
        int lancer = generateur.nextInt(6) + 1;
        System.out.println("vous êtes à la case " + lancer);
        valeur = valeur + lancer;
    }
    if (valeur == 20) {
        System.out.println("Vous avez gagné !");
        win = 1; 
    }  else {
        System.out.println("Vous avez perdu !");
    }
    }}
}
