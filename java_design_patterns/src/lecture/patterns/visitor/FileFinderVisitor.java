package lecture.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFinderVisitor extends Visitor{
	
	private String fileType="";
	private ArrayList<Item> found = new ArrayList<Item>();
	
	public FileFinderVisitor(String fileType) {
		this.fileType = fileType;
	}
	
	public Iterator<Item> getFoundFiles() {
		return found.iterator();
	}
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		if(file.getName().endsWith(fileType)) {
			found.add(file);
		}
	}

	@Override
	public void visit(Folder folder) {
		// TODO Auto-generated method stub
		Iterator<Item> it = folder.iterator();
		while(it.hasNext()) {
			Item item = it.next();
			item.accept(this);
		}
	}

}
