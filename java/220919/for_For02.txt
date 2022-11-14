package for_;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력 : ");
		int dan = scan.nextInt();
		
		for(int i=1;i < 10; i++ ) {
			System.out.println(dan+"*" +i+"="+ dan*i);
		}
		

	}

}
/*
원하는 단을 입력 : 2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
 */