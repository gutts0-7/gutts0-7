import java.util.Scanner;

public class Elgli
 {
    public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 
	 
	 System.out.print("Enter Your Name");
	 String name=sc.next();
	
	  
	  System.out.print("Enter your Age ");
	  int age=sc.nextInt();
	  
	  if(age<18){
		  System.out.print("Hi "+name+", you  are eligible for voting, your age is "+age);
	  }
	  else {
		System.out.print("You are not elgible");
	  }
	  
 }
}	
