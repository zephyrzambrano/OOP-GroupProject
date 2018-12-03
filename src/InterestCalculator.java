
public class InterestCalculator {
	
	private double principal=1000;
	private double rate=0.05;
	
	public double calculateInterest(double years) {
		double withInterest=principal*rate*years;
		return (withInterest);
	}
	
	public double compareRates(double a, double b) {
		if (a>b) {
			return a;
		}
		else if (b>a) {
			return b;
		}
		else {
			return a;
		}
	}

}
