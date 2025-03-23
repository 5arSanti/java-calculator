package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("La suma es: " + sum);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        }
    }
}
