/*
b. Implement a Java Program to demonstrate at least 10 math class 
methods*/
package pr4;

public class MathMethodsDemo {
	public static void main(String[] args) {
		// Math class methods

		// 1. Absolute value
		double num1 = -10.5;
		double absValue = Math.abs(num1);
		System.out.println("Absolute value of " + num1 + " is " + absValue);

		// 2. Square root
		double num2 = 16;
		double sqrtValue = Math.sqrt(num2);
		System.out.println("Square root of " + num2 + " is " + sqrtValue);

		// 3. Power
		double base = 2;
		double exponent = 3;
		double powerValue = Math.pow(base, exponent);
		System.out.println(base + " raised to the power " + exponent + " is " + powerValue);

		// 4. Trigonometric functions
		double angle = 45;
		double radian = Math.toRadians(angle);
		double sinValue = Math.sin(radian);
		double cosValue = Math.cos(radian);
		double tanValue = Math.tan(radian);
		System.out.println("Sine of " + angle + " degrees is " + sinValue);
		System.out.println("Cosine of " + angle + " degrees is " + cosValue);
		System.out.println("Tangent of " + angle + " degrees is " + tanValue);

		// 5. Minimum and maximum
		int num3 = 5;
		int num4 = 10;
		int min = Math.min(num3, num4);
		int max = Math.max(num3, num4);
		System.out.println("Minimum of " + num3 + " and " + num4 + " is " + min);
		System.out.println("Maximum of " + num3 + " and " + num4 + " is " + max);

		// 6. Rounding
		double num5 = 3.75;
		double roundedValue = Math.round(num5);
		System.out.println("Rounded value of " + num5 + " is " + roundedValue);

		// 7. Random number
		double randomValue = Math.random();
		System.out.println("Random number between 0 and 1: " + randomValue);

		// 8. Exponential function
		double num6 = 2.0;
		double expValue = Math.exp(num6);
		System.out.println("e^" + num6 + " is " + expValue);

		// 9. Logarithms
		double num7 = 64.0;
		double logValue = Math.log(num7);
		System.out.println("Natural logarithm of " + num7 + " is " + logValue);

		// 10. Constants
		System.out.println("Value of pi: " + Math.PI);
		System.out.println("Value of e: " + Math.E);
	}
}
