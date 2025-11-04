import java.util.Scanner;

public class TripPlanner {

    // Calculates and returns travel time in hours
    public static double calculateTravelTime(double distance, double avgSpeed) {
        return distance / avgSpeed;
    }

    // Calculates and returns gallons of fuel needed
    public static double calculateFuelNeeded(double distance, double fuelEfficiency) {
        return distance / fuelEfficiency;
    }

    // Calculates and returns total cost in dollars
    public static double calculateTripCost(double fuelNeeded, double fuelPrice) {
        return fuelNeeded * fuelPrice;
    }
    public static void displayResults(double travelTime, double fuelNeeded, double tripCost) {
        System.out.println("\nResults:");
        System.out.println("Travel Time: "+travelTime+"hours");
        System.out.println("Fuel Needed:" +fuelNeeded + "gallons");
        System.out.println("Trip Cost: $"+ tripCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter trip distance (miles): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter average speed (mph): ");
        double avgSpeed = scanner.nextDouble();

        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter fuel price per gallon ($): ");
        double fuelPrice = scanner.nextDouble();

        double travelTime = calculateTravelTime(distance, avgSpeed);
        double fuelNeeded = calculateFuelNeeded(distance, fuelEfficiency);
        double tripCost = calculateTripCost(fuelNeeded, fuelPrice);

        displayResults(travelTime, fuelNeeded, tripCost);
    }
}