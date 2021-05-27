package lecture.patterns.tcafe;

public class Beverage {
	public String description;
	
	private double milkCost = .10;
	private double soyCost = .15;
	private double mochaCost = .20;
	private double whipCost = .10;
	
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	
	public double cost() {
		double condimentCost = 0.0;
		
		if (hasMilk()) {
			condimentCost += milkCost;
		}
		if (hasSoy()) {
			condimentCost += soyCost;
		}
		if (hasMocha()) {
			condimentCost += mochaCost;
		}
		if (hasWhip()) {
			condimentCost += whipCost;
		}
		
		return condimentCost;
	}
	
	public boolean hasMilk() { return this.milk; }
	public boolean hasSoy() { return this.soy; }
	public boolean hasMocha() { return this.mocha; }
	public boolean hasWhip() { return this.whip; }
}
