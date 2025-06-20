import java.util.Scanner;
public class ResultSheet
{
	public static void main(String args[])
	{
		System.out.print("\n\n\n\n");
		Scanner sc=new Scanner(System.in);
		// Input ...
		System.out.print("Enter your name");
		String name = sc.next();
		
		System.out.print("Enter your registerNO: ");
		int regno = sc.nextInt();
		
		System.out.print("Enter M1 ");
		int m1=sc.nextInt();
		
		System.out.print("Enter M2 ");
		int m2=sc.nextInt();
		
		System.out.print("Enter M3 ");
		int m3=sc.nextInt();
		
		//process.....
		int total=m1+m2+m3;
		float avg = total/3;
		
		
		
		System.out.println("\tName\tRegNO\t M1\tM2\tm3\t total\taverage");
	    System.out.println("\t"+name+"\t"+regno+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+avg);
		
		
		
	}
}