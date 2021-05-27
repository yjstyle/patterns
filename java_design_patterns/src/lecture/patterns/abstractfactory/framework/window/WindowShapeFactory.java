package lecture.patterns.abstractfactory.framework.window;

import lecture.patterns.abstractfactory.framework.*;

public class WindowShapeFactory extends AbstractShapeFactory {

	@Override
	public Circle createCircle() {
		// TODO Auto-generated method stub
		return new WindowCircle();
	}

	@Override
	public Square createSquare() {
		// TODO Auto-generated method stub
		return new WindowSquare();
	}

}
