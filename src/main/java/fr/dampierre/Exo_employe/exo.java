package fr.dampierre.Exo_employe;

public class exo{
public static void main(String[] args) {
    Employe employe1 = new Employe("lefebre", "Tibo", 2, 500);
    Employe employe2 = new Employe("lefebre", "Mathéo", 18, 500);
    System.out.println(employe1.getprenom() + " et " + employe2.getprenom() + " gagnent chacun " + employe1.getsalaire());
    System.out.println(employe2.getprenom() + " a une augmentation de 1 %, et " + employe2.getprenom() + " une augmentation de 20 %" );
    employe1.augmentation(1);
    employe2.augmentation(20);
    affichersalaire(employe1);
    affichersalaire(employe2);   
}
public static void affichersalaire(Employe employe){
    System.out.println(employe.getprenom() + "a un salaire de " + employe.getsalaire());
}
}
