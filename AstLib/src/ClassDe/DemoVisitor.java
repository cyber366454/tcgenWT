package ClassDe;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.*;

public class DemoVisitor extends ASTVisitor {
	DataWriter dw = new DataWriter();
	ArrayList contentData = new ArrayList<String>();
	boolean typeCheck = false;

	@Override
	public boolean visit(CompilationUnit node) {

		System.out.println("CompilationUnit:\t");
		contentData.add(/* node.getStartPosition() + */ "begin");
		return true;
	}

	@Override
	public void endVisit(CompilationUnit node) {
		System.out.println("CompilationUnitEnd.");
		contentData.add("end.");
		dw.writeInfo(contentData);
	}

	@Override
	public boolean visit(PackageDeclaration node) {
		System.out.println("PackageDeclaration:\t");
		// contentData.add("PackageDeclaration:\t");
		// System.out.println("PackageDeclaration:\t"+node.getName().getFullyQualifiedName());
		DemoVisitorTest.MyNodeList.add(node);
		return true;
	}

	@Override
	public void endVisit(PackageDeclaration node) {
		// System.out.println("PackageDeclarationEnd.\n");
		// System.out.println("PackageDeclaration:\t"+node.getName().getFullyQualifiedName()+"\tEnd.\n");
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		System.out.println("TypeDeclaration:\t");
		// System.out.println("TypeDeclaration:\t"+node.getName().getFullyQualifiedName());
		// contentData.add("TypeDeclaration:\t");
		DemoVisitorTest.MyNodeList.add(node);
		return true;
	}

	@Override
	public void endVisit(TypeDeclaration node) {
		// System.out.println("TypeDeclarationEnd.\n");
		// System.out.println("TypeDeclaration:\t"+node.getName().getFullyQualifiedName()+"\tEnd.\n");

	}

	@Override
	public boolean visit(Modifier node) {
		System.out.println("\tModifier:\t" + node.getKeyword());
		// contentData.add(node.getKeyword().toString());
		// contentData.add("\tModifier:\t" + node.getKeyword());

		return true;
	}

	@Override
	public void endVisit(Modifier node) {
	}

	@Override
	public boolean visit(MethodInvocation node) {
		System.out.println("MethodInvocation: " + node.getExpression() + "." + node.getName());
		System.out.println("MethodInvocation Arguments:\t" + node.arguments());
		contentData.add(node.getExpression() + "." + node.getName());
		contentData.add(node.arguments().toString());
		// contentData.add("MethodInvocation: " + node.getExpression() + "." +
		// node.getName());
		// contentData.add("MethodInvocation Arguments:\t" + node.arguments());
		return true;
	}

	@Override
	public boolean visit(MethodDeclaration node) {
		System.out.println("MethodDeclaration:\t");
		// System.out.println("MethodDeclaration:\t"+node.getName());
		// contentData.add("MethodDeclaration:\t");
		return true;
	}

	@Override
	public void endVisit(MethodDeclaration node) {
		// System.out.println("MethodDeclarationEnd.\t");
	}

	@Override
	public boolean visit(ExpressionStatement node) {
		System.out.println("ExpressionStatement:\t" + node.getExpression());
		// myList.add(node.getExpression());
		// DemoVisitorTest.MyNodeList.add(node.getExpression());
		contentData.add(node.getExpression().toString());
		// contentData.add("ExpressionStatement:\t" + node.getExpression());
		return true;
	}

	@Override
	public void endVisit(ExpressionStatement node) {
		// System.out.println("ExpressionStatementEnd.\t");
		// myList.add(node.getExpression());
	}

	@Override
	public boolean visit(SingleVariableDeclaration node) {
		System.out.println("SingleVariableDeclaration:");
		return true;
	}

	@Override
	public boolean visit(SimpleName node) {
		if (typeCheck) {
			System.out.println("\tparentType:\n\t\t" + node.getParent().getClass().getName());
		}
		// if
		// (node.getParent().getClass().getName().equals("org.eclipse.jdt.core.dom.PackageDeclaration"))
		// {
		System.out.println("\tSimpleName:\t" + node.getFullyQualifiedName());
		// contentData.add(node.getFullyQualifiedName());
		// contentData.add("\tSimpleName:\t" +
		// node.getFullyQualifiedName());
		// }
		return true;
	}

	@Override
	public boolean visit(SimpleType node) {
		System.out.println("SimpleType:\t" + node.getName());
		contentData.add(node.getName());
		// contentData.add("SimpleType:\t" + node.getName());
		return true;
	}

	@Override
	public boolean visit(ForStatement node) {
		System.out.println("For:\t");
		// contentData.add("For:\t");
		return true;
	}

