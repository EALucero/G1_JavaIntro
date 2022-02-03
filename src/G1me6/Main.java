package G1me6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, cont = 0;
        double alt, sum = 0, prom;
        System.out.println("Ingrese el número de personas:");
        
        do {
            n = kb.nextInt();
        } while (n <= 0);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de p" + (i + 1) + ":");
            alt = kb.nextDouble();
            sum += alt;
            
            if (alt <= 1.60) {
                cont++;
            }
        }
        prom = sum / n;
        System.out.println("El promedio de las " + n + " alturas es " + prom + ((cont > 0)? " y hay " + cont + " hobbits" : "") + ".");
    }
    
}