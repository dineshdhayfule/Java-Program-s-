package pr7;

import java.util.Scanner;

import pr3.BankOperation;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Bank Operations:");
			System.out.println("1. Deposit money");
			System.out.println("2. Withdraw money");
			System.out.println("3. Display balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				BankOperation.deposit();
				break;
			case 2:
				BankOperation.withdraw();
				break;
			case 3:
				BankOperation.display();
				break;
			case 4:
				System.out.println("Exiting the program.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}

}