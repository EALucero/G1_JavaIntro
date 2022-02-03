package G1ea9;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word;
        System.out.println("Ingrese una frase:");
        word = kb.next();
        System.out.println((word.length() == 8)? "Correcto." : "Incorrecto.");
    }
    
}
