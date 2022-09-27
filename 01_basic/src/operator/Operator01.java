package operator;
import java.text.DecimalFormat;
public class Operator01 {

	public static void main(String[] args) {
		int money = 5738;

		int thousand = money / 1000; //5
		int thousand_mod =	money % 1000;	
		int hundred = thousand_mod/ 100;
		int hundred_mod = thousand_mod % 100;
		int ten = hundred_mod/ 10;
		int ten_mod = hundred_mod % 10;
				
		DecimalFormat dc = new DecimalFormat();
		
		System.out.println("현금 " + new DecimalFormat().format(money) + "원");
		System.out.println("천의 자리 : " + thousand);
		System.out.println("백의 자리 : " + hundred);
		System.out.println("십의 자리 : " + ten);
		System.out.println("일의 자리 : " + ten_mod);
	
	}

}

/*
 [문제] 현금이 5738원이 있다. 각 자리별로 출력하시오.
 
 [실행결과]
현금 5,738원
천의 자리 : 5
백의 자리 : 7
십의 자리 : 3
일의 자리 : 8


 
 
 
 
 
 */