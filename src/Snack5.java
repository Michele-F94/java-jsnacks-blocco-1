import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        int somma = 0;
        
        System.out.println("Inserisci 6 numeri:");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                somma += numero;
            } else {
                System.out.println("Il numero " + numero + " è dispari.");
            }
        }
    }

}
