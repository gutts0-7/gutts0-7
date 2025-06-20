import java.util.Scanner;
 public class Trapezoid
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter base a :");
	double a = sc.nextDouble();
	
	System.out.print("Enter b : ");
	double b =sc.nextDouble();
	
	System.out.print("Enter h : ");
	double h = sc.nextDouble();
	
	double area = 0.5* (b1+b2)*h;      
   	
    System.out.println("The area of the trapezoid is : " + area );
	
}

}