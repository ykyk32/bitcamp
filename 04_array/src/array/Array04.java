package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean ar[];					//boolean[] ar = new boolean[5]
		ar = new boolean[5];
		
		int i;
		
		while(true) {
			System.out.println();
			System.out.println("주자장 관리 프로그램");
			System.out.println("**************");
			System.out.println("1. 입차\n2. 출차\n3. 리스트\n4. 종료");
			System.out.println("**************");
			System.out.print("   메뉴 : ");
			
			int a = scan.nextInt();
			if (a <1 || a >4) {
				System.out.println("1번 ~ 4번까지만 입력하세요");
				continue;
			}else if(a==1) {
				System.out.print("위치입력 : ");
				int position=scan.nextInt(); 
					if(ar[position-1]== false) {
					ar[position-1]=true;
					System.out.println(position+"위치에 입차") ;
					}else System.out.println("이미 주차되어있습니다");
			}else if(a==2) {
				System.out.print("위치입력 : ");
				int position=scan.nextInt();
					if(ar[position-1]== true) {
						ar[position-1]=false;
						System.out.println(position+"위치에 출차") ;
					}else System.out.println("주차되어 있지않습니다");
				
				
			}else if(a==3) {
				for(i=0;i<ar.length;i++) {
					System.out.println((i+1)+"위치 :" + ar[i]);
					
				}
				
			}else if (a==4) break;
		
			
					
			
		}System.out.println("프로그램을 종료합니다.");

	}

}

/*
주차장 관리 프로그램
**************
   1. 입차     
   2. 출차      
   3. 리스트     
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false

초기 boolean[]값은 모두 false
*/