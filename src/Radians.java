import java.util.Scanner;

public class Radians {
    private static final double PI = 3.141592653589793;
    public static double toRadians(double degrees) {
        return (degrees * PI) / 180;
    }

    public static double toDegrees(double radians) {
        return (radians * 180) / PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println(toRadians(degrees));
        System.out.println(Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println(toDegrees(radians));
        System.out.println(Math.toDegrees(radians));
    }
}
