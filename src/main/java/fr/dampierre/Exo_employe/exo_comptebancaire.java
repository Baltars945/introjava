package fr.dampierre.Exo_employe;

public class exo_comptebancaire {
    
    public static void main(String[]args){
        Comptebancaire compte1 = new Comptebancaire("Mathéo", 1000);
        compte1.retirer(600);
        compte1.deposer(150);
        compte1.afficherinfo();
        compte1.retirer(600);
        compte1.afficherinfo();
    }
}
