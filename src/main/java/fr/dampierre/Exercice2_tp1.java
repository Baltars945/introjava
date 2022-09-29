package fr.dampierre;
import java.util.Scanner;

public class Exercice2_tp1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrer l'heure:");
        int heure = clavier.nextInt();

        System.out.print("entrer les minutes:");
        int minutes = clavier.nextInt();

        System.out.print("entrer les secondes:");
        int secondes = clavier.nextInt();

        clavier.close();
        int secDpminuit = heure * 3600 + minutes * 60 + secondes;
        System.out.print("Le nombre de secondes depuis minuit est:" + secDpminuit);
    }
}
