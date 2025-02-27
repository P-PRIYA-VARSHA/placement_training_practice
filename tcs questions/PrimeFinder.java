public class PrimeFinder {  
    
    public static void main(String[] args) {  
        System.out.println("The 10th prime number is: " + findNthPrime(10)); // Output: 29  
        System.out.println("The 13th prime number is: " + findNthPrime(13)); // Output: 41  
    }  

    public static int findNthPrime(int n) {  
        if (n < 1 || n > 1000) {  
            throw new IllegalArgumentException("N must be between 1 and 1000");  
        }  

        int count = 0; // Count of found prime numbers  
        int num = 1;   // Number to check for primality  

        while (count < n) {  
            num++;  
            boolean isPrime = true; // Initial assumption that the number is prime  
            for (int i = 2; i <= Math.sqrt(num); i++) {  
                if (num % i == 0) {  
                    isPrime = false; // Found a divisor, not a prime  
                    break;  
                }  
            }  
            if (isPrime) {  
                count++;  
            }  
        }  

        return num; // Return the Nth prime number  
    }  
}