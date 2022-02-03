package G1ea5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número entero:");
        n = kb.nextInt();
        System.out.println(n + " | doble: " + n * 2 + ", triple: " + n * 3 + ", raiz: " + Math.sqrt(n) + ".");
    }
    
}
