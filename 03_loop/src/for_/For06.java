package for_;

public class For06 {

	public static void main(String[] args) {
		
		int i;
		int sum =0;
		String sik;
		for(i=1;i<=10;i++) {
			if(i%2== 0) {
			sum +=i;
			sik = "+"+ i;
					
			}else {sum -=i;sik = "-"+ i;
			}
		System.out.print(sik);
		}System.out.print(" = "+sum);
		
		
	}

}
/*
[문제] 결과화면과 똑같이 출력하시오 (for, if)

[실행결과]
-1+2-3+4-5+6-7+8-9+10 = 5
 */