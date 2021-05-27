package lecture.patterns.visitor;

public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Folder folder);
}

