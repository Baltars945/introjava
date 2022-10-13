package fr.dampierre.Tp3;

public class suite3 {
    public static void main(String[] args) {
        int nb1 = 1;
        int nb2 = 2;
        int nb3 = 3;
        for (int i=1; i <= 4; i++){
            System.out.println(nb1 * nb1);
            System.out.println(nb2 * nb2);
            System.out.println(nb3 * nb3);
            nb1 = nb3 + 1;
            nb2 = nb1 + 1;
            nb3 = nb2 + 1;
        }
    }
    
}
