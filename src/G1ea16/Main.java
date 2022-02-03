package G1ea16;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        String word, FDE = "&&&&&";
        int cor = 0, inc = 0;
        System.out.println("Ingrese cadenas (formato X---O):");        
        
        do {
            word = kb.next();
            
            if (word.length() == 5 && "X".equals(word.substring(0,1)) && "O".equals(word.substring(4))) {
                cor++;
            } else {
                if (!word.equals(FDE)) {
                    inc++;
                }         
            }
        } while (!word.equals(FDE));
        
        System.out.println("Hubo " + cor + " lecturas correctas y " + inc + " incorrectas.");
    }
    
}