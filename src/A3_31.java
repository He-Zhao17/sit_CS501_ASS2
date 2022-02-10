import java.util.Scanner;

public class A3_31 {
    public static void main (String[] args) {

        System.out.println("This tool is to exhange between dollar and RMB. \n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double rate = scan.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa (input 0 or 1): ");
        int toward = scan.nextInt();
        if (rate <= 0) {
            System.out.println("Error input.");
            System.exit(1);
        }
        if (toward != 0 && toward != 1) {
            System.out.println("CIncorrect input");
            System.exit(1);
        }
        if (toward == 0) {
            System.out.println("Enter the dollar amount: ");
            double amount = scan.nextDouble();
            if (amount < 0) {
                System.out.println("Error input.");
                System.exit(1);
            }
            System.out.println("$" + amount + " is " + (amount * rate) + " yuan");
        } else if (toward == 1) {
            System.out.println("Enter the RMB amount: ");
            double amount = scan.nextDouble();
            if (amount < 0) {
                System.out.println("Error input.");
                System.exit(1);
            }
            System.out.println(amount +" yuan is $" + (amount / rate));
        }

    }
}
