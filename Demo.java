import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        int a[] = {10, 20, 30};
        int b[] = {2, 4, 5};

        int sum[] = new int[3];
        int sub[] = new int[3];
        int mul[] = new int[3];
        int div[] = new int[3];

        // Addition
        for (int i = 0; i < 3; i++) {
            sum[i] = a[i] + b[i];
        }

        // Subtraction
        for (int i = 0; i < 3; i++) {
            sub[i] = a[i] - b[i];
        }

        // Multiplication
        for (int i = 0; i < 3; i++) {
            mul[i] = a[i] * b[i];
        }

        // Division (assuming no division by zero)
        for (int i = 0; i < 3; i++) {
            div[i] = a[i] / b[i];
        }

        // Printing arrays
        System.out.println("\n---------Array A--------------");
        for (int i = 0; i < 3; i++)
            System.out.print(a[i] + "\t");

        System.out.println("\n\n----------Array B--------------");
        for (int i = 0; i < 3; i++)
            System.out.print(b[i] + "\t");

        System.out.println("\n\n------Sum--------------------");
        for (int i = 0; i < 3; i++)
            System.out.print(sum[i] + "\t");

        System.out.println("\n\n------Subtraction------------");
        for (int i = 0; i < 3; i++)
            System.out.print(sub[i] + "\t");

        System.out.println("\n\n------Multiplication----------");
        for (int i = 0; i < 3; i++)
            System.out.print(mul[i] + "\t");

        System.out.println("\n\n------Division---------------");
        for (int i = 0; i < 3; i++)
            System.out.print(div[i] + "\t");

        System.out.println("\n===========================");
    }
}
