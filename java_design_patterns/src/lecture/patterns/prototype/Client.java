package lecture.patterns.prototype;
import lecture.patterns.prototype.graphiceditor.GraphicEditor;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor editor = new GraphicEditor();
		
		editor.clickCircle();
		editor.clickCircle();
		editor.clickSquare();
		editor.clickRectangle();
		editor.clickRoundedRectangle();
	}

}
