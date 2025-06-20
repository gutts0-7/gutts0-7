import java.util.Scanner;

public class Calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number (n1): ");
        int no1 = sc.nextInt();
        
        System.out.print("Enter the second number (n2): ");
        int no2 = sc.nextInt();
        
        System.out.print("Enter the third number (n3): ");
        int no3 = sc.nextInt();
        
        if (no1 > no2)  {
			if( no1 >no3 ){
					System.out.println("n1 is the largest number: " + no1);
			}else {
				System.out.println("n1 is the largest number: " + no3);
			}
        } else {
			if(no2 > no3) {
				System.out.println("n2 is the largest number: " + no2);
			} else {
				System.out.println("n1 is the largest number: " + no3);
			}
		}// END OF OUTTER ELSE
	} // END OF MAIN
}// END OF CLASS		
