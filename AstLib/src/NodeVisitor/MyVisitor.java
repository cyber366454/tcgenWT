package NodeVisitor;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import ClassDe.DataWriter;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.*;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTNode;
public class MyVisitor extends ASTVisitor {
	public static ArrayList<ASTNode> MyASTDataList =new ArrayList<ASTNode>();
	DataWriter dw = new DataWriter();
	ArrayList contentData = new ArrayList<String>();
	
}