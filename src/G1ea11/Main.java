package G1ea11;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tipoMotor;
        String exit;
        exit = "";
        System.out.println("Ingrese un valor (entre 1 y 4):");
        tipoMotor = kb.nextInt();
        
        switch (tipoMotor) {
            case 1:
                exit = "agua";
                break;
            case 2:
                exit = "gasolina";
                break;
            case 3:
                exit = "hormigón";
                break;
            case 4:
                exit = "pasta alimenticia";
                break;
            default:
                System.out.println("No existe un valor válido para la bomba.");
        }
        
        System.out.println(!"".equals(exit)? "La bomba es una bomba de " + exit + "." : "Inténtelo de nuevo.");
    }
    
}
