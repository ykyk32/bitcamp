package operator;

public class Boxing {

	public static void main(String[] args) {
		int a =25;
		double b = (double)a / 3;//Casting Cast연산(강제형변환) 기본은 기본끼리,
		
		String c = "25";
		//int d = c; error -객체는 객체끼리 Casting
		int d = Integer.parseInt(c);	
		
		
		int e = 5;		
		Integer f = e;// Integer객체형 e 기본형 //AutoBoxing - JDK 5.0		
		//Integer g = new Integer(e);  //JDK 5.0 이전
		
		Integer h = 5;
		int i = h;//unAutoBoxing
		//int j = h.intValue; //- JDK5.0 이전
	}

}
