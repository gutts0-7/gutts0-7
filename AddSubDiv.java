import java.util.Scanner;
 public class AddSubDiv{
 public static void main (String args[]){
 
 Scanner sc= new Scanner(System.in);
 int a[] ={10,20,30} ;
 int b[] = {2,4,5};
 int sum[] =new int[3]; 
 int sub[] =new int[3]; 
 int mul[] =new int[3]; 
 int div[] =new int[3]; 
 
 for (int i = 0; i<3 ; i++){
     sum[i]= a[i] + b[i];
 }
 
 for (int i = 0; i<3 ; i++){
     sub[i]= a[i] - b[i];
 }
 
  System.out.println();
 System.out.println("---------Array if A--------------");
  for(int i=0;i<3;i++)
	 System.out.print(a[i]+"\t");
 
  System.out.println();
  System.out.println();
 System.out.println("----------Array if B--------------");
 for(int i=0;i<3;i++)
	 System.out.print(b[i]+"\t");
 System.out.println("\n\n");
  System.out.println("------Sum is--------------------");
 
 for(int i=0;i<3;i++)
	 System.out.print(sum[i]+"\t");
 System.out.println();
 
 System.out.println("\n\n");
  System.out.println("------sub is--------------------");
 
 for(int i=0;i<3;i++)
	 System.out.print(sub[i]+"\t");
 System.out.println();
 
 System.out.println("===========================");
 
 System.out.println("Subtraction");
  for (int i = 0; i<3 ; i++ ){
    [i] = a[i] - b [i];
	System.out.print([i] +" ");
	}
	
  System.out.println("\n\n");
  System.out.println("------Multi is--------------------");
	
	 System.out.println("Mult :");
     for (int i = 0; i < 3; i++) {
            mul[i] = a[i] * b[i];
	System.out.print(mul[i] + "\t");
	
	System.out.println("\n\n------Division---------------");
	}
	
		 System.out.println("Division :");
           for (int i = 0; i < 3; i++) {
            div[i] = a[i]/b[i];
        for (int i = 0; i < 3; i++)
            System.out.print(div[i] + "\t");

        System.out.println("\n===========================");
    }
}