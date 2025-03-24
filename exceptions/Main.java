package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            int N = sc.nextInt();

            if (N < 0) {
                throw new IllegalArgumentException("El número debe ser positivo.");
            }
    
            System.out.print("Números pares entre 1 y " + N + ": ");
            for (int i = 2; i <= N; i += 2) {
                System.out.print(i + " ");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
