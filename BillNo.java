/*

invoice 

output :

Desc     Qty    AMT    Total 
--------------------------------
computer 3       3000      9000
================================

INPUT 
		DESC
		QTY
		AMT

total =- qty * AMT


*/

import java.util.Scanner;
public class BillNo
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter your desc ");
	String desc = sc.next();
	
	System.out.print("Enter your Qty ");
	int qty = sc.nextInt();
	
	 System.out.print("Enter your Amt ");
	 int amt = sc.nextInt();
     int total = qty * amt;
		
    System.out.println("\t\t\tDesc\tQty\tAmt\ttotal");
	
	System.out.println("\t\t\t-----------------------------------");
	
	System.out.println("\t\t\t"+desc+"\t"+qty+"\t"+amt+"\t"+total);
	
	System.out.println("\t\t\t=====================================");
	
}
}