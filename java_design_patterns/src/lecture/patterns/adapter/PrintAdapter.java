package lecture.patterns.adapter;

public class PrintAdapter implements Print {
    
    private LegacyPrinter printer;
    
    public PrintAdapter(String string) {
        this.printer = new LegacyPrinter(string);
    }
    
    @Override
    public void printNormal() {
    	//write code here...
    	
    }

    @Override
    public void printStrong() {
    	//write code here...
    	
    }
}

    