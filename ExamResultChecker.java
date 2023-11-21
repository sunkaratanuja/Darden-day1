package Darden;
import java.util.Scanner;

public class ExamResultChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter marks for Subject 1: ");
	        int subject1 = scanner.nextInt();

	        System.out.print("Enter marks for Subject 2: ");
	        int subject2 = scanner.nextInt();

	        System.out.print("Enter marks for Subject 3: ");
	        int subject3 = scanner.nextInt();

	        // Condition 1: All subjects marks greater than 60 is Passed
	        if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
	            System.out.println("Result: Passed");
	        }
	        // Condition 2: Any two subjects marks greater than 60 is Promoted
	        else if ((subject1 > 60 && subject2 > 60) || (subject1 > 60 && subject3 > 60) || (subject2 > 60 && subject3 > 60)) {
	            System.out.println("Result: Promoted");
	        }
	        // Condition 3: Any one subject mark greater than 60 or all subjects' marks less than 60 is failed
	        else if (subject1 > 60 || subject2 > 60 || subject3 > 60 || (subject1 <= 60 && subject2 <= 60 && subject3 <= 60)) {
	            System.out.println("Result: Failed");
	        }

	        scanner.close();
	    }
	}


