package G1ea25;
import java.util.Scanner;

public class Main {
    
    static Scanner kb = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {     
        boolean res;   
        int[][] mat = new int[3][3];
        System.out.println("Ingrese los números:");        
        rellenar(mat);
        res = procesar(mat);
        System.out.println(res? "Es una matriz mágica!" : "No tiene magia.");
    }
    
    public static void rellenar(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición (" + i + "," + j + "): ");
                mat[i][j] = kb.nextInt();
                
                while (mat[i][j] < 1 || mat[i][j] > 9) {
                    System.out.println("No es un dato válido.");
                    mat[i][j] = kb.nextInt();
                }
            }           
        }
    }
    
    public static boolean procesar(int[][] mat) {
        boolean log;
        int fil = 0, col = 0, diagI = 0, diagD = 0;
        log = false;
        
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + mat[i][j] + " |");
                fil += mat[i][j];
                
                if (i == j) {
                    diagI += mat[i][j];
                }
            }  
            
            System.out.println("");
            
            for (int k = 0; k < 3; k++) {
                col += mat[k][i];
                
                if (i + k == 2) {
                    diagD += mat[k][i];
                }
            }
            
            log = (fil == col && col == diagI && diagI == diagD); 
            fil = 0; col = 0;
        }
        
        return log;
    }
    
}
