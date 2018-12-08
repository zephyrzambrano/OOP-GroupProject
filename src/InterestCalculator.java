
public class InterestCalculator {
	
	private double principalA=100;
	private double rateA=0.1;
	private double minA=575;
	
	private double principalB=500;
	private double rateB=0.05;
	private double minB=200;
	
	public double calculateInterestA(double years) {
		double withInterest=principalA*rateA*years;
		return (withInterest+minA);
	}
	
	public double calculateInterestB(double years) {
		double withInterest=principalB*rateB*years;
		return (withInterest+minB);
	}
	
	public String compareRates(double a, double b) {
		if (a>b) {
			return "Company A";
		}
		else if (b>a) {
			return "Company B";
		}
		else {
			return "both!";
		}
	}

}
