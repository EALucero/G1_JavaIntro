package G1ea18;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        int n;
        System.out.println("Ingrese números (entre 1 y 20):");
        
        for (int i = 0; i < 4; i++) {    
            do {
                n = kb.nextInt();
            } while (n < 0 || n > 20);
            
            System.out.print(n + " ");
            
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    
}