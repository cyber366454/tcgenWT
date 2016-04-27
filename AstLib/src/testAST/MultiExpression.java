package testAST;

public class MultiExpression {
	public MultiExpression() {
		System.out.println("Hello World!");
		int flag=1;
		int step=6;
		flag = step;
		if(flag > 5 ){
			System.out.println("if expression!");
		}else{
			System.out.println("if else expression!");
		}
		
		for (int j = 0; j < 10; j++) {			
			System.out.print(j+"1"+"2"+"end");
		}
		if(flag < 500 ){
			System.out.println("if 2expression!");
		}else{
			System.out.println("if 2else expression!");
		}
	}
}
