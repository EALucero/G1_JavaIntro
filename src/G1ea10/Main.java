package G1ea10;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word;
        System.out.println("Ingrese una frase:");
        word = kb.next();
        System.out.println((word.toUpperCase().substring(0,1).equals("A"))? "Correcto." : "Incorrecto.");
    }
    
}
