public class Main {
    public static void main(String[] args) {
        final double GRAVITATIONAL_CONSTANT = 0.000000000066743;
        final double MASS_OF_SUN_KG = 1988470000000000000000000000000.0;
        final double DISTANCE_BETWEEN_EARTH_AND_SUN_M = 151480000000.0;

        int deltaT = 1;
        int time = 0;
        double distanceFromSun = DISTANCE_BETWEEN_EARTH_AND_SUN_M;
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