import java.util.Scanner;
public class Student
{
    public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the Name:  ");
	String name = sc.next();
	
	System.out.print("Enter the RegisterNo: ");
	int regno =sc.nextInt();
	
	System.out.print("Enter Your mark in Malayalam : ");
	int mal =sc.nextInt();
	
	System.out.print("Enter Your mark in English : ");
	int eng =sc.nextInt();
	
		System.out.print("Enter Your mark in Maths : ");
	    int maths =sc.nextInt();
		
	System.out.print("Enter Your mark in Hindi : ");
	int hind =sc.nextInt();
	 
	int total= mal + eng + maths + hind;
	float avg = total/3;
	
	if(avg >20){
	System.out.print(""+avg+"You are passed ");}
	
	else{
		System.out.print("You are failed");
                            	
	}
	}
	

}