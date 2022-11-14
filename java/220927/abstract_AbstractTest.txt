package abstract_;

public abstract class AbstractTest {//POJO형식(Plain Old Java Object)
	 String name;//default -같은 패키지 내에서 접근가능 

	public String getName() { //구현
		return name;
	}

	public abstract void setName(String name);//추상method//만들예정 body가 없다//body{} -구현부
	//추상메소드 쓰면 ->그 클래스도 추상이어야 한다
	//추상클래스이다 ->추상메소드 있을수도 ,없을수도 
}
