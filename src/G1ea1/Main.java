package G1ea1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Ingrese los valores de n1 y n2:");
        n1 = kb.nextInt();
        n2 = kb.nextInt();
        suma = n1 + n2;
        System.out.println("La suma entre " + n1 + " y " + n2 + " es " + suma + ".");    
    }
    
}