public class Main {
    public static void main(String[] args) {
        /*
        There is a little one that comes to mind: if the Earth stopped in its orbit around the Sun, it would then
        accelerate under gravity until it hit the Sun. Using Newton's equation for universal gravitation, you could
        calculate the Earth's progress as it falls towards the Sun second by second.

        Yes, and for the acceleration (which is what you care about, not the force) you can remove the mass of the
        Earth from that equation

        It will be similar to your car acceleration problem.

        Work out the acceleration, a = -GM/(r²) . Take this as constant for 1s = delta-t .

        The change in velocity, delta-v = a × delta-t .

        The change in displacement (distance from the Sun) in 1s, delta-s = v × delta-t .

        The new displacement, s = s-old + delta-s .
        And similar to work out the new v.
        */

        final double GRAVITATIONAL_CONSTANT = 0.000000000066743d;
        final double MASS_OF_SUN_KG = 1988470000000000000000000000000d;
        final double DISTANCE_BETWEEN_EARTH_AND_SUN_KM = 151480000d;
    }
}