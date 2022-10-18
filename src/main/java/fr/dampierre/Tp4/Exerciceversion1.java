package fr.dampierre.Tp4;
import java.util.Scanner;

public class Exerciceversion1 {
    public static void main(String[] args) {
        
    Scanner Clavier = new Scanner(System.in);
    int nombre = 0 + (int) (Math.random() * 99);

    System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
    System.out.println("Entrez un nombre :") ;
    int joueur = Clavier.nextInt();
    System.out.println("Vous proposez :" + joueur);
    System.out.println("Le nombre auquel je pensais était :" + nombre);
    if (joueur != nombre) {
        System.out.println("Vous étiez à " + (nombre-joueur) + " de la bonne réponse.");
    }
    Clavier.close();
    }
}
