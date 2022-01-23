import java.util.Scanner;

public class A4_2 {
    public static void main (String[] args) {
        System.out.println("This tool is to get the great circle distance between " +
                "2 points on the earth.\n" + "We will use the formula as follows.");
        System.out.println("d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))");
        System.out.print("\nEnter point 1 (latitude and longitude) " +
                "in degrees (input number separated with spaces): ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double x1 = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double y1 = scan.nextDouble();
                System.out.print("Enter point 2 (latitude and longitude) " +
                        "in degrees (input number separated with spaces): ");
                if (scan.hasNextDouble()) {
                    double x2 = scan.nextDouble();
                    if (scan.hasNextDouble()) {
                        double y2 = scan.nextDouble();
                        System.out.println("The radius is 6371.01 km.");
                        System.out.println("So the point 1 is (" + x1 + ", " + y1 + ") and " +
                                "the point 2 is (" + x2 + ", " + y2 + ").\n");
                        double radius = 6371.01;

                        double d = radius * Math.acos(Math.sin(Math.toRadians(x1)) *
                                Math.sin(Math.toRadians(x2)) +
                                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                        Math.cos(Math.toRadians(y1 - y2)));
                        System.out.println("The distance between the two points is " + d +
                                " km.");
                        return;

                    }
                } else {
                    System.out.println("Error.");
                    return;
                }
            } else {
                System.out.println("Error.");
                return;
            }
        } else {
            System.out.println("Error.");
            return;
        }
    }
}
