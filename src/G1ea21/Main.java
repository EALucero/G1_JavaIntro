package G1ea21;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        int dim, num, enc, posi, rep;
        System.out.println("Ingrese el tamaño del vector:");
        dim = kb.nextInt();
        int[] vec = new int[dim];     
        System.out.println("¿Qué número desea encontrar?");
        num = kb.nextInt();      
        enc = 0;
        posi = -1;
        rep = 0;
        
        System.out.print("[ ");
        for (int i = 0; i < dim; i++) {
            vec[i] = (int) (Math.random() * 10);  
            System.out.print(vec[i] + " ");
            
            if (vec[i] == num) { 
                enc = vec[i];
                if (posi < 0 || posi > i) { // esto lo puse para que guarde solo la 1ra posición
                     posi = i;
                } 
                if (num == enc) {
                    rep += 1;
                }
            }           
        } 
        System.out.println("]");
        
        System.out.print((rep != 0)? "El número se encuentra en la posición " + posi : "No se encontró el número.");
        System.out.println((rep > 1)? " y está repetido " + rep + " veces." : "");
    }
    
}