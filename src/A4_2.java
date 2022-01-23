import java.util.Scanner;

public class A4_2 {
    public static void main (String[] args) {
        System.out.print("Enter point 1 (latitude and longitude) " +
                "in degrees: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double x1 = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double y1 = scan.nextDouble();
                System.out.print("Enter point 2 (latitude and longitude) " +
                        "in degrees: ");
                if (scan.hasNextDouble()) {
                    double x2 = scan.nextDouble();
                    if (scan.hasNextDouble()) {
                        double y2 = scan.nextDouble();
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
