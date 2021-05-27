package lecture.patterns.abstractfactory.framework.linux;

import lecture.patterns.abstractfactory.framework.*;

public class LinuxShapeFactory extends AbstractShapeFactory{

	@Override
	public Circle createCircle() {
		// TODO Auto-generated method stub
		return new LinuxCircle();
	}

	@Override
	public Square createSquare() {
		// TODO Auto-generated method stub
		return new LinuxSquare();
	}
}
