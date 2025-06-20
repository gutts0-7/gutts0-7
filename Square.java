import java.util.Scanner;
 public class Square
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); 
	
    System.out.print("Enter Side Lenght :");
	int s = sc.nextInt();
	double area = s* s ;                                                                                  
    System.out.println("The area of the square is : " + area );
	
}

}