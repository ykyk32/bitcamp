package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();	
		
		
		//큰분류 먼저 한다음에 세부 분류
		if (a <= b && a <= c) {//a가 가장 작은 경우
			if (b<=c)System.out.println(a +", "+ b +", "+ c);			
			else System.out.println(a +", "+ c +", "+ b);			
		}else if (b<= c) {//b가 가장 작은 경우 - a는 b보다 큼 앞의 if조건에 걸려서
			if (a <= c) System.out.println(b+", "+a+", "+c);
			else System.out.println(b  +", "+c+", "+a);			
		}else {//c가 가장 작은경우 
			if(a <= b)System.out.println(c+" "+a+" "+b);
			else System.out.println(c+" "+b+" "+a);
					
		}
		
		
		
	}

}

/*
 3개의 숫자 (a,b,c)를 입력받아수 순서대로 출력(if문 사용)
[실행결과]
a의 값 : 5
b의 값 : 7
c의 값 : 6
5, 6, 7
 */