import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter company A years");
		System.out.print("Enter company B years");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter loan term (in years): ");
	      double termInterestYears = scanner.nextInt();
	      InterestCalculator x=new InterestCalculator();
			double a= scanner.nextDouble();
			 a = x.calculateInterest(a);
			 double b =scanner.nextDouble();
			 b = x.calculateInterest(b); 
			System.out.print("company A interest is " + a);
			System.out.print("company B interest is " + b);
			
		x.compareRates(a, b);
		
		System.out.print("The better interest rate is");
		
	}

}
