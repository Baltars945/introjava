package fr.dampierre.Exo_employe;

public class Comptebancaire {
    private String proprietaire;
    private double solde;
    
    Comptebancaire(String proprietaire, double solde) {
        this.proprietaire = proprietaire;
        this.solde = solde;
    }
    void afficherinfo(){
        System.out.println("Propriétaire: " + proprietaire + "\n" +"Solde: " + solde + "\n");
    }
    void deposer(double argent) {
        solde += argent;
    }
    void retirer(double argent) {
        if (solde - argent < 0) {
            System.out.println("Vous n'avez pas assez de fonds.");
        } else{
            solde -= argent;
        }
    }
}
