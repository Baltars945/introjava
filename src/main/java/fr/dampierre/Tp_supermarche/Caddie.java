package fr.dampierre.Tp_supermarche;

import java.util.ArrayList;

public class Caddie {
    private int nbarticle;  
    private ArrayList tab = new ArrayList<>();

    void remplir(Article article,int nbarticle){
        this.nbarticle = nbarticle;
        tab.add(nbarticle, article);
    }
}