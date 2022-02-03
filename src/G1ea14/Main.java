package G1ea14;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        String vec[] = {"MENU", "1.Sumar", "2.Restar", "3. Multiplicar", "4. Dividir", "5. Salir", "Elija opción:"};
        int n1, n2, value, res;
        String op, desi;
        op = ""; desi = "";
        res = 0;
        
        do {
            System.out.println("Ingrese dos números positivos:");
            n1 = kb.nextInt();
            n2 = kb.nextInt();
        } while (n1 <= 0 || n2 <= 0);
        
        do {
            for (int i = 0; i < vec.length; i++) {
                System.out.println(vec[i]);
            }
            
            value = kb.nextInt();
            
            switch (value) {
                case 1:
                    res = n1 + n2;
                    op = "+";
                    break;
                case 2:
                    res = n1 - n2;
                    op = "-";
                    break;
                case 3:
                    res = n1 * n2;
                    op = "*";
                    break;
                case 4:
                    res = n1 / n2;
                    op = "/";
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    desi = kb.next();
                    break;
                default:
                    System.out.println("Elijió cualquiera! Pruebe de vuelta:");
            }
            
            if (value >= 1 && value <= 4) {
                System.out.println(n1 + " " + op + " " + n2 + " = " + res);
            }
            
            System.out.println("* * * * * * * * * * * * * * * * * * * *");
        } while (!"S".equals(desi.toUpperCase()));     
    }
    
}