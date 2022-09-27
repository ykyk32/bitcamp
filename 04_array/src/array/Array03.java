package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();
		int sum =0;
		int max,min;
		
		int[] ar = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("ar[" +i+"] 입력 : ");
			ar[i] = scan.nextInt();
				
			
			sum += ar[i];//합
			
			
		}//for i
		System.out.println();
		
		max=min=ar[0];
		for(int i=1; i<size;i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}		
		
		for(int data : ar) {
			System.out.print(data + "  ");
			
		}
		System.out.println();
		System.out.println("합 = "+sum);
		System.out.println("최대값 = "+ max);
		System.out.println("최대값 = "+ min);
		
		
		//max의 초기값은 ar[0] 한다.값이 음수이면 0이 max일 수도 있어서
		
	}

}
/*
배열 크기 입력 : 7
ar[0] 입력 : 6
ar[1] 입력 : 9
ar[2] 입력 : 2
ar[3] 입력 : 3
ar[4] 입력 : 4
ar[5] 입력 : 2
ar[6] 입력 : 10

6  9  2  3  4  2  10  
합 = 36
최대값 = 10
최대값 = 2
 //입력과 출력 for문을 따로 써
 */