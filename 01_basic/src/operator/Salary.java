package operator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat();

		System.out.print("이름 입력 :");
		String name = scan.next();
		System.out.print("직급 입력 :");
		String position = scan.next();
		System.out.print("기본급 입력 :");
		int basePay = scan.nextInt();
		System.out.print("수당 입력 :");
		int extra = scan.nextInt();
		
		/*
		 String name, position;
		 int basepay, extrapay, sum, tax;
		 
		System.out.print("이름 입력 :");
		name = scan.next();
		System.out.print("직급 입력 :");
		position = scan.next();
		System.out.print("기본급 입력 :");
		basePay = scan.nextInt();
		System.out.print("수당 입력 :");
		extra = scan.nextInt();
	
		 
		 */
		
		System.out.println("*** " + name +""+ position +" 월급 ***");
		System.out.println("기본급 : "+ dc.format(basePay) + "원");
		System.out.println("수당 : " + dc.format(extra) + "원");
		
		int sum = basePay + extra;
		System.out.println("합계 : " + dc.format(sum) + "원");
		
		double taxRate =  sum >= 5000000 ? sum >=3000000 ? 0.03: 0.02 : 0.01; 
		System.out.println("세금 : " + dc.format((int)(sum *taxRate)) + "원");
		
		double salary = sum -(sum *taxRate);
		System.out.println("월급 : " +dc.format((int)salary) + "원");
		
		
		/*
		 
		 조건 ? 참 : 거짓;
		 조건 ? 참 : 조건? 참 : 거짓;
		*/
		
	}

}

/*
 [문제] 월급 계산 프로그램
 이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오.
 단, 합계가 5,000,000원이 이상이면 3%
 		  3,000,000원이 이상이면 2%
 		  아니면 1%
 		  (조건연산자 사용)
 합계 = 기본급 + 수당 
 세금 = 합계 * 세율
 월급 = 합계 - 세금
 
 [실행결과]
 이름 입력 : 홍길동
 직급 입력 : 부장
 기본급 입력 : 4900000
 수당 입력 : 200000
 
 *** 홍길동 부장 월급 ***
 
 기본급 : 4,900,000원
 수당 : 200,000원
 합계 : 5,100,000원
 세금 : 153,000원
 월급 : 4,947,000원
 */