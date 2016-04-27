package ClassDe;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
//import com.ast.util.JdtAstUtil;  
//import com.ast.visitor.DemoVisitor;  
import org.eclipse.jdt.core.dom.Block;

public class DemoVisitorTest {
	ArrayList<ASTNode> mylist = new ArrayList<ASTNode>();
	public static ArrayList<ASTNode> MyNodeList=new ArrayList<ASTNode>();
	public DemoVisitorTest(String path) {
		CompilationUnit comp = JdtAstUtil.getCompilationUnit(path);
		DemoVisitor visitor = new DemoVisitor();

//		comp.accept(visitor);
//		System.out.println(MyNodeList);
		mylist = JdtAstUtil.acceptVisit(comp);
		NodetoCLG clg = new NodetoCLG(mylist);
	//	System.out.println("mylist: "+mylist);
		
//		comp.accept(new DemoVisitor() {
//			public boolean visit(ExpressionStatement node) {
//				System.out.println("1111"+node.getExpression());
//				mylist.add(node.getExpression());
//				return true;
//			}
//
//		});
		
		
	}
}