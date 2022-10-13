package fr.dampierre.Tp3;

public class Motif1 {
    public static void main(String[] args) {
        String sortie = "";
        for (int i=1; i <= 40 ;i++){
            sortie += "-";
        }
        System.out.println(sortie);
        sortie = "_-^";
        for (int i=1; i <= 9 ;i++){
            sortie += "-_-^";
        }
        System.out.println(sortie);
        sortie = "";
        for (int i = 1; i<= 2; i++){
            for (int x = 1; x <= 9;x++){
                sortie +=x + "" + x;
            }
            sortie += 0 + "" + 0;
        }
        System.out.println(sortie);
        sortie = "";
        for (int i=1; i <= 40 ;i++){
            sortie += "-";
        }
        System.out.println(sortie);
    }
    
}
