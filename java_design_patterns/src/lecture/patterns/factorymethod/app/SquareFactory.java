package lecture.patterns.factorymethod.app;

import lecture.patterns.factorymethod.framework.*;


public class SquareFactory extends Factory{	
	protected Shape createShape() {
		return new Square();
	}
}
