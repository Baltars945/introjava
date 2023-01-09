package fr.dampierre.Exo_employe;

public class exo{
public static void main(String[] args) {
    Employe employe1 = new Employe("lefebre", "Tibo", 2, 500);
    Employe employe2 = new Employe("lefebre", "Mathéo", 18, 500);
    affichersalaire(employe1);
    affichersalaire(employe2);
    employe1.augmentation(1);
    employe2.augmentation(20);
    affichersalaire(employe1);
    affichersalaire(employe2);   
}
public static void affichersalaire(Employe employe){
    employe.description();
}
}
