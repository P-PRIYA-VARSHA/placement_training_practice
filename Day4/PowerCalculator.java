import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
PowerCalculator obj= new PowerCalculator();
        double result = obj.power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    double power(int base, int exponent) {
        double result = 1.0;

        // Handle negative exponents
        if (exponent < 0) {
            for (int i = 0; i < -exponent; i++) { // Loop for the positive value of the exponent
                result *= base;
            }
            return 1.0 / result; // Take the reciprocal for negative exponents
        } else {
            for (int i = 0; i < exponent; i++) { // Loop for positive exponents
                result *= base;
            }
            return result;
        }
    }
}
