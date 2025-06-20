import java.util.Scanner;
    public class Diameter
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Radius :");
	int d = sc.nextInt();
	double area = 3.14 * d* d/4;                                                                                       
    System.out.println("The area of the diameter is : " + area );
	
	}
	
}