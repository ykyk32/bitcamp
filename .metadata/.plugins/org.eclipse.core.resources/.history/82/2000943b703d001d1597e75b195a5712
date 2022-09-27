package class_;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5]; //초기값으로 null
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("   1. 가입");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 탈퇴");	
			System.out.println("   5. 끝내기");	
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break; //while를 벗어나라
			if(num == 1) insert(); //호출
			else if(num == 2) list();
			else if(num == 3) update();
			else if(num == 4) delete();
			else System.out.println("1 ~ 5 사이의 숫자만 입력하세요");
		}//while
	}//menu()

	public void delete() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					ar[i] = null;
					
					System.out.println("1 row(s) deleted");					
					break; //for를 벗어나라
				}
			}
		}//for i
		
		if(i == ar.length) System.out.println("찾는 회원이 없습니다");
		
	}//delete()

	public void update() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					System.out.println("이름\t나이\t핸드폰\t\t주소");
					System.out.println(ar[i].getName()+"\t"
							 + ar[i].getAge()+"\t"
							 + ar[i].getPhone()+"\t"
							 + ar[i].getAdress());
					
					//수정
					System.out.println();
					System.out.print("수정 할 이름 입력 : ");
					ar[i].setName(scan.next());
					System.out.print("수정 할 나이 입력 : ");
					ar[i].setAge(scan.nextInt());
					System.out.print("수정 할 핸드폰 입력 : ");
					ar[i].setPhone(scan.next());
					System.out.print("수정 할 주소 입력 : ");
					ar[i].setAddress(scan.next());
					
					System.out.println("1 row(s) updated");					
					break; //for를 벗어나라
				}
			}
		}//for
		
		if(i == ar.length) System.out.println("찾는 회원이 없습니다");
		
	}//update()
	
	public void list() {
		System.out.println();
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(MemberDTO memberDTO : ar) {
			if(memberDTO != null) 
				System.out.println(memberDTO.getName()+"\t"
								 + memberDTO.getAge()+"\t"
								 + memberDTO.getPhone()+"\t"
								 + memberDTO.getAdress());
		}//for
		
	}//list()

	public void insert() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) break;
		}//for i
		
		if(i == ar.length) {
			System.out.println("5명 정원이 꽉 찼습니다.");
			return; //메소드를 벗어나라
		}
		
		//데이터 입력
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("핸드폰 입력 : "); 
		String phone = scan.next();
		System.out.print("주소 입력 : "); 
		String address = scan.next();
		
		ar[i] = new MemberDTO(name, age, phone, address);
		System.out.println("1 row created");
			
		int count=0;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) count++;
		}//for i
		System.out.println(count + "자리 남았습니다");
			
	}//insert()
	
}










