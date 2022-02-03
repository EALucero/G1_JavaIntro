package G1me5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        String op;
        double pri, dis;
        int porc = 0, centi = 0;
        System.out.println("Ingrese su clase de socio (A, B o C):");
        op = kb.next();
        
        do {
            System.out.println("Ahora el costo del tratamiento:");
            pri = kb.nextDouble(); 
        } while (pri <= 0);
        
        op = op.toUpperCase();
        
        switch (op) {
            case "A":
                porc = 50;
                pri /= 2; 
                break;
            case "B":
                porc = 35;
                dis = (pri / 100) * porc; 
                pri -= dis;
                break;
            case "C":
                break;
            default:
                System.out.println(op + " no es una opción válida.");
                centi++;
        }
        
        if (centi == 0) {
            System.out.println("El socio " + op + ((!"C".equals(op))? ", con un descuento del " + porc + "%," : "") + " deberá abonar " + pri + ".");
        }      
    }
    
}
