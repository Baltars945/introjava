package fr.dampierre.Tp_supermarche;

public class Article {
    private String nom;
    private double prix;
    private boolean promotion;

    Article(String nom,double prix, boolean promotion){
        this.nom = nom;
        this.prix=prix;
        this.promotion = promotion;
    }
    public double getPrix() {
        return prix;
    }
    public String getNom() {
        return nom;
    }
    public boolean getPromotion() {
        return promotion;
    }
}
