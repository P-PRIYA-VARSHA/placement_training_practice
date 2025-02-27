import java.util.Scanner;

public class BusFareCalculator {
    static int[] distances = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

    public static int calculateFare(int distance) {
        return (int) Math.ceil((distance / 1000.0) * 5);
    }

    public static int getFare(int source, int destination) {
        int totalStops = distances.length;
        int clockwiseDistance = 0, counterClockwiseDistance = 0;

        // Calculate clockwise distance
        for (int i = source; i != destination; i = (i + 1) % totalStops) {
            clockwiseDistance += distances[i];
        }

        // Calculate counterclockwise distance
        for (int i = destination; i != source; i = (i + 1) % totalStops) {
            counterClockwiseDistance += distances[i]; 
        }

        // Return the fare for the shortest route
        return calculateFare(Math.min(clockwiseDistance, counterClockwiseDistance));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Source Stop (1-8): ");
        int source = scanner.nextInt() - 1;

        System.out.print("Enter Destination Stop (1-8): ");
        int destination = scanner.nextInt() - 1;

        if (source == destination) {
            System.out.println("Fare: 0 INR (Same Stop)");
        } else {
            System.out.println("Fare: " + getFare(source, destination) + " INR");
        }

        scanner.close();
    }
}
