import java.util.Scanner;

class PrimeRange {
    public static boolean isPrime(int num) {
        if (num <= 1) 
            return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
       	       return false; // Found a divisor, so not a prime
        }
        return true; // No divisors found, so it's a prime
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int num = s.nextInt(); // End range
        System.out.println("Prime numbers up to " + num + ":");

        for (int i = 2; i <= num; i++) { // Check all numbers from 2 to num
            if (isPrime(i))  // Call isPrime with i, not num
                System.out.println(i); // Print the prime number
            
        }

       
    }
}
