package fr.dampierre.Exo_employe;

public class Employe {
    
    private String nom;
    private String prenom;
    private int age;
    private double salaire;

    Employe(String nom, String prenom, int age, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }


    void augmentation(double pourcent) {
        System.out.println(prenom + " " + nom + " a une augmentation de " + pourcent + " %.");
        pourcent = pourcent / 100 +1;
        salaire = salaire * pourcent;
    }   
    void description(){
    System.out.println(prenom + " " + nom + ", " + age +" ans " + "a un salaire de " + salaire);
    }
}
