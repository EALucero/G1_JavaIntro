package G1me3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        String let;
        System.out.println("Ingrese una letra:");
        let = kb.next();
        
        if (let.length() == 1) {
            switch (let.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("Es una vocal.");
                    break;
                default:
                    System.out.println("No es una vocal.");
            }
        } else {
            System.out.println("Ingresó cualquier cosa.");
        }
        
    }
    
}
