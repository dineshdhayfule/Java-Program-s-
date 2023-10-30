/*b. Write java program to take one integer and one float number and 
display square and cube of both numbers.*/

package pr1;

import java.util.Scanner;

public class SquareAndCubeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integerNumber = input.nextInt();
        System.out.print("Enter a float number: ");
        float floatNumber = input.nextFloat();

        int integerSquare = integerNumber * integerNumber;
        int integerCube = integerNumber * integerNumber * integerNumber;

        float floatSquare = floatNumber * floatNumber;
        float floatCube = floatNumber * floatNumber * floatNumber;

        System.out.println("Square of the integer: " + integerSquare);
        System.out.println("Cube of the integer: " + integerCube);
        System.out.println("Square of the float: " + floatSquare);
        System.out.println("Cube of the float: " + floatCube);

        input.close();
    }
}
