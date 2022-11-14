package class_;

public class MemberMain {

	public static void main(String[] args) {
		MemberService serv = new MemberService();
		serv.menu();
		System.out.println("프로그램을 종료합니다.");
	}
}
//숙제
/*
클럽 회원관리 프로그램 작성
여기는 폐쇄적인(private 객체 배열) 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다 주소는 두글자정도 (1인분씩)
//DTO(Data Transfer Object) /VO(Value Object)
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

MemberDTO - 정보 1 인분
MemberService - 일, menu, insert, list, update, delete
MemberMain - 


[실행결과]
menu() while 무한반복?
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
list() - if문 걸어야함
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
delete() 객체배열의 주소 지우기(null) -> 객체가 가리키는 클래스가 사라진다
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
*/
