import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
	    
	      InterestCalculator x=new InterestCalculator();
	      System.out.print("Enter company A years"); 
	      double a= scanner.nextDouble();
			 a = x.calculateInterest(a);
			 System.out.print("Enter company B years");
			 double b =scanner.nextDouble();
			 b = x.calculateInterest(b); 
			System.out.print("company A interest is " + a);
			System.out.print("company B interest is " + b);
		
			double betterrate = x.compareRates(a, b);
		System.out.print("The better interest rate is" + betterrate);
		
	}

}
