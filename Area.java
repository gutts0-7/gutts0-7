import java.util.Scanner;
    public class Area
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Radius :");
	int r = sc.nextInt();
	double area = 3.14 * r* r;
	
    System.out.println("The area of the circle is: " + area);
	
	}
	
}