import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somma = 0;
        
        System.out.println("Inserisci 10 numeri:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scan.nextInt();
            somma += numero;
        }
        
        System.out.println("La somma di tutti i numeri inseriti è: " + somma);
        scan.close();
    }
}