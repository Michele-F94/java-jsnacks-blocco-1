
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci la prima parola: ");
        String primaParola = scan.nextLine();
        System.out.print("Inserisci la seconda parola: ");
        String secondaParola = scan.nextLine();
        

        if (primaParola.length() > secondaParola.length()) {
            System.out.println(secondaParola + primaParola);
        } else if (primaParola.length() < secondaParola.length()) {
            System.out.println(primaParola + secondaParola);
        } else {
            System.out.println("Le due parole hanno la stessa lunghezza.");
        }
    }

}
