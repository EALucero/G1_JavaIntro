package G1ea3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase:");
        frase = kb.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}