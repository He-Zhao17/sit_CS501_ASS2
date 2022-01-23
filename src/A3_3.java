import java.util.Scanner;

public class A3_3 {
    public static void main (String[] args) {
        System.out.print("Enter a, b, c, d, e, f: ");
        Scanner scan = new Scanner(System.in);
        double[] k = new double[6];
        for (int i = 0; i < 6; i++) {
            if (scan.hasNextDouble()) {
                k[i] = scan.nextDouble();
            } else {
                System.out.print("\nInput Error.");
                return;
            }
        }
        if (k[0] * k[2] == k[1] * k[3]) {
            System.out.println("This equation has no solution.");
            return;
        } else {
            double x = (k[4] * k[3] - k[1] * k[5]) / (k[0] * k[3] - k[1] * k[2]);
            double y = (k[0] * k[5] - k[4] * k[2]) / (k[0] * k[3] - k[1] * k[2]);
            System.out.println("x is " + x + " and y is " + y);
        }

    }
}
