package exceptions;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número entero: ");
            String input = sc.next();
            int number = Integer.parseInt(input);
            System.out.println("Número ingresado: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número entero.");
        }
    }
}

