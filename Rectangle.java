import java.util.Scanner;
 public class Rectangle
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter lenght :");
	double l = sc.nextDouble();
	
	System.out.print("Enter the breadth: ");
	double b =sc.nextDouble();
	
	double area = l* b;                                                                           
    System.out.println("The area of the Rectangle is : " + area );
	
}

}