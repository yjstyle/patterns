package lecture.patterns.prototype.graphiceditor;
import lecture.patterns.prototype.framework.grahpic.*;

public class GraphicEditor {

	GraphicManager manager = new GraphicManager();
	
	public GraphicEditor() {
				
		Shape circle = new Circle();
		Shape roundedRect = new Rectangle("round off the edge");
		Shape normalRect = new Rectangle("normal");
		Shape square = new Square();
		
		manager.register("circle", circle);
		manager.register("rectangle", normalRect);
		manager.register("rounded rectangle", roundedRect);
		manager.register("square", square);
	}
	
	public void clickCircle() {
		manager.create("circle").draw();
		
	}
	
	public void clickRectangle() {
		manager.create("rectangle").draw();
		
	}
	
	public void clickRoundedRectangle() {
		manager.create("rounded rectangle").draw();
		
	}
	
	public void clickSquare() {
		manager.create("square").draw();
		
	}
	
}