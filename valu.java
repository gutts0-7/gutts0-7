import java.util.Scanner;
 public class Valu
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter Radius :");
	int d = sc.nextInt();
	double area = 3.14 * d* d/4 ;                                                                                  
    System.out.println("The value is : " + area );
	
}

}