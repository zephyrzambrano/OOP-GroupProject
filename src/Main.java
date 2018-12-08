import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
	    InterestCalculator x=new InterestCalculator();
	    
	    System.out.print("Enter years: "); 
	    double years= scanner.nextDouble();
	    double a = x.calculateInterestA(years);
		double b = x.calculateInterestB(years);
		
		System.out.println("Company A interest is " + a);
		System.out.println("Company B interest is " + b);
		
		String betterRate = x.compareRates(a, b);
		System.out.println("The better interest rate is: " + betterRate);
		
		scanner.close();
		
	}

}
