package ClassDe;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.IfStatement;

public class NodetoCLG {
	public NodetoCLG(ArrayList<ASTNode> listData){	
		for(ASTNode node:listData){
			System.out.println(node.getClass().getName());
		if(node.getClass().getName().equals("org.eclipse.jdt.core.dom.IfStatement")){
	
		}
		}
		
	}

}
