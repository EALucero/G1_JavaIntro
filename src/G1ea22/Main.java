package G1ea22;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dim, un, dos, tre, cua, cin;
        String aux;       
        un = 0;
        dos = 0;
        tre = 0;
        cua = 0;
        cin = 0;
        
        System.out.println("Ingrese el tamaño del vector:");
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        dim = kb.nextInt();
        int[] vec = new int[dim];
        System.out.println("Ingrese los números:");
        
        for (int i = 0; i < dim; i++) {
            vec[i] = kb.nextInt();
            aux = Integer.toString(vec[i]);
            
            switch (aux.length()) {
                case 1:
                    un += 1;
                    break;
                case 2:
                    dos += 1;
                    break;
                case 3:
                    tre += 1;
                    break;
                case 4:
                    cua += 1;
                    break;
                case 5:
                    cin += 1;
                    break;
            }       
        }  
        
        System.out.print("Hay ");
        System.out.print((un != 0)? + un + " número" + ((un > 1)? "s" : "") + " de un dígito, " : "");
        System.out.print((dos != 0)? + dos + " número" + ((dos > 1)? "s" : "") + " de dos dígitos, "  : "");
        System.out.print((tre != 0)? + tre + " número" + ((tre > 1)? "s" : "") + " de tres dígitos, "  : "");
        System.out.print((cua != 0)? + cua + " número" + ((cua > 1)? "s" : "") + " de cuatro dígitos, "  : "");
        System.out.println((cin != 0)? + cin + " número" + ((cin > 1)? "s" : "") + " de cinco dígitos."  : "");
    }
    
}
