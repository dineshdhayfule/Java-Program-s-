package pr6;

import java.util.Scanner;

public class YoungestCandidate {
	public static void main(String[] args) {
		String[] candidates = { "Candidate 1", "Candidate 2", "Candidate 3" };
		int[][] dob = new int[3][3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter birthdate for " + candidates[i] + " (day, month, year):");
			for (int j = 0; j < 3; j++) {
				dob[i][j] = sc.nextInt();
			}
		}

		int yindex = 0;
		int yage = calculateAge(dob[0]);

		for (int i = 1; i < 3; i++) {
			int age = calculateAge(dob[i]);
			if (age < yage) {
				yage = age;
				yindex = i;
			}
		}

		System.out.println("The youngest candidate is: " + candidates[yindex]);
	}

	public static int calculateAge(int[] birthdate) {
		int currentYear = 2023;
		int currentMonth = 10;
		int currentDay = 26;

		int birthYear = birthdate[2];
		int birthMonth = birthdate[1];
		int birthDay = birthdate[0];

		int age = currentYear - birthYear;

		if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
			age--;
		}
		return age;
	}
}