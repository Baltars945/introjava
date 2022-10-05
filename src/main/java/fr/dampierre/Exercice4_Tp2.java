package fr.dampierre;
import java.util.Scanner;
public class Exercice4_Tp2 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quelle couleur souhaitez-vous ? :");
        String couleur = clavier.nextLine();
        System.out.println(couleur);
        clavier.close();
        if (couleur.equals("r") || couleur.equals ("R")) {
            System.out.println("Vous avez choisi le rouge. ");
        } else if (couleur.equals ("b") || couleur.equals ("B")) {
            System.out.println("Vous avez choisi le bleu. ");
        } else if (couleur.equals("v") || couleur.equals("V")) {
            System.out.println("Vous avez choisi le vert. ");
        } else {
            System.out.println("Connais pas.");
        }
    }

}
