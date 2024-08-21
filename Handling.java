import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        System.out.println("Program is started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Divisor :");
        int b = sc.nextInt();

        for (int a = 1; a < 4; a++) {
            try {
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
                System.out.println("Division by zero is not allowed");
            }
        }
    }
}