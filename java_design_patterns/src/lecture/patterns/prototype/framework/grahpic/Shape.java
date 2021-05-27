package lecture.patterns.prototype.framework.grahpic;

public abstract class Shape implements Cloneable{
	public abstract void draw();
	
	public Shape clone() {
		Shape s = null;
		try {
			s = (Shape) super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return s;
	}
}
