package fr.dampierre.Tp_IMC;


public class Patient {
    private double poids;
    private double taille;
    private double IMC;

    Patient(double patient_poids,double patient_taille){
        poids = patient_poids;
        taille = patient_taille;
        IMC = 0;
        if(taille < 0 || poids <0){
            taille = 0;
            poids = 0;
        }
    }
    String calculerIMC(){
        if(taille == 0 || poids == 0){
            IMC = 0;
            return "" + IMC;
        } 
        return "" + poids / (taille*taille);
    }
    String caractéristiques(){
        return "Patient: " + poids + " kg pour " + taille + " m (IMC: " + calculerIMC() + " )";
    }
    
}
