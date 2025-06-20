import java.util.Scanner;
 public class Tri
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter base :");
	double l = sc.nextDouble();
	
	System.out.print("Enter the height: ");
	double b =sc.nextDouble();
	
	double area = 0.5* b* l ;                                                                                  
    System.out.println("The area of the triangle is : " + area );
	
}

}