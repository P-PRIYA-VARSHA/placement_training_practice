public class PrimeCounter {  

    public static void main(String[] args) {  
        int start = 10; // Example start value  
        int end = 50;   // Example end value  
        
        int primeCount = countPrimes(start, end);  
        
        System.out.println("The number of prime numbers between " + start + " and " + end + " is: " + primeCount);  
    }  

    public static int countPrimes(int start, int end) {  
        int count = 0;  

        for (int i = start; i <= end; i++) {  
            if (i > 1) { // Exclude numbers <= 1  
                boolean isPrime = true;  
                for (int j = 2; j <= Math.sqrt(i); j++) {  
                    if (i % j == 0) {  
                        isPrime = false;  
                        break;  
                    }  
                }  
                if (isPrime) {  
                    count++;  
                }  
            }  
        }  
        
        return count;  
    }  
}