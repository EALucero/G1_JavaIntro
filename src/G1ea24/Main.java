package G1ea24;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int centi, opu;
        centi = 0;
        
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        int[][] mat = new int[3][3];
        System.out.println("Ingrese los números:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = kb.nextInt();
            }           
        }
        
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }          
            
            for (int j = 2; j < 3; j--) {
                opu = mat[j][i] * (-1);
                if (opu != mat[i][j]) {
                    centi++;
                }
                System.out.print(opu + " ");
            }
            
            System.out.println("");     
        }         
        
        System.out.println((centi == 0)? "Es anti simétrica." : "Es una matriz común y corriente.");
    }
    
}