public class Functions {
    public static double calculateAcceleration(double gravitationalConstant, double mass, double radius) {
        return (gravitationalConstant * mass) / (radius * radius);
    }
}
