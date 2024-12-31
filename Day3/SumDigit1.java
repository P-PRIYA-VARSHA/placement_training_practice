import java.util.Scanner;

class SumDigit1 {
    // Recursive method to calculate the single digit sum
    int findSingleDigitSum(int num) {
        if (num < 10) {
            return num; // Base case: num is already a single digit
        }
else{
        
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }

        return findSingleDigitSum(sum); // Recursive call with the sum
    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        SumDigit1 obj = new SumDigit1();
        int result = obj.findSingleDigitSum(num);

        System.out.println("The single digit sum is: " + result);
    }
}
