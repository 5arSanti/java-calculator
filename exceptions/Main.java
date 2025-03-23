package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            if (num == 0) { throw new ArithmeticException("No se puede dividir por cero"); }

            int result = 100 / num;
            System.out.println("El resultado es: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
