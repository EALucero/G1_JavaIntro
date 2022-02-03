package G1ea12;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        
        do {
            System.out.println("Ingrese una nota (entre 0 y 10):");
            n = kb.nextInt();
        } while (n < 0 || n > 10);      
    }
    
}
