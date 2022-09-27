package class2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st= new StringTokenizer(str,",");//빈 것은 무시
		System.out.println("토큰개수 = "+ st.countTokens()); //3
		
		while(st.hasMoreTokens()){//현재위치에 토큰이 있으면 true,없으면 false
			System.out.println(st.nextToken());
		}                         //.nextToken 토큰을 꺼내주고 다음 토큰으로 이동

		
		System.out.println("-----------------------------");
		
		String[] ar = str.split(",");//빈것 무시안함 data수 4개
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
