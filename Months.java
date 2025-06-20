import java.util.Scanner;

public class Months {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (1-12) to get month: ");
        int val = sc.nextInt();
        
        if (val == 1) {
            System.out.println("January");
        } else if (val == 2) {
            System.out.println("February");
        } else if (val == 3) {
            System.out.println("March");
        } else if (val == 4) {
            System.out.println("April");
        } else if (val == 5) {
            System.out.println("May");
        } else if (val == 6) {
            System.out.println("June");
        } else if (val == 7) {
            System.out.println("July");
        } else if (val == 8) {
            System.out.println("August");
        } else if (val == 9) {
            System.out.println("September");
        } else if (val == 10) {
            System.out.println("October");
        } else if (val == 11) {
            System.out.println("November");
        } else if (val == 12) {
            System.out.println("December");
        } else {
            System.out.println(" Error. Please enter a number between 1 and 12.");
        }
        
    }
}
