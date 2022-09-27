package constructor;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;
	private int score=0;
	private final String JUNG = "11111"; // 상수화
	
	public Exam() {
		ox = new char[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		
		System.out.print("답 입력 : ");
		this.dap = scan.next();
	}
	
	public void compare() {
		//for(int i=0; i<ox.length; i++) { //배열 크기 => 배열.length
		for(int i=0; i<dap.length(); i++) { //문자열 크기 => 문자열.length()
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else 
				ox[i] = 'X';
			
		}//for
	}
	
	public String getName(){
		return name;
	}
	public char[] getOx(){
		return ox;
	}
	public int getScore() {
		return score;
	}
}


















