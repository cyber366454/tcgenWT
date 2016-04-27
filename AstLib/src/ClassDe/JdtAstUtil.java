package ClassDe;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;

public class JdtAstUtil {
	/**
	 * get compilation unit of source code
	 * 
	 * @param javaFilePath
	 * @return CompilationUnit
	 */
	
	
	public static CompilationUnit getCompilationUnit(String javaFilePath) {
		byte[] input = null;
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(javaFilePath));
			input = new byte[bufferedInputStream.available()];
			bufferedInputStream.read(input);
			bufferedInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		ASTParser astParser = ASTParser.newParser(AST.JLS3);
		astParser.setSource(new String(input).toCharArray());
		astParser.setKind(ASTParser.K_COMPILATION_UNIT);
/*
		 Map options = JavaCore.getOptions();
		 JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options);
		 astParser.setCompilerOptions(options);
	*/	
		
		CompilationUnit result = (CompilationUnit) (astParser.createAST(null));

		return result;
	}
	public static ArrayList<ASTNode> acceptVisit(CompilationUnit cuAst){
		final ArrayList<ASTNode> myList= new ArrayList<ASTNode>();
		DemoVisitor DeVisitor = new DemoVisitor();
		cuAst.accept(DeVisitor);	

//		
//		cuAst.accept(new DemoVisitor(){
//			public boolean visit(ExpressionStatement node) {
//			System.out.println(node.getExpression());
//			myList.add(node.getExpression());
//			DemoVisitorTest.MyNodeList.add(node.getExpression());
//			return true;
//		}

//	}
		
		return DemoVisitorTest.MyNodeList;
	}
	
	
	
	
}