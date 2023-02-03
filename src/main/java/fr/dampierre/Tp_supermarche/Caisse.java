package fr.dampierre.Tp_supermarche;


public class Caisse {
    private int numéro;
    private double montant;

    Caisse(int numéro, double montant){
        this.numéro = numéro;
        this.montant = montant;
    }
    void scanner(Caddie caddie){
        System.out.println("=========================================\n27/01/23 \nCaisse numéro " + numéro +"\n");
        montant += caddie.montantcaddie();
        System.out.println("========================================= \n");
    }
    void totalCaisse(){
        System.out.println("La caisse numéro " + numéro + " a encaissé " + montant + " euros aujourd'hui");
    }
}
