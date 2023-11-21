package Darden;
import java.util.Scanner;
public class InterestCalculator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter interest rate (in percentage): ");
	        double rate = scanner.nextDouble();

	        System.out.print("Enter time (in years): ");
	        double time = scanner.nextDouble();

	        // Calculate Simple Interest
	        double simpleInterest = calculateSimpleInterest(principal, rate, time);
	        System.out.println("Simple Interest: " + simpleInterest);

	        // Calculate Compound Interest
	        System.out.print("Enter number of times interest is compounded per year: ");
	        int n = scanner.nextInt();
	        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
	        System.out.println("Compound Interest: " + compoundInterest);

	        scanner.close();
	    }

	    static double calculateSimpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100;
	    }

	    static double calculateCompoundInterest(double principal, double rate, double time, int n) {
	        double compoundInterest = principal * Math.pow((1 + rate / (100 * n)), n * time) - principal;
	        return compoundInterest;
	    }

}
