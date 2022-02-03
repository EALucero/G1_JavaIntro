package G1ea13;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int lim, n, sum = 0;
        do {
            System.out.println("Ingrese valor límite:");
            lim = kb.nextInt();
        } while (lim <= 0);
        System.out.println("Ingrese números:");
        do {
            n = kb.nextInt();
            sum += n;
        } while (sum <= lim);
        System.out.println(sum + " superó el límite(" + lim + ").");
    }
    
}
