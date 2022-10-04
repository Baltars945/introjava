package fr.dampierre;
import java.util.Scanner;
public class Exercice1_Tp2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer un nombre :");
        int Nombre = clavier.nextInt();

        clavier.close();
        int parité = Nombre % 2;
        //pas finit 
    }
    
}
