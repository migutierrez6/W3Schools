package practice;
import java.util.Scanner;
import java.text.NumberFormat;

public class mortgageCalculator {

	public static void main(String[] args) {
	
		final int MONTHS_IN_YEAR = 12;
		final int PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal amount: ");
		int principal = scanner.nextInt();
		
		System.out.print("Annual Interes Rate: ");
		double annualInterest = scanner.nextDouble();
		double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		
		System.out.print("Period in years: ");
		int years = scanner.nextInt();
		int numberOfPayments =  years * MONTHS_IN_YEAR;
		
		Double mortgage = principal
					* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))	
					/ (Math.pow(1 + monthlyInterest, numberOfPayments) -1);	
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.print("Mortgage: " + mortgageFormatted);
	 
	
	
	
	}
}
