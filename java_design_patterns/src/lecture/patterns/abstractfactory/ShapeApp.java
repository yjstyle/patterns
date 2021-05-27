package lecture.patterns.abstractfactory;

import lecture.patterns.abstractfactory.framework.*;
import lecture.patterns.abstractfactory.framework.linux.*;
import lecture.patterns.abstractfactory.framework.window.*;


public class ShapeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractShapeFactory factory = new LinuxShapeFactory();
		
		Circle circle = factory.createCircle();
		Square square = factory.createSquare();
		
		circle.draw();
		square.draw();
	}

}
