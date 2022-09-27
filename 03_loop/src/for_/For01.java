package for_;

public class For01 {
	public static void main(String[] args) {
		
		int i ;// local 구역, 
		for(i = 1; i <= 10; i++) {
			System.out.println("Hello Java : " + i);
		}//for
		
		System.out.println("탈출 i = " + i);//11
		
		
		//10 9 8 7 6 5 4 3 2 1 
		for (i=10; i >= 1; i--) {
			System.out.print(i + " ");
		}//for
		System.out.println();
		
		//A B C D E   ~~ X Y Z
		for(i = 'A'; i <= 'Z'; i++) {//i는 int형
			System.out.print((char)i + " ");//형변환
		}//for
		
	}

}
