import java.util.Scanner;

public class Days {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day of the week : ");
        int val = sc.nextInt();
        
        if (val == 1) {
            System.out.println("Monday");
        } else if (val == 2) {
            System.out.println("Tuesday");
        } else if (val == 3) {
            System.out.println("Wednesday");
        } else if (val == 4) {
            System.out.println("Thursday");
        } else if (val == 5) {
            System.out.println("Friday");
        } else if (val == 6) {
            System.out.println("Saturday");
        } else if (val == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println(" enter a number between 1 and 7.");
        }
        
    }
}
