package fr.dampierre.Tp_supermarche;

import java.util.ArrayList;

public class Caddie {
    private ArrayList<Integer> nbarticle = new ArrayList<>();
    private ArrayList<Article> tab = new ArrayList<>();

    void remplir(Article article,int nbarticle){
        this.nbarticle.add(nbarticle);
        tab.add(article);
    }
    
    public ArrayList<Article> getTab() {
        return tab;
    }
    public ArrayList<Integer> getNbarticle() {
        return nbarticle;
    }

    double montantcaddie(){
        double montant = 0;
        for (int i = 0; i < nbarticle.size(); i++){
            if (tab.get(i).getPromotion() == true){
                montant += (tab.get(i).getPrix() * nbarticle.get(i)) / 2;
                System.out.println(tab.get(i).getNom() + " : " + tab.get(i).getPrix() + " x " + nbarticle.get(i) + " = " + nbarticle.get(i) * tab.get(i).getPrix() + " euros (remise 50 %) => " + (nbarticle.get(i) * tab.get(i).getPrix()) / 2 + " euros");
            } else{
                montant += (tab.get(i).getPrix() * nbarticle.get(i));
                System.out.println(tab.get(i).getNom() + " : " + tab.get(i).getPrix() + " x " + nbarticle.get(i) + " = " + (tab.get(i).getPrix() * nbarticle.get(i)) + " euros ");
            }
        }
        System.out.println("Montant à payer : " + montant + " euros \n");
        return montant;
    }
}
