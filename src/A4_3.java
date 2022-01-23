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
        System.out.println("This tool is to calculate the enclosed area of Atlanta, Georgia; \n" +
                "Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina.");
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

        System.out.println("The GPS location of these 4 city is as follows:");
        System.out.println("Charlotte: (" + x[0] + ", " + y[0] + ")");
        System.out.println("Savannah: (" + x[1] + ", " + y[1] + ")");
        System.out.println("Orlando: (" + x[2] + ", " + y[2] + ")");
        System.out.println("Atlanta: (" + x[3] + ", " + y[3] + ")\n");


        A4_3 demo = new A4_3();
        System.out.println("Now We will use the formula as follows to calculate the distance " +
                "between 2 points.");
        System.out.println("d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))");
        System.out.println("(radius is 6373.01 km.)");

        double d0_2 = demo.distance(x[0], y[0], x[2], y[2]);
        System.out.println("The distance between Charlotte and Orlando is " + d0_2 + "km.");
        double d0_1 = demo.distance(x[0], y[0], x[1], y[1]);
        System.out.println("The distance between Charlotte and Savannah is " + d0_1 + "km.");
        double d1_2 = demo.distance(x[1], y[1], x[2], y[2]);
        System.out.println("The distance between Savannah and Orlando is " + d1_2 + "km.");
        double d0_3 = demo.distance(x[0], y[0], x[3], y[3]);
        System.out.println("The distance between Charlotte and Atlanta is " + d0_3 + "km.");
        double d2_3 = demo.distance(x[2], y[2], x[3], y[3]);
        System.out.println("The distance between Atlanta and Orlando is " + d2_3 + "km.\n");

        System.out.println("Now we will use the formula as follows to calculate the area" +
                "of triangles.");
        System.out.println("s = (side1 + side2 + side3)/2;\n" +
                "area = (s(s - side1)(s - side2)(s - side3))exp0.5\n");
        double area1 = demo.areaOfTriangle(d0_1, d1_2, d0_2);
        System.out.println("The area of the triangle consisting of Charlotte, Savannah " +
                "and Orlando is " + area1 + " km2.");
        double area2 = demo.areaOfTriangle(d0_3, d2_3, d0_2);
        System.out.println("The area of the triangle consisting of Charlotte, Atlanta " +
                "and Orlando is " + area1 + " km2.");

        double sumOfArea  = area1 + area2;
        System.out.println("The enclosed area is " + sumOfArea + " km2.");
    }

}
