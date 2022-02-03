package G1me4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        String r = "";
        
        do {
            System.out.println("Ingrese un número (entre 1 y 9):");
            n = kb.nextInt();
        } while (n < 1 || n > 9);
        
        switch (n) {
            case 1:
                r = "I";
                break;
            case 2:
                r = "II";
                break;
            case 3:
                r = "III";
                break;
            case 4:
                r = "IV";
                break;
            case 5:
                r = "V";
                break;
            case 6:
                r = "VI";
                break;
            case 7:
                r = "VII";
                break;
            case 8:
                r = "VIII";
                break;
            case 9:
                r = "IX";
                break;
        }
        
        System.out.println(n + " en números romanos es " + r + ".");     
    }
    
}
