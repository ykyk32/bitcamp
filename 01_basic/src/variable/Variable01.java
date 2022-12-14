package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //static 은 아무때나 쓸 수 있다.
		System.out.println(Long.MAX_VALUE);
		
		boolean a;//1byte로 잡고 들어간다 사용공간은 1 bit
		a = false; //대입문  0 =false 1 = true
		System.out.println("a = " + a);
		
		char b = 'A';
		System.out.println("b = " + b);
		
		char c  = 65;
		System.out.println("c = " + c);//A    0000 0000 0100 0001
		
		//byte d = 128; -error (cannot convert from int to byte)
		
		int e = 65;
		System.out.println("e = " + e); //65   0000 0000 0000 0000 0000 0000 0100 0001
		
		int f = 'A';
		System.out.println("f = " + f); //65
		
		long g = 65L;  //65L 은 long형 상수
		
		//float h = 43.8; //error - 43.8은 double형 상수 
		float h = 43.8f; //43.8f는 float형 상수 
		float h2 = (float)43.8; //강제형변환 (Cast 연산)
		
		System.out.println("h = " + h);
	
	}

}
