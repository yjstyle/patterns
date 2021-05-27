package lecture.patterns.factorymethod.framework;

public abstract class Factory {
		
	public Shape create() {
		Shape shape = createShape();
		return shape;
	}
	
	protected abstract Shape createShape();

}

