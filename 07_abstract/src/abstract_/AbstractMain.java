package abstract_;

public class AbstractMain extends AbstractTest{

	public void setName(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();//추상클래스는 new 할 수 없다.
		AbstractTest at = new AbstractMain();//상속관계만들어서
	}

}
