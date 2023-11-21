package Darden;
import java.util.Scanner;
public class SimpleArraySearch {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Initialize an array of size 15 (you can modify the values as needed)
	        int[] numbers = {10, 25, 7, 42, 15, 30, 5, 18, 23, 12, 35, 8, 20, 3, 50};

	        System.out.print("Enter a number to search: ");
	        int target = scanner.nextInt();

	        // Perform the search
	        boolean found = false;
	        for (int number : numbers) {
	            if (number == target) {
	                found = true;
	                break;
	            }
	        }

	        // Display the result
	        if (found) {
	            System.out.println("The number " + target + " is present in the array.");
	        } else {
	            System.out.println("The number " + target + " is not present in the array.");
	        }

	        scanner.close();
	    }
	}



