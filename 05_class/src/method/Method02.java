package method;

public class Method02 {
	
	public void disp() {//구현
		System.out.println("non-static method");
	}
	public static void output() {//구현
		System.out.println("static method");
	}
		
	public static void main(String[] args) {
		Method02.output();//호출
		output();//같은 구역내라 Method02안써도 괜찮
		
		//disp();// non-static method		
		Method02 m= new Method02();
		m.disp();
		
	}

}
