package fr.dampierre;
import java.util.Scanner;;
public class Exercice_cafe_creme {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("pièce de 1 centime? :" );
        int uncent = clavier.nextInt();
        System.out.println("pièce de 5 centime? :" );
        int cinqcent = clavier.nextInt();
        System.out.println("pièce de 10 centime? :" );
        int dixcent = clavier.nextInt();
        System.out.println("pièce de 20 centime? :" );
        int vingcent = clavier.nextInt();
        System.out.println("pièce de 50 centime? :" );
        int cinquantecent = clavier.nextInt();

        clavier.close();
        int total = uncent + 5 * cinqcent + 10 * dixcent + 20 * vingcent + 50 * cinquantecent;
        
        if (total < 100) {
            int reste = 100 - total;
            System.out.println("Il vous manque " + reste + " cents pour prendre un café.");
        } else if (total == 100) {
            System.out.println("Vous avez exactement de quoi vous payer le café!");
        } else {
            int reste = total - 100;
            System.out.println("Il vous restera " + reste + " après avoir pris votre café!"); 
        }
    }
}