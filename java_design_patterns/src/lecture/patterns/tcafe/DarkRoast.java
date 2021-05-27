package lecture.patterns.tcafe;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		description = "최고의 다크 로스트";
	}
	
	public double cost() {
		return 0.99 + super.cost();
	}
}


