package G1ea23;

public class Main {

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (int) (Math.random() * 10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nTraspuesta:\n");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
