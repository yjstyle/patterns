package lecture.patterns.prototype.framework.grahpic;
import java.util.*;

public class GraphicManager {
	private HashMap<String, Shape> figures = new HashMap<String, Shape>();
	
	public void register(String name, Shape s) {
		figures.put(name, s);
	}
	
	public Shape create(String protoName) {
		Shape s = figures.get(protoName);
		return s.clone();
	}
}
