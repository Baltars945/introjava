package fr.dampierre;

import java.util.Scanner;


public class exo_quota_2 {
    public static void main(String[] args) {

        int quota = 10;

        Scanner clavier = new Scanner(System.in);
        System.out.println("donner le nombre de vente sur la semaine");
        int nbVenteSemaine = clavier.nextInt();

        clavier.close();

        if (nbVenteSemaine >= quota) {
            System.out.println("Félicitations! Vous avez rempli le quota.");
        }else{
        int nbventemanquant = quota -nbVenteSemaine;
        System.out.println("Il vous manque " + nbventemanquant + " ventes pour atteindre le quota.");
        }
    }
}
