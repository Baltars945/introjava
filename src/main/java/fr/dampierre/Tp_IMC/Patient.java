package fr.dampierre.Tp_IMC;


public class Patient {
    private double poids;
    private double taille;
    private double IMC;

    Patient(double poids,double taille){
        this.poids = poids;
        this.taille = taille;
        IMC = 0;
    }
    String calculerIMC(){
        if(taille == 0){
            IMC = 0;
            return "" + IMC;
        } 
        return "" + poids / (taille*taille);
    }
    String caractéristiques(){
        return "Patient: " + poids + " kg pour " + taille + " m (IMC: " + calculerIMC() + " )";
    }
    
}
