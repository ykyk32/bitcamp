package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("점수 입력하시오 : ");
		int score = scan.nextInt();
		
		// score >= 80 && score <= 100 ? "합격" : "불합격";

		System.out.println(score >= 80 && score <= 100 ? "합격" : "불합격");  //1번 방법
		
		String result = score >= 80 && score <= 100 ? "합격" : "불합격";     //2번 방법
		System.out.println(result);
	}

}
