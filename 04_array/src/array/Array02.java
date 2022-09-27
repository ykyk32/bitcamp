package array;

public class Array02 {

	public static void main(String[] args) {
		String[] ar = {"사자","코끼리","카멜레온","오리너구리","기린","원숭이"};
		for(int i=0;i<ar.length;i++) {
			System.out.println("ar[" +  i + "] = "+ ar[i]);
			System.out.println("문자열의 크기 = "+ar[i].length());//"배열 크기 ="+ar.length
			System.out.println("첫번째 문자 = " + ar[i].charAt(0));
			System.out.println("마지막 문자 = "+ ar[i].charAt(ar[i].length()-1));
			System.out.println();
			
		}
		System.out.println();
		
		System.out.println("확장 for 문");
		for(String aa : ar) {
			System.out.println(aa);
		}
	}

}
