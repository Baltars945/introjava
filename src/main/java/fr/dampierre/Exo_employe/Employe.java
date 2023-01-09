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
    public String getprenom() {
        return prenom;
    }
    public String getnom() {
        return nom;
    }
    public int getage() {
        return age;
    }
    public double getsalaire() {
        return salaire;
    }
    void augmentation(double pourcent) {
        pourcent = pourcent / 100 +1;
        salaire = salaire * pourcent;
    }   
}
