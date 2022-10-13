package fr.dampierre.Tp3;

public class Motif4 {
    public static void main(String[] args) {
        String sortie = "1";
        for (int i = 1 ; i<= 6; i++){
            sortie =i +"";
            for (int x = 1 ; x <= i - 1; x++){
                sortie += i;
            }
        System.out.println(sortie);
        }
    }
}
