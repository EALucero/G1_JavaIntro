package G1me1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int min, day, hs, aux;
        String contH;
        System.out.println("Ingrese los minutos a convertir:");
        min = kb.nextInt();
        hs = 0;
        day = 0;
        aux = min;
          
        while (min >= 60) {
            hs += 1;
            min -= 60;
        }
        
        while (hs >= 24) {
            day += 1;
            hs -= 24;
        }
        
        contH = (hs > 1)? "s." : ".";     
        System.out.print(aux + " minutos");
        System.out.print((day != 0)? " equivalen a " + day + " día" + ((day > 1)? "s" : "") : "");
        System.out.println((hs != 0)? ((day == 0)? " equivalen a " + hs + " hora" + contH : " y " + hs + " hora" + contH) : "");       
    }
    
}
