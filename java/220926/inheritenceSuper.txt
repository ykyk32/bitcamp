package inheritence;

public class Super {
	protected double weight,height;
	
	public Super() {
		System.out.println("Super  기본 생성자");
		
	}//자식은 부모의 기본생성자를 부른다.
	public Super(double weight,double height) {
		System.out.println("Super 일반 생성자");
		this.weight=weight;
		this.height=height;
	}
	
	public void disp() {
		System.out.println("몸무게 = "+weight);
		System.out.println("키 ="+ height);
	}
}


