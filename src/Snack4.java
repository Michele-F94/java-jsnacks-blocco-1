
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        String [] nomi = {"Alice", "Giovanni", "Francesco", "Davide", "Michele"};

        switch (nome) {
            case "Alice":
                System.out.println("Ciao Alice, Benvenuta!");
                break;
            case "Giovanni":
                System.out.println("Ciao Giovanni,  Benvenuto!");
                break;
            case "Francesco":
                System.out.println("Ciao Francesco,  Benvenuto!");
                break;
            case "Davide":
                System.out.println("Ciao Davide,  Benvenuto!");
                break;
            case "Michele":
                System.out.println("Ciao Michele, Benvenuto!");
                break;
            default:
                System.out.println("Ciao " + nome + ", non sei in lista.");
        }
    }

}
