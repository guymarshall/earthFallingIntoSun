public class Functions {
    public static double calculateAcceleration(double gravitationalConstant, double mass, double radius) {
        return -1 * (gravitationalConstant * mass) / (radius * radius);
    }
}
