package operator;

import java.util.Scanner;

public class Home02 {

	public static void main(String[] args) {
		//char ch = 'T';
		//char ch = 'e';
		
		Scanner scan = new Scanner(System.in);
		char ch =  scan.next().charAt(0);
		
		
		System.out.println(ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : (char)(ch - 32));
		//'A' = 65,'Z' = 90
		// 계산 결과의 default는 int
		
		/*
		   int result = ch>='A' && ch<='Z' ?  ch+32 : ch-32;
      		System.out.println(ch + " → " + (char)result);   
   		  
		  */
	}

}
/*
 [문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오
 조건연산자 사용, 알파벳만 사용
 +-32 
 [실행결과]
 B -> b
 ----------------
 e -> E
 
 
 
 */