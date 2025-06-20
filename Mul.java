import java.util.Scanner;
public class Mul{
      public static void main (String args[]){
		 
		 char ch='a';
		 Scanner sc = new Scanner(System.in);
		 while(true){
			System.out.print("\n\n Type 'E' to exit any other char to contine: ");
			ch = sc.next().charAt(0);
			if(ch == 'E')
				break;
			System.out.println("\n\n\n");
			
			System.out.print("Enter a number : ");
			int no = sc.nextInt();
			 for (int i =1; i <=12; i++){
				  System.out.println(i+" x " + no + " = " +(i*no));
			 } 
			 System.out.println("\n\n\n");
		 }	
	} 
}	   
