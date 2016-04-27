package NodeVisitor;

import org.eclipse.jdt.core.dom.CompilationUnit;

public class MyCompilationUnitVisitor extends MyVisitor{
	@Override
	public boolean visit(CompilationUnit node) {

		System.out.println("CompilationUnit:\t");
		MyASTDataList.add(node);
		contentData.add(node.getStartPosition() + " begin");
		return true;
	}

	
	@Override
	public void endVisit(CompilationUnit node) {
		System.out.println("CompilationUnitEnd.");
		MyASTDataList.add(node);
		contentData.add("end.");
		dw.writeInfo(contentData);
	}
}
