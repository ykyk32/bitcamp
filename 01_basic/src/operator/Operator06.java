package operator;

public class Operator06 {

	public static void main(String[] args) {
		
		boolean a = 25>36;
		System.out.println("a = " + a); //false
		System.out.println("!a = " + !a); //true
		System.out.println();
		
		String b = "apple"; //literal생성
		String c = new String("apple");
		System.out.println("b == c ?" + (b == c ? "같다": "다르다"));//참조값,메모리에 주소가 각자 잡혀있다.주소값비교
		System.out.println("b != c ?" + (b != c ? "참": "거짓"));
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));//문자열 자체를 비교할때
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));
		
		
	}

}
