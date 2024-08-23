import java.util.Scanner;

public class Hack4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  // Close the scanner after reading the input

        // Edge case for numbers less than or equal to 1
        if (n <= 1) {
            System.out.println("not prime");
            return;
        }

        // Assume number is prime
        boolean isPrime = true;

        // Check for factors from 2 up to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;  // Number is not prime
                break;
            }
        }

        // Output result based on isPrime
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
