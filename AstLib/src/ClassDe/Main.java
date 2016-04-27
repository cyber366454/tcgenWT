package ClassDe;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.core.runtime.jobs.Job;

public class Main {
	public static void main(String[] args) {

		
		System.out.println("Get in main.");
		
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\newAST\\HelloWorld.java";
		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\NullData.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\ClassDemo.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\HelloWorld.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\Parameter.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\DeclarationData.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\ForLoop1.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\WhileLoop1.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\IfStatementData1.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\IfStatementData2.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\IfStatementData3.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\MultiExpression.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\thisTestData.java";
//		String path ="C:\\Users\\pllab\\Documents\\tcgenWT\\AstLib\\src\\testAST\\AssignmentDate.java";

		System.out.println("Now file path is "+path+"\n");
		DemoVisitorTest VistTest = new DemoVisitorTest(path);
		CompilationUnit comp = JdtAstUtil.getCompilationUnit(path);  
	//	System.out.println("Get out main.");
		
	}
}