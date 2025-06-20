import java.util.Scanner;

public class Eg01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		for (int i = 1; i<=5 ; i++){
			char ch = '1';
		for (int j =1; j<=i; j++){
			System.out.print(ch+ " ");
		ch++;}
		 System.out.print ln();
			
			
		 	for (int i = 4; i<=0; i--){
				char ch = '4';
		for (int j = 1; j<=i; j++){
        
			System.out.println(ch+ " " );
		ch++; }
           System.out.print ln();
			}
		 	for (int i = 1; i<=5; i++){
				
		for (int j = 1; j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
			}
	}
	}
    