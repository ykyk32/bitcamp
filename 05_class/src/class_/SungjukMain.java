package class_;

public class SungjukMain {

	public static void main(String[] args) {
		Sungjuk aa= new Sungjuk();//진짜 메모리 생성,heap에 메모리 설정 후 주소값 전달
		aa.setData("홍길동", 90, 95, 100);//호출
		aa.calc();
		System.out.println("----------------------------------------------------");
		System.out.println("이름      국어      영어      수학      총점      평균      학점");
		System.out.println("----------------------------------------------------");
		System.out.println(aa.getName()+"\t"+aa.getKor()+"\t"+aa.getEng()+"\t"+aa.getMath()+"\t"
							+aa.getTot()+"\t"+aa.getAvg()+"\t"+aa.getGrade());
		

		//-----------------------------------
		///배열 같은 자료형끼리 묶는다
		//클래스는 1인분 씩 묶는다.
		
				
				
				 Sungjuk bb = new Sungjuk();
				 bb.setData("프로도", 100, 89, 75);
				 bb.calc();
				
					System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"
										+bb.getTot()+"\t"+bb.getAvg()+"\t"+bb.getGrade());
					
		//-----------------------------------
				
				
				 Sungjuk cc = new Sungjuk();
				 cc.setData("조르디", 75, 80, 48);
				 cc.calc();
				
					System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"+cc.getEng()+"\t"+cc.getMath()+"\t"
										+cc.getTot()+"\t"+cc.getAvg()+"\t"+cc.getGrade());

	}

}


/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
      getName()
      getKor()
      getEng()
      getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

 */