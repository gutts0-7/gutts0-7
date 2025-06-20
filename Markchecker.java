import java.util.Scanner;

public class Markchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark: "); 
        int mark = sc.nextInt();

        System.out.println("\nStudent Name: " + name);
        System.out.println("Mark: " + mark); // 

        if (mark > 18) {
            System.out.println(name + ", you have passed. Your mark is: " + mark);
        } else {
            System.out.println(name + ", you have failed.");
        }

        sc.close();
    }
}
