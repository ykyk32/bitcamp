package inheritence;

public class Child extends Super  {
	
	protected String name;
	protected int age;
	
	public Child() {
		System.out.println("Child 기본 생성자");
		
	}
	public Child(String name,int age,double weight,double height) {
		super(weight,height);//부모생성자 선택해서 호출,선택안하면 기본부모생성자
		System.out.println("Child 기본 생성자");
		this.name=name;
		this.age=age;
		super.weight=weight;//this.weight=weight;super this둘다가능
		super.height=height;//this.height=height;
		
	}
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	public static void main(String[] args) {
		Child aa = new Child("홍길동",25,70.5,182.3);
		aa.disp();
		System.out.println();
		
		System.out.println("--------------");
		
		Super bb= new Child("코난",13,35.6,152.7);
		bb.disp();//override이면 다 자식것을 처리한다.

	}

}
