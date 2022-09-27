package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		System.out.println("큰 값 ="+ Math.max(25, 36)); //java.lang 은 이미 알고잇다 
		System.out.println("큰 값 ="+ Math.max(78.9, 55.8));
		
		System.out.println();
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*26 + 65) ); //65 ~ 90, (90 - 65 + 1) + 65)
		System.out.println((char)(Math.random()*26 + 65) );//65 ~ 90
		
		System.out.println(new Random().nextDouble()); //1회용
	}

}

/*
  난수 - 컴퓨터가 불규칙하게 발생하는 수
 	  - 0 <= 난수 <1
 	  -a ~ b 사이의 난수 발생 => (int)(Math.random()*(b-a +1) +a) 	  
 	  
 */