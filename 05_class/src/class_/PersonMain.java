package class_;


class Person{
	
	private String name;//private-캡슐화//필드,초기화, null
	private int age;//필드,초기화, 0
	
	public int getAge() {
		return age;
	}
	public String getName(){
		return name;
	}
	
	
	
	public void setName(String n) {
		name =n;
	}
	public void setAge(int a) {
		age =a;
	}
	public void setData(String n,int a) {
		name= n;
		age=a;
	}
	public void setData() {
		
	}//overload쌍둥이 같은이름으로 여러개
	
}
//-------------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa;;//클래스 변수=>객체
		aa= new Person();//메모리에 생성
		System.out.println("객체 aa=" + aa);//.Person@6f2b958e

		//aa.name = "홍길동";//aa안에있는 name에 준다//private 못 건드림
		aa.setName("홍길동");//호출
		//aa.age=25;
		aa.setAge(25);
		System.out.println("이름 = "+ aa.getName()+ "\t 나이 = "+ aa.getAge());
		System.out.println();
		
		Person bb = new Person();		
		System.out.println("객체 bb = " +bb);
		bb.setName("코난");
		bb.setAge(13);		
		System.out.println("이름 = "+bb.getName()+"\t 나이 = "+ bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		System.out.println("객체 cc = " +cc);
		cc.setData("둘리",100);		
		System.out.println("이름 = "+cc.getName()+"\t 나이 = "+ cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		System.out.println("객체 dd = " +dd);
		dd.setData();		
		System.out.println("이름 = "+dd.getName()+"\t 나이 = "+ dd.getAge());
		System.out.println();
		
		
		
	}

}






