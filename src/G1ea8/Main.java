package G1ea8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word;
        System.out.println("Ingrese una palabra:");
        word = kb.next();
        System.out.println((word.equals("eureka"))? "Correcto." : "Incorrecto.");
    }
    
}
