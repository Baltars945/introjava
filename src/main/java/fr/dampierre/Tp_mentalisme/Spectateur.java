package fr.dampierre.Tp_mentalisme;

import java.util.Scanner;

public class Spectateur {
    private int age;
    private int argent;

    void recuillirinfo(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("[Spectateur] J'entre mon âge :");
        age = clavier.nextInt();
        do {
            System.out.print("[Spectateur] J'entre la somme d'argent que j'ai en poche (max 99) :");
            argent = clavier.nextInt();
        } while(argent > 99);
        clavier.close();
    }

    public int getAge() {
        return age;
    }
    public int getArgent() {
        return argent;
    }
}
