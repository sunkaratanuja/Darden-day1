package Darden;
import java.util.Scanner;
public class armstrongNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    }

	    static boolean isArmstrongNumber(int num) {
	        int originalNumber = num;
	        int sum = 0;
	        int numberOfDigits = String.valueOf(num).length();

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        return sum == originalNumber;
	    }
	}



