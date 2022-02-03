package G1me2;

public class Main {

    public static void main(String[] args) {
        int A = 4, B = 8, C = 6, D = 2, aux;
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
    
}
