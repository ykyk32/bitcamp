package basic;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println(2 + 3);          //5
		System.out.println();
		
		System.out.println('2' + '3');      //101 = 50 +51
		System.out.println('2'-48 + '3'-48);      //문자 => 숫자로 변환
		System.out.println();
		
		System.out.println("2" + "3");		//23
		System.out.println(Integer.parseInt( "2") + Integer.parseInt("3"));	    //문자열 => 숫자로 변환
		

	}

}
