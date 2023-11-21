package Darden;
import java.util.Scanner;
public class LoginApplication {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Valid login credentials
	        String validUsername = "user123";
	        String validPassword = "pass123";

	        int attempts = 0;
	        boolean loggedIn = false;

	        while (attempts < 3 && !loggedIn) {
	            System.out.print("Enter your login name: ");
	            String enteredUsername = scanner.nextLine();

	            System.out.print("Enter your password: ");
	            String enteredPassword = scanner.nextLine();

	            // Check if entered credentials are valid
	            if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
	                loggedIn = true;
	                System.out.println("Welcome, " + enteredUsername + "!");
	            } else {
	                attempts++;
	                System.out.println("Invalid login credentials. Attempts left: " + (3 - attempts));
	            }
	        }

	        if (!loggedIn) {
	            System.out.println("Contact Admin. Too many unsuccessful attempts.");
	        }

	        scanner.close();
	    }
	}



