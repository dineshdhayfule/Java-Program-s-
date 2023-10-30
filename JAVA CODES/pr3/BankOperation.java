/*
b. Write java program to implement bank operation using switch 
case for following task
i. Deposit money
ii. Withdraw money 
iii. display money*/

package pr3;

import java.util.Scanner;

public class BankOperation {
	static Scanner input = new Scanner(System.in);
	static double balance = 0.0;
	

	public static void deposit() {
		System.out.print("Enter the amount to deposit: ₹");
		balance += input.nextDouble();
		System.out.println("Amount deposited successfully.");
	}

	public static void withdraw() {
		System.out.print("Enter the amount to withdraw: ₹");
		double withdrawAmount = input.nextDouble();
		if (withdrawAmount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= withdrawAmount;
			System.out.println("Amount withdrawn successfully.");
		}
	}
	
	public static void display() {
		System.out.println("Your balance is: ₹" + balance);
		
	}

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bank Operations:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                	withdraw();
                    break;
                case 3:
                	display();
                	break;
                case 4:
                    System.out.println("Exiting the program.");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
