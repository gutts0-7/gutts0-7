import java.util.Scanner;

    public class Empoye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Performance Grade (A/B/C/D/E): ");
        char grade = sc.next().charAt(0);

        
        double da =  salary * 10/100 ;
        double hra =  salary * 5/100;
        double ma =  salary * 7 /100;
        double sa =  salary * 13/100;
		
		int incentive = 0;

        switch (grade) {
            case 'A' :
				incentive = 100;
				break;
            case 'B' : 
				incentive = 80;
				break;
            case 'C' :
				incentive = 100;
				break;
            case 'D' : 
				incentive = 100;
				break;
            case 'E' :
				incentive = 100;
				break;
			default: 
				incentive = 0;
				break;
        };
		
		incentive = (int)salary * incentive /100;
        
        
        double totalSalary = salary + da + hra + ma + sa + incentive;

        
        double tax = 0;
        if (totalSalary > 2000000) {
            tax = totalSalary * 30/100;
        } else if (totalSalary > 1000000) {
            tax =  totalSalary * 20/100;
        } else if (totalSalary > 500000) {
            tax =  totalSalary * 10/100;
        }

        double pf = totalSalary * 10/100; 

        double netIncome = totalSalary - tax - pf;
        System.out.println("\n---**** Salary Slip --*******-");
        System.out.println("Name        : " + name);
        System.out.println("Grade       : " + grade);
        System.out.println("Basic Salary: " + salary);
        System.out.println("DA          : " + da);
        System.out.println("HRA         : " + hra);
        System.out.println("MA          : " + ma);
        System.out.println("SA          : " + sa);
        System.out.println("Incentive   : " + incentive);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("PF          : " + pf);
        System.out.println("Tax         : " + tax);
        System.out.println("Net Income  : " + netIncome);
    }
}