package lecture.patterns.prototype.graphiceditor;
import lecture.patterns.prototype.framework.grahpic.*;

public class Rectangle extends Shape{
	private String type;
	public Rectangle(String type) {
		this.type = type;
	}
	public void draw() {
		System.out.println("Draw "+type+" Rectangle");
	}
}
