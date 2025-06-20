import java.util.Scanner;

public class Eg03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100000.00; 
        char c;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("B: Balance Check");
            System.out.println("W: Withdraw");
            System.out.println("D: Deposit");
            System.out.println("E: Exit");
            System.out.print("Enter your choice: ");
            c
			= sc.next().toUpperCase().charAt(0);

            switch (c) {
                case 'B':
                    System.out.println("Current Balance: " + balance);
                    break;

                case 'W':
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 'D':
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    break;

                case 'E':
                    System.out.println("Thank you for using ATM. Taataa!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter B, W, D or E.");
            }

        } while (c = 'E');
    }
}