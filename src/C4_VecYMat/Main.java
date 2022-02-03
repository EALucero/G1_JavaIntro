package C4_VecYMat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] a = new int[5];
////        int[] b = {1,2,3,4,5,6,7,8,9};
//        int n = 5;
//        int[] b = new int[n];
//        int[][] c = new int[2][2];
//        int[] d = {1,2,3,4,5,6,7,8,9};
//        int longi = d.length;
        
        Scanner kb = new Scanner(System.in).useDelimiter("\n"); // sirve para no usar nextLine()
        
//        for (int i = 0; i < b.length; i++) {
//            b[i] = kb.nextInt();
//        }
//        
//        System.out.print("[ ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        System.out.println("]");
        
//        int vec1[] = new int[n];
//        int vec2[] = {1,2,3,4,5,6};
//        
//        vec2[0] = 18;
//        
//        for (int i = 0; i < vec1.length; i++) {
//            vec1[i] = kb.nextInt();
//        }
//        
//        System.out.print("[ ");
//        for (int i = 0; i < vec1.length; i++) {
//            System.out.print(vec1[i] + " ");
//        }
//        System.out.println("]");
        
//        int[][] mat1 = new int[2][2];
//        int[][] mat2 = {{1,2,3,4,5},
//                        {1,3,4,5,6},
//                        {1,2,3,4,5}};
//        
////        int[] vecAux = mat2[0];
//        System.out.println(mat2.length);
//        System.out.println(mat2[0].length);
        
//        for (int i = 0; i < mat2.length; i++) {
//            for (int j = 0; j < mat2[i].length; j++) {
//                mat1[i][j] = 5;
//            }
//        }
        
        int[][] mat1 = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mat1[i][j] = 5;
            }
        }
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
 
    }
    
}
