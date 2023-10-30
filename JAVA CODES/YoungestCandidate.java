import java.util.Scanner;

public class YoungestCandidate {
    public static void main(String[] args) {
        String[] candidates = {"Candidate 1", "Candidate 2", "Candidate 3"};
        int[][] birthdates = new int[3][3]; // 3 candidates, 3 values for each birthdate (day, month, year)

        Scanner scanner = new Scanner(System.in);

        // Input birthdates for each candidate
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter birthdate for " + candidates[i] + " (day, month, year):");
            for (int j = 0; j < 3; j++) {
                birthdates[i][j] = scanner.nextInt();
            }
        }

        // Find the candidate with the youngest age
        int youngestIndex = 0;
        int youngestAge = calculateAge(birthdates[0]);

        for (int i = 1; i < 3; i++) {
            int age = calculateAge(birthdates[i]);
            if (age < youngestAge) {
                youngestAge = age;
                youngestIndex = i;
            }
        }

        // Display the name of the youngest candidate
        System.out.println("The youngest candidate is: " + candidates[youngestIndex]);
    }

    public static int calculateAge(int[] birthdate) {
        // Assuming the current date is 2023-10-26
        int currentYear = 2023;
        int currentMonth = 10;
        int currentDay = 26;

        int birthYear = birthdate[2];
        int birthMonth = birthdate[1];
        int birthDay = birthdate[0];

        int age = currentYear - birthYear;
        
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--; // Decrease age if the birthdate hasn't occurred yet this year.
        }

        return age;
    }
}
