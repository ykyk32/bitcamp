package class_;

import java.util.Scanner;

public class MemberService {
	static Scanner scan = new Scanner(System.in);
	
	MemberDTO[] ar = new MemberDTO[5];
	
	String name, phone, adress;
	int age;
	
	public void insert() {
		for(int i = 0; i < ar.length ; i++) {
			if(ar[i] == null) {
				ar[i] = new MemberDTO();//남는 객체 주소할당
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("나이 입력 : ");
				age = scan.nextInt();
				System.out.print("핸드폰 입력 : "); 
				String phone = scan.next();
				System.out.print("주소 입력 : "); 
				String adress = scan.next();
				
				ar[i].setData(name, age, phone, adress);
				return ;//한번 값을 주면 종료
			}
		}//마지막 배열까지 객체 주소가 있는 경우
		System.out.println("5명의 정원이 꽉 찼습니다.");	
	}//insert()
	public void list() {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] != null) {
				System.out.println(ar[i].getName()+"\t"
								  +ar[i].getAge()+"\t"
								  +ar[i].getPhone()+"\t"
								  +ar[i].getAdress()+"\t");
			}
			System.out.println();
		}
	}//list()
	public void update() {
		System.out.print("핸드폰 번호 입력 : ");
		phone = scan.next();
		int i , j ;
		for(i = 0 ; i < ar.length ; i++) {
			for(j = 0 ; j < phone.length() ; j++) {
				if(i == ar.length-1 && (ar[ar.length-1] == null || phone.charAt(j) != ar[i].getPhone().charAt(j))) {
					System.out.println("찾는 회원이 없습니다");
					return ;
				}//마지막까지도 없는 조건
				if(ar[i] == null || phone.charAt(j) != ar[i].getPhone().charAt(j)) {
					break ;
				}//번호가 다르거나 비어있으면 다음객체 검사
				else if(j == phone.length()-1) {
					System.out.println(ar[i].getName()+"\t"
							+ar[i].getAge()+"\t"
							+ar[i].getPhone()+"\t"
							+ar[i].getAdress()+"\t");
					System.out.println();
					System.out.print("수정 할 이름 입력 : ");
					name = scan.next();
					System.out.print("수정 할 나이 입력 : ");
					age = scan.nextInt();
					System.out.print("수정 할 핸드폰 입력 : ");
					phone = scan.next();
					System.out.print("수정 할 주소 입력 : ");
					adress = scan.next();
					System.out.println();
					ar[i].setData(name, age, phone, adress);
					System.out.println(i+1 + " row(s) updated");
					return ; 
				}//번호가 맞다면 정보수정
			}
		}
	}//update()
	public void delete() {
		System.out.print("핸드폰 번호 입력 : ");
		phone = scan.next();
		
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = 0 ; j < phone.length() ; j++) {
				if(ar[i] == null || phone.charAt(j) != ar[i].getPhone().charAt(j))
					break;
				else if(j == phone.length()-1){
					ar[i] = null;
					System.out.println(i+1 + " row deleted");
					return ;
				}
			}
		}
		System.out.println("찿는 회원이 없습니다");
	}//delete()
	public void menu() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("*************");
			System.out.println("   1. 가입");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 탈퇴");	
			System.out.println("   5. 끝내기");	
			System.out.println("*************");
			System.out.print("  번호 : ");
			
			int num = scan.nextInt();
			if(num == 1) insert();
			if(num == 2) list();
			if(num == 3) update();
			if(num == 4) delete();
			if(num == 5) break;
		}//menu()
	}
}
//숙제
/*
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created
xx자리 남았습니다

[2번 경우]
list()
이름   나이   핸드폰      주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동   25   xxx   xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
*/