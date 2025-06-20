import java.util.Scanner;
public class Eg02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println(" (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            char ch = '1';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println(); 

        System.out.println( "(5 to 1):");
        for (int i = 5; i >= 1; i--) {
            char ch = '1';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("*");
        }
    }
}