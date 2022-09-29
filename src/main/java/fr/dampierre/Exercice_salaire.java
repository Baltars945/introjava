package fr.dampierre;

import java.util.Scanner;

public class Exercice_salaire {
    public static void main(String[] args) {
        
        int salaire = 400; 

        Scanner clavier = new Scanner(System.in);
        System.out.println("enterz le nombre de ventes de la semaine:");
        int nbVenteSemaine = clavier.nextInt();
        clavier.close();
        
        if (nbVenteSemaine >= 10) {
        salaire = salaire + 250;
    }
    System.out.println("le salaire pour la semaine est de :" + salaire);
}
}
