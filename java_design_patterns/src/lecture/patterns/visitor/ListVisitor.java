package lecture.patterns.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor{
	private String currDir = "";
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currDir + "/" + file);
	}

	@Override
	public void visit(Folder folder) {
		// TODO Auto-generated method stub
		System.out.println(currDir + "/" + folder);
		Iterator<Item> it = folder.iterator();
		
		while(it.hasNext()) {
			Item item = it.next();
			item.accept(this);
		}
	}
}

