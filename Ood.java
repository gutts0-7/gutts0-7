import java.util.Scanner;
  public class Ood{
    public static void main (String args[]){
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number  : ");
	   
	   int n = sc.nextInt();
	   
	    
		 boolean isPrime = true;
		 for(int i = 2; i <= n / 2; i++){
		     if( n % i == 0 ){
			    isPrime = false;
			 break;
			 }
			}
		 
		 if (isPrime)
			System.out.print(n + " is a prime even number.");
		  else
			System.out.print(n + " is not a prime number.");
		 
		
	
	}
	
	
	
	
	}
	
	