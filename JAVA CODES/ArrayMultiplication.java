public class ArrayMultiplication {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {1, 3, 5, 7, 9};
        int[] result = new int[array1.length]; // Initialize the result array

        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for multiplication.");
        } else {
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] * array2[i];
            }

            // Display the result array
            System.out.println("Resultant Array:");
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }
}
