import java.util.Scanner;

public class A3_27 {
    public static void main (String[] args) {
        System.out.println("This tool is to tell whether a point is in a triangle " +
                "or not in the triangle.");
        System.out.println("The triangle is a right triangle. The right-angle point is placed at (0, 0), and the other two points \n" +
                "are placed at (200, 0) and (0, 100).");
        System.out.print("\nEnter the point`s x- and y-coordinates (input " +
                "number separated with spaces): ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double y = scan.nextDouble();
                System.out.println("So the point is (" + x + ", " + y + ").");
                // On the side is in the triangle
                if (x < 0 || y < 0) {
                    System.out.println("The point is not in the triangle.");
                    return;
                } else {
                    if (y <= -0.5 * x + 100) {
                        System.out.println("The point is in the triangle.");
                        return;
                    } else {
                        System.out.println("The point is not in the triangle.");
                        return;
                    }
                }
            }
        } else {
            System.out.println("Error.");
            return;
        }
    }
}
