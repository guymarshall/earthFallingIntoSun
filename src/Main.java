import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double GRAVITATIONAL_CONSTANT = 0.000000000066743;
        final double MASS_OF_SUN_KG = 1988470000000000000000000000000.0;
//        final double DISTANCE_BETWEEN_EARTH_AND_SUN_M = 151480000000.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your planet!");
        System.out.println("1 - Mercury");
        System.out.println("2 - Venus");
        System.out.println("3 - Earth");
        System.out.println("4 - Mars");
        System.out.println("5 - Jupiter");
        System.out.println("6 - Saturn");
        System.out.println("7 - Uranus");
        System.out.println("8 - Neptune");
        System.out.println("9 - Pluto");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        double radius;

        switch (choice) {
            case 1:
                radius = 69550000000.0;
                break;
            case 2:
                radius = 107550000000.0;
                break;
            case 3:
                radius = 151480000000.0;
                break;
            case 4:
                radius = 211620000000.0;
                break;
            case 5:
                radius = 741850000000.0;
                break;
            case 6:
                radius = 1474100000000.0;
                break;
            case 7:
                radius = 2944700000000.0;
                break;
            case 8:
                radius = 4474000000000.0;
                break;
            case 9:
                radius = 5900000000000.0;
                break;
            default:
                System.exit(1);
        }

        int deltaT = 1;
        int time = 0;
        double distanceFromSun = radius;
        double acceleration = 0.0;
        double velocity = 0.0;
        double deltaV = 0.0;
        double deltaS = 0.0;

        while (distanceFromSun > 0) {
            acceleration = Functions.calculateAcceleration(GRAVITATIONAL_CONSTANT, MASS_OF_SUN_KG, distanceFromSun);
            deltaV = acceleration * deltaT;
            velocity += deltaV;
            deltaS = velocity * deltaT;
            distanceFromSun += deltaS;

            System.out.printf("Time: %ds, acceleration: %fms^-2, velocity: %fms^-1, distance: %fm%n", time, acceleration, velocity, distanceFromSun);

            time += deltaT;
        }
    }
}