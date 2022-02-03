package G1ea4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int C, F;
        System.out.println("Ingrese la temperatura (en Celsius):");
        C = kb.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println(C + "° Celsius equivalen a " + F + "° Fahrenheit.");    
    }
    
}