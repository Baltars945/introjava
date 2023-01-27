package main.java.fr.dampierre.Tp_IMC;

public class Patient {
    private double poids;
    private double taille;
    private double IMC;

    Patient(double poids,double taille){
        this.poids = poids;
        this.taille = taille;
    }
    calculerIMC(){
        if(taille == 0){
            IMC = 0;
            return IMC;
        }
        IMC = poids / taille;
        return IMC;
    }
    caractéristiques(){
        if(IMC = 0){
            calculerIMC();
            return "Patient: " + poids + " kg pour " + taille + " m (IMC: " + IMC + " )";
        }
        return "Patient: " + poids + " kg pour " + taille + " m (IMC: " + IMC + " )";
    }
    
}
