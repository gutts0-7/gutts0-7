import java.util.Scanner;
 public class Ellipse
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter (a) :");
	double a = sc.nextDouble();
	
	System.out.print("Enter (b): ");
	double b =sc.nextDouble();
	
	double area = (3.14)*a*b;                                                                          
    System.out.println("The area of the Ellipse is : " + area );
	
}

}