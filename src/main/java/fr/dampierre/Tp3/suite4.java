package fr.dampierre.Tp3;
import java.lang.Math;
public class suite4 {
    public static void main(String[] args) {
        int nb1 = 1;
        int nb2 = 2;
        int nb3 = 3;
        for (int i=1; i <= 4; i++){
            System.out.println(Math.pow(nb1,2));
            System.out.println(Math.pow(nb2,2));
            System.out.println(Math.pow(nb3,2));
            nb1 = nb3 + 1;
            nb2 = nb1 + 1;
            nb3 = nb2 + 1;
        }
    }
    
    
}
