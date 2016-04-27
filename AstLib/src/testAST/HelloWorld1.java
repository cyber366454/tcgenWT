package testAST;

public class HelloWorld1 {
	public HelloWorld1() {
	
		int flag=100000;
		flag++;
		System.out.println(flag);
		
		if(flag > 5 ){
			System.out.println("if expression!");
		}else{
			System.out.println("if else expression!");
		}
		
		while(flag< 10){
			System.out.println("While Expression!");
			++flag;
			flag++;
		}
		
		
		for (int j = 0; j < 10; j++) {			
			System.out.println(j+"1"+"2"+"end");
		}
		if(flag < 500 ){
			System.out.println("if 2expression!");
		}else{
			System.out.println("if 2else expression!");
		}
		System.out.println("final statement.");
	}
}
