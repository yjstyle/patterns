package lecture.patterns.adapter;

public class LegacyPrinter {
    
	private String string;

    public LegacyPrinter(String string) {
    	this.string = string;
    }
    
    public void show() {
        System.out.println(string);
    }
    
    public void showWithBracket() {
        System.out.println("[ " + string + " ]");
    }
}

    