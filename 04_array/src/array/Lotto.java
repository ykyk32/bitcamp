package array;

import java.util.Scanner;
import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int money;		
		int[] lotto = new int[6];
		
		System.out.print("현금입력 :");
		money= scan.nextInt();
		for(int k=1;k<=money/1000;k++) {
		
			for(int i=0;i<lotto.length;i++) {
				lotto[i]= (int) (Math.random()*45) +1;
				
				for(int j=0;j<i;j++)
					if (lotto[i]==lotto[j]) {
						i--;//제거한 뒤에 다시 뽑기
						break;}
						//continue;
				
				}//for 입력
			
			Arrays.sort(lotto);//new 안 썼으니가 sort 는 static이다
			//정렬 - 오름차순							
			
			/*
			for(int i=0;i<lotto.length;i++) {
				System.out.print(lotto[i] + " ");
				
			}//for 출력
			 */
			for(int data : lotto) {
				System.out.print(String.format("%5d", data)); //-5왼쪽정렬  5 오른쪽 정렬
			}//for 출력
			System.out.println();
			if(k%5 ==0)System.out.println();
		}//for k
	}
	
}


/*
 lotto
-6개의 숫자가 1~45 사이에서 나온다
-중복 안됨
-정렬

[문제] 로또
 - 돈을 입력받아서 난수가 자동으로 발생하는 프로그램
 -
 [실행결과]
 현금입력 :7000
   19   24   28   34   36   41
    2    6   16   24   31   45
    2   10   11   27   38   45
    2    4    8   16   32   34
   12   18   22   26   34   38

    3   15   21   24   39   44
    6   12   14   17   20   32
 
 

 */
						
