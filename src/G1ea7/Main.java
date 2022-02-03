package G1ea7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número entero:");
        n = kb.nextInt();
        System.out.println((n % 2 == 0)? "Es par." : "Es impar.");
    }
    
}
