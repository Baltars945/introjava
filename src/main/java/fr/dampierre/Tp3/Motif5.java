package fr.dampierre.Tp3;

public class Motif5 {
    public static void main(String[] args) {
        String sortie = "";
        for (int i = 5 ; i <= 0; i--){
            for (int x = 1; x <= i; x++){
                sortie += " ";
                
            }
            sortie += i + "";
        }
        System.out.println(sortie);
    }
}
