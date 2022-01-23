import java.util.Scanner;

public class A3_27 {
    public static void main (String[] args) {
        System.out.print("Enter a point`s x- and y-coordinates: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double y = scan.nextDouble();
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
