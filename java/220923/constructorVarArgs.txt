package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
	public int sum(int...ar) {
		int hap=0;
		
		for(int i=0;i<ar.length;i++) {
			hap+=ar[i];
		}
		return hap;
	}
//	public int sum(int a,int b) {
//		return a+b;
//	}
//	public int sum(int a,int b,int c) {
//		return a+b+c;
//	}
//	public int sum(int a,int b,int c,int d) {
//		return a+b+c+d;
//	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("합="+va.sum(10,20));//호출
		System.out.println("합="+va.sum(10,20,30));//호출
		System.out.println("합="+va.sum(10,20,30,40));//호출

	
	}

}
