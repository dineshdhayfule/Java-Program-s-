/*
a. Write java program with class name “Student”, using class method 
take students data (name and roll number) and display it using 
class and object*/

package pr2;

import java.util.Scanner;

class Student {
	String name;
	int rollNumber;

	// Constructor to initialize the student's data
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	// Method to display student data
	public void displayStudentDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the student's name: ");
		String name = input.nextLine();

		System.out.print("Enter the student's roll number: ");
		int rollNumber = input.nextInt();

		// Create an object of the Student class
		Student student = new Student(name, rollNumber);

		// Display the student's data using the object
		System.out.println("\nStudent Information:");
		student.displayStudentDetails();

		input.close();
	}
}
