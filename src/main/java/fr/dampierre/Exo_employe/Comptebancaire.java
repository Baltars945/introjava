package fr.dampierre.Exo_employe;

public class Comptebancaire {
    private String propriétaire;
    private double solde;
    
    Comptebancaire(String propriétaire, double solde) {
        this.propriétaire = propriétaire;
        this.solde = solde;
    }
    void afficherinfo(){
        System.out.println("Le compte de " + propriétaire + " a comme solde " + solde);
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
