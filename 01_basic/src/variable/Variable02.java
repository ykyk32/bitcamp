package variable;

public class Variable02 {
	static int a; //필드 , 초기화되어있다.
	int b;
	
	public static void main(String[] args) {
		int a = 5; //local variable(지역변수),쓰레기값, 반드시 초기화 해야 한다.
		// int a;
		
		System.out.println("지역변수 a =" + a );
		System.out.println("필드 a =" + Variable02.a );
		System.out.println("필드 b =" + new Variable02().b ); //static 아니니까 new
		
	}

}
