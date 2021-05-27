package lecture.patterns.factorymethod;

import java.util.*;

import lecture.patterns.factorymethod.app.*;
import lecture.patterns.factorymethod.framework.*;

public class ShapeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory circleFactory = new CircleFactory();
		Factory squareFactory = new SquareFactory();
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(circleFactory.create());
		shapes.add(squareFactory.create());
		shapes.add(circleFactory.create());
		shapes.add(squareFactory.create());
		
		drawAllShapes(shapes);
		
	}
	public static void drawAllShapes(ArrayList<Shape> shapes) {
		for(Shape shape:shapes) {
			shape.draw();
		}
	}
}
