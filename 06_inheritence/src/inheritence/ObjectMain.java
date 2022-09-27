package inheritence;


class Test extends Object{//자바의 모든 클래스는 Object로 부터 상속받는다. 안 적혀있어도
	
	@Override
	public String toString() {		
		return getClass() +"@개바부";
	}
	
}
//--------------------------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+ t);//객체 t = inheritence.Test@6f2b958e=>override해서 바꿈 객체 t = 개바부
		System.out.println("객체 t = "+ t.toString());//객체 t = inheritence.Test@6f2b958e
		System.out.println("객체 t = "+ t.hashCode());//객체 t = 1865127310
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str ="+ str);
		System.out.println("객체 str ="+ str.toString());
		System.out.println("객체 str ="+ str.hashCode());
		System.out.println();
		
		String aa = new String ("apple");
		String bb = new String ("apple");
		System.out.println("aa==bb : "+ (aa==bb) );// 주소 false
		System.out.println("aa.equals(bb) : "+aa.equals(bb) );//문자열 true//equals는원래 오브젝트가 가지고있는데 String에서 override한거
		System.out.println();
				
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+ (cc==dd) );//주소 false
		System.out.println("cc.equals(dd) : "+cc.equals(dd) );//주소 false
		
		Object ee = new String ("apple");
		Object ff = new String ("apple");
		System.out.println("ee==ff : "+ (ee==ff) );//주소 false
		System.out.println("ee.equals(ff) : "+ee.equals(ff) );//true
		System.out.println();
	}

}
//----------------------------
/**
 class Object{
 	public boolean equals(Object ){}   참조값비교
 	public int hashCode()		       10진수
 	public String toString()	        클래스명@16진수
 }
 
 class Test extends Object{
 	public String toString()    개바부
 }
 
 
 
 class String extends Object{
 	public boolean equals(Object )  문자열 비교
 	public int hashCode()	       문자열을 10진수로 변환
 							        표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할 수 없다.믿을수없다
 	public String toString()        문자열
 }
 */