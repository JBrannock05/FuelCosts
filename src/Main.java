import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons;
        double fuelEfficiency;
        double pricePerGallon;

        // Get the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallons = scanner.nextDouble();
            if (gallons <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (gallons <= 0);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = scanner.nextDouble();
            if (fuelEfficiency <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (fuelEfficiency <= 0);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();
            if (pricePerGallon < 0) {
                System.out.println("Please enter a non-negative number.");
            }
        } while (pricePerGallon < 0);

        // Calculate the cost to drive 100 miles
        double costToDrive100Miles = (100 / fuelEfficiency) * pricePerGallon;
        // Calculate how far the car can go with a full tank of gas
        double distanceWithFullTank = gallons * fuelEfficiency;

        // Print the results
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100Miles);
        System.out.printf("Distance with a full tank: %.2f miles%n", distanceWithFullTank);

        // Close the scanner
        scanner.close();
    }
}