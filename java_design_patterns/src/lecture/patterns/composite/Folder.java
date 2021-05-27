package lecture.patterns.composite;

import java.util.ArrayList;

public class Folder extends Item{

    private String name;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public Folder(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
    	int size = 0;
    	for(Item item : items) {
    		size += item.getSize();
    	}    
    	return size;
    }

    @Override
    public void add(Item item) {
    	items.add(item);
    }

}
