import java.util.Scanner;

     public class MarkChecker {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks (0 to 100): ");
        int marks = sc.nextInt();

      
        System.out.println("\nStudent Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 0) {
            System.out.println("Grade: F (Fail)");
        } else {
            System.out.println("Invalid Marks!");
        }

        sc.close();
    }
}
