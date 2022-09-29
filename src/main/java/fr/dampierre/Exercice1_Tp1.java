package fr.dampierre;

public class Exercice1_Tp1 {
    public static void main(String[] args) {
       
        int heures = 12;

        int minutes = 34;

        int secondes = 56;
        
        int secDpminuit = heures * 3600 + minutes * 60 + secondes;

        System.out.println("le nombre de seconde depuis minuit est :" + secDpminuit);
    }
}
