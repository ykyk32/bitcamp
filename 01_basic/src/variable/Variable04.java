package variable;

import java.util.Random; //메뉴판 이라고 생각

public class Variable04 {

	public static void main(String[] args) {
		int a =10; //정수형 변수, 지역변수
		System.out.println("지역변수 a =" + a);
		System.out.println();
		
		Random r = new Random(); //클래스형 변수 >객체
		System.out.println("객체 r =" + r);
		System.out.println(r.nextDouble()); // 1회용 x
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100)); // 0 ~ 99
		System.out.println(r.nextInt(26)+65);  //65~ 99    (Math.random()*26 + 65)
		System.out.println();
		
		String b = new String("사과"); ///메모리에 생성 ,음식 만들엇다.
		String c = "딸기";  // 문자열 literal 생성, 상수아님,
		System.out.println(b + "\t" + c);
		
		

	}

}
