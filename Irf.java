import java.util.Scanner;

public class Irf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Consumer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Consumer Number:");
        String consumerNo = sc.nextLine();

        System.out.println("Enter Meter Number:");
        String meterNo = sc.nextLine();

        System.out.println("Enter Previous Reading:");
        int prev = sc.nextInt();

        System.out.println("Enter Current Reading:");
        int curr = sc.nextInt();

        int units = curr - prev;

        System.out.println("Enter Energy Charge:");
        double energy = sc.nextDouble();

        System.out.println("Enter Fixed Charge:");
        double fixed = sc.nextDouble();

        System.out.println("Enter Meter Rate:");
        double meter = sc.nextDouble();

        System.out.println("Enter Tax:");
        double tax = sc.nextDouble();

        double total = energy + fixed + meter + tax;
		double average =(unit>0)?(total/units):0;

        // Output Bill Summary
        System.out.println("\n--- KSEB Electricity Bill ---");
        System.out.println("Name:\t\t" + name);
        System.out.println("Consumer No:\t" + consumerNo);
        System.out.println("Meter No:\t" + meterNo);
        System.out.println("Units Used:\t" + units + " KWH");

        System.out.println("\n--- Charges ---");
        System.out.printf("Energy:\t\t$%.2f\n", energy);
        System.out.printf("Fixed:\t\t$%.2f\n", fixed);
        System.out.printf("Meter:\t\t$%.2f\n", meter);
        System.out.printf("Tax:\t\t$%.2f\n", tax);
        System.out.printf("Total Due:\t$%.2f\n", total);
        System.out.printf("Avg per Unit:\t$%.2f\n", average);

        sc.close();
    }
}