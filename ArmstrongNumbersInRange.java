package Darden;

public class ArmstrongNumbersInRange {
	
	    public static void main(String[] args) {
	        System.out.println("Armstrong numbers between 100 and 999:");

	        for (int i = 100; i <= 999; i++) {
	            if (isArmstrongNumber(i)) {
	                System.out.println(i);
	            }
	        }
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


