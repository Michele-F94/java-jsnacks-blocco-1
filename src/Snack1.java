
import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("inserisci il primo numero: ");
        int primoNumero = scan.nextInt();
        System.out.print("inserisci il secondo numero: ");
        int secondoNumero = scan.nextInt();

        if (primoNumero > secondoNumero) {
            System.out.println("Il numero piu grande è:" + primoNumero);
        } else if (primoNumero < secondoNumero) {
            System.out.println("Il numero piu grande è:" + secondoNumero);
        } else {
            System.out.println("I due numeri sono uguali.");
        }
    }

}
