package for_;

public class For04 {

	public static void main(String[] args) {
		int count=0;
		char ch;//변수 잡아서 하는게 편리 
		for(int i=1;i<=100;i++) {
					
		
			
			ch = (char)(Math.random()*26 +65);
			System.out.print(ch + " ");
			if (i%10 == 0)System.out.println();
			
			
			if (ch == 'A') count++;
			
			}	
		
		System.out.println();
		System.out.println("A의 개수 : " + count);
		
		
	}

}


/*
 A~Z까지의 난수 100개 발생하여 출력
 -단, 한 줄에 10개씩 출력
 A의 개수 :
 -100개 중에서 A가 몇 개 나왔는지 개수를 출력
 */