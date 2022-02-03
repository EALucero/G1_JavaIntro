package G1me7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, min, max, sum, prom;
        min = 9999;
        max = -9999;
        sum = 0;
        System.out.println("Ingrese la cantidad de números:");
        
        do {
            n = kb.nextInt();
        } while (n <= 0);
        
        int[] vec = new int[n];  
        System.out.println("Ingrese los números");
        
        for (int i = 0; i < n; i++) {
            vec[i] = kb.nextInt();
            min = Math.min(vec[i], min);
            max = Math.max(vec[i], max);
            sum += vec[i];
        }
        
        prom = sum / n;
        System.out.println("El valor máximo es " + max + ", el mínimo " + min + " y el promedio " + prom + ".");    
    }
    
}