import java.util.Scanner;

/**
 * This class contains a method to find the minimum value in an array of integers.
 * It takes user input for the array elements and outputs the minimum value.
 */
public class Problem1 {

    /**
     * Main method to read user input, create the array, call the findMin method, and output the result.
     * Time Complexity: O(n)
     * - The for loop iterates over each element of the array once.
     * - The worst-case time complexity occurs when the array has n elements.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();
        // Create an array for storing elements
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an object of class Problem1
        Problem1 problem1 = new Problem1();

        // Call the findMin method, passing it the array arr
        int min = problem1.findMin(arr);

        // Output the result
        System.out.println(min);
    }

    /**
     * Method for finding the minimum value in the array.
     * Time Complexity: O(n)
     * - The for loop iterates over each element of the array once.
     * - The worst-case time complexity occurs when the array has n elements.
     *
     * @param arr The array of integers in which the minimum value needs to be found.
     * @return The minimum value in the array.
     */
    public int findMin(int[] arr){

        // Assume that the first element of the array is minimal
        int min = arr[0];

        // Go through the rest of the array elements
        for (int i = 0; i < arr.length; i++) {
            // If the current element is less than the previous minimum value, update the minimum value
            if (arr[i] < min){
                min = arr[i];
            }
        }

        // Return the minimum value
        return min;
    }
}
