
import java.util.Scanner;

public class Snack6 {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
    
        System.out.print("Inserisci un numero: ");
        int n = scan.nextInt();
        System.out.println("Cubo dei primi " + n + " numeri:");
        
        for (int i = 1; i <= n; i++) {
            int cubo = i * i * i;
            System.out.println("Il cubo di " + i + " è " + cubo);
        }


    }
}
