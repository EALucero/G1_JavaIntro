package G1ea15;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        int n, sum = 0, cont = 0;
        System.out.println("Ingrese 20 números:");
        
        for (int i = 0; i < 20; i++) {
            if (cont == 0) {
                System.out.print("Posición " + i + ": ");
                n = kb.nextInt();
            
                switch (n) {
                    case 0:
                        System.out.println("Se capturó el numero cero.");
                        cont += 1;
                        break;
                    default:
                        sum = (n > 0)? sum + n : sum;
                } 
            }
        }
        
        if (cont == 0) {
            System.out.println("La suma de los números leidos es " + sum + ".");
        }
    }
    
}
