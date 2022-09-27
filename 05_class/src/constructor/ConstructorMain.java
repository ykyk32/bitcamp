package constructor;


class Hello{
	private String name;
	private int age;
	
	public Hello() {
		System.out.println("기본 생성자");
	}
	public Hello(String name) {
		this.name=name;
	}
	public Hello(int age) {
		this();//Overload된 다른 생성자를 호출 할 수 있다.-쌍둥이 끼리 서로 호출
		//this("코난");
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}


//----------------------------
public class ConstructorMain {

	public static void main(String[] args) {
		Hello aa = new Hello();//>생성자 호출
		System.out.println(aa.getName());
		System.out.println();
		
		Hello bb=new Hello("홍길동");
		System.out.println(bb.getName()+"\t"+bb.getAge());
		System.out.println();
				
		Hello cc= new Hello(25);
		System.out.println(cc.getName()+"\t"+cc.getAge());
	}

}
