package C5_Repaso;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in).useDelimiter("\n");
//        int n1, n2, op;
//        String salir = "";
//        
//        System.out.println("Ingrese el valor de n1:");
//        n1 = kb.nextInt();
//        System.out.println("Ingrese el valor de n2:");
//        n2 = kb.nextInt();
//        
//        do {
//            System.out.println("MENU");
//            System.out.println("1.Sumar");
//            System.out.println("2.Restar");
//            System.out.println("3. Multiplicar");
//            System.out.println("4. Dividir");
//            System.out.println("5. Salir");
//            System.out.println("Elija opción:");
//            op = kb.nextInt();
//            
//            switch (op) {
//                case 1:
//                    System.out.println("La suma es: " + (n1 + n2));
//                    break;
//                case 2:
//                    System.out.println("La resta es: " + (n1 - n2));
//                    break;
//                case 3:
//                    System.out.println("La multiplicación es: " + (n1 * n2));
//                    break;
//                case 4:
//                    System.out.println("La división es: " + (n1 / n2));
//                    break;
//                case 5:
//                    System.out.println("Está seguro que quiere salir? s/n");
//                    break;
//                default:
//                    System.out.println("Opción incorrecta.");
//            }
//        } while (!salir.equals("s"));

        int[][] m = {{0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0,0}};
        
        int[][] p = {{1,1,1},
                     {1,1,1},
                     {1,1,1}};
        
        int it = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (m[i+k][j+l] == p[k][l]) {
                           it++; 
                        }
                    }
                }
                
                if (it == 9) {
                    System.out.println(i + "," + j);
                    it = 0;
                } else {
                    it = 0;
                }
            }
        }
    }
    
}
