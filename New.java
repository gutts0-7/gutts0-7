import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consumer Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

       
        double rate = 0;
        
        
        if (units < 100) {
           
            rate = 1.5;
        } else if (units >= 200 && units <= 300) {
           
            rate = 3;
        } else if (units > 300 && units <= 500) {
            
            rate = 5;
        } else if (units > 500 && units <= 1000) {
            
            rate = 7;
        } else if (units > 1000) {
            
            rate = 10;
        } else {
            System.out.println("Invalid unit entry.");
            return;
        }

        double bill = units * rate;

       
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name   : " + name);
        System.out.println("Consumer Number : " + number);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Rate Unit   : " + rate);
        System.out.println("Total Bill      : " + bill);
    }
}
