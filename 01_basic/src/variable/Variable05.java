package variable;

public class Variable05 {

	public static void main(String[] args) {
		int a = 10;                    //정수형 변수
		String b = "호랑이";            //객체
		
		int[] ar = new int [5];        //정수형 배열
		String[] ar2 = new String[3];  //객체 배열
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		ar[5] = 60; //문법적 에러는 아님 error - ArrayIndexOutOfBoundsException
		
		
		ar2[0] = "사자"; //ar2에 사자의 주소값이 온다,방 안에 사자있는게아니다
		ar2[1] = "기린";
		ar2[2] = "코끼리";
	}

}
