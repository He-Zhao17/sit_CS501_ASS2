import java.util.Scanner;

public class A4_3 {
    public double distance (double x1, double y1, double x2, double y2) {
        double radius = 6371.01;
        double d = radius * Math.acos(Math.sin(Math.toRadians(x1)) *
                Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1 - y2)));
        return d;
    }

    public double areaOfTriangle (double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }

    public static void main (String[] args) {
        double[] x = new double[4];
        double[] y = new double[4];
        //Charlotte
        x[0] = 35.2270869;
        y[0] = -80.8431267;
        //Savannah
        x[1] = 32.0835407;
        y[1] = -81.0998342;
        //Orlando
        x[2] = 28.5383355;
        y[2] = -81.3792365;
        //Alanta
        x[3] = 33.7489954;
        y[3] = -84.3879824;

        A4_3 demo = new A4_3();

        double d0_2 = demo.distance(x[0], y[0], x[2], y[2]);
        double d0_1 = demo.distance(x[0], y[0], x[1], y[1]);
        double d1_2 = demo.distance(x[1], y[1], x[2], y[2]);
        double d0_3 = demo.distance(x[0], y[0], x[3], y[3]);
        double d2_3 = demo.distance(x[2], y[2], x[3], y[3]);

        double area1 = demo.areaOfTriangle(d0_1, d1_2, d0_2);
        double area2 = demo.areaOfTriangle(d0_3, d2_3, d0_2);

        double sumOfArea  = area1 + area2;
        System.out.println("The enclosed area is " + sumOfArea + " km2.");
    }

}
