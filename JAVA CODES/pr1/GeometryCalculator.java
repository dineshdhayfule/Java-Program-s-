/*a. Write java program to calculate area of circle, parameter of circle and area of triangle
*/
package pr1;
import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        int circleArea = (int) (Math.PI * Math.pow(radius, 2));
        int circlePerimeter = (int) (2 * Math.PI * radius);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Perimeter of the circle: " + circlePerimeter);

        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        int triangleArea = (int) (0.5 * base * height);

        System.out.println("Area of the triangle: " + triangleArea);

        input.close();
    }
}
