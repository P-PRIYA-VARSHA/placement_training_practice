import java.util.Arrays;

public class BuiltMin {
    public static int min(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 33, 12, 54, 789, 12, 90};
        System.out.println("The minimum value in the array is: " + min(numbers));
    }
}
