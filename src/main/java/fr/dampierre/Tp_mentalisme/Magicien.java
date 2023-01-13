package fr.dampierre.Tp_mentalisme;

public class Magicien {
    private int trmagic;

    Magicien(int trmagic){
        this.trmagic = trmagic;
    }
    void magie(){
        trmagic += 115;
        int age = trmagic/100;
        int argent = trmagic - age*100;

    System.out.println(age);
    System.out.println(argent);
    }
}
