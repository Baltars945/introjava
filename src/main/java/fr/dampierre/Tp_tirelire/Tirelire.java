package fr.dampierre.Tp_tirelire;

public class Tirelire {
  private double montant;

  Tirelire(){
    montant = 0;
  }
  Tirelire(double montant){
    this.montant = montant;
  }

  public double getMontant() {
      return montant;
  }
  void vider(){
    montant = 0;
  }
  String getCaractéristiques(){
    if(montant ==0){
      return "vous êtes sans sous";
    }
    return "vous avez " + montant + " euros dans la tirelire.";
  }
  void secouer(){
    if(montant > 0){
      System.out.println("gling gling !");
    }
  }
  void ajouter(double montant){
    if (montant > 0) {
      this.montant += montant;
    }
  }
  void sortir(double montant){
    if (montant > 0){
      this.montant -= montant;
      if (this.montant < 0){
        this.montant =0;
      }
    }
  }
  double soldeSiOnSort(double solde){
    return montant - solde;
  }
}
