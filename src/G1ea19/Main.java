package G1ea19;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        float euros;
        String moneda;
        System.out.println("Ingrese la cantidad de euros:"); 
        euros = kb.nextFloat();
        System.out.println("Ingrese la modena a cambiar (libra, peso o yen):"); 
        moneda = kb.next();        
        Arbolito(euros, moneda);     
    }
    
    public static void Arbolito(float euros, String moneda) {
        double libra, peso, yen;
        libra = 0.86;
        peso = 1.28611;
        yen = 129.852;       
        
        switch (moneda.toLowerCase()) {
            case "libra":
                System.out.println(euros + " euros equivalen a " + (euros * libra) + " libras.");
                break;
            case "peso":
                System.out.println(euros + " euros equivalen a " + (euros * peso) + " pesos.");
                break;
            case "yen":
                System.out.println(euros + " euros equivalen a " + (euros * yen) + " yenes.");
                break;
            default:
                System.out.println("No tenemos esa moneda.");
        } 
    }
    
}