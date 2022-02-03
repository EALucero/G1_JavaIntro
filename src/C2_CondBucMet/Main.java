package C2_CondBucMet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useDelimiter("\n");
        int n = 2;

        // IF - Si O SiNo
//        if (n == 10) {
//            System.out.println("El número es 10.");
//        } else if (n == 20) {
//            System.out.println("El número es 20.");
//        } else {
//            System.out.println("El número es distinto de 10 y 20.");
//        }
        
        // SWICTH - Segun
//        switch (n) {
//            case 1:
//                System.out.println("Mi número vale 1.");
//                break;
//            case 2:
//                System.out.println("El número vale 2.");
//                break;
//            case 10:
//                System.out.println("El número es igual a 10.");
//                break;
//            default:
//                System.out.println("El número no es igual a ninguna de las opciones.");
//        }
        
        // WHILE - Hacer Mientras/Hasta
//        while (n == 2) {
//            System.out.println("El número sigue siendo igual a 2.");
//            System.out.println("Ingrese un valor:");
//            n = kb.nextInt();
//        }
        
        // DO WHILE - Repetir Mientras/Hasta
//        do {
//            System.out.println("El número es distinto de 10.");
//            System.out.println("Ingrese un valor para n:");
//            n = kb.nextInt();
//        } while (n != 10);
        
        // FOR - Para
//        int num = 10;
//        
//        for (int i = 0; i < 10; i++) { //con paso 1 hacer -- i++
//            for (int j = 0; j < 10; j++) {
//                System.out.println(j);
//            }    
//        }   
    
        int n1 = 2;
        int n2 = 4;
        Suma(n1, n2);
        int res = Sumatoria(n1, n2);
        System.out.println("El resultado de la suma es " + res + ".");
    }
    
    // METHOD
    
    // SubProceso
    public static void Suma(int n1, int n2) {
        int suma = n1 + n2;
        System.out.println("El valor de la suma es " + suma + ".");
    }
    
    // Funcion
    public static int Sumatoria(int a, int b) {
        int suma = a + b;
        return suma;
    }  
}
