package G1ea6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1, n2, may;
        System.out.println("Ingrese dos números enteros:");
        n1 = kb.nextInt();
        n2 = kb.nextInt();
        may = (n1 > n2)? n1 : n2;
        System.out.println((n1 != n2)? "El mayor es " + may + "." : "Son iguales");
    }
    
}
