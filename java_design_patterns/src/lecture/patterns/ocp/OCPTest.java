package lecture.patterns.ocp;

public class OCPTest {

	enum ShapeType {
		CIRLCE,
		SQUARE,
		RECTANGLE
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawShape(ShapeType.CIRLCE);
	}
	
	public static void drawShape(ShapeType type){
		if( type == ShapeType.CIRLCE ) {
			Circle circle = new Circle();
			circle.draw();
		} else if (type == ShapeType.SQUARE ) {
			Square square = new Square();
			square.draw();
		} else if( type == ShapeType.RECTANGLE ) {
			Rectangle rect = new Rectangle();
			rect.draw();
		}
	}
}