	@Override
	public void endVisit(ForStatement node) {
		System.out.println("ForEnd.");
	}

	@Override
	public boolean visit(InfixExpression node) {
		System.out.println("Infix:\t");
		System.out.print("left operator - operator - right operator:" + "\t");
		System.out.println(node.getLeftOperand() + " " + node.getOperator() + " " + node.getRightOperand());
		System.out.println("Left operator :\t" + node.getLeftOperand());
		System.out.println("Operator :\t" + node.getOperator());
		System.out.println("Right operator :" + node.getRightOperand());
		contentData.add("Infix:\t");
		contentData.add("left operator - operator - right operator:" + "\t");
		contentData.add(node.getLeftOperand() + " " + node.getOperator() + " " + node.getRightOperand());
		contentData.add("Left operator :\t" + node.getLeftOperand());
		contentData.add("Operator :\t" + node.getOperator());
		contentData.add("Right operator :" + node.getRightOperand());
		if (!node.extendedOperands().isEmpty()) {
			System.out.println("extend operands :" + node.extendedOperands().toString());
			contentData.add("extend operands :" + node.extendedOperands().toString());
		}
		return true;
	}

	@Override
	public void endVisit(InfixExpression node) {
	}

	@Override
	public boolean visit(PostfixExpression node) {
		System.out.println("Postfix:\t" + node.getOperand() + node.getOperator());
		System.out.println("PostfixOperand:\t" + node.getOperand());
		System.out.println("PostfixOperator:" + node.getOperator());
		contentData.add("Postfix:\t" + node.getOperand() + node.getOperator());
		contentData.add("PostfixOperand:\t" + node.getOperand());
		contentData.add("PostfixOperator:" + node.getOperator());
		return true;
	}

	@Override
	public void endVisit(PostfixExpression node) {
	}

	@Override
	public boolean visit(WhileStatement node) {
		System.out.println("While Expression:\t" + node.getExpression());
		contentData.add("While Expression:\t" + node.getExpression());
		return true;
	}

	@Override
	public boolean visit(IfStatement node) {
		System.out.println("If:\t" + node.getExpression());
		System.out.println("ThenStatement :" + node.getThenStatement());
		System.out.println("ElseStatement :" + node.getElseStatement());
		contentData.add("If:\t" + node.getExpression());
		contentData.add("ThenStatement :" + node.getThenStatement());
		contentData.add("ElseStatement :" + node.getElseStatement());
		DemoVisitorTest.MyNodeList.add(node);
		return true;
	}

	@Override
	public boolean visit(PrimitiveType node) {
		System.out.println("PrimitiveType:\t" + node.getPrimitiveTypeCode());
		contentData.add(node.getPrimitiveTypeCode().toString());
		// contentData.add("PrimitiveType:\t" + node.getPrimitiveTypeCode());
		return true;
	}

	@Override
	public boolean visit(Assignment node) {
		System.out.println("Assignment:\t" + node.getLeftHandSide() + "->" + node.getRightHandSide());
		// DemoVisitorTest.MyNodeList.add(node.getLeftHandSide());
		contentData.add(node.getLeftHandSide() + "->" + node.getRightHandSide());
		// contentData.add("Assignment:\t" + node.getLeftHandSide() + "->" +
		// node.getRightHandSide());
		return true;
	}

	@Override
	public boolean visit(FieldAccess node) {
		System.out.println("FieldAccess:\t" + node.getExpression() + "." + node.getName());
		contentData.add(node.getExpression() + "." + node.getName());
		// contentData.add("FieldAccess:\t" + node.getExpression() + "." +
		// node.getName());
		return true;
	}

	@Override
	public boolean visit(NumberLiteral node) {
		// System.out.println("par number:\t" +
		// node.getParent().getClass().toString());
		if (node.getParent().getClass().toString().equals("class org.eclipse.jdt.core.dom.InfixExpression") || node
				.getParent().getClass().toString().equals("class org.eclipse.jdt.core.dom.VariableDeclarationFragment"))
			return true;
		System.out.println("NumberLiteral:\t" + node.getToken());
		contentData.add(node.getToken());
		// contentData.add("NumberLiteral:\t" + node.getToken());
		return true;
	}

	@Override
	public boolean visit(VariableDeclarationFragment node) {
		System.out.println("VariableDeclarationFragment:\t" + node.getName());
		System.out.println("VariableDeclarationInitializer:\t" + node.getInitializer());
		contentData.add(node.getName().toString());
		if (node.getInitializer() != null)
			contentData.add(node.getInitializer().toString());
		// contentData.add("VariableDeclarationFragment:\t" + node.getName());
		// contentData.add("VariableDeclarationInitializer:\t" +
		// node.getInitializer());

		return true;
	}

}