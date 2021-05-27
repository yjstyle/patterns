package lecture.patterns.factorymethod.app;

import lecture.patterns.factorymethod.framework.*;

public class CircleFactory extends Factory{
	protected Shape createShape() {
		return new Circle();
	}
}
