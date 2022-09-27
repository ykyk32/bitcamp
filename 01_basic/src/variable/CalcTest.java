package variable;
	
	import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		

		short a = 320;
		short b = 258;
		
		short sum = (short)(a + b);  //정수형 끼리 계산의 결과값은 int형이 기본
		
		short sub = (short)(a - b);
		int mul = a * b;
		double div = (double)a / b;    // 강제형변환/ 자동형변환   <-소수점 위치 맞추듯이 하나를 실수형으로 바꿔준다.
		
		System.out.println(a + " + " + b + " = " + sum );
		System.out.println(a + " - " + b + " = " + sub );
		
		System.out.println(a + " * " + b + " = " +new DecimalFormat().format(mul));//세자리마다 쉼표		
		System.out.println(a + " / " + b + " = " + String.format("%7.5f",div));
	}

}


/*
 [문제] 변수를 이용하여 320, 258 의 합sum, 차sub, 곱mul, 몫div을 구하시오
 
 [실행결과]
 320 + 258 = xxx
 320 - 258 = xxx
 320 * 258 = xxx
 320 / 258 = xxx
 
 */