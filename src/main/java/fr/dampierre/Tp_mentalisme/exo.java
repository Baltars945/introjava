package fr.dampierre.Tp_mentalisme;


public class exo {
    public static void main(String[] args) {
    Spectateur spectateur =  new Spectateur();
    spectateur.recuillirinfo();
    Papier papier = new Papier(spectateur.getAge(),spectateur.getArgent());
    Assistant assistant = new Assistant(papier.getAge(), papier.getArgent());
    assistant.magic(assistant.getAge(),assistant.getArgent());
    Magicien magicien = new Magicien(assistant.getTrmagic());
    magicien.magie(); 
}
}