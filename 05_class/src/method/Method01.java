package method;

public class Method01 {

	public static void main(String[] args) {
		int a =25,b=36;//지역변수, local variable
		
		Method01 m =new Method01();//생성
		
		int sum = m.sum2(25, 36);//호출
		int sub = m.sub2(25, 36);
		int mul = m.mul2(25, 36);
		double div = m.div2(25, 36);

		
		System.out.println(a+" + " + b+ " = "+ sum);
		System.out.println(a+" + " + b+ " = "+ sub);
		System.out.println(a+" + " + b+ " = "+ mul);
		System.out.println(a+" + " + b+ " = "+ String.format("%.2f", div));
		
	}
	public int sum2(int a,int b){//구현,인수(argument),매개변수(parameter)
		return a+b;
	}
	public int sub2(int a,int b) {
		return a-b;
	}
	public int mul2(int a,int b) {
		return a*b;
	}
	public double div2(int a, int b) {
		return (double)a/b;
	}
	
	
}
