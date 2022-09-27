package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("정수 입력하시오 : ");
		int input = scan.nextInt();
		
		System.out.println(input % 2 == 0 ? input + "는 짝수" : input + "는 홀수");
		
		String result =  input % 2 == 0 && input % 3 == 0 ? input +"는 2와3의 공배수이다" : input +"는 2와3의 공배수가 아니다";
		System.out.println(result); ///방법1
		
		System.out.println(input + "는 2와 3의 공배수" + (input % 2 == 0 && input % 3 == 0 ? "이다" : "가 아니다")); //방법2
		
		String result2 =input % 2 == 0 && input % 3 == 0 ? "공배수이다" : "공배수가아니다가 아니다";
		System.out.println(input + "는 2와 3의 " + result2 );//방법3
				
	}

}
/*
 [문제]
 정수를 입력하여 짝수? 홀수?,2와 3의 공배수이냥 ? 아니냥?
 
  정수 입력하시오 : 12
  12는 짝수
  12는 2와 3의 공배수이다
  ---------------------------------
  정수 입력하시오 : 15
  15는 홀수
  15는 2와 3의 공배수가 아니다.
 
 */