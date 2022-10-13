package fr.dampierre.Tp3;

public class suite2 {
    public static void main(String[] args) {
        int nb1 = 0;
        int nb2 = 1;
        for ( int i = 0 ; i <= 19; i++ ){
            System.out.println(nb1);
            System.out.println(nb2);
            int temp = nb1;
            nb1 = temp + nb2;
            nb2 = nb1 + nb2;
        }
    }
}
